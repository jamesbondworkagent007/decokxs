package o;

import com.okinc.captcha.impl.data.CaptchaVendor;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.preference.data.model.meta.AppMetaInfo;
import com.okinc.preference.data.model.meta.UserMetaInfo;
import com.okinc.preference.data.remote.SupportRemoteDataSource;
import com.okinc.preference.domain.MetaInfoManager$loadMetaInfoSuspend$1;
import com.okinc.preference.domain.MetaInfoManager$loadMetaInfoSuspend$3;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.reactive.AwaitKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tXO {
    public static final MutableSharedFlow<Unit> AEQbTJ;
    public static final int EZpvd;
    public static final MutableSharedFlow<Unit> OLrzqt;
    public static final tXO KWHzl = new tXO();
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.tXN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return tXO.AEQbTJ();
        }
    });

    private tXO() {
    }

    static {
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        AEQbTJ = mutableSharedFlowMutableSharedFlow$default;
        EZpvd = 8;
    }

    public static final lWe AEQbTJ() {
        return (lWe) C43251rlk.copydefault(lWe.class);
    }

    public final lWe copydefault() {
        return (lWe) copydefault.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0112 A[Catch: Exception -> 0x0145, TryCatch #2 {Exception -> 0x0145, blocks: (B:13:0x002c, B:67:0x0102, B:69:0x010c, B:72:0x0116, B:74:0x011d, B:75:0x012a, B:77:0x0130, B:79:0x013e, B:80:0x0142, B:71:0x0112, B:63:0x00f0), top: B:88:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011d A[Catch: Exception -> 0x0145, TryCatch #2 {Exception -> 0x0145, blocks: (B:13:0x002c, B:67:0x0102, B:69:0x010c, B:72:0x0116, B:74:0x011d, B:75:0x012a, B:77:0x0130, B:79:0x013e, B:80:0x0142, B:71:0x0112, B:63:0x00f0), top: B:88:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(boolean z, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MetaInfoManager$loadMetaInfoSuspend$1 metaInfoManager$loadMetaInfoSuspend$1;
        java.lang.Throwable th;
        tXO txo;
        tXO txo2;
        java.lang.Object objM7377constructorimpl;
        ResponseData responseData;
        java.util.List<java.lang.String> listAhwBna;
        com.okinc.okuser.data.UserInfo userInfo;
        java.util.List<java.lang.String> guidanceItems;
        AppMetaInfo appMetaInfo;
        java.util.List<java.lang.String> listAhwBna2;
        if (continuation instanceof MetaInfoManager$loadMetaInfoSuspend$1) {
            metaInfoManager$loadMetaInfoSuspend$1 = (MetaInfoManager$loadMetaInfoSuspend$1) continuation;
            int i = metaInfoManager$loadMetaInfoSuspend$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metaInfoManager$loadMetaInfoSuspend$1.label = i - Integer.MIN_VALUE;
            } else {
                metaInfoManager$loadMetaInfoSuspend$1 = new MetaInfoManager$loadMetaInfoSuspend$1(this, continuation);
            }
        }
        java.lang.Object objAwaitFirstOrNull = metaInfoManager$loadMetaInfoSuspend$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = metaInfoManager$loadMetaInfoSuspend$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwaitFirstOrNull);
                if (z) {
                    try {
                        Result.Application application = Result.Companion;
                        AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl((AbstractC58185ywX) tXW.AEQbTJ.AEQbTJ());
                        metaInfoManager$loadMetaInfoSuspend$1.L$0 = this;
                        metaInfoManager$loadMetaInfoSuspend$1.label = 1;
                        objAwaitFirstOrNull = AwaitKt.awaitFirstOrNull(abstractC58185ywXKWHzl, metaInfoManager$loadMetaInfoSuspend$1);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        txo = this;
                        Result.Application application2 = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                    if (objAwaitFirstOrNull == objCopydefault) {
                        return objCopydefault;
                    }
                    txo = this;
                    objM7377constructorimpl = Result.m7377constructorimpl((ResponseData) objAwaitFirstOrNull);
                    if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    }
                    responseData = (ResponseData) objM7377constructorimpl;
                    if (responseData != null) {
                    }
                } else {
                    SupportRemoteDataSource supportRemoteDataSourceKWHzl = SupportRemoteDataSource.Companion.KWHzl();
                    metaInfoManager$loadMetaInfoSuspend$1.L$0 = this;
                    metaInfoManager$loadMetaInfoSuspend$1.label = 2;
                    objAwaitFirstOrNull = supportRemoteDataSourceKWHzl.appMetaInfo(metaInfoManager$loadMetaInfoSuspend$1);
                    if (objAwaitFirstOrNull == objCopydefault) {
                        return objCopydefault;
                    }
                    txo2 = this;
                    appMetaInfo = (AppMetaInfo) ((ResponseData) objAwaitFirstOrNull).getData();
                    if (appMetaInfo != null) {
                        listAhwBna2 = yDY.AhwBna();
                        if (!listAhwBna2.isEmpty()) {
                        }
                    }
                }
            } else if (i2 == 1) {
                txo = (tXO) metaInfoManager$loadMetaInfoSuspend$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objAwaitFirstOrNull);
                    objM7377constructorimpl = Result.m7377constructorimpl((ResponseData) objAwaitFirstOrNull);
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    Result.Application application22 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = null;
                }
                responseData = (ResponseData) objM7377constructorimpl;
                if (responseData != null) {
                    return Unit.INSTANCE;
                }
                UserMetaInfo userMetaInfo = (UserMetaInfo) responseData.getData();
                if (userMetaInfo == null || (listAhwBna = userMetaInfo.getCaptchaVendors()) == null) {
                    listAhwBna = yDY.AhwBna();
                }
                if (!listAhwBna.isEmpty()) {
                    lWe lweCopydefault = txo.copydefault();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator<T> it = listAhwBna.iterator();
                    while (it.hasNext()) {
                        CaptchaVendor captchaVendorKWHzl = CaptchaVendor.Companion.KWHzl((java.lang.String) it.next());
                        if (captchaVendorKWHzl != null) {
                            arrayList.add(captchaVendorKWHzl);
                        }
                    }
                    lweCopydefault.KWHzl(arrayList);
                }
                UserMetaInfo userMetaInfo2 = (UserMetaInfo) responseData.getData();
                if (userMetaInfo2 != null && (userInfo = userMetaInfo2.getUserInfo()) != null && (guidanceItems = userInfo.getGuidanceItems()) != null && guidanceItems.size() > 0) {
                    BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new MetaInfoManager$loadMetaInfoSuspend$3(null), 2, null);
                }
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                txo2 = (tXO) metaInfoManager$loadMetaInfoSuspend$1.L$0;
                C56391yDq.AEQbTJ(objAwaitFirstOrNull);
                appMetaInfo = (AppMetaInfo) ((ResponseData) objAwaitFirstOrNull).getData();
                if (appMetaInfo != null || (listAhwBna2 = appMetaInfo.KWHzl()) == null) {
                    listAhwBna2 = yDY.AhwBna();
                }
                if (!listAhwBna2.isEmpty()) {
                    lWe lweCopydefault2 = txo2.copydefault();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.Iterator<T> it2 = listAhwBna2.iterator();
                    while (it2.hasNext()) {
                        CaptchaVendor captchaVendorKWHzl2 = CaptchaVendor.Companion.KWHzl((java.lang.String) it2.next());
                        if (captchaVendorKWHzl2 != null) {
                            arrayList2.add(captchaVendorKWHzl2);
                        }
                    }
                    lweCopydefault2.KWHzl(arrayList2);
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return Unit.INSTANCE;
    }
}
