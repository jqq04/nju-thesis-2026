) 企业内容管理（ECM）/内容管理系统（CMS）综述与参考架构

- 作用：支撑第 1 章“现状”、第 3 章“总体设计为什么这样分层”
- 关键词：Enterprise Content Management reference architecture / CMS architecture / content lifecycle management

1. 知识管理与企业知识库（KM/KB）建设方法论

- 作用：支撑“知识沉淀—复用—演进”的合理性（尤其是你提到“内容资产”）
- 关键词：knowledge management system / organizational knowledge base / knowledge lifecycle

1. 信息架构：分类法/标签体系/主题模型（Taxonomy & Tagging）

- 作用：支撑“空间-应用-类目-标签”的组织体系设计
- 关键词：information architecture taxonomy / tagging system / faceted classification / metadata schema

1. 权限控制：RBAC/ABAC 与内容级授权

- 作用：支撑“权限与审批发布”模块不是拍脑袋；给出学术公认模型
- 关键词：RBAC model / ABAC policy / fine-grained access control / content authorization

1. 工作流/审批：BPMN/工作流系统与发布流程治理

- 作用：支撑“审批发布状态机”“流程可控性”的设计选择
- 关键词：workflow management system / business process management / approval workflow / BPMN

1. 信息检索基础：倒排索引、评分、评测方法（BM25、nDCG 等）

- 作用：支撑“全文检索/召回/相关性评估”的基础论述（第 2 章、应用模块实现）
- 关键词：BM25 / learning to rank / IR evaluation metrics / nDCG MAP MRR

1. 神经检索与向量检索：Dense Retrieval、ANN 索引、混合检索

- 作用：支撑“向量召回”“多通道召回”“性能与准确性权衡”
- 关键词：dense retrieval / approximate nearest neighbor (HNSW, IVF, PQ) / hybrid search sparse+dense

1. RAG 核心与变体：多跳/长文档、RAG 评测、可控性

- 作用：支撑“从人工查找→智能获取”的关键技术路线与局限
- 关键词：retrieval-augmented generation / long-context QA / faithful RAG / RAG evaluation

1. 重排（Reranking）与检索链路优化（Query rewrite、fusion）

- 作用：支撑“重排机制提升相关性”“多路召回融合”的设计
- 关键词：cross-encoder reranking / reciprocal rank fusion / query expansion / query rewriting

1. 事实性与引用：可溯源问答、幻觉控制、证据包/引用生成

- 作用：支撑你平台“证据、引用、可解释”的工程目标（很适合放第 5 章评估指标）
- 关键词：attributed QA / citation generation / grounded generation / hallucination mitigation

1. 多模态文档理解：表格/图片/版式（Document AI）与多模态 RAG

- 作用：如果你的内容形态里含图片/表格/富文本，这一块能补 2–4 篇很自然
- 关键词：document understanding / layout analysis / table QA / multimodal RAG

1. 内容质量与数据治理：质量维度、治理流程、闭环与指标体系

- 作用：支撑“重复/歧义/覆盖不足”“治理任务闭环”“质量可度量”
- 关键词：data quality dimensions / data governance framework / continuous data quality / data quality metrics

1. 去重/一致性：文本重复检测、语义聚类、冲突消解

- 作用：直接支撑“重复度/歧义度”治理子任务的算法与工程选择
- 关键词：semantic deduplication / near-duplicate detection / clustering / entity resolution / contradiction detection

1. 可观测性与数据洞察：事件埋点、用户行为分析、A/B 与指标设计

- 作用：支撑第 5 章“效果评估”，以及“洞察模块”的指标来源
- 关键词：product analytics / event logging schema / experimentation A/B testing / causal inference (可选)

1. 系统工程类参考：微服务、RPC、缓存、搜索系统工程实践（少量但权威）

- 作用：支撑你“工程化解决方案”的可信度（别太多，2–5 篇足够）
- 关键词：RPC foundations / distributed systems design / search engine architecture

