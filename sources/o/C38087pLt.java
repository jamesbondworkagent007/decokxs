package o;

import com.huawei.hms.framework.common.ContainerUtils;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.modular.deeplinkv2.DeeplinkMode;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pLt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38087pLt implements InterfaceC38089pLv {
    public final C43239rlY AEQbTJ;
    public final OKComplianceRestrictionService KWHzl;
    public final InterfaceC33171mrS copydefault;

    @yCM
    public C38087pLt(@NotNull InterfaceC33171mrS interfaceC33171mrS, @NotNull C43239rlY c43239rlY, @NotNull OKComplianceRestrictionService oKComplianceRestrictionService) {
        Intrinsics.checkNotNullParameter(interfaceC33171mrS, "");
        Intrinsics.checkNotNullParameter(c43239rlY, "");
        Intrinsics.checkNotNullParameter(oKComplianceRestrictionService, "");
        this.copydefault = interfaceC33171mrS;
        this.AEQbTJ = c43239rlY;
        this.KWHzl = oKComplianceRestrictionService;
    }

    public final java.lang.String copydefault(DeeplinkMode deeplinkMode, java.lang.String str) {
        return deeplinkMode.getMode() + "/" + str;
    }

    @Override // o.InterfaceC38089pLv
    public kotlin.Pair<InterfaceC43233rlS, java.util.Map<java.lang.String, java.lang.Object>> EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C38088pLu c38088pLuAEQbTJ = AEQbTJ(str);
        if (c38088pLuAEQbTJ == null) {
            return new kotlin.Pair<>(null, C56424yEw.KWHzl());
        }
        return new kotlin.Pair<>(KWHzl(c38088pLuAEQbTJ), c38088pLuAEQbTJ.OLrzqt());
    }

    @Override // o.InterfaceC38089pLv
    public InterfaceC43234rlT EZpvd(@NotNull InterfaceC43233rlS interfaceC43233rlS) {
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        InterfaceC56387yDm<InterfaceC43234rlT> interfaceC56387yDm = this.AEQbTJ.EZpvd().get(copydefault(interfaceC43233rlS.KWHzl(), interfaceC43233rlS.OLrzqt()));
        if (interfaceC56387yDm != null) {
            return interfaceC56387yDm.getValue();
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.Pair<? extends o.rlS, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC38089pLv
    public kotlin.Pair<InterfaceC43233rlS, java.util.Map<java.lang.String, java.lang.Object>> OLrzqt(@NotNull kotlin.Pair<? extends InterfaceC43233rlS, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> pair, @NotNull java.lang.String str) {
        InterfaceC43233rlS interfaceC43233rlSKWHzl;
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(str, "");
        C38088pLu c38088pLuAEQbTJ = AEQbTJ(str);
        return (c38088pLuAEQbTJ == null || c38088pLuAEQbTJ.AEQbTJ() == ((InterfaceC43233rlS) pair.getFirst()).KWHzl() || (interfaceC43233rlSKWHzl = KWHzl(c38088pLuAEQbTJ)) == null) ? pair : new kotlin.Pair<>(interfaceC43233rlSKWHzl, pair.getSecond());
    }

    public final InterfaceC43233rlS KWHzl(C38088pLu c38088pLu) {
        return this.AEQbTJ.copydefault().get(copydefault(c38088pLu.AEQbTJ(), c38088pLu.KWHzl()));
    }

    public final C38088pLu AEQbTJ(java.lang.String str) {
        try {
            java.lang.String strKWHzl = StringsKt__StringsKt.KWHzl(str, "://", "");
            java.lang.String str2 = (java.lang.String) StringsKt__StringsKt.split$default((java.lang.CharSequence) strKWHzl, new java.lang.String[]{"/"}, false, 0, 6, (java.lang.Object) null).get(0);
            try {
                DeeplinkMode deeplinkModeCopydefault = copydefault(str2);
                if (deeplinkModeCopydefault == null) {
                    return null;
                }
                return new C38088pLu((java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(StringsKt__StringsKt.split$default((java.lang.CharSequence) StringsKt__StringsKt.substringAfter$default(strKWHzl, str2 + "/", (java.lang.String) null, 2, (java.lang.Object) null), new java.lang.String[]{"?"}, false, 0, 6, (java.lang.Object) null)), deeplinkModeCopydefault, KWHzl(str));
            } catch (java.lang.Exception unused) {
                return null;
            }
        } catch (java.lang.Exception unused2) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        if (r6.equals("metaX") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        if (r6.equals("wallet") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007a, code lost:
    
        return com.okinc.modular.deeplinkv2.DeeplinkMode.WALLET;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DeeplinkMode copydefault(java.lang.String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -795192327) {
            if (iHashCode != 103787251) {
                if (iHashCode == 1989774883 && str.equals("exchange")) {
                    OKComplianceRestrictionService oKComplianceRestrictionService = this.KWHzl;
                    OKComplianceRestrictionService.CefiMode cefiMode = OKComplianceRestrictionService.CefiMode.PRO;
                    return (oKComplianceRestrictionService.AEQbTJ(cefiMode) && this.KWHzl.AEQbTJ(OKComplianceRestrictionService.CefiMode.LITE)) ? this.copydefault.getFieldNames() ? DeeplinkMode.PRO : DeeplinkMode.LITE : this.KWHzl.AEQbTJ(cefiMode) ? DeeplinkMode.PRO : DeeplinkMode.LITE;
                }
            }
            for (DeeplinkMode deeplinkMode : DeeplinkMode.values()) {
                if (Intrinsics.EZpvd((java.lang.Object) deeplinkMode.getMode(), (java.lang.Object) str)) {
                    return deeplinkMode;
                }
            }
            return null;
        }
    }

    @Override // o.InterfaceC38089pLv
    public java.util.Map<java.lang.String, java.lang.String> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            android.net.Uri uri = android.net.Uri.parse(str);
            for (java.lang.String str2 : uri.getQueryParameterNames()) {
                java.lang.String queryParameter = uri.getQueryParameter(str2);
                if (queryParameter != null) {
                    linkedHashMap.put(str2, queryParameter);
                }
            }
        } catch (java.lang.Exception unused) {
            java.lang.String str3 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"?"}, false, 0, 6, (java.lang.Object) null), 1);
            if (str3 != null && C33129mqd.OLrzqt((java.lang.CharSequence) str3)) {
                java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str3, new java.lang.String[]{ContainerUtils.FIELD_DELIMITER}, false, 0, 6, (java.lang.Object) null);
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listSplit$default, 10));
                java.util.Iterator it = listSplit$default.iterator();
                while (it.hasNext()) {
                    java.util.List listSplit$default2 = StringsKt__StringsKt.split$default((java.lang.CharSequence) it.next(), new java.lang.String[]{ContainerUtils.KEY_VALUE_DELIMITER}, false, 0, 6, (java.lang.Object) null);
                    if (listSplit$default2.size() > 1) {
                        linkedHashMap.put(listSplit$default2.get(0), URLDecoder.decode((java.lang.String) listSplit$default2.get(1), "utf-8"));
                    }
                    arrayList.add(Unit.INSTANCE);
                }
            }
        }
        return linkedHashMap;
    }
}
