<body>
    <style>
        body {
            background-image: linear-gradient(to right, rgba(255, 0, 0, 0.623), yellow);
            text-align: center;
        }
        a {
            text-decoration: none;
            color: rgb(0, 0, 0);
        }
        table {
            border-collapse: collapse;
            margin: 0 auto;
        }
        table td,
        table th {
            border: 1px solid #cad9ea79;
            text-align: center;
            color: #666;
            height: 30px;
        }
        table thead th {
            background-color: #cce8ebc0;
            color:#000000ce;
            width: 100px;
        }
        table tr:nth-child(odd) {
            background: rgba(255, 255, 255, 0.692);
        }
        table tr:nth-child(even) {
            background: #f5fafa80;
        }
        table tr td:first-child {
            color: rgba(0, 0, 0, 0.918);
        }
        table tr td:hover {
            background: rgba(0, 153, 204, 0.493);
            color: red;
        }
    </style>
    <table frame="box">
        <thead>
            <tr>
                <th>序号</th>
                <th>创建型</th>
                <th>结构型</th>
                <th>行为型</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>01</td>
                <td>单例模式</td>
                <td>适配器模式</td>
                <td>模版方法模式</td>
            </tr>
            <tr>
                <td>02</td>
                <td>抽象工厂模式</td>
                <td>桥接模式</td>
                <td><a href='src/io/honghu/command'>命令模式</a></td>
            </tr>
            <tr>
                <td>03</td>
                <td><a href='src/io/honghu/prototype'>原型模式</a></td>
                <td><a href='src/io/honghu/decorator'>装饰者模式</a></td>
                <td><a href='src/io/honghu/visitor'>访问者模式</a></td>
            </tr>
            <tr>
                <td>04</td>
                <td><a href='src/io/honghu/builder'>建造者模式</a></td>
                <td>组合模式</td>
                <td>迭代器模式</td>
            </tr>
            <tr>
                <td>05</td>
                <td>工厂模式</td>
                <td>外观模式</td>
                <td><a href='src/io/honghu/observer'>观察者模式</a></td>
            </tr>
            <tr>
                <td>06</td>
                <td>&nbsp;</td>
                <td><a href='src/io/honghu/flyweight'>享元模式</a></td>
                <td>中介者模式</td>
            </tr>
            <tr>
                <td>07</td>
                <td>&nbsp;</td>
                <td>代理模式</td>
                <td>备忘录模式</td>
            </tr>
            <tr>
                <td>08</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>解释器模式</td>
            </tr>
            <tr>
                <td>09</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td><a href='src/io/honghu/state'>状态模式</a></td>
            </tr>
            <tr>
                <td>10</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td><a href='src/io/honghu/strategy'>策略模式</a></td>
            </tr>
            <tr>
                <td>11</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td><a href='src/io/honghu/responsibilitychain'>责任链模式</a></td>
            </tr>
        </tbody>
    </table>
</body>