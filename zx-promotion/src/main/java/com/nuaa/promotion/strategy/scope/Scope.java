package com.nuaa.promotion.strategy.scope;

import com.nuaa.api.dto.promotion.OrderCourseDTO;
import com.nuaa.promotion.constants.ScopeType;

import java.util.List;

public interface Scope {

    boolean canUse(OrderCourseDTO course);

    ScopeType getType();

    List<Long> getScopeIds();
}
