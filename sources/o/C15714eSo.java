package o;

import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import com.okinc.business.defi.biz.net.bean.AccountMpcResponse;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import o.C13754dXa;
import o.C15714eSo;
import o.InterfaceC8104awT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eSo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15714eSo {
    public static InterfaceC58217yxC AEQbTJ;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final C13934dbu OLrzqt = new C13934dbu();

    /* JADX INFO: renamed from: o.eSo$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eSo.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ void step$default(TaskDescription taskDescription, android.content.Context context, java.lang.String str, int i, boolean z, boolean z2, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                str = "";
            }
            java.lang.String str2 = str;
            if ((i2 & 4) != 0) {
                i = 1;
            }
            taskDescription.copydefault(context, str2, i, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2);
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.awT.StateListAnimator.routeLoginFromMpcWallet$default(o.awT, android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.okinc.account.api.model.mpcwallet.LoginType, java.lang.Integer, int, java.lang.Object):void */
        /* JADX DEBUG: Class process forced to load method for inline: o.mnV.unwrapResponseData$default(o.ywX, kotlin.jvm.functions.Function1, int, java.lang.Object):o.ywX */
        public final void copydefault(@NotNull final android.content.Context context, @NotNull final java.lang.String str, final int i, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            dZP dzp = dZP.OLrzqt;
            if (!dzp.valueOf()) {
                InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class);
                if (interfaceC8104awT != null) {
                    InterfaceC8104awT.StateListAnimator.routeLoginFromMpcWallet$default(interfaceC8104awT, context, null, null, null, null, null, 48, null);
                }
                KWHzl(context, str, z2, i);
                return;
            }
            if (dzp.values() && z) {
                InterfaceC8104awT interfaceC8104awT2 = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class);
                if (interfaceC8104awT2 != null) {
                    InterfaceC8104awT.StateListAnimator.routeLoginFromMpcWallet$default(interfaceC8104awT2, context, null, null, null, null, null, 48, null);
                }
                KWHzl(context, str, z2, i);
                return;
            }
            final java.lang.String strEZpvd = dzp.EZpvd();
            AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C32962mnV.unwrapResponseData$default(C15714eSo.OLrzqt.AEQbTJ((AbstractC12782ctV) null, strEZpvd), (Function1) null, 1, (java.lang.Object) null);
            final Function1 function1 = new Function1() { // from class: o.eSu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15714eSo.TaskDescription.AEQbTJ(strEZpvd, (AccountMpcResponse) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXUnwrapResponseData$default.KWHzl(new InterfaceC58229yxO() { // from class: o.eSq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C15714eSo.TaskDescription.AhwBna(function1, obj);
                }
            });
            final Function1 function12 = new Function1() { // from class: o.eSr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15714eSo.TaskDescription.copydefault(context, str, i, (kotlin.Pair) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eSs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C15714eSo.TaskDescription.gEmmrt(function12, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.eSw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15714eSo.TaskDescription.EZpvd((java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eSx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C15714eSo.TaskDescription.AYXKKw(function13, obj);
                }
            });
        }

        public static final InterfaceC60096zvd AhwBna(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (InterfaceC60096zvd) function1.invoke(obj);
        }

        public static final InterfaceC60096zvd AEQbTJ(java.lang.String str, final AccountMpcResponse accountMpcResponse) {
            Intrinsics.checkNotNullParameter(accountMpcResponse, "");
            AbstractC58260yxt<java.util.List<AbstractC12782ctV>> abstractC58260yxtAYXKKw = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).AYXKKw(str);
            final Function1 function1 = new Function1() { // from class: o.eSl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15714eSo.TaskDescription.KWHzl(accountMpcResponse, (java.util.List) obj);
                }
            };
            return abstractC58260yxtAYXKKw.copydefault(new InterfaceC58229yxO() { // from class: o.eSt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C15714eSo.TaskDescription.valueOf(function1, obj);
                }
            }).EZpvd();
        }

        public static final kotlin.Pair valueOf(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (kotlin.Pair) function1.invoke(obj);
        }

        public static final kotlin.Pair KWHzl(AccountMpcResponse accountMpcResponse, java.util.List list) {
            Intrinsics.checkNotNullParameter(list, "");
            return C56390yDp.OLrzqt(accountMpcResponse, list);
        }

        public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.xho.toastWithFailedIcon$default(java.lang.String, int, int, java.lang.Object):void */
        public static final Unit copydefault(android.content.Context context, java.lang.String str, int i, kotlin.Pair pair) {
            java.lang.Object next;
            java.lang.Object first = pair.getFirst();
            Intrinsics.checkNotNullExpressionValue(first, "");
            AccountMpcResponse accountMpcResponse = (AccountMpcResponse) first;
            java.lang.Object second = pair.getSecond();
            Intrinsics.checkNotNullExpressionValue(second, "");
            java.util.List list = (java.util.List) second;
            java.lang.String mpcId = accountMpcResponse.getMpcId();
            if (mpcId != null && mpcId.length() != 0) {
                if (list.isEmpty()) {
                    ActivityC17523fIm.Companion.AEQbTJ(context, str, i == 2 ? 2 : 0);
                } else {
                    java.util.Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) next;
                        if (abstractC12782ctV.zLjUOn() && !abstractC12782ctV.DCUTEIdCUTEI() && abstractC12782ctV.Dmq()) {
                            break;
                        }
                    }
                    AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) next;
                    if (abstractC12782ctV2 != null) {
                        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV2.QSBOWP();
                        if (Intrinsics.EZpvd((java.lang.Object) (mpcWalletEncodeInfoQSBOWP != null ? mpcWalletEncodeInfoQSBOWP.getMpcId() : null), (java.lang.Object) accountMpcResponse.getMpcId())) {
                            ActivityC17523fIm.Companion.AEQbTJ(context, str, 1);
                        } else {
                            ActivityC17523fIm.Companion.AEQbTJ(context, str, i == 2 ? 2 : 0);
                        }
                    } else {
                        ActivityC17523fIm.Companion.AEQbTJ(context, str, i == 2 ? 2 : 0);
                    }
                }
            } else {
                C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.r8lambdamcLa5hzjxuexHpGdLt3kU1m1dA), 0, 1, (java.lang.Object) null);
            }
            return Unit.INSTANCE;
        }

        public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit EZpvd(java.lang.Throwable th) {
            C15724eSy.AEQbTJ.AEQbTJ();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ void registerEvent$default(TaskDescription taskDescription, android.content.Context context, java.lang.String str, boolean z, int i, int i2, java.lang.Object obj) {
            if ((i2 & 8) != 0) {
                i = 1;
            }
            taskDescription.KWHzl(context, str, z, i);
        }

        public final void KWHzl(final android.content.Context context, final java.lang.String str, final boolean z, final int i) {
            InterfaceC58217yxC interfaceC58217yxC = C15714eSo.AEQbTJ;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("ev_account_login");
            final Function1 function1 = new Function1() { // from class: o.eSz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15714eSo.TaskDescription.OLrzqt(context, str, i, z, (java.lang.String) obj);
                }
            };
            C15714eSo.AEQbTJ = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM() { // from class: o.eSv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C15714eSo.TaskDescription.djBIcL(function1, obj);
                }
            });
        }

        public static final void djBIcL(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit OLrzqt(android.content.Context context, java.lang.String str, int i, boolean z, java.lang.String str2) {
            if (str.length() > 0) {
                step$default(C15714eSo.Companion, context, str, i, false, z, 8, null);
            }
            InterfaceC58217yxC interfaceC58217yxC = C15714eSo.AEQbTJ;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            TaskDescription taskDescription = C15714eSo.Companion;
            C15714eSo.AEQbTJ = null;
            return Unit.INSTANCE;
        }

        public final void AEQbTJ() {
            InterfaceC58217yxC interfaceC58217yxC = C15714eSo.AEQbTJ;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            C15714eSo.AEQbTJ = null;
        }
    }
}
