# NJU-Thesis

本项目提供了一个用于排版南京大学学位论文的LaTeX模板。该模板基于校友[Haixing-Hu的模板](https://github.com/Haixing-Hu/nju-thesis)，修复了若干Bug，增加和优化了一些功能细节。可根据文档注释说明，将本模板修改为本科/硕士/博士学位论文模板。

**如果有Bug修复或者优化相关的建议，请直接提pull requests，或者issues. 感谢大家的贡献！**
  
## 使用说明
* 默认Windows系统下，**安装[CTeX](http://www.ctex.org/CTeXDownload/)完整版**。Mac,Linux操作系统需按照sample.tex中的注释说明，修改字体等参数。已给出样例sample.tex，编辑修改该文件即可。
* **必须使用XeLaTeX**。建议使用TeXworks编辑，选择**XeLaTeX+MakeIndex+BibTex**编译运行。WinEdt需要使用**UTF-8**编码打开.tex文件，并且使用XeLaTeX编译。
* 切换本科生、研究生、博士生论文模版，需修改.tex文件中\documentclass[参数]
* 参数twoside/oneside指定排版的文档为双面/单面格式，如果论文双面打印，则建议用twoside（twoside会使得chapter章节从奇数页开始，即纸张的正面开始，因此会出现一些空白的页面）。
* 使用BibTeX文献管理，用编辑器编辑sample.bib文件即可。或使用[JabRef](https://www.jabref.org/)打开

## 文件说明
|文件(夹)|说明|
| --- | --- |
|sample.tex | 示例文档，可作为学位论文的基本模板|
|sample.bib | 示例文档的参考文献数据库|
|njuthesis.cls | 模板类文件|
|njuthesis.cfg | 模板配置文件|
|njulogo.eps | 南京大学校徽图片|
|njuname.eps | 南京大学校名图片|
|gbt7714-2005.bst | 符合国标GB/T 7714-2005 的参考文献样式文件|
|figure/ | 示例文档图片目录|

## 参考文献格式说明
严格遵循中国国家标准[《GB/T 7714-2005: 文后参考文献著录规则》][gbt7714-2005]   
详细信息见该项目：[GBT7714-2005-BibTeX-Style](https://github.com/Haixing-Hu/GBT7714-2005-BibTeX-Style)

[gbt7714-2005]: https://github.com/njuHan/njuthesis-nju-thesis-template/blob/master/%E3%80%90GB_T%207714-2005%E3%80%91%E6%96%87%E5%90%8E%E5%8F%82%E8%80%83%E6%96%87%E7%8C%AE%E8%91%97%E5%BD%95%E8%A7%84%E5%88%99.pdf


# JinQIQing 项目说明

## GitHub
- 项目地址：[jqq04/nju-thesis-2026](https://github.com/jqq04/nju-thesis-2026)
- 分支：
  - 主分支：`master`
  - mac 开发分支：`feat/mac`

```bash
git add .
git commit -m "update xxx"
git push origin feat/mac
```

## NJU LaTeX
- 项目地址：https://tex.nju.edu.cn/project/user/96c8828f-4952-4599-96ec-b3db73da85e3/2ba6f538-e2b1-47c7-bdbb-fbd1b83f150c

## 画图
- 使用 draw.io 画图，导出为 PDF 格式，然后在论文中使用
- 画图文件：`其他材料/figures.drawio`
- draw.io：
  - 网址：https://app.diagrams.net/
  - 项目地址：https://app.diagrams.net/#Hjqq04%2Fnju-thesis-2026%2Ffeat%252Fmac%2F%E5%85%B6%E4%BB%96%E6%9D%90%E6%96%99%2Ffigures.drawio#%7B%22pageId%22%3A%22remXLEl2kWC0B1G6v7ud%22%7D

## Trae AI
- 使用 Trae 辅助写作
