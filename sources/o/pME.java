package o;

import com.okinc.lifecycle.api.business.shortlink.ShortLinkFailureReason;
import com.okinc.lifecycle.impl.deeplink.usecase.ShortLinkInfoUseCaseImpl$getShortLinkInfoWithParams$1;
import com.okinc.lifecycle.impl.deeplink.usecase.ShortLinkInfoUseCaseImpl$getShortLinkInfoWithoutParams$1;
import com.okinc.network.okg.response.ResponseData;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.pKG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pME implements pMI {
    public static final ActionBar Companion = new ActionBar(null);
    public static final kotlin.ranges.IntRange copydefault = new kotlin.ranges.IntRange(6, 7);
    public final InterfaceC38106pMl AEQbTJ;
    public final InterfaceC38101pMg EZpvd;
    public final pLC KWHzl;

    @yCM
    public pME(@NotNull InterfaceC38106pMl interfaceC38106pMl, @NotNull InterfaceC38101pMg interfaceC38101pMg, @NotNull pLC plc) {
        Intrinsics.checkNotNullParameter(interfaceC38106pMl, "");
        Intrinsics.checkNotNullParameter(interfaceC38101pMg, "");
        Intrinsics.checkNotNullParameter(plc, "");
        this.AEQbTJ = interfaceC38106pMl;
        this.EZpvd = interfaceC38101pMg;
        this.KWHzl = plc;
    }

    @Override // o.pMI
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super pKG> continuation) {
        if (this.KWHzl.copydefault()) {
            return OLrzqt(str, continuation);
        }
        return copydefault(str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.lang.String str, Continuation<? super pKG> continuation) throws java.lang.Throwable {
        ShortLinkInfoUseCaseImpl$getShortLinkInfoWithParams$1 shortLinkInfoUseCaseImpl$getShortLinkInfoWithParams$1;
        pME pme;
        if (continuation instanceof ShortLinkInfoUseCaseImpl$getShortLinkInfoWithParams$1) {
            shortLinkInfoUseCaseImpl$getShortLinkInfoWithParams$1 = (ShortLinkInfoUseCaseImpl$getShortLinkInfoWithParams$1) continuation;
            int i = shortLinkInfoUseCaseImpl$getShortLinkInfoWithParams$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                shortLinkInfoUseCaseImpl$getShortLinkInfoWithParams$1.label = i - Integer.MIN_VALUE;
            } else {
                shortLinkInfoUseCaseImpl$getShortLinkInfoWithParams$1 = new ShortLinkInfoUseCaseImpl$getShortLinkInfoWithParams$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = shortLinkInfoUseCaseImpl$getShortLinkInfoWithParams$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = shortLinkInfoUseCaseImpl$getShortLinkInfoWithParams$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                java.util.Map<java.lang.String, java.lang.String> mapOLrzqt = OLrzqt(str);
                if (mapOLrzqt.isEmpty()) {
                    return new pKG.StateListAnimator(ShortLinkFailureReason.INVALID_SHORT_LINK);
                }
                InterfaceC38106pMl interfaceC38106pMl = this.AEQbTJ;
                shortLinkInfoUseCaseImpl$getShortLinkInfoWithParams$1.L$0 = this;
                shortLinkInfoUseCaseImpl$getShortLinkInfoWithParams$1.label = 1;
                objOLrzqt = interfaceC38106pMl.OLrzqt(mapOLrzqt, shortLinkInfoUseCaseImpl$getShortLinkInfoWithParams$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                pme = this;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pme = (pME) shortLinkInfoUseCaseImpl$getShortLinkInfoWithParams$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            return pme.KWHzl((ResponseData<C38108pMn>) objOLrzqt);
        } catch (java.lang.Exception unused) {
            return new pKG.StateListAnimator(ShortLinkFailureReason.API_FAIL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(java.lang.String str, Continuation<? super pKG> continuation) throws java.lang.Throwable {
        ShortLinkInfoUseCaseImpl$getShortLinkInfoWithoutParams$1 shortLinkInfoUseCaseImpl$getShortLinkInfoWithoutParams$1;
        pME pme;
        if (continuation instanceof ShortLinkInfoUseCaseImpl$getShortLinkInfoWithoutParams$1) {
            shortLinkInfoUseCaseImpl$getShortLinkInfoWithoutParams$1 = (ShortLinkInfoUseCaseImpl$getShortLinkInfoWithoutParams$1) continuation;
            int i = shortLinkInfoUseCaseImpl$getShortLinkInfoWithoutParams$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                shortLinkInfoUseCaseImpl$getShortLinkInfoWithoutParams$1.label = i - Integer.MIN_VALUE;
            } else {
                shortLinkInfoUseCaseImpl$getShortLinkInfoWithoutParams$1 = new ShortLinkInfoUseCaseImpl$getShortLinkInfoWithoutParams$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = shortLinkInfoUseCaseImpl$getShortLinkInfoWithoutParams$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = shortLinkInfoUseCaseImpl$getShortLinkInfoWithoutParams$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                java.lang.String strKWHzl = KWHzl(str);
                if (strKWHzl.length() == 0) {
                    return new pKG.StateListAnimator(ShortLinkFailureReason.INVALID_SHORT_LINK);
                }
                InterfaceC38106pMl interfaceC38106pMl = this.AEQbTJ;
                shortLinkInfoUseCaseImpl$getShortLinkInfoWithoutParams$1.L$0 = this;
                shortLinkInfoUseCaseImpl$getShortLinkInfoWithoutParams$1.label = 1;
                objKWHzl = interfaceC38106pMl.KWHzl(strKWHzl, shortLinkInfoUseCaseImpl$getShortLinkInfoWithoutParams$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                pme = this;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pme = (pME) shortLinkInfoUseCaseImpl$getShortLinkInfoWithoutParams$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
            }
            return pme.KWHzl((ResponseData<C38108pMn>) objKWHzl);
        } catch (java.lang.Exception unused) {
            return new pKG.StateListAnimator(ShortLinkFailureReason.API_FAIL);
        }
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        java.util.List listSplit$default;
        try {
            java.lang.String path = android.net.Uri.parse(str).getPath();
            java.lang.String str2 = (path == null || (listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) path, new java.lang.String[]{"/"}, false, 0, 6, (java.lang.Object) null)) == null) ? null : (java.lang.String) CollectionsKt___CollectionsKt.wlaJM(listSplit$default);
            if (str2 != null) {
                return str2;
            }
        } catch (java.lang.Exception unused) {
            kotlin.ranges.IntRange intRange = copydefault;
            int iKWHzl = intRange.KWHzl();
            int iCopydefault = intRange.copydefault();
            int length = str.length();
            if (iKWHzl <= length && length <= iCopydefault) {
                return str;
            }
        }
        return "";
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pME.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final pKG KWHzl(ResponseData<C38108pMn> responseData) {
        if (responseData.getCode() == 0) {
            C38108pMn data = responseData.getData();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (data != null ? data.AEQbTJ() : null))) {
                C38108pMn data2 = responseData.getData();
                java.lang.String strAEQbTJ = data2 != null ? data2.AEQbTJ() : null;
                if (strAEQbTJ == null) {
                    strAEQbTJ = "";
                }
                return new pKG.ActionBar(strAEQbTJ, this.EZpvd.OLrzqt(strAEQbTJ));
            }
        }
        return new pKG.StateListAnimator(responseData.getCode() == 0 ? ShortLinkFailureReason.NO_DEEPLINK : ShortLinkFailureReason.API_FAIL);
    }

    public final java.util.Map<java.lang.String, java.lang.String> OLrzqt(java.lang.String str) {
        java.util.List listSplit$default;
        try {
            android.net.Uri uri = android.net.Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(uri, "");
            java.lang.String path = uri.getPath();
            java.lang.String str2 = (path == null || (listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) path, new java.lang.String[]{"/"}, false, 0, 6, (java.lang.Object) null)) == null) ? null : (java.lang.String) CollectionsKt___CollectionsKt.wlaJM(listSplit$default);
            if (str2 == null) {
                str2 = "";
            }
            if (str2.length() == 0) {
                return C56424yEw.KWHzl();
            }
            java.util.Set<java.lang.String> queryParameterNames = uri.getQueryParameterNames();
            Intrinsics.checkNotNullExpressionValue(queryParameterNames, "");
            java.util.Set<java.lang.String> set = queryParameterNames;
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(set, 10)), 16));
            for (java.lang.Object obj : set) {
                java.lang.String queryParameter = uri.getQueryParameter((java.lang.String) obj);
                if (queryParameter == null) {
                    queryParameter = "";
                }
                linkedHashMap.put(obj, queryParameter);
            }
            return C56424yEw.OLrzqt(C56423yEv.EZpvd(C56390yDp.OLrzqt("shortCode", str2)), linkedHashMap);
        } catch (java.lang.Exception unused) {
            kotlin.ranges.IntRange intRange = copydefault;
            int iKWHzl = intRange.KWHzl();
            int iCopydefault = intRange.copydefault();
            int length = str.length();
            if (iKWHzl <= length && length <= iCopydefault) {
                return C56423yEv.EZpvd(C56390yDp.OLrzqt("shortCode", str));
            }
            return C56424yEw.KWHzl();
        }
    }
}
