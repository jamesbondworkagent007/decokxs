package o;

import com.okinc.business.defi.dapp.utils.FeatureLimitUtilsKt$inviseFeatureIsHidden$1;
import com.okinc.business.defi.dapp.utils.FeatureLimitUtilsKt$nftFeatureIsHidden$1;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dyI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C15115dyI {
    public static final java.lang.Object copydefault(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return C56443yFo.KWHzl(((OKComplianceRestrictionService) C43248rlh.KWHzl.AEQbTJ(OKComplianceRestrictionService.class)).AEQbTJ(OKComplianceRestrictionService.Feature.WEB3DISCOVER));
    }

    public static final java.lang.Object EZpvd(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return C56443yFo.KWHzl(((OKComplianceRestrictionService) C43248rlh.KWHzl.AEQbTJ(OKComplianceRestrictionService.class)).OLrzqt(OKComplianceRestrictionService.Feature.WEB3DISCOVER));
    }

    public static final java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return ((gKO) C43248rlh.KWHzl.AEQbTJ(gKO.class)).KWHzl(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object AEQbTJ(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        FeatureLimitUtilsKt$nftFeatureIsHidden$1 featureLimitUtilsKt$nftFeatureIsHidden$1;
        boolean zBooleanValue;
        InterfaceC9773bbs interfaceC9773bbs;
        if (continuation instanceof FeatureLimitUtilsKt$nftFeatureIsHidden$1) {
            featureLimitUtilsKt$nftFeatureIsHidden$1 = (FeatureLimitUtilsKt$nftFeatureIsHidden$1) continuation;
            int i = featureLimitUtilsKt$nftFeatureIsHidden$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                featureLimitUtilsKt$nftFeatureIsHidden$1.label = i - Integer.MIN_VALUE;
            } else {
                featureLimitUtilsKt$nftFeatureIsHidden$1 = new FeatureLimitUtilsKt$nftFeatureIsHidden$1(continuation);
            }
        }
        java.lang.Object objOLrzqt = featureLimitUtilsKt$nftFeatureIsHidden$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = featureLimitUtilsKt$nftFeatureIsHidden$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            java.util.List listKWHzl = C43251rlk.KWHzl(InterfaceC9773bbs.class);
            zBooleanValue = false;
            if (listKWHzl != null) {
                if (listKWHzl.isEmpty()) {
                    listKWHzl = null;
                }
                if (listKWHzl != null && (interfaceC9773bbs = (InterfaceC9773bbs) listKWHzl.get(0)) != null) {
                    featureLimitUtilsKt$nftFeatureIsHidden$1.label = 1;
                    objOLrzqt = interfaceC9773bbs.OLrzqt(featureLimitUtilsKt$nftFeatureIsHidden$1);
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                }
            }
            return C56443yFo.KWHzl(zBooleanValue);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(objOLrzqt);
        zBooleanValue = ((java.lang.Boolean) objOLrzqt).booleanValue();
        return C56443yFo.KWHzl(zBooleanValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object OLrzqt(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        FeatureLimitUtilsKt$inviseFeatureIsHidden$1 featureLimitUtilsKt$inviseFeatureIsHidden$1;
        boolean zBooleanValue;
        InterfaceC9774bbt interfaceC9774bbt;
        if (continuation instanceof FeatureLimitUtilsKt$inviseFeatureIsHidden$1) {
            featureLimitUtilsKt$inviseFeatureIsHidden$1 = (FeatureLimitUtilsKt$inviseFeatureIsHidden$1) continuation;
            int i = featureLimitUtilsKt$inviseFeatureIsHidden$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                featureLimitUtilsKt$inviseFeatureIsHidden$1.label = i - Integer.MIN_VALUE;
            } else {
                featureLimitUtilsKt$inviseFeatureIsHidden$1 = new FeatureLimitUtilsKt$inviseFeatureIsHidden$1(continuation);
            }
        }
        java.lang.Object objKWHzl = featureLimitUtilsKt$inviseFeatureIsHidden$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = featureLimitUtilsKt$inviseFeatureIsHidden$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            java.util.List listKWHzl = C43251rlk.KWHzl(InterfaceC9774bbt.class);
            zBooleanValue = false;
            if (listKWHzl != null) {
                if (listKWHzl.isEmpty()) {
                    listKWHzl = null;
                }
                if (listKWHzl != null && (interfaceC9774bbt = (InterfaceC9774bbt) listKWHzl.get(0)) != null) {
                    featureLimitUtilsKt$inviseFeatureIsHidden$1.label = 1;
                    objKWHzl = interfaceC9774bbt.KWHzl(featureLimitUtilsKt$inviseFeatureIsHidden$1);
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                }
            }
            return C56443yFo.KWHzl(zBooleanValue);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(objKWHzl);
        zBooleanValue = ((java.lang.Boolean) objKWHzl).booleanValue();
        return C56443yFo.KWHzl(zBooleanValue);
    }
}
