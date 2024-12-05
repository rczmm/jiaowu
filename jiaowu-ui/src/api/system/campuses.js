import request from '@/utils/request'

// 查询校区基础数据由教务处管理和维护列表
export function listCampuses(query) {
  return request({
    url: '/system/campuses/list',
    method: 'get',
    params: query
  })
}

// 查询校区基础数据由教务处管理和维护详细
export function getCampuses(campusID) {
  return request({
    url: '/system/campuses/' + campusID,
    method: 'get'
  })
}

// 新增校区基础数据由教务处管理和维护
export function addCampuses(data) {
  return request({
    url: '/system/campuses',
    method: 'post',
    data: data
  })
}

// 修改校区基础数据由教务处管理和维护
export function updateCampuses(data) {
  return request({
    url: '/system/campuses',
    method: 'put',
    data: data
  })
}

// 删除校区基础数据由教务处管理和维护
export function delCampuses(campusID) {
  return request({
    url: '/system/campuses/' + campusID,
    method: 'delete'
  })
}
