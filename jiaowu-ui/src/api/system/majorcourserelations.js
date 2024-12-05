import request from '@/utils/request'

// 查询更精细地管理每门课程在不同年级的专业归属列表
export function listMajorcourserelations(query) {
  return request({
    url: '/system/majorcourserelations/list',
    method: 'get',
    params: query
  })
}

// 查询更精细地管理每门课程在不同年级的专业归属详细
export function getMajorcourserelations(RelationID) {
  return request({
    url: '/system/majorcourserelations/' + RelationID,
    method: 'get'
  })
}

// 新增更精细地管理每门课程在不同年级的专业归属
export function addMajorcourserelations(data) {
  return request({
    url: '/system/majorcourserelations',
    method: 'post',
    data: data
  })
}

// 修改更精细地管理每门课程在不同年级的专业归属
export function updateMajorcourserelations(data) {
  return request({
    url: '/system/majorcourserelations',
    method: 'put',
    data: data
  })
}

// 删除更精细地管理每门课程在不同年级的专业归属
export function delMajorcourserelations(RelationID) {
  return request({
    url: '/system/majorcourserelations/' + RelationID,
    method: 'delete'
  })
}
