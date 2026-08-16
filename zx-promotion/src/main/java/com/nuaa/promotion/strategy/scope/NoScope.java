package com.nuaa.promotion.strategy.scope;

import com.nuaa.api.dto.promotion.OrderCourseDTO;
import com.nuaa.promotion.constants.ScopeType;

import java.util.List;

public class NoScope implements Scope{

    @Override
    public boolean canUse(OrderCourseDTO course) {
        return true;
    }

    @Override
    public ScopeType getType() {
        return ScopeType.ALL;
    }

    @Override
    public List<Long> getScopeIds() {
        return null;
    }

}
