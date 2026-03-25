package o;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.wallet.metricsmonitor.AddOrRemoveType;
import com.okinc.business.defi.wallet.metricsmonitor.CreateOrImportType;
import com.okinc.business.defi.wallet.metricsmonitor.DeleteActionType;
import com.okinc.business.defi.wallet.metricsmonitor.EncryptionMethod;
import com.okinc.business.defi.wallet.metricsmonitor.WalletOrAccountType;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fja, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18500fja implements InterfaceC18445fiY {
    public final C10948byA KWHzl;
    public final Gson OLrzqt;
    public final ReportManager copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C18500fja() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public C18500fja(@NotNull ReportManager reportManager, @NotNull C10948byA c10948byA) {
        Intrinsics.checkNotNullParameter(reportManager, "");
        Intrinsics.checkNotNullParameter(c10948byA, "");
        this.copydefault = reportManager;
        this.KWHzl = c10948byA;
        this.OLrzqt = new Gson();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:com.okinc.components.report.ReportManager:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.components.report.ReportManager:0x0004: SGET  A[WRAPPED] (LINE:34) com.okinc.components.report.ReportManager.AEQbTJ com.okinc.components.report.ReportManager) : (r1v0 com.okinc.components.report.ReportManager))
  (wrap:o.byA:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.byA:0x000c: INVOKE (wrap:o.byG:0x000a: SGET  A[WRAPPED] (LINE:35) o.byG.EZpvd o.byG) VIRTUAL call: o.byG.valueOf():o.byA A[MD:():o.byA (m), WRAPPED] (LINE:35)) : (r2v0 o.byA))
 A[MD:(com.okinc.components.report.ReportManager, o.byA):void (m)] (LINE:33) call: o.fja.<init>(com.okinc.components.report.ReportManager, o.byA):void type: THIS */
    public /* synthetic */ C18500fja(ReportManager reportManager, C10948byA c10948byA, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ReportManager.AEQbTJ : reportManager, (i & 2) != 0 ? C10954byG.EZpvd.valueOf() : c10948byA);
    }

    @Override // o.InterfaceC18445fiY
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ReportManager reportManager = this.copydefault;
        EventData eventData = new EventData();
        eventData.setAct("wallet_homepage_view");
        eventData.setPath(str);
        eventData.setAttrs(C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", "false")));
        reportManager.EZpvd(eventData);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.InterfaceC18445fiY
    public void copydefault(@NotNull java.lang.String str, WalletType walletType, java.lang.String str2, @NotNull EncryptionMethod encryptionMethod, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(encryptionMethod, "");
        ReportManager reportManager = this.copydefault;
        EventData eventData = new EventData();
        eventData.setAct("wallet_homepage_view");
        eventData.setPath(str);
        kotlin.Pair[] pairArr = new kotlin.Pair[5];
        pairArr[0] = C56390yDp.OLrzqt("attr_1", "true");
        java.lang.String strEZpvd = walletType != null ? C18446fiZ.EZpvd(walletType) : null;
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        pairArr[1] = C56390yDp.OLrzqt("attr_2", strEZpvd);
        if (str2 == null) {
            str2 = "";
        }
        pairArr[2] = C56390yDp.OLrzqt("attr_3", str2);
        pairArr[3] = C56390yDp.OLrzqt("attr_4", encryptionMethod.getStringValue());
        pairArr[4] = C56390yDp.OLrzqt("attr_5", java.lang.String.valueOf(z));
        java.util.Map mapGEmmrt = C56424yEw.gEmmrt(pairArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapGEmmrt.entrySet()) {
            if (((java.lang.CharSequence) entry.getValue()).length() != 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        eventData.setAttrs(linkedHashMap);
        reportManager.EZpvd(eventData);
    }

    @Override // o.InterfaceC18445fiY
    public void EZpvd(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        ReportManager reportManager = this.copydefault;
        EventData eventData = new EventData();
        eventData.setAct("app_home_animation_finished");
        eventData.setPath(str);
        eventData.setAttrs(C56424yEw.gEmmrt(C56390yDp.OLrzqt("attr_1", "success"), C56390yDp.OLrzqt("attr_2", java.lang.String.valueOf(j))));
        reportManager.EZpvd(eventData);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.InterfaceC18445fiY
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.Long l, @NotNull AddOrRemoveType addOrRemoveType, WalletType walletType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(addOrRemoveType, "");
        ReportManager reportManager = this.copydefault;
        EventData eventData = new EventData();
        eventData.setAct("app_home_manage_custom_asset_coin");
        eventData.setPath(str);
        kotlin.Pair[] pairArr = new kotlin.Pair[5];
        pairArr[0] = C56390yDp.OLrzqt("attr_1", str2);
        pairArr[1] = C56390yDp.OLrzqt("attr_2", str3);
        java.lang.String string = l != null ? l.toString() : null;
        if (string == null) {
            string = "";
        }
        pairArr[2] = C56390yDp.OLrzqt("attr_3", string);
        pairArr[3] = C56390yDp.OLrzqt("attr_4", addOrRemoveType.getStringValue());
        java.lang.String strEZpvd = walletType != null ? C18446fiZ.EZpvd(walletType) : null;
        pairArr[4] = C56390yDp.OLrzqt("attr_5", strEZpvd != null ? strEZpvd : "");
        java.util.Map mapGEmmrt = C56424yEw.gEmmrt(pairArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapGEmmrt.entrySet()) {
            if (((java.lang.CharSequence) entry.getValue()).length() != 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        eventData.setAttrs(linkedHashMap);
        reportManager.EZpvd(eventData);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.InterfaceC18445fiY
    public void KWHzl(@NotNull java.lang.String str, @NotNull OKWBaseTransaction.TransactionType transactionType, @NotNull java.lang.String str2, long j, @NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        ReportManager reportManager = this.copydefault;
        EventData eventData = new EventData();
        eventData.setAct("connect_hardware_wallet");
        eventData.setPath(str);
        java.util.Map mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("attr_1", C18446fiZ.AEQbTJ(transactionType)), C56390yDp.OLrzqt("attr_2", str2), C56390yDp.OLrzqt("attr_3", java.lang.String.valueOf(j)), C56390yDp.OLrzqt("attr_4", C18446fiZ.KWHzl(abstractC12782ctV)));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapGEmmrt.entrySet()) {
            if (((java.lang.CharSequence) entry.getValue()).length() != 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        eventData.setAttrs(linkedHashMap);
        reportManager.EZpvd(eventData);
    }

    @Override // o.InterfaceC18445fiY
    public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, WalletType walletType, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        copydefault("connect_dapp_by_wallet_connect", str, str2, str3, walletType, str4);
    }

    @Override // o.InterfaceC18445fiY
    public void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, WalletType walletType, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        copydefault("connect_dapp_by_ton_connect", str, str2, str3, walletType, str4);
    }

    @Override // o.InterfaceC18445fiY
    public void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, WalletType walletType, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        copydefault("connect_dapp_by_okx_connect", str, str2, str3, walletType, str4);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, WalletType walletType, java.lang.String str5) {
        ReportManager reportManager = this.copydefault;
        EventData eventData = new EventData();
        eventData.setAct(str);
        eventData.setPath(str2);
        kotlin.Pair[] pairArr = new kotlin.Pair[4];
        pairArr[0] = C56390yDp.OLrzqt("attr_1", str3);
        pairArr[1] = C56390yDp.OLrzqt("attr_2", str4);
        java.lang.String strEZpvd = walletType != null ? C18446fiZ.EZpvd(walletType) : null;
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        pairArr[2] = C56390yDp.OLrzqt("attr_3", strEZpvd);
        if (str5 == null) {
            str5 = "";
        }
        pairArr[3] = C56390yDp.OLrzqt("attr_4", str5);
        java.util.Map mapGEmmrt = C56424yEw.gEmmrt(pairArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapGEmmrt.entrySet()) {
            if (((java.lang.CharSequence) entry.getValue()).length() != 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        eventData.setAttrs(linkedHashMap);
        reportManager.EZpvd(eventData);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.InterfaceC18445fiY
    public void copydefault(@NotNull java.lang.String str, java.lang.Integer num, @NotNull java.lang.String str2, java.lang.String str3, @NotNull CreateOrImportType createOrImportType, @NotNull WalletType walletType, WalletType walletType2, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(createOrImportType, "");
        Intrinsics.checkNotNullParameter(walletType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        ReportManager reportManager = this.copydefault;
        EventData eventData = new EventData();
        eventData.setAct("wallet_business_error");
        eventData.setPath(str);
        java.lang.String string = num != null ? num.toString() : null;
        if (string == null) {
            string = "";
        }
        eventData.setCode(string);
        eventData.setMsg(str2);
        kotlin.Pair[] pairArr = new kotlin.Pair[5];
        if (str3 == null) {
            str3 = "";
        }
        pairArr[0] = C56390yDp.OLrzqt("attr_1", str3);
        pairArr[1] = C56390yDp.OLrzqt("attr_2", createOrImportType.getStringValue());
        pairArr[2] = C56390yDp.OLrzqt("attr_3", C18446fiZ.EZpvd(walletType));
        java.lang.String strEZpvd = walletType2 != null ? C18446fiZ.EZpvd(walletType2) : null;
        pairArr[3] = C56390yDp.OLrzqt("attr_4", strEZpvd != null ? strEZpvd : "");
        pairArr[4] = C56390yDp.OLrzqt("attr_5", str4);
        java.util.Map mapGEmmrt = C56424yEw.gEmmrt(pairArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapGEmmrt.entrySet()) {
            if (((java.lang.CharSequence) entry.getValue()).length() != 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        eventData.setAttrs(linkedHashMap);
        reportManager.EZpvd(eventData);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.fiZ.OLrzqt(com.okinc.business.defi.biz.constant.WalletType):java.lang.String */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.InterfaceC18445fiY
    public void AEQbTJ(@NotNull java.lang.String str, WalletType walletType, java.lang.String str2, boolean z, @NotNull WalletOrAccountType walletOrAccountType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(walletOrAccountType, "");
        ReportManager reportManager = this.copydefault;
        EventData eventData = new EventData();
        eventData.setAct("delete_reset_wallet");
        eventData.setPath(str);
        kotlin.Pair[] pairArr = new kotlin.Pair[5];
        pairArr[0] = C56390yDp.OLrzqt("attr_1", DeleteActionType.DELETE.getStringValue());
        java.lang.String strEZpvd = walletType != null ? C18446fiZ.EZpvd(walletType) : null;
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        pairArr[1] = C56390yDp.OLrzqt("attr_2", strEZpvd);
        if (str2 == null) {
            str2 = "";
        }
        pairArr[2] = C56390yDp.OLrzqt("attr_3", str2);
        pairArr[3] = C56390yDp.OLrzqt("attr_4", java.lang.String.valueOf(z));
        pairArr[4] = C56390yDp.OLrzqt("attr_5", walletOrAccountType.getStringValue());
        java.util.Map mapGEmmrt = C56424yEw.gEmmrt(pairArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapGEmmrt.entrySet()) {
            if (((java.lang.CharSequence) entry.getValue()).length() != 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        eventData.setAttrs(linkedHashMap);
        reportManager.EZpvd(eventData);
    }

    @Override // o.InterfaceC18445fiY
    public void copydefault(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        ReportManager reportManager = this.copydefault;
        EventData eventData = new EventData();
        eventData.setAct("delete_reset_wallet");
        eventData.setPath(str);
        eventData.setAttrs(C56424yEw.gEmmrt(C56390yDp.OLrzqt("attr_1", DeleteActionType.RESET.getStringValue()), C56390yDp.OLrzqt("attr_4", java.lang.String.valueOf(z))));
        reportManager.EZpvd(eventData);
    }

    @Override // o.InterfaceC18445fiY
    public void KWHzl(@NotNull java.lang.String str, @NotNull AbstractC12782ctV abstractC12782ctV, @NotNull CreateOrImportType createOrImportType, @NotNull java.lang.String str2) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(createOrImportType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            Result.Application application = Result.Companion;
            Gson gson = this.OLrzqt;
            java.util.List<ChainAddress> listValueOf = abstractC12782ctV.valueOf();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listValueOf, 10));
            for (ChainAddress chainAddress : listValueOf) {
                JsonObject jsonObject = new JsonObject();
                C10854bwM c10854bwMKWHzl = this.KWHzl.KWHzl(chainAddress.getCoinId());
                jsonObject.addProperty("chainId", java.lang.String.valueOf(c10854bwMKWHzl != null ? java.lang.Long.valueOf(c10854bwMKWHzl.fetchVPNInfo()) : ""));
                jsonObject.addProperty(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, chainAddress.getAddress());
                arrayList.add(jsonObject);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(gson.toJson(arrayList));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.KWHzl(thM7380exceptionOrNullimpl);
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        java.lang.String str3 = (java.lang.String) objM7377constructorimpl;
        java.lang.String str4 = str3 != null ? str3 : "";
        ReportManager reportManager = this.copydefault;
        EventData eventData = new EventData();
        eventData.setAct("add_wallet_success");
        eventData.setPath(str);
        eventData.setAttrs(C56424yEw.gEmmrt(C56390yDp.OLrzqt("attr_1", C18446fiZ.EZpvd(abstractC12782ctV.QwvEab())), C56390yDp.OLrzqt("attr_2", createOrImportType.getStringValue()), C56390yDp.OLrzqt("attr_3", str4), C56390yDp.OLrzqt("attr_4", str2), C56390yDp.OLrzqt("attr_5", abstractC12782ctV.DbNXlk())));
        reportManager.EZpvd(eventData);
    }
}
