package com.okinc.common.application;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class BaseApplication$initCommon$3 extends FunctionReferenceImpl implements Function0<Boolean> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BaseApplication$initCommon$3(Object obj) {
        super(0, obj, BaseApplication.class, "isUnifiedReportEnabled", "isUnifiedReportEnabled()Z", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((BaseApplication) this.receiver).DAIeex());
    }
}
