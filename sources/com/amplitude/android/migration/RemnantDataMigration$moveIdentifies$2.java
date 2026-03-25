package com.amplitude.android.migration;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.C5233Jv;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RemnantDataMigration$moveIdentifies$2 extends FunctionReferenceImpl implements Function1<Long, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RemnantDataMigration$moveIdentifies$2(Object obj) {
        super(1, obj, C5233Jv.class, "removeIdentify", "removeIdentify(J)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Unit invoke(Long l) {
        invoke(l.longValue());
        return Unit.INSTANCE;
    }

    public final void invoke(long j) {
        ((C5233Jv) this.receiver).KWHzl(j);
    }
}
