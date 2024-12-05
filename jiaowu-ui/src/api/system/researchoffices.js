import request from '@/utils/request'

// 查询教研室信息由组织人事部管理和维护列表
export function listResearchoffices(query) {
  return request({
    url: '/system/researchoffices/list',
    method: 'get',
    params: query
  })
}

// 查询教研室信息由组织人事部管理和维护详细
export function getResearchoffices(officeID) {
  return request({
    url: '/system/researchoffices/' + officeID,
    method: 'get'
  })
}

// 新增教研室信息由组织人事部管理和维护
export function addResearchoffices(data) {
  return request({
    url: '/system/researchoffices',
    method: 'post',
    data: data
  })
}

// 修改教研室信息由组织人事部管理和维护
export function updateResearchoffices(data) {
  return request({
    url: '/system/researchoffices',
    method: 'put',
    data: data
  })
}

// 删除教研室信息由组织人事部管理和维护
export function delResearchoffices(officeID) {
  return request({
    url: '/system/researchoffices/' + officeID,
    method: 'delete'
  })
}
