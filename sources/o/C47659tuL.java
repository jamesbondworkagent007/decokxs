package o;

import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.okuser.data.User;
import com.okinc.planet.biz_content.leaderboard.bean.NewsFlashListResponse;
import com.okinc.planet.biz_content.leaderboard.usecase.PlanetGetLatestNewsUseCase$invoke$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tuL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47659tuL {
    public final InterfaceC47278tmy OLrzqt;
    public final tQV copydefault;

    public C47659tuL(@NotNull tQV tqv, @NotNull InterfaceC47278tmy interfaceC47278tmy) {
        Intrinsics.checkNotNullParameter(tqv, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.copydefault = tqv;
        this.OLrzqt = interfaceC47278tmy;
    }

    public static /* synthetic */ java.lang.Object invoke$default(C47659tuL c47659tuL, java.lang.Integer num, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return c47659tuL.AEQbTJ(num, str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(java.lang.Integer num, java.lang.String str, @NotNull Continuation<? super NewsFlashListResponse> continuation) throws java.lang.Throwable {
        PlanetGetLatestNewsUseCase$invoke$1 planetGetLatestNewsUseCase$invoke$1;
        java.lang.Boolean boolKWHzl;
        NewsFlashListResponse newsFlashListResponse;
        if (continuation instanceof PlanetGetLatestNewsUseCase$invoke$1) {
            planetGetLatestNewsUseCase$invoke$1 = (PlanetGetLatestNewsUseCase$invoke$1) continuation;
            int i = planetGetLatestNewsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                planetGetLatestNewsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                planetGetLatestNewsUseCase$invoke$1 = new PlanetGetLatestNewsUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = planetGetLatestNewsUseCase$invoke$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = planetGetLatestNewsUseCase$invoke$1.label;
        boolean z = true;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                OKComplianceRestrictionService oKComplianceRestrictionService = (OKComplianceRestrictionService) C43251rlk.OLrzqt(OKComplianceRestrictionService.class);
                if (oKComplianceRestrictionService != null && oKComplianceRestrictionService.djSkpj()) {
                    tQV tqv = this.copydefault;
                    planetGetLatestNewsUseCase$invoke$1.label = 1;
                    objCopydefault = tqv.AEQbTJ(num, planetGetLatestNewsUseCase$invoke$1);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    newsFlashListResponse = (NewsFlashListResponse) ((AbstractC43419rot) objCopydefault).AEQbTJ();
                } else {
                    if (C46437tUh.OLrzqt.copydefault()) {
                        User userOLrzqt = this.OLrzqt.OLrzqt();
                        if (userOLrzqt == null || !userOLrzqt.isMainAccount()) {
                            z = false;
                        }
                        boolKWHzl = C56443yFo.KWHzl(z);
                    } else {
                        boolKWHzl = null;
                    }
                    tQV tqv2 = this.copydefault;
                    planetGetLatestNewsUseCase$invoke$1.label = 2;
                    objCopydefault = tqv2.copydefault(num, str, boolKWHzl, planetGetLatestNewsUseCase$invoke$1);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    newsFlashListResponse = (NewsFlashListResponse) ((AbstractC43419rot) objCopydefault).AEQbTJ();
                }
            } else if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                newsFlashListResponse = (NewsFlashListResponse) ((AbstractC43419rot) objCopydefault).AEQbTJ();
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
                newsFlashListResponse = (NewsFlashListResponse) ((AbstractC43419rot) objCopydefault).AEQbTJ();
            }
            return newsFlashListResponse;
        } catch (java.lang.Exception e) {
            pUU.copydefault("PlanetLatestNews", "PlanetGetLatestNewsUseCase invoke exception = " + tRK.AEQbTJ(e));
            return null;
        }
    }
}
