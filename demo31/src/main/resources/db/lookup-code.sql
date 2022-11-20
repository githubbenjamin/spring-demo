CREATE TABLE if not exists lookup_code_t
(
    id bigint PRIMARY KEY NOT NULL COMMENT '主键ID',
    lookup_code_type VARCHAR(30) NULL COMMENT '快码类型',
    lookup_code VARCHAR(30) not NULL COMMENT '快码编码',
    name_cn VARCHAR(50) not NULL COMMENT '中文名称',
    name_en VARCHAR(50) not NULL COMMENT '英文名称',
    delete_flag VARCHAR(1) not NULL default 'N' COMMENT '删除标识',
    ordered_num INT NULL COMMENT '顺序',
    description VARCHAR(200) NULL DEFAULT NULL COMMENT '描述',
    last_update_version INT not null default '1' COMMENT '版本号',
    last_update_time datetime DEFAULT CURRENT_TIMESTAMP COMMENT '最新更新时间',
    last_update_account VARCHAR(11) null COMMENT '更新人',
    created_by VARCHAR(11) null COMMENT '创建人',
    created_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',

);

-- create index lookup_code_type_idx on lookup_code (lookup_code, lookup_code_type)