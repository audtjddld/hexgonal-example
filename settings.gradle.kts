rootProject.name = "membership"

include(":applications")
include(":adapters:in:membership-api")
include(":adapters:out:persistence-rdb")

/**
 * 4 개의 repository를 나눈다. merchant-gateway (com.demaecan.merchant.gateway)
 * ==> config 관리를 어떻게 할것인가? properties, code <-- cloud config
 * merchant-owner-api (com.demaecan.merchant.owner) ->
 * owner app에 데이터를 표현하는데, 캐싱이 필요하다. merchant-membership-api
 * (com.demaecan.merchant.membership) ---> database
 * line-oa-api (com.demaecan.line.oa) ㅋㅋㅋ ---> database
 */

