package o;

import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5930aFk implements InterfaceC43234rlT {
    public final java.lang.String KWHzl = "PasskeyCrossDeviceMasterDeeplinkHandler";

    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.lang.Object objM7377constructorimpl;
        java.lang.Object objM7377constructorimpl2;
        java.lang.Object objM7377constructorimpl3;
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        try {
            Result.Application application = Result.Companion;
            java.lang.Object obj = map.get("bleServiceUUID");
            Intrinsics.copydefault(obj, "");
            objM7377constructorimpl = Result.m7377constructorimpl((java.lang.String) obj);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            objM7377constructorimpl = "";
        }
        java.lang.String str = (java.lang.String) objM7377constructorimpl;
        try {
            Result.Application application3 = Result.Companion;
            java.lang.Object obj2 = map.get("isSync");
            Intrinsics.copydefault(obj2, "");
            objM7377constructorimpl2 = Result.m7377constructorimpl(java.lang.Boolean.valueOf(Intrinsics.EZpvd(obj2, (java.lang.Object) "True")));
        } catch (java.lang.Throwable th2) {
            Result.Application application4 = Result.Companion;
            objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl2) != null) {
            objM7377constructorimpl2 = java.lang.Boolean.FALSE;
        }
        boolean zBooleanValue = ((java.lang.Boolean) objM7377constructorimpl2).booleanValue();
        try {
            Result.Application application5 = Result.Companion;
            java.lang.Object obj3 = map.get("crossDeviceSessionId");
            Intrinsics.copydefault(obj3, "");
            objM7377constructorimpl3 = Result.m7377constructorimpl((java.lang.String) obj3);
        } catch (java.lang.Throwable th3) {
            Result.Application application6 = Result.Companion;
            objM7377constructorimpl3 = Result.m7377constructorimpl(C56391yDq.EZpvd(th3));
        }
        java.lang.String str2 = (java.lang.String) (Result.m7380exceptionOrNullimpl(objM7377constructorimpl3) == null ? objM7377constructorimpl3 : "");
        pUU.KWHzl(this.KWHzl, "crossDeviceSessionId:" + str2 + " bleServiceUuid:" + str + " isSync: " + zBooleanValue);
        try {
            Result.Application application7 = Result.Companion;
            android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            if (activityAEQbTJ != null) {
                activityAEQbTJ.finish();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m7377constructorimpl(unit);
        } catch (java.lang.Throwable th4) {
            Result.Application application8 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th4));
        }
        ((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).OLrzqt(context, str, str2, zBooleanValue);
    }
}
