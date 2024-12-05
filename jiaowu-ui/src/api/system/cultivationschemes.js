import request from '@/utils/request'

// 查询按学期从鹏达系统读取基础数据，以教研室为单位完成各专业的人才培养方案的上传并实现共享列表
export function listCultivationschemes(query) {
  return request({
    url: '/system/cultivationschemes/list',
    method: 'get',
    params: query
  })
}

// 查询按学期从鹏达系统读取基础数据，以教研室为单位完成各专业的人才培养方案的上传并实现共享详细
export function getCultivationschemes(SchemeID) {
  return request({
    url: '/system/cultivationschemes/' + SchemeID,
    method: 'get'
  })
}

// 新增按学期从鹏达系统读取基础数据，以教研室为单位完成各专业的人才培养方案的上传并实现共享
export function addCultivationschemes(data) {
  return request({
    url: '/system/cultivationschemes',
    method: 'post',
    data: data
  })
}

// 修改按学期从鹏达系统读取基础数据，以教研室为单位完成各专业的人才培养方案的上传并实现共享
export function updateCultivationschemes(data) {
  return request({
    url: '/system/cultivationschemes',
    method: 'put',
    data: data
  })
}

// 删除按学期从鹏达系统读取基础数据，以教研室为单位完成各专业的人才培养方案的上传并实现共享
export function delCultivationschemes(SchemeID) {
  return request({
    url: '/system/cultivationschemes/' + SchemeID,
    method: 'delete'
  })
}
