package o;

import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import com.amplifyframework.ui.liveness.camera.LivenessCoordinator;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.DexTransferData;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.dexlogic.bean.ApproveUnsignedData;
import com.okinc.business.dexlogic.error.NoWallet;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.MpcWalletService;
import com.okinc.wallet.api.WalletDappInteractionBizService;
import com.okinc.wallet.api.WalletDexService;
import com.okinc.wallet.api.bean.WalletAddressBookGroupBean;
import com.okinc.wallet.api.bean.WalletRechargeBean;
import com.okinc.wallet.api.bean.WalletScanInformationBean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;
import o.InterfaceC54829xWw;
import o.InterfaceC9737bbI;
import o.InterfaceC9859bdY;
import o.xWS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.htc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23193htc implements InterfaceC23194htd {
    public C54848xXo AEQbTJ;
    public final java.lang.String EZpvd;
    public C54845xXl KWHzl;
    public C54845xXl OLrzqt;
    public InterfaceC9738bbJ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC23194htd
    public C54845xXl EZpvd(boolean z) {
        return z ? this.KWHzl : this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC23194htd
    public void KWHzl(boolean z, @NotNull C54845xXl c54845xXl) {
        Intrinsics.checkNotNullParameter(c54845xXl, "");
        if (z) {
            this.KWHzl = c54845xXl;
        } else {
            this.OLrzqt = c54845xXl;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC23194htd
    public void copydefault(@NotNull C54848xXo c54848xXo) {
        Intrinsics.checkNotNullParameter(c54848xXo, "");
        this.AEQbTJ = c54848xXo;
    }

    public C23193htc(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    @Override // o.InterfaceC23194htd
    public AbstractC58260yxt<InterfaceC9738bbJ> OLrzqt() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtEZpvd = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.htn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                C23193htc.AEQbTJ(objectRef, this, objectRef2, interfaceC58257yxq);
            }
        }).KWHzl(C58266yxz.OLrzqt()).OLrzqt(C58266yxz.OLrzqt()).EZpvd(new InterfaceC58222yxH() { // from class: o.htl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C23193htc.EZpvd(objectRef, objectRef2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtEZpvd, "");
        return abstractC58260yxtEZpvd;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [T, o.yxC] */
    public static final void AEQbTJ(Ref.ObjectRef objectRef, final C23193htc c23193htc, final Ref.ObjectRef objectRef2, final InterfaceC58257yxq interfaceC58257yxq) {
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtIsConnected = c23193htc.isConnected();
        final Function1 function1 = new Function1() { // from class: o.hte
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23193htc.OLrzqt(objectRef2, c23193htc, interfaceC58257yxq, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Boolean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hti
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23193htc.AkhnZx(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.htg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23193htc.EZpvd(this.EZpvd, interfaceC58257yxq, (java.lang.Throwable) obj);
            }
        };
        objectRef.element = abstractC58260yxtIsConnected.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.htf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23193htc.DbNXlk(function12, obj);
            }
        });
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [T, o.yxC] */
    public static final Unit OLrzqt(Ref.ObjectRef objectRef, final C23193htc c23193htc, final InterfaceC58257yxq interfaceC58257yxq, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().KWHzl();
            final Function1 function1 = new Function1() { // from class: o.htq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C23193htc.EZpvd(this.EZpvd, interfaceC58257yxq, (InterfaceC9738bbJ) obj);
                }
            };
            InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hto
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C23193htc.AhwBna(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.htp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C23193htc.copydefault(this.AEQbTJ, interfaceC58257yxq, (java.lang.Throwable) obj);
                }
            };
            objectRef.element = abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.htr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C23193htc.fetchVPNInfo(function12, obj);
                }
            });
        } else {
            c23193htc.copydefault = null;
            pUU.copydefault(C23193htc.class.getName(), "existWallets NoWallet" + bool);
            interfaceC58257yxq.onError(new NoWallet());
        }
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C23193htc c23193htc, InterfaceC58257yxq interfaceC58257yxq, InterfaceC9738bbJ interfaceC9738bbJ) {
        c23193htc.copydefault = interfaceC9738bbJ;
        interfaceC58257yxq.onSuccess(interfaceC9738bbJ);
        return Unit.INSTANCE;
    }

    public static final void fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C23193htc c23193htc, InterfaceC58257yxq interfaceC58257yxq, java.lang.Throwable th) {
        c23193htc.copydefault = null;
        pUU.copydefault(C23193htc.class.getName(), "getSelectedWallet NoWallet" + th.getMessage());
        interfaceC58257yxq.onError(new NoWallet());
        return Unit.INSTANCE;
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C23193htc c23193htc, InterfaceC58257yxq interfaceC58257yxq, java.lang.Throwable th) {
        c23193htc.copydefault = null;
        pUU.copydefault(C23193htc.class.getName(), "existWallets NoWallet" + th.getMessage());
        interfaceC58257yxq.onError(new NoWallet());
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
        InterfaceC58217yxC interfaceC58217yxC = (InterfaceC58217yxC) objectRef.element;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = (InterfaceC58217yxC) objectRef2.element;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
    }

    @Override // o.InterfaceC23194htd
    public java.lang.String copydefault() {
        java.lang.String strDbNXlk;
        InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = AEQbTJ();
        return (interfaceC9738bbJAEQbTJ == null || (strDbNXlk = interfaceC9738bbJAEQbTJ.DbNXlk()) == null) ? "" : strDbNXlk;
    }

    public AbstractC58260yxt<java.lang.Boolean> isConnected() {
        return ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().OLrzqt(false);
    }

    @Override // o.InterfaceC23194htd
    public java.lang.String KWHzl(@NotNull java.lang.String str) {
        java.lang.String strEZpvd;
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = AEQbTJ();
        return (interfaceC9738bbJAEQbTJ == null || (strEZpvd = interfaceC9738bbJAEQbTJ.EZpvd(C33129mqd.valueOf(str))) == null) ? "" : strEZpvd;
    }

    @Override // o.InterfaceC23194htd
    public boolean OLrzqt(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        Intrinsics.checkNotNullParameter(str, "");
        return interfaceC9738bbJ.djSkpj() && interfaceC9738bbJ.gEmmrt(C33129mqd.valueOf(str)) && (interfaceC9738bbJ.getFieldNames() ? C22380heK.OLrzqt.copydefault(this.EZpvd).EZpvd(z).AEQbTJ(str, z) : true);
    }

    @Override // o.InterfaceC23194htd
    public InterfaceC9738bbJ valueOf() {
        pUU.copydefault(C23193htc.class.getName(), "sourceType: >>>>>>>>" + this.EZpvd);
        return AEQbTJ();
    }

    @Override // o.InterfaceC23194htd
    public boolean copydefault(@NotNull InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return interfaceC9738bbJ.QfsBiF();
    }

    @Override // o.InterfaceC23194htd
    public boolean KWHzl(@NotNull InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return interfaceC9738bbJ.zsXlph();
    }

    @Override // o.InterfaceC23194htd
    public AbstractC58185ywX<C9860bdZ> EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return ((InterfaceC9859bdY) C43251rlk.copydefault(InterfaceC9859bdY.class)).i_(str);
    }

    @Override // o.InterfaceC23194htd
    public boolean EZpvd(@NotNull java.lang.String str, @NotNull InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return interfaceC9738bbJ.KWHzl(java.lang.Long.valueOf(C33129mqd.valueOf(str))) & (!KWHzl(interfaceC9738bbJ));
    }

    @Override // o.InterfaceC23194htd
    public java.lang.String AhwBna() {
        return ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).djBIcL();
    }

    @Override // o.InterfaceC23194htd
    public boolean OLrzqt(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).AhwBna().AEQbTJ(str, j);
    }

    @Override // o.InterfaceC23194htd
    public C57567ykp fetchVPNInfo() {
        return ((InterfaceC9859bdY) C43251rlk.copydefault(InterfaceC9859bdY.class)).values();
    }

    @Override // o.InterfaceC23194htd
    public C57567ykp DbNXlk() {
        return InterfaceC9859bdY.Application.walletPublicConnection$default((InterfaceC9859bdY) C43251rlk.copydefault(InterfaceC9859bdY.class), false, 1, null);
    }

    @Override // o.InterfaceC23194htd
    public AbstractC58185ywX<java.lang.Boolean> djBIcL() {
        return ((InterfaceC9859bdY) C43251rlk.copydefault(InterfaceC9859bdY.class)).isConnected();
    }

    @Override // o.InterfaceC23194htd
    public void OLrzqt(@NotNull java.lang.String str) {
        InterfaceC54846xXm interfaceC54846xXm;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List listKWHzl = C43251rlk.KWHzl(InterfaceC54846xXm.class);
        if (listKWHzl == null || (interfaceC54846xXm = (InterfaceC54846xXm) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) == null) {
            return;
        }
        interfaceC54846xXm.OLrzqt(str);
    }

    @Override // o.InterfaceC23194htd
    public AbstractC58260yxt<java.util.ArrayList<WalletAddressBookGroupBean>> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return ((InterfaceC54832xWz) C43251rlk.copydefault(InterfaceC54832xWz.class)).copydefault(str, C33129mqd.valueOf(str2));
    }

    @Override // o.InterfaceC23194htd
    public void EZpvd(@NotNull android.content.Context context, @NotNull ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(activityResultLauncher, "");
        ((InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class)).AEQbTJ(context, activityResultLauncher);
    }

    public static final InterfaceC60096zvd djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.lang.String> */
    @Override // o.InterfaceC23194htd
    public AbstractC58185ywX<java.lang.String> KWHzl() {
        AbstractC58185ywX<InterfaceC9738bbJ> abstractC58185ywXEZpvd = OLrzqt().EZpvd();
        final Function1 function1 = new Function1() { // from class: o.htk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23193htc.EZpvd((InterfaceC9738bbJ) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.htm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C23193htc.djBIcL(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd EZpvd(InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return ((xWO) C43251rlk.copydefault(xWO.class)).g_(interfaceC9738bbJ.DbNXlk());
    }

    @Override // o.InterfaceC23194htd
    public WalletScanInformationBean copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return ((InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class)).h_(str);
    }

    @Override // o.InterfaceC23194htd
    public void AEQbTJ(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.util.ArrayList<java.lang.String> arrayList, java.util.ArrayList<java.lang.String> arrayList2, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC54829xWw.ActionBar.showRechargeDialog$default((InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class), abstractActivityC33041mov, new WalletRechargeBean(str, str2, "dex", "balance", (java.util.ArrayList) arrayList, (java.util.ArrayList) arrayList2, false, (java.lang.String) null, num != null ? num.intValue() : -1, 192, (DefaultConstructorMarker) null), 0, null, 12, null);
    }

    @Override // o.InterfaceC23194htd
    public void copydefault(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC54829xWw.ActionBar.showRechargeDialog$default((InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class), abstractActivityC33041mov, new WalletRechargeBean(str, str2, "dex", "balance", yDY.copydefault("dex"), (java.util.ArrayList) null, false, (java.lang.String) null, 0, LivenessCoordinator.TARGET_WIDTH, (DefaultConstructorMarker) null), 0, null, 12, null);
    }

    /* JADX DEBUG: Type inference failed for r1v4. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.lang.String> */
    @Override // o.InterfaceC23194htd
    public AbstractC58185ywX<java.lang.String> EZpvd(@NotNull FragmentActivity fragmentActivity, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull ApproveUnsignedData approveUnsignedData, boolean z, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(approveUnsignedData, "");
        AbstractC58185ywX<WalletDappInteractionBizService.SubmitResult> abstractC58185ywXAEQbTJ = AEQbTJ(str, z, approveUnsignedData, (WalletDappInteractionBizService) C43251rlk.copydefault(WalletDappInteractionBizService.class), fragmentActivity, function1, fragmentManager);
        final Function1 function12 = new Function1() { // from class: o.hta
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23193htc.EZpvd((WalletDappInteractionBizService.SubmitResult) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58229yxO() { // from class: o.htb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C23193htc.values(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd values(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(WalletDappInteractionBizService.SubmitResult submitResult) {
        Intrinsics.checkNotNullParameter(submitResult, "");
        java.lang.Integer code = submitResult.getCode();
        if (code != null && code.intValue() == 0) {
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(submitResult.getTxId());
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        java.lang.Integer code2 = submitResult.getCode();
        AbstractC58185ywX abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new OKServerException(code2 != null ? code2.intValue() : -1, submitResult.getErrMsg(), null, null, 12, null));
        Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
        return abstractC58185ywXAEQbTJ;
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.wallet.api.WalletDappInteractionBizService$SubmitResult> */
    public final AbstractC58185ywX<WalletDappInteractionBizService.SubmitResult> AEQbTJ(java.lang.String str, boolean z, ApproveUnsignedData approveUnsignedData, WalletDappInteractionBizService walletDappInteractionBizService, final FragmentActivity fragmentActivity, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1, final androidx.fragment.app.FragmentManager fragmentManager) {
        AbstractC58185ywX<ResponseData<xWF>> abstractC58185ywXEZpvd = walletDappInteractionBizService.EZpvd(fragmentActivity, 2, new DappInteractionArgs(copydefault(), null, str, null, ApproveUnsignedData.getSignDataJson$default(approveUnsignedData, z, null, 2, null), null, "dex", 3, null, null, approveUnsignedData.getDexContractAddress(), null, false, true, approveUnsignedData.getId(), true, null, approveUnsignedData.getApproveGasLimitCoefficient(), null, 1, null, null, null, null, null, null, 1, approveUnsignedData.getBizLoad(), null, null, null, null, -202044630, null), function1);
        final Function1 function12 = new Function1() { // from class: o.hth
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23193htc.KWHzl(fragmentActivity, fragmentManager, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.htj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C23193htc.AYXKKw(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    @Override // o.InterfaceC23194htd
    public void KWHzl(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull FragmentActivity fragmentActivity, @NotNull Function1<? super MpcWalletService.MpcWalletAbleStatus, Unit> function1) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).copydefault(interfaceC9738bbJ, fragmentActivity, function1);
    }

    @Override // o.InterfaceC23194htd
    public AbstractC58185ywX<WalletDexService.FeeInfo> EZpvd(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull DexTransferData dexTransferData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(dexTransferData, "");
        return ((WalletDexService) C43251rlk.copydefault(WalletDexService.class)).copydefault(str, str2, str3, dexTransferData, 1, "");
    }

    @Override // o.InterfaceC23194htd
    public AbstractC58185ywX<WalletDexService.AAFreeGasInfo> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return ((WalletDexService) C43251rlk.copydefault(WalletDexService.class)).AEQbTJ(str, str2);
    }

    @Override // o.InterfaceC23194htd
    public java.lang.String KWHzl(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return ((InterfaceC9850bdP) C43251rlk.copydefault(InterfaceC9850bdP.class)).EZpvd(str, i);
    }

    @Override // o.InterfaceC23194htd
    public java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return ((InterfaceC9850bdP) C43251rlk.copydefault(InterfaceC9850bdP.class)).KWHzl(str, str2);
    }

    @Override // o.InterfaceC23194htd
    public java.util.Map<java.lang.String, java.lang.String> gEmmrt() {
        return ((xWO) C43251rlk.copydefault(xWO.class)).aM_();
    }

    @Override // o.InterfaceC23194htd
    public boolean copydefault(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return InterfaceC9737bbI.Application.getTokenWithContractAddressAndChainId$default(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault(), str, j, false, 4, null) != null;
    }

    @Override // o.InterfaceC23194htd
    public void AEQbTJ(@NotNull android.content.Context context, long j, @NotNull java.lang.String str, @NotNull androidx.fragment.app.FragmentManager fragmentManager, Function1<? super android.os.Bundle, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        ((InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class)).KWHzl(context, j, str, fragmentManager, function1);
    }

    @Override // o.InterfaceC23194htd
    public void KWHzl(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull InterfaceC9738bbJ interfaceC9738bbJ, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        xWS.Application.routeBackupWallet$default((xWS) C43251rlk.copydefault(xWS.class), abstractActivityC33041mov, fragmentManager, interfaceC9738bbJ, (Function0) null, 8, (java.lang.Object) null);
    }

    @Override // o.InterfaceC23194htd
    public AbstractC58260yxt<kotlin.Pair<InterfaceC9734bbF, java.lang.String>> KWHzl(@NotNull SignDataArgs<?> signDataArgs) {
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        return AYXKKw().EZpvd(signDataArgs);
    }

    @Override // o.InterfaceC23194htd
    public AbstractC58260yxt<kotlin.Pair<InterfaceC9734bbF, java.lang.String>> KWHzl(@NotNull DappInteractionArgs dappInteractionArgs, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1) {
        Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
        return AYXKKw().OLrzqt(dappInteractionArgs, function1);
    }

    @Override // o.InterfaceC23194htd
    public InterfaceC9740bbL AYXKKw() {
        return ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).AEQbTJ();
    }

    @Override // o.InterfaceC23194htd
    public InterfaceC9738bbJ AEQbTJ() {
        return (InterfaceC9738bbJ) CollectionsKt___CollectionsKt.AkhnZx(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().copydefault(), 0);
    }

    @Override // o.InterfaceC23194htd
    public AbstractC58185ywX<java.util.ArrayList<WalletDexService.SupportedMevNodeBean>> EZpvd() {
        return ((WalletDexService) C43251rlk.copydefault(WalletDexService.class)).OLrzqt();
    }

    public long KWHzl(long j) {
        InterfaceC9731bbC chainMetaWithRealChainId$default = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault(), j, false, 2, null);
        if (chainMetaWithRealChainId$default != null) {
            return chainMetaWithRealChainId$default.AhwBna();
        }
        return 0L;
    }

    @Override // o.InterfaceC23194htd
    public void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, long j, @NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull xWC xwc) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        Intrinsics.checkNotNullParameter(xwc, "");
        ((xWB) C43251rlk.copydefault(xWB.class)).OLrzqt(fragmentManager, KWHzl(j), interfaceC9738bbJ, xwc);
    }

    @Override // o.InterfaceC23194htd
    public java.lang.Object KWHzl(@NotNull FlowCollector<? super xWY> flowCollector, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objCollect = ((InterfaceC54826xWt) C43251rlk.copydefault(InterfaceC54826xWt.class)).OLrzqt().collect(flowCollector, continuation);
        return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
    }

    @Override // o.InterfaceC23194htd
    public boolean copydefault(long j) {
        InterfaceC9731bbC chainMetaWithRealChainId$default = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault(), j, false, 2, null);
        return chainMetaWithRealChainId$default != null && chainMetaWithRealChainId$default.ejfBZ();
    }

    @Override // o.InterfaceC23194htd
    public boolean EZpvd(long j) {
        InterfaceC9731bbC chainMetaWithRealChainId$default = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault(), j, false, 2, null);
        return chainMetaWithRealChainId$default != null && chainMetaWithRealChainId$default.fARcdN();
    }

    @Override // o.InterfaceC23194htd
    public java.lang.String KWHzl(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            return str2;
        }
        InterfaceC9731bbC chainMetaWithRealChainId$default = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).copydefault(), C33129mqd.valueOf(str), false, 2, null);
        java.lang.String strKWHzl = chainMetaWithRealChainId$default != null ? chainMetaWithRealChainId$default.KWHzl(str2) : null;
        return strKWHzl == null ? "" : strKWHzl;
    }

    public static final InterfaceC60096zvd KWHzl(FragmentActivity fragmentActivity, androidx.fragment.app.FragmentManager fragmentManager, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0) {
            xWF xwf = (xWF) responseData.getData();
            if (xwf != null) {
                return xwf.copydefault(fragmentActivity, fragmentManager);
            }
            return null;
        }
        return AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new OKServerException(responseData.getCode(), responseData.getMsg(), null, null, 12, null));
    }
}
