package com.nbk.news.entity

import lombok.*

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
open class BaseResponse(open val status: String, open val totalResults: Int)