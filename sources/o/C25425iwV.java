package o;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iwV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C25425iwV implements InterfaceC7380aij {
    public static final ActionBar Companion = new ActionBar(null);

    /* JADX INFO: renamed from: o.iwV$ActionBar */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iwV.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.InterfaceC7380aij
    public java.util.Set<java.lang.String> KWHzl() {
        return yEE.AhwBna("investHomePage", "InvestActivityV2", "investProductDetailPage", "investHome2ndPage", "investSearchPage", "boostTrade");
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [74=6] */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:143:0x01db */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:88:0x0134 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: java.lang.String */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // o.InterfaceC7380aij
    public void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull InterfaceC7379aii interfaceC7379aii) {
        java.lang.String str2;
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC7379aii, "");
        InterfaceC25429iwZ interfaceC25429iwZ = (InterfaceC25429iwZ) C43248rlh.KWHzl.OLrzqt(InterfaceC25429iwZ.class);
        switch (str.hashCode()) {
            case -1880263124:
                if (str.equals("investSearchPage")) {
                    java.lang.Object obj = map != null ? map.get("searchKey") : null;
                    java.lang.String strGEmmrt = C33129mqd.gEmmrt(obj instanceof java.lang.String ? (java.lang.String) obj : null);
                    java.lang.Object obj2 = map != null ? map.get("chainId") : null;
                    java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null);
                    java.lang.Object obj3 = map != null ? map.get("tagType") : null;
                    java.lang.String strGEmmrt3 = C33129mqd.gEmmrt(obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null);
                    if ((context instanceof android.app.Activity ? (android.app.Activity) context : null) != null) {
                        ActivityC26554jeX.Companion.EZpvd((android.app.Activity) context, strGEmmrt, strGEmmrt2, strGEmmrt3);
                    }
                    break;
                }
                break;
            case 36177888:
                if (str.equals("InvestActivityV2")) {
                    java.lang.Object obj4 = map != null ? map.get("specialzoneTabId") : null;
                    obj = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
                    str2 = obj != null ? obj : "";
                    if (interfaceC25429iwZ != null) {
                        interfaceC25429iwZ.KWHzl(context, str2);
                    }
                    break;
                }
                break;
            case 718256931:
                if (str.equals("investHome2ndPage")) {
                    java.lang.Object obj5 = map != null ? map.get("tabId") : null;
                    int iAhwBna = C33129mqd.AhwBna(obj5 instanceof java.lang.Integer ? (java.lang.Integer) obj5 : null);
                    java.lang.Object obj6 = map != null ? map.get("itemKey") : null;
                    java.lang.String strGEmmrt4 = C33129mqd.gEmmrt(obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null);
                    java.lang.Object obj7 = map != null ? map.get("totalTokenAmount") : null;
                    java.lang.String strGEmmrt5 = C33129mqd.gEmmrt(obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null);
                    java.lang.Object obj8 = map != null ? map.get("source") : null;
                    java.lang.String strGEmmrt6 = C33129mqd.gEmmrt(obj8 instanceof java.lang.String ? (java.lang.String) obj8 : null);
                    if (interfaceC25429iwZ != null) {
                        interfaceC25429iwZ.EZpvd(context, iAhwBna, strGEmmrt4, strGEmmrt5, strGEmmrt6);
                    }
                    break;
                }
                break;
            case 1027539747:
                if (str.equals("investHomePage")) {
                    java.lang.Object obj9 = map != null ? map.get("entryType") : null;
                    java.lang.Integer num = obj9 instanceof java.lang.Integer ? (java.lang.Integer) obj9 : null;
                    int iIntValue = num != null ? num.intValue() : 0;
                    java.lang.Object obj10 = map != null ? map.get("source") : null;
                    obj = obj10 instanceof java.lang.String ? (java.lang.String) obj10 : null;
                    str2 = obj != null ? obj : "";
                    if (iIntValue == 0) {
                        if (interfaceC25429iwZ != null) {
                            interfaceC25429iwZ.copydefault(context, str2);
                        }
                        break;
                    } else if (iIntValue == 1) {
                        C27508jwX c27508jwX = C27508jwX.AEQbTJ;
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putString("source", str2);
                        Unit unit = Unit.INSTANCE;
                        c27508jwX.OLrzqt(context, bundle);
                        break;
                    }
                }
                break;
            case 1721740161:
                if (str.equals("boostTrade")) {
                    try {
                        Result.Application application = Result.Companion;
                        long jValueOf = C33129mqd.valueOf(map != null ? map.get("investmentId") : null);
                        long jValueOf2 = C33129mqd.valueOf(map != null ? map.get("chainId") : null);
                        long jValueOf3 = C33129mqd.valueOf(map != null ? map.get(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION) : null);
                        long jValueOf4 = C33129mqd.valueOf(map != null ? map.get("stakeId") : null);
                        android.content.Context context2 = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                        if (context2 != null && interfaceC25429iwZ != null) {
                            if (jValueOf3 == 1) {
                                interfaceC25429iwZ.EZpvd(context2, jValueOf4, jValueOf, jValueOf2, new TaskDescription());
                            } else if (jValueOf3 == 2) {
                                interfaceC25429iwZ.AEQbTJ(context2, jValueOf4, jValueOf, jValueOf2, new Activity());
                            }
                            obj = Unit.INSTANCE;
                        }
                        objM7377constructorimpl = Result.m7377constructorimpl(obj);
                    } catch (java.lang.Throwable th) {
                        Result.Application application2 = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                    java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        pUU.AEQbTJ("XStake", "GO_TO_STAKE route failed", thM7380exceptionOrNullimpl);
                    }
                    break;
                }
                break;
            case 1742623066:
                if (str.equals("investProductDetailPage")) {
                    long jValueOf5 = C33129mqd.valueOf(map != null ? map.get("investmentId") : null);
                    java.lang.Object obj11 = map != null ? map.get("source") : null;
                    java.lang.String str3 = obj11 instanceof java.lang.String ? (java.lang.String) obj11 : null;
                    if (str3 == null) {
                        str3 = "";
                    }
                    java.lang.Object obj12 = map != null ? map.get("investmentCategory") : null;
                    java.lang.Integer num2 = obj12 instanceof java.lang.Integer ? (java.lang.Integer) obj12 : null;
                    if (interfaceC25429iwZ != null) {
                        interfaceC25429iwZ.AEQbTJ(context, jValueOf5, jValueOf5, str3, num2);
                    }
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: o.iwV$TaskDescription */
    public static final class TaskDescription implements InterfaceC25422iwS {
        @Override // o.InterfaceC25422iwS
        public void KWHzl() {
        }

        @Override // o.InterfaceC25422iwS
        public void OLrzqt() {
        }

        @Override // o.InterfaceC25422iwS
        public void KWHzl(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            pUU.EZpvd("XStake", "Stake------>>" + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: o.iwV$Activity */
    public static final class Activity implements InterfaceC25422iwS {
        @Override // o.InterfaceC25422iwS
        public void KWHzl() {
        }

        @Override // o.InterfaceC25422iwS
        public void OLrzqt() {
        }

        @Override // o.InterfaceC25422iwS
        public void KWHzl(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            pUU.EZpvd("XStake", "UnStake------>>" + th.getMessage());
        }
    }
}
