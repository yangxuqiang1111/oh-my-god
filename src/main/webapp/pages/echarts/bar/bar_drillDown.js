/**
 * Created by fangdi on 2017/8/21.
 */

var drillDown = {
    // 指定图表的配置项和数据
    getOption: function () {
        return {
            title: {
                text: '某站点用户访问来源',
                left: 'center',
                subtext: '纯属虚构'
            },
            legend: {
                data: ['直接访问', '邮件营销', '联盟广告', '视频广告', '搜索引擎', '百度', '谷歌', '必应', '其他'],
                left: 'left',
                orient: 'vertical'
            },
            grid: {
                show: true,
                left: '15%'
            },
            toolbox: {
                right: '40px',
                feature: {
                    saveAsImage: {
                        type: 'jpeg',           // 支持 png（默认）和 jpeg
                        excludeComponents: []   // 保存为图片时忽略的组件列表，默认忽略工具栏 toolbox
                    },
                    restore: {},
                    dataView: {
                        readOnly: true,         // false 即可编辑，编辑后刷新，图表跟随修改
                        lang: ['数据视图', '关闭^.^', '刷新'],
                        optionToContent: function (opt) {
                            var axisData = opt.xAxis[0].data;
                            var series = opt.series;
                            var table = '<table class="table table-hover table-bordered"><thead>'
                                + '<th rowspan="2" style="text-align: center; vertical-align: middle;">#</th>'
                                + '<th rowspan="2" style="text-align: center; vertical-align: middle;">' + series[0].name + '</th>'
                                + '<th rowspan="2" style="text-align: center; vertical-align: middle;">' + series[1].name + '</th>'
                                + '<th rowspan="2" style="text-align: center; vertical-align: middle;">' + series[2].name + '</th>'
                                + '<th rowspan="2" style="text-align: center; vertical-align: middle;">' + series[3].name + '</th>'
                                + '<th colspan="4" style="text-align: center;">' + series[4].name + '</th>'
                                + '<tr>'
                                + '<th style="text-align: center;">' + series[5].name + '</th>'
                                + '<th style="text-align: center;">' + series[6].name + '</th>'
                                + '<th style="text-align: center;">' + series[7].name + '</th>'
                                + '<th style="text-align: center;">' + series[8].name + '</th>'
                                + '</tr></thead><tbody>';
                            for (var i = 0, l = axisData.length; i < l; i++) {
                                table += '<tr>'
                                    + '<td>' + axisData[i] + '</td>'
                                    + '<td>' + series[0].data[i] + '</td>'
                                    + '<td>' + series[1].data[i] + '</td>'
                                    + '<td>' + series[2].data[i] + '</td>'
                                    + '<td>' + series[3].data[i] + '</td>'
                                    + '<td>' + series[5].data[i] + '</td>'
                                    + '<td>' + series[6].data[i] + '</td>'
                                    + '<td>' + series[7].data[i] + '</td>'
                                    + '<td>' + series[8].data[i] + '</td>'
                                    + '</tr>';
                            }
                            table += '</tbody></table>';
                            return table;
                        }
                    },
                    magicType: {
                        type: ['line', 'bar', 'stack', 'tiled']
                    },
                    dataZoom: {},
                    myTool1: {
                        show: true,
                        title: '自定义扩展方法',
                        icon: 'path://M432.45,595.444c0,2.177-4.661,6.82-11.305,6.82c-6.475,0-11.306-4.567-11.306-6.82s4.852-6.812,11.306-6.812C427.841,588.632,432.452,593.191,432.45,595.444L432.45,595.444z M421.155,589.876c-3.009,0-5.448,2.495-5.448,5.572s2.439,5.572,5.448,5.572c3.01,0,5.449-2.495,5.449-5.572C426.604,592.371,424.165,589.876,421.155,589.876L421.155,589.876z M421.146,591.891c-1.916,0-3.47,1.589-3.47,3.549c0,1.959,1.554,3.548,3.47,3.548s3.469-1.589,3.469-3.548C424.614,593.479,423.062,591.891,421.146,591.891L421.146,591.891zM421.146,591.891',
                        onclick: function () {
                            alert('自定义扩展方法，如打印等...');
                        }
                    }
                }
            },
            tooltip: {
                trigger: 'axis',
                axisPointer: {
                    type: 'cross'
                },
                formatter: function (params) {
                    var result = params[0].name + '<br />';
                    params.forEach(function (item) {
                        result += '<span style="display:inline-block;margin-right:5px;border-radius:10px;width:9px;height:9px;background-color:' + item.color + '"></span> ' + item.seriesName + ': ' + item.data + '万<br />';
                    });
                    return result;
                }
            },
            xAxis: [
                {
                    type: 'category',
                    data: ['周一', '周二', '周三', '周四', '周五', '周六', '周日']
                }
            ],
            yAxis: [
                {
                    type: 'value',
                    axisLabel: {
                        formatter: '{value} 万'
                    }
                }
            ],
            series: [
                {
                    name: '直接访问',
                    type: 'bar',
                    data: [320, 332, 301, 334, 390, 330, 320],
                    markLine: {
                        lineStyle: {
                            normal: {
                                type: 'dashed'
                            }
                        },
                        data: [
                            [
                                {
                                    type: 'min'
                                },
                                {
                                    type: 'max'
                                }
                            ]
                        ]
                    }
                },
                {
                    name: '邮件营销',
                    type: 'bar',
                    stack: '广告',
                    data: [120, 132, 101, 134, 90, 230, 210]
                },
                {
                    name: '联盟广告',
                    type: 'bar',
                    stack: '广告',
                    data: [220, 182, 191, 234, 290, 330, 310]
                },
                {
                    name: '视频广告',
                    type: 'bar',
                    stack: '广告',
                    data: [150, 232, 201, 154, 190, 330, 410]
                },
                {
                    name: '搜索引擎',
                    type: 'bar',
                    data: [862, 1018, 964, 1026, 1679, 1600, 1570],
                    markLine: {
                        lineStyle: {
                            normal: {
                                type: 'dashed'
                            }
                        },
                        data: [
                            [
                                {
                                    name: '最小值',
                                    type: 'min',
                                    value: '最小值'
                                },
                                {
                                    name: '最大值',
                                    type: 'max'
                                }
                            ],
                            {
                                name: '平均线',
                                type: 'average',
                                value: '平均线'
                            },
                            {
                                name: '最小值',
                                type: 'min'
                            },
                            {
                                name: '最大值',
                                type: 'max'
                            },
                            {
                                name: 'Y 轴值为 1000 的水平线',
                                yAxis: 1000
                            }
                        ]
                    }
                },
                {
                    name: '百度',
                    type: 'bar',
                    barWidth: 5,
                    stack: '搜索引擎',
                    data: [620, 732, 701, 734, 1090, 1130, 1120]
                },
                {
                    name: '谷歌',
                    type: 'bar',
                    stack: '搜索引擎',
                    data: [120, 132, 101, 134, 290, 230, 220]
                },
                {
                    name: '必应',
                    type: 'bar',
                    stack: '搜索引擎',
                    data: [60, 72, 71, 74, 190, 130, 110]
                },
                {
                    name: '其他',
                    type: 'bar',
                    stack: '搜索引擎',
                    data: [62, 82, 91, 84, 109, 110, 120]
                }
            ]
        };
    },
    initChart: function (myChart, option) {
        myChart.setOption(option);

        myChart.on('click', function (object) {
            // 销毁之前的 ECharts 实例
            echarts.dispose(dom);
            // 创建一个新的 ECharts 实例
            var _myChart = echarts.init(dom);

            // 异步加载数据
            $.get("http://localhost:8585/mock/bar_drillDown.json")
                .done(function (data) {
                    for (var i = 0, length = option.series.length; i < length; i++) {
                        option.series[i].data = data.data[i];
                        if (option.series[i].hasOwnProperty('markLine')) delete option.series[i].markLine;
                    }
                    option.xAxis[0].data = ['00:00', '04:00', '08:00', '12:00', '16:00', '20:00'];
                    _myChart.setOption(option, true);
                });
        });
    }
};