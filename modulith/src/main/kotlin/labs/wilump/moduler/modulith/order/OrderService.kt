package labs.wilump.moduler.modulith.order

import labs.wilump.moduler.modulith.common.CommonComponent
import labs.wilump.moduler.modulith.common.utils.CommonUtils
import org.springframework.stereotype.Service

interface OrderService {
}

@Service
class OrderServiceImpl(
    private val component: CommonComponent,
) : OrderService {
    private val utils: CommonUtils = CommonUtils()
}