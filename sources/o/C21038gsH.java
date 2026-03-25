package o;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.biz.core.scan.TransactionInfo;
import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C10525bqB;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gsH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21038gsH {
    public static final C21038gsH copydefault = new C21038gsH();
    public static final java.util.HashMap<java.lang.String, C10525bqB> AEQbTJ = new java.util.HashMap<>();
    public static final int EZpvd = 8;

    private C21038gsH() {
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> copydefault() {
        return new kotlin.Pair<>(SPUtils.getString("receive_coin_id", MultiTransferSignData.DEFAULT_INTERVAL), SPUtils.getString("receive_wallet_id", MultiTransferSignData.DEFAULT_INTERVAL));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final Function1<? super C10525bqB, Unit> function1) {
        java.lang.String str4 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = str;
        if (str.length() == 0) {
            kotlin.Pair<java.lang.String, java.lang.String> pairCopydefault = copydefault();
            T first = str4;
            if (pairCopydefault.getFirst().length() != 0) {
                first = pairCopydefault.getFirst();
            }
            objectRef.element = first;
        }
        if (str2.length() == 0) {
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
            final Function1 function12 = new Function1() { // from class: o.gsI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C21038gsH.KWHzl(objectRef, function1, (AbstractC12782ctV) obj);
                }
            };
            InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gsG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C21038gsH.valueOf(function12, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.gsF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C21038gsH.EZpvd(function1, (java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gsE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C21038gsH.AhwBna(function13, obj);
                }
            });
            return;
        }
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str2, false);
        final Function1 function14 = new Function1() { // from class: o.gsM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21038gsH.OLrzqt(function1, objectRef, str3, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.gsL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21038gsH.AYXKKw(function14, obj);
            }
        };
        final Function1 function15 = new Function1() { // from class: o.gsJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21038gsH.AEQbTJ(function1, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.gsN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21038gsH.EZpvd(function15, obj);
            }
        });
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit KWHzl(Ref.ObjectRef objectRef, Function1 function1, AbstractC12782ctV abstractC12782ctV) {
        AbstractC12782ctV abstractC12782ctV2;
        AbstractC12782ctV abstractC12782ctV3;
        java.util.List<C10525bqB> listQHmsKR;
        java.util.List<C10525bqB> listQHmsKR2;
        C10525bqB c10525bqB = null;
        if (!abstractC12782ctV.zLjUOn()) {
            abstractC12782ctV2 = null;
        } else {
            if (abstractC12782ctV.QfsBiF()) {
                abstractC12782ctV2 = abstractC12782ctV;
                abstractC12782ctV3 = null;
                if (abstractC12782ctV3 != null) {
                    abstractC12782ctV2 = abstractC12782ctV3;
                }
                if (((java.lang.CharSequence) objectRef.element).length() != 0) {
                    if (abstractC12782ctV2 != null && (listQHmsKR2 = abstractC12782ctV2.QHmsKR()) != null) {
                        c10525bqB = (C10525bqB) CollectionsKt___CollectionsKt.firstOrNull(listQHmsKR2);
                    }
                    function1.invoke(c10525bqB);
                } else {
                    C10594brR c10594brRFJNWhG = abstractC12782ctV2 != null ? abstractC12782ctV2.fJNWhG(C33129mqd.valueOf(objectRef.element)) : null;
                    if (c10594brRFJNWhG == null) {
                        C10525bqB c10525bqBAYXKKw = abstractC12782ctV2 != null ? abstractC12782ctV2.AEQbTJ(java.lang.Long.valueOf(C33129mqd.valueOf(objectRef.element))) : null;
                        if (c10525bqBAYXKKw == null) {
                            if (abstractC12782ctV2 != null && (listQHmsKR = abstractC12782ctV2.QHmsKR()) != null) {
                                c10525bqB = (C10525bqB) CollectionsKt___CollectionsKt.firstOrNull(listQHmsKR);
                            }
                            function1.invoke(c10525bqB);
                        } else {
                            function1.invoke(c10525bqBAYXKKw);
                        }
                    } else {
                        C10525bqB c10525bqBFromCoinMeta$default = C10525bqB.StateListAnimator.fromCoinMeta$default(C10525bqB.Companion, c10594brRFJNWhG.fetchVPNInfo().AEQbTJ(), c10594brRFJNWhG.DbNXlk(), null, 4, null);
                        C10525bqB.setValues$default(c10525bqBFromCoinMeta$default, c10594brRFJNWhG.values(), c10594brRFJNWhG.AhwBna(), "0.00", "", null, null, null, null, null, 16, null);
                        function1.invoke(c10525bqBFromCoinMeta$default);
                    }
                }
                return Unit.INSTANCE;
            }
            abstractC12782ctV2 = abstractC12782ctV;
        }
        abstractC12782ctV3 = abstractC12782ctV2;
        if (abstractC12782ctV3 != null) {
        }
        if (((java.lang.CharSequence) objectRef.element).length() != 0) {
        }
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(Function1 function1, java.lang.Throwable th) {
        function1.invoke(null);
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Function1 function1, Ref.ObjectRef objectRef, java.lang.String str, AbstractC12782ctV abstractC12782ctV) {
        C10525bqB c10525bqBAYXKKw;
        java.lang.Object obj = null;
        if (!abstractC12782ctV.zLjUOn()) {
            function1.invoke(null);
            return Unit.INSTANCE;
        }
        if (((java.lang.CharSequence) objectRef.element).length() == 0) {
            function1.invoke(CollectionsKt___CollectionsKt.firstOrNull(abstractC12782ctV.QHmsKR()));
        } else {
            java.util.Iterator<T> it = abstractC12782ctV.OxVOHk().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((C10594brR) next).OLrzqt() == C33129mqd.valueOf(objectRef.element)) {
                    obj = next;
                    break;
                }
            }
            C10594brR c10594brR = (C10594brR) obj;
            if (c10594brR == null) {
                C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(C33129mqd.valueOf(objectRef.element)));
                if (c10854bwMKWHzl != null && c10854bwMKWHzl.dxcTrN()) {
                    if (abstractC12782ctV.OLrzqt(C33129mqd.valueOf(objectRef.element), str) == null) {
                        C10525bqB.StateListAnimator stateListAnimator = C10525bqB.Companion;
                        Intrinsics.copydefault(abstractC12782ctV);
                        c10525bqBAYXKKw = stateListAnimator.AEQbTJ(c10854bwMKWHzl, abstractC12782ctV, str);
                    } else {
                        c10525bqBAYXKKw = abstractC12782ctV.OLrzqt(C33129mqd.valueOf(objectRef.element), str);
                    }
                } else {
                    c10525bqBAYXKKw = abstractC12782ctV.AEQbTJ(java.lang.Long.valueOf(C33129mqd.valueOf(objectRef.element)));
                }
                if (c10525bqBAYXKKw == null) {
                    function1.invoke(CollectionsKt___CollectionsKt.firstOrNull(abstractC12782ctV.QHmsKR()));
                } else {
                    function1.invoke(c10525bqBAYXKKw);
                }
            } else {
                C10525bqB c10525bqBFromCoinMeta$default = C10525bqB.StateListAnimator.fromCoinMeta$default(C10525bqB.Companion, c10594brR.fetchVPNInfo().AEQbTJ(), c10594brR.DbNXlk(), null, 4, null);
                C10525bqB.setValues$default(c10525bqBFromCoinMeta$default, c10594brR.values(), c10594brR.AhwBna(), "0.00", "", null, null, null, null, null, 16, null);
                function1.invoke(c10525bqBFromCoinMeta$default);
            }
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(Function1 function1, java.lang.Throwable th) {
        function1.invoke(null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.bwM.isXRCToken$default(o.bwM, com.okinc.business.defi.biz.constant.XRCTokenType[], int, java.lang.Object):boolean */
    public final java.lang.String EZpvd(C10854bwM c10854bwM, @NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, java.lang.Boolean bool, C10854bwM c10854bwM2, java.lang.String str5) {
        boolean zBooleanValue;
        C10854bwM c10854bwMKWHzl;
        java.lang.String strOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            java.lang.Boolean boolValueOf = c10854bwM != null ? java.lang.Boolean.valueOf(c10854bwM.AuCTel()) : null;
            zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : false;
        }
        if (c10854bwM2 == null) {
            c10854bwMKWHzl = c10854bwM != null ? c10854bwM.KWHzl() : null;
        } else {
            c10854bwMKWHzl = c10854bwM2;
        }
        if (str5 == null) {
            strOLrzqt = c10854bwM != null ? c10854bwM.OLrzqt() : null;
            if (strOLrzqt == null) {
                strOLrzqt = "";
            }
        } else {
            strOLrzqt = str5;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (zBooleanValue || (c10854bwM != null && C10854bwM.isXRCToken$default(c10854bwM, null, 1, null))) {
            EZpvd(str, sb, str2, str3, str4, z, c10854bwMKWHzl);
        } else {
            KWHzl(strOLrzqt, str, sb, str2, str3, str4, z, c10854bwMKWHzl);
        }
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final void EZpvd(java.lang.String str, java.lang.StringBuilder sb, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, C10854bwM c10854bwM) {
        if (z) {
            sb.append(str);
            return;
        }
        boolean z2 = false;
        boolean z3 = (C33129mqd.OLrzqt((java.lang.Object) str2, (java.lang.Object) 0) || str2 == null || str2.length() <= 0) ? false : true;
        boolean z4 = (C33129mqd.OLrzqt((java.lang.Object) str4, (java.lang.Object) 0) || str4 == null || str4.length() <= 0) ? false : true;
        EZpvd(c10854bwM, str, sb);
        if (z3) {
            sb.append("?amount=" + str2);
            z2 = true;
        }
        if (z4) {
            if (z2) {
                sb.append("&currency=" + str3);
                sb.append("&valuation=" + str4);
                return;
            }
            sb.append("?currency=" + str3);
            sb.append("&valuation=" + str4);
        }
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2, java.lang.StringBuilder sb, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, C10854bwM c10854bwM) {
        if (z) {
            sb.append(str2);
            return;
        }
        boolean z2 = false;
        boolean z3 = (C33129mqd.OLrzqt((java.lang.Object) str3, (java.lang.Object) 0) || str3 == null || str3.length() <= 0) ? false : true;
        if (!C33129mqd.OLrzqt((java.lang.Object) str5, (java.lang.Object) 0) && str5 != null && str5.length() > 0) {
            z2 = true;
        }
        EZpvd(c10854bwM, str2, sb);
        sb.append("?token=" + str);
        if (z3) {
            sb.append("&amount=" + str3);
        } else {
            sb.append("&amount=0");
        }
        if (z2) {
            sb.append("&currency=" + str4);
            sb.append("&valuation=" + str5);
        }
    }

    public final void EZpvd(C10854bwM c10854bwM, java.lang.String str, java.lang.StringBuilder sb) {
        if (c10854bwM != null && c10854bwM.OFhtUX()) {
            sb.append(str);
            return;
        }
        sb.append((c10854bwM != null ? c10854bwM.sSMYrx() : null) + ":" + str);
    }

    public final TransactionInfo EZpvd(@NotNull C10854bwM c10854bwM, @NotNull TransactionInfo transactionInfo) {
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(transactionInfo, "");
        boolean z = transactionInfo.getContractAddress().length() == 0;
        java.lang.String strValueOf = java.lang.String.valueOf(c10854bwM.AhwBna());
        transactionInfo.setTokenId(strValueOf);
        if (transactionInfo.getName().length() == 0 && transactionInfo.getNetwork().length() == 0 && C33129mqd.AEQbTJ(transactionInfo.getAmount(), "0")) {
            return transactionInfo;
        }
        java.lang.String strAEQbTJ = AEQbTJ(transactionInfo, z);
        if (strAEQbTJ.length() <= 0 || !Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) strValueOf)) {
            transactionInfo.setAmount("0");
            transactionInfo.setValuation("0");
            transactionInfo.setCurrency("");
        }
        return transactionInfo;
    }

    public final java.lang.String AEQbTJ(TransactionInfo transactionInfo, boolean z) {
        C10948byA c10948byAValueOf = C10954byG.EZpvd.valueOf();
        if (transactionInfo.getNetwork().length() != 0) {
            if (z) {
                C10854bwM c10854bwMKWHzl = c10948byAValueOf.KWHzl(transactionInfo.getNetwork());
                return java.lang.String.valueOf(c10854bwMKWHzl != null ? java.lang.Long.valueOf(c10854bwMKWHzl.AhwBna()) : null);
            }
            if (transactionInfo.getContractAddress().length() != 0) {
                C10854bwM c10854bwMEZpvd = c10948byAValueOf.EZpvd(transactionInfo.getNetwork());
                java.lang.Long lValueOf = c10854bwMEZpvd != null ? java.lang.Long.valueOf(c10854bwMEZpvd.fetchVPNInfo()) : null;
                if (lValueOf != null) {
                    C10854bwM c10854bwMEZpvd2 = c10948byAValueOf.EZpvd(transactionInfo.getContractAddress(), lValueOf.longValue());
                    if (c10854bwMEZpvd2 != null) {
                        lValueOf = java.lang.Long.valueOf(c10854bwMEZpvd2.AhwBna());
                    }
                }
                return java.lang.String.valueOf(lValueOf);
            }
        }
        return "";
    }
}
