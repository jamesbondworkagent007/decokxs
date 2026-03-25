package o;

import androidx.appcompat.app.AppCompatActivity;
import com.google.gson.Gson;
import com.okinc.business.defi.biz.constant.WalletStatus;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.error.FingerprintLog;
import com.okinc.business.defi.biz.core.nostrfix.IdentifierType;
import com.okinc.business.defi.biz.core.nostrfix.IdentifierTypeNostrFixStatus;
import com.okinc.business.defi.biz.net.bean.WalletIdsReq;
import com.okinc.business.defi.wallet.common.WalletConnectUtils;
import com.okinc.rxutils.RxBus;
import com.okinc.wallet.api.bean.EnterWalletMainBean;
import com.okinc.wallet.hardware.api.ledger.model.BluetoothDeviceModel;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13023cxy;
import o.C13754dXa;
import o.C15530eLt;
import o.C15935eaT;
import o.C16058eck;
import o.C17231eyr;
import o.C18943fru;
import o.InterfaceC17258ezR;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eyx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17237eyx {
    public final C18943fru AEQbTJ;
    public final InterfaceC17258ezR AhwBna;
    public final InterfaceC17288ezv EZpvd;
    public final java.lang.String KWHzl;
    public final C17287ezu OLrzqt;
    public final C17230eyq copydefault;

    /* JADX INFO: renamed from: o.eyx$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WalletType.values().length];
            try {
                iArr[WalletType.KeyWallet.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[WalletType.MPCWallet.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletType.AAWallet.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[WalletType.TrackingWallet.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[WalletType.HardwareWallet.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[WalletType.HDWallet.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[WalletType.TonWallet.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            OLrzqt = iArr;
        }
    }

    public C17237eyx(@NotNull InterfaceC17258ezR interfaceC17258ezR, @NotNull C17230eyq c17230eyq, @NotNull C17287ezu c17287ezu, @NotNull InterfaceC17288ezv interfaceC17288ezv, @NotNull C18943fru c18943fru) {
        Intrinsics.checkNotNullParameter(interfaceC17258ezR, "");
        Intrinsics.checkNotNullParameter(c17230eyq, "");
        Intrinsics.checkNotNullParameter(c17287ezu, "");
        Intrinsics.checkNotNullParameter(interfaceC17288ezv, "");
        Intrinsics.checkNotNullParameter(c18943fru, "");
        this.AhwBna = interfaceC17258ezR;
        this.copydefault = c17230eyq;
        this.OLrzqt = c17287ezu;
        this.EZpvd = interfaceC17288ezv;
        this.AEQbTJ = c18943fru;
        this.KWHzl = "WalletDeleteHelper";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0025: CONSTRUCTOR 
  (r9v0 o.ezR)
  (wrap:o.eyq:0x000b: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.eyq:0x0008: CONSTRUCTOR 
  (null o.dnn)
  (1 int)
  (wrap:byte:?: TERNARY null = ((0 byte) == true) ? (1 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) : (0 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY]))
 A[MD:(o.dnn, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:61) call: o.eyq.<init>(o.dnn, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r10v0 o.eyq))
  (wrap:o.ezu:0x0016: TERNARY null = ((wrap:int:0x000c: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.ezu:0x0013: CONSTRUCTOR 
  (wrap:byte:?: TERNARY null = ((0 byte) == true) ? (1 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) : (0 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY]))
  (wrap:byte:?: TERNARY null = ((0 byte) == true) ? (1 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) : (0 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY]))
  (3 int)
  (wrap:byte:?: TERNARY null = ((0 byte) == true) ? (1 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) : (0 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY]))
 A[MD:(o.cuN, o.fiY, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:62) call: o.ezu.<init>(o.cuN, o.fiY, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r11v0 o.ezu))
  (r12v0 o.ezv)
  (wrap:o.fru:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:o.fru:0x001d: INVOKE 
  (wrap:o.fru$StateListAnimator:0x001b: SGET  A[WRAPPED] (LINE:64) o.fru.Companion o.fru$StateListAnimator)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.fru.StateListAnimator.getInstance$default(o.fru$StateListAnimator, android.content.Context, int, java.lang.Object):o.fru A[MD:(o.fru$StateListAnimator, android.content.Context, int, java.lang.Object):o.fru (m), WRAPPED] (LINE:64)) : (r13v0 o.fru))
 A[MD:(o.ezR, o.eyq, o.ezu, o.ezv, o.fru):void (m)] (LINE:59) call: o.eyx.<init>(o.ezR, o.eyq, o.ezu, o.ezv, o.fru):void type: THIS */
    public /* synthetic */ C17237eyx(InterfaceC17258ezR interfaceC17258ezR, C17230eyq c17230eyq, C17287ezu c17287ezu, InterfaceC17288ezv interfaceC17288ezv, C18943fru c18943fru, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC17258ezR, (i & 2) != 0 ? new C17230eyq(null, 1, 0 == true ? 1 : 0) : c17230eyq, (i & 4) != 0 ? new C17287ezu(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : c17287ezu, interfaceC17288ezv, (i & 16) != 0 ? C18943fru.StateListAnimator.getInstance$default(C18943fru.Companion, null, 1, null) : c18943fru);
    }

    public static final void QOLQEE(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ezR.TaskDescription.getAllWallets$default(o.ezR, boolean, boolean, int, java.lang.Object):o.yxt */
    public final void AEQbTJ(@NotNull final C17260ezT c17260ezT) {
        Intrinsics.checkNotNullParameter(c17260ezT, "");
        AbstractC58260yxt abstractC58260yxtValueOf = C11607cUn.valueOf(InterfaceC17258ezR.TaskDescription.getAllWallets$default(this.AhwBna, false, false, 3, null));
        final Function1 function1 = new Function1() { // from class: o.eyR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17237eyx.OLrzqt(this.EZpvd, (java.util.List) obj);
            }
        };
        abstractC58260yxtValueOf.copydefault(new InterfaceC58227yxM() { // from class: o.eyP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C17237eyx.QOLQEE(function1, obj);
            }
        });
        AbstractC58177ywP abstractC58177ywPAEQbTJ = C11607cUn.AEQbTJ(this.EZpvd.copydefault());
        final Function1 function12 = new Function1() { // from class: o.eyT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17237eyx.EZpvd((java.lang.Throwable) obj);
            }
        };
        abstractC58177ywPAEQbTJ.AEQbTJ(new InterfaceC58227yxM() { // from class: o.eyQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C17237eyx.DTwDnp(function12, obj);
            }
        }).AEQbTJ(new InterfaceC58222yxH() { // from class: o.eyY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C17237eyx.OLrzqt(this.EZpvd, c17260ezT);
            }
        });
    }

    public static final Unit OLrzqt(C17237eyx c17237eyx, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c17237eyx.copydefault.AEQbTJ(list);
        return Unit.INSTANCE;
    }

    public static final void DTwDnp(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        C6777aVl.Companion.EZpvd(new java.lang.Throwable("Defi: reset wallet failed. Message: " + th.getMessage()));
        pUU.copydefault("WalletDeleteUseCaseImpl", ">>>delete requestResetWallet error message :" + th.getMessage());
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C17237eyx c17237eyx, C17260ezT c17260ezT) {
        pUU.OLrzqt(">>>delete deleteWallets complete");
        c17237eyx.AEQbTJ(c17260ezT.OLrzqt(), true);
        c17237eyx.OLrzqt.copydefault(c17260ezT);
    }

    public final void EZpvd(@NotNull final C17263ezW c17263ezW) {
        AbstractActivityC33041mov abstractActivityC33041mov;
        Intrinsics.checkNotNullParameter(c17263ezW, "");
        pUU.OLrzqt(">>>prom deleteWallet: id:" + c17263ezW.djBIcL() + " type:" + c17263ezW.AEQbTJ() + " - walletDelete:" + c17263ezW);
        final AppCompatActivity appCompatActivityOLrzqt = c17263ezW.OLrzqt();
        int i = Application.OLrzqt[c17263ezW.AEQbTJ().ordinal()];
        if (i == 1) {
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtKWHzl = this.AhwBna.KWHzl(c17263ezW.djBIcL(), true);
            final Function1 function1 = new Function1() { // from class: o.ezp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C17237eyx.copydefault(c17263ezW, this, appCompatActivityOLrzqt, (AbstractC12782ctV) obj);
                }
            };
            InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ezo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C17237eyx.uzCIH(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.ezq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C17237eyx.copydefault(this.AEQbTJ, appCompatActivityOLrzqt, c17263ezW, (java.lang.Throwable) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ezs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C17237eyx.AubY(function12, obj);
                }
            });
            abstractActivityC33041mov = appCompatActivityOLrzqt instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) appCompatActivityOLrzqt : null;
            if (abstractActivityC33041mov != null) {
                abstractActivityC33041mov.addDisposable(interfaceC58217yxCAEQbTJ);
            }
            Intrinsics.copydefault(interfaceC58217yxCAEQbTJ);
            return;
        }
        if (i == 2) {
            AbstractC58260yxt<AbstractC12784ctX> abstractC58260yxtOLrzqt = this.AhwBna.OLrzqt(c17263ezW.djBIcL());
            final Function1 function13 = new Function1() { // from class: o.eyz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C17237eyx.OLrzqt(this.KWHzl, appCompatActivityOLrzqt, c17263ezW, (AbstractC12784ctX) obj);
                }
            };
            InterfaceC58227yxM<? super AbstractC12784ctX> interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.eyA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C17237eyx.zsXlph(function13, obj);
                }
            };
            final Function1 function14 = new Function1() { // from class: o.eyC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C17237eyx.OLrzqt(this.copydefault, appCompatActivityOLrzqt, c17263ezW, (java.lang.Throwable) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCAEQbTJ2 = abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.eyD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C17237eyx.zLjUOn(function14, obj);
                }
            });
            abstractActivityC33041mov = appCompatActivityOLrzqt instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) appCompatActivityOLrzqt : null;
            if (abstractActivityC33041mov != null) {
                abstractActivityC33041mov.addDisposable(interfaceC58217yxCAEQbTJ2);
            }
            Intrinsics.copydefault(interfaceC58217yxCAEQbTJ2);
            return;
        }
        showDeleteConfirmDialogFragment$default(this, appCompatActivityOLrzqt, c17263ezW, false, 4, null);
    }

    public static final void uzCIH(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(final C17263ezW c17263ezW, final C17237eyx c17237eyx, final AppCompatActivity appCompatActivity, final AbstractC12782ctV abstractC12782ctV) {
        C14090der c14090der = C14090der.OLrzqt;
        Intrinsics.copydefault(abstractC12782ctV);
        if (c14090der.AEQbTJ(abstractC12782ctV) && abstractC12782ctV.getPostValueLengthLimit() == IdentifierType.IDENTIFIER_TYPE_NOSTR_KEY_WALLET_TYPE && abstractC12782ctV.hBpjJd() == IdentifierTypeNostrFixStatus.IDENTIFIER_TYPE_NOSTR_KEYWALLETTYPEHDEXPORT) {
            C11005bzE.EZpvd.OLrzqt(c17263ezW.OLrzqt(), new Function1() { // from class: o.ezm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C17237eyx.KWHzl(appCompatActivity, abstractC12782ctV, c17263ezW, c17237eyx, ((java.lang.Integer) obj).intValue());
                }
            });
        } else {
            showDeleteConfirmDialogFragment$default(c17237eyx, appCompatActivity, c17263ezW, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractC12782ctV abstractC12782ctV, final C17263ezW c17263ezW, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<java.util.List<C13855daU>> abstractC58260yxtValueOf = abstractC12782ctV.valueOf(str);
        final Function1 function1 = new Function1() { // from class: o.ezn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17237eyx.OLrzqt(c17263ezW, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM<? super java.util.List<C13855daU>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ezk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C17237eyx.getNewProxyInstance(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.ezl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17237eyx.copydefault((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtValueOf.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ezj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C17237eyx.getFieldNames(function12, obj);
            }
        });
        AppCompatActivity appCompatActivityOLrzqt = c17263ezW.OLrzqt();
        AbstractActivityC33041mov abstractActivityC33041mov = appCompatActivityOLrzqt instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) appCompatActivityOLrzqt : null;
        if (abstractActivityC33041mov != null) {
            abstractActivityC33041mov.addDisposable(interfaceC58217yxCAEQbTJ);
        }
        return Unit.INSTANCE;
    }

    public static final void getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C17263ezW c17263ezW, java.util.List list) {
        C11005bzE c11005bzE = C11005bzE.EZpvd;
        AppCompatActivity appCompatActivityOLrzqt = c17263ezW.OLrzqt();
        Intrinsics.copydefault(list);
        c11005bzE.EZpvd(appCompatActivityOLrzqt, (C13855daU) CollectionsKt___CollectionsKt.AuCTelauCTel(list));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void getFieldNames(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(AppCompatActivity appCompatActivity, final AbstractC12782ctV abstractC12782ctV, final C17263ezW c17263ezW, final C17237eyx c17237eyx, int i) {
        if (i == 1) {
            androidx.fragment.app.FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            new C14461dlr(supportFragmentManager, "deleteNostr-backup", new Function1() { // from class: o.eyK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C17237eyx.copydefault(abstractC12782ctV, c17263ezW, (java.lang.String) obj);
                }
            }, null, null, false, 56, null).EZpvd();
        } else if (i == 2) {
            androidx.fragment.app.FragmentManager supportFragmentManager2 = appCompatActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
            new C14461dlr(supportFragmentManager2, "deleteNostr-delete", new Function1() { // from class: o.eyS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C17237eyx.OLrzqt(this.copydefault, c17263ezW, (java.lang.String) obj);
                }
            }, null, null, false, 56, null).EZpvd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final C17237eyx c17237eyx, final C17263ezW c17263ezW, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtValueOf = C11607cUn.valueOf(c17237eyx.EZpvd.EZpvd(c17263ezW.djBIcL(), c17263ezW.AEQbTJ(), str, true));
        final Function1 function1 = new Function1() { // from class: o.ezb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17237eyx.AhwBna(this.copydefault, c17263ezW, (java.lang.Throwable) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtValueOf.OLrzqt(new InterfaceC58227yxM() { // from class: o.ezd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C17237eyx.iwGUEr(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.eyZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17237eyx.AhwBna(this.OLrzqt, c17263ezW, (C17289ezw) obj);
            }
        };
        abstractC58260yxtOLrzqt.copydefault(new InterfaceC58227yxM() { // from class: o.ezc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C17237eyx.hDKMBd(function12, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void iwGUEr(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AhwBna(C17237eyx c17237eyx, C17263ezW c17263ezW, java.lang.Throwable th) {
        c17237eyx.EZpvd("WalletType:" + c17263ezW.AEQbTJ() + " walletId:" + c17263ezW.djBIcL(), th);
        return Unit.INSTANCE;
    }

    public static final void hDKMBd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AhwBna(C17237eyx c17237eyx, C17263ezW c17263ezW, C17289ezw c17289ezw) {
        Intrinsics.copydefault(c17289ezw);
        c17237eyx.OLrzqt(c17289ezw, c17263ezW);
        return Unit.INSTANCE;
    }

    public static final void AubY(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C17237eyx c17237eyx, AppCompatActivity appCompatActivity, C17263ezW c17263ezW, java.lang.Throwable th) {
        showDeleteConfirmDialogFragment$default(c17237eyx, appCompatActivity, c17263ezW, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void zsXlph(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C17237eyx c17237eyx, AppCompatActivity appCompatActivity, C17263ezW c17263ezW, AbstractC12784ctX abstractC12784ctX) {
        c17237eyx.copydefault(appCompatActivity, c17263ezW, abstractC12784ctX.getNewProxyInstance());
        return Unit.INSTANCE;
    }

    public static final void zLjUOn(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C17237eyx c17237eyx, AppCompatActivity appCompatActivity, C17263ezW c17263ezW, java.lang.Throwable th) {
        showDeleteConfirmDialogFragment$default(c17237eyx, appCompatActivity, c17263ezW, false, 4, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void showDeleteConfirmDialogFragment$default(C17237eyx c17237eyx, AppCompatActivity appCompatActivity, C17263ezW c17263ezW, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        c17237eyx.copydefault(appCompatActivity, c17263ezW, z);
    }

    public final void copydefault(AppCompatActivity appCompatActivity, final C17263ezW c17263ezW, boolean z) {
        C17231eyr.ActionBar actionBar = C17231eyr.Companion;
        androidx.fragment.app.FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        WalletType walletTypeCopydefault = c17263ezW.copydefault();
        if (walletTypeCopydefault == null) {
            walletTypeCopydefault = c17263ezW.AEQbTJ();
        }
        actionBar.copydefault(appCompatActivity, supportFragmentManager, walletTypeCopydefault, z, new Function0() { // from class: o.eyy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C17237eyx.AEQbTJ(this.KWHzl, c17263ezW);
            }
        }, new Function0() { // from class: o.eyw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C17237eyx.KWHzl(this.EZpvd, c17263ezW);
            }
        });
    }

    public static final Unit AEQbTJ(C17237eyx c17237eyx, C17263ezW c17263ezW) {
        c17237eyx.KWHzl(c17263ezW);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C17237eyx c17237eyx, C17263ezW c17263ezW) {
        c17237eyx.AEQbTJ(c17263ezW);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(C17263ezW c17263ezW) {
        if (Application.OLrzqt[c17263ezW.AEQbTJ().ordinal()] == 2) {
            ActivityC17448fFs.Companion.KWHzl(c17263ezW.OLrzqt(), c17263ezW.djBIcL());
        }
    }

    public final void KWHzl(final C17263ezW c17263ezW) {
        androidx.fragment.app.FragmentManager supportFragmentManager = c17263ezW.OLrzqt().getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        switch (Application.OLrzqt[c17263ezW.AEQbTJ().ordinal()]) {
            case 1:
            case 3:
                new C14461dlr(supportFragmentManager, "deleteWallet-aa&key", new Function1() { // from class: o.eyE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C17237eyx.KWHzl(this.OLrzqt, c17263ezW, (java.lang.String) obj);
                    }
                }, null, null, false, 56, null).EZpvd();
                break;
            case 2:
            case 6:
            case 7:
                new C14461dlr(supportFragmentManager, "deleteWallet-mpc&hd&ton", new Function1() { // from class: o.eyO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C17237eyx.AhwBna(this.OLrzqt, c17263ezW, (java.lang.String) obj);
                    }
                }, null, null, false, 56, null).EZpvd();
                break;
            case 4:
                AbstractC58260yxt abstractC58260yxtValueOf = C11607cUn.valueOf(this.EZpvd.EZpvd(c17263ezW.djBIcL(), c17263ezW.AEQbTJ(), "", false));
                final Function1 function1 = new Function1() { // from class: o.eyB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C17237eyx.djBIcL(this.OLrzqt, c17263ezW, (java.lang.Throwable) obj);
                    }
                };
                AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtValueOf.OLrzqt(new InterfaceC58227yxM() { // from class: o.eyI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C17237eyx.AxsJAY(function1, obj);
                    }
                });
                final Function1 function12 = new Function1() { // from class: o.eyG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C17237eyx.AYXKKw(this.EZpvd, c17263ezW, (C17289ezw) obj);
                    }
                };
                abstractC58260yxtOLrzqt.copydefault(new InterfaceC58227yxM() { // from class: o.eyH
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C17237eyx.sSMYrx(function12, obj);
                    }
                });
                break;
            case 5:
                AbstractC58260yxt abstractC58260yxtValueOf2 = C11607cUn.valueOf(this.EZpvd.AEQbTJ(c17263ezW.djBIcL(), c17263ezW.AEQbTJ(), ""));
                final Function1 function13 = new Function1() { // from class: o.eyF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C17237eyx.valueOf(this.copydefault, c17263ezW, (java.lang.Throwable) obj);
                    }
                };
                AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtValueOf2.OLrzqt(new InterfaceC58227yxM() { // from class: o.eyL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C17237eyx.zuBGHE(function13, obj);
                    }
                });
                final Function1 function14 = new Function1() { // from class: o.eyN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C17237eyx.djBIcL(this.AEQbTJ, c17263ezW, (C17289ezw) obj);
                    }
                };
                abstractC58260yxtOLrzqt2.copydefault(new InterfaceC58227yxM() { // from class: o.eyM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C17237eyx.gHZMYf(function14, obj);
                    }
                });
                break;
        }
    }

    public static final Unit KWHzl(final C17237eyx c17237eyx, final C17263ezW c17263ezW, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtValueOf = C11607cUn.valueOf(c17237eyx.EZpvd.EZpvd(c17263ezW.djBIcL(), c17263ezW.AEQbTJ(), str, true));
        final Function1 function1 = new Function1() { // from class: o.eze
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17237eyx.gEmmrt(this.KWHzl, c17263ezW, (java.lang.Throwable) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtValueOf.OLrzqt(new InterfaceC58227yxM() { // from class: o.ezf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C17237eyx.AuCTelauCTel(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.ezh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17237eyx.gEmmrt(this.EZpvd, c17263ezW, (C17289ezw) obj);
            }
        };
        abstractC58260yxtOLrzqt.copydefault(new InterfaceC58227yxM() { // from class: o.ezg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C17237eyx.wlaJM(function12, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(C17237eyx c17237eyx, C17263ezW c17263ezW, java.lang.Throwable th) {
        c17237eyx.EZpvd("WalletType:" + c17263ezW.AEQbTJ() + " walletId:" + c17263ezW.djBIcL(), th);
        return Unit.INSTANCE;
    }

    public static final void wlaJM(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(C17237eyx c17237eyx, C17263ezW c17263ezW, C17289ezw c17289ezw) {
        Intrinsics.copydefault(c17289ezw);
        c17237eyx.OLrzqt(c17289ezw, c17263ezW);
        return Unit.INSTANCE;
    }

    public static final void AxsJAY(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL(C17237eyx c17237eyx, C17263ezW c17263ezW, java.lang.Throwable th) {
        c17237eyx.EZpvd("WalletType.TrackingWallet walletId:" + c17263ezW.djBIcL(), th);
        return Unit.INSTANCE;
    }

    public static final void sSMYrx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AYXKKw(C17237eyx c17237eyx, C17263ezW c17263ezW, C17289ezw c17289ezw) {
        Intrinsics.copydefault(c17289ezw);
        c17237eyx.OLrzqt(c17289ezw, c17263ezW);
        return Unit.INSTANCE;
    }

    public static final void zuBGHE(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit valueOf(C17237eyx c17237eyx, C17263ezW c17263ezW, java.lang.Throwable th) {
        c17237eyx.EZpvd("WalletType.HardwareWallet walletId:" + c17263ezW.djBIcL(), th);
        return Unit.INSTANCE;
    }

    public static final void gHZMYf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL(C17237eyx c17237eyx, C17263ezW c17263ezW, C17289ezw c17289ezw) {
        Intrinsics.copydefault(c17289ezw);
        c17237eyx.OLrzqt(c17289ezw, c17263ezW);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(final C17237eyx c17237eyx, final C17263ezW c17263ezW, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<C17289ezw> abstractC58260yxtAEQbTJ = c17237eyx.EZpvd.AEQbTJ(c17263ezW.djBIcL(), c17263ezW.AEQbTJ(), str);
        final Function1 function1 = new Function1() { // from class: o.eyJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17237eyx.AYXKKw(this.OLrzqt, c17263ezW, (java.lang.Throwable) obj);
            }
        };
        AbstractC58260yxt<C17289ezw> abstractC58260yxtOLrzqt = abstractC58260yxtAEQbTJ.OLrzqt(new InterfaceC58227yxM() { // from class: o.eyW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C17237eyx.AwvSrB(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.ezi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17237eyx.valueOf(this.KWHzl, c17263ezW, (C17289ezw) obj);
            }
        };
        abstractC58260yxtOLrzqt.copydefault(new InterfaceC58227yxM() { // from class: o.ezr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C17237eyx.QKVWgx(function12, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void AwvSrB(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AYXKKw(C17237eyx c17237eyx, C17263ezW c17263ezW, java.lang.Throwable th) {
        c17237eyx.EZpvd("WalletType.HDWallet walletId:" + c17263ezW.djBIcL(), th);
        return Unit.INSTANCE;
    }

    public static final void QKVWgx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit valueOf(C17237eyx c17237eyx, C17263ezW c17263ezW, C17289ezw c17289ezw) {
        Intrinsics.copydefault(c17289ezw);
        c17237eyx.OLrzqt(c17289ezw, c17263ezW);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void logWalletDeleteError$default(C17237eyx c17237eyx, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        c17237eyx.EZpvd(str, th);
    }

    public final void EZpvd(java.lang.String str, java.lang.Throwable th) {
        pUU.copydefault(">>>wallet delete error message:" + str + " - error:" + th);
    }

    public final void copydefault() {
        RxBus.AEQbTJ(new xXO());
        RxBus.AEQbTJ(new xXM());
        xXA.OLrzqt();
    }

    public final void OLrzqt(C17289ezw c17289ezw, C17263ezW c17263ezW) {
        java.lang.String strEZpvd;
        C13854daT c13854daTFetchVPNInfo;
        pUU.OLrzqt(">>>wallet delete handleDeleteResult: " + c17289ezw + " - type: " + c17289ezw.EZpvd().EZpvd());
        copydefault();
        Function1<java.lang.String, Unit> function1EZpvd = c17263ezW.EZpvd();
        if (function1EZpvd != null) {
            function1EZpvd.invoke(c17289ezw.EZpvd().AEQbTJ());
        }
        this.OLrzqt.AEQbTJ(c17263ezW, c17289ezw.EZpvd());
        java.lang.String str = "";
        if (c17289ezw.copydefault()) {
            AbstractC12784ctX abstractC12784ctXOLrzqt = c17289ezw.EZpvd().OLrzqt();
            if (abstractC12784ctXOLrzqt != null) {
                C15689eRq.KWHzl.KWHzl(abstractC12784ctXOLrzqt.EZpvd());
                for (AbstractC12782ctV abstractC12782ctV : abstractC12784ctXOLrzqt.KWHzl()) {
                    WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).ejfBZ(abstractC12782ctV.DbNXlk());
                    C16058eck.Activity.getInstance$default(C16058eck.Companion, null, 1, null).OLrzqt(abstractC12782ctV.DbNXlk());
                    C15935eaT.ActionBar.getInstance$default(C15935eaT.Companion, null, 1, null).OLrzqt(abstractC12782ctV.DbNXlk());
                }
                if (c17289ezw.EZpvd().EZpvd() == WalletType.HardwareWallet && (c13854daTFetchVPNInfo = abstractC12784ctXOLrzqt.fetchVPNInfo()) != null) {
                    C13992dcz.AEQbTJ.EZpvd(new BluetoothDeviceModel(c13854daTFetchVPNInfo.AEQbTJ(), c13854daTFetchVPNInfo.AYXKKw(), ""));
                }
                dXK dxk = dXK.OLrzqt;
                java.util.List<AbstractC12782ctV> listKWHzl = abstractC12784ctXOLrzqt.KWHzl();
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
                java.util.Iterator<T> it = listKWHzl.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC12782ctV) it.next()).DbNXlk());
                }
                dxk.KWHzl(arrayList);
                dXK dxk2 = dXK.OLrzqt;
                java.util.List<AbstractC12782ctV> listKWHzl2 = abstractC12784ctXOLrzqt.KWHzl();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl2, 10));
                java.util.Iterator<T> it2 = listKWHzl2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((AbstractC12782ctV) it2.next()).DbNXlk());
                }
                dxk2.copydefault(arrayList2);
                C15523eLm.KWHzl.AhwBna();
                C15530eLt.ActionBar.getInstance$default(C15530eLt.Companion, null, 1, null).KWHzl();
                for (AbstractC12782ctV abstractC12782ctV2 : abstractC12784ctXOLrzqt.KWHzl()) {
                    try {
                        this.AEQbTJ.OLrzqt(abstractC12782ctV2.DbNXlk());
                        pUU.EZpvd(this.KWHzl, "Cleared search history for wallet: " + abstractC12782ctV2.DbNXlk());
                    } catch (java.lang.Exception e) {
                        pUU.AEQbTJ(this.KWHzl, "Failed to clear search history for wallet " + abstractC12782ctV2.DbNXlk() + ": " + e.getMessage(), e);
                    }
                }
                C10337bmZ c10337bmZ = C10337bmZ.KWHzl;
                java.util.List<AbstractC12782ctV> listKWHzl3 = abstractC12784ctXOLrzqt.KWHzl();
                java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl3, 10));
                java.util.Iterator<T> it3 = listKWHzl3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((AbstractC12782ctV) it3.next()).DbNXlk());
                }
                c10337bmZ.AEQbTJ(arrayList3);
                java.util.List<AbstractC12782ctV> listKWHzl4 = abstractC12784ctXOLrzqt.KWHzl();
                java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl4, 10));
                java.util.Iterator<T> it4 = listKWHzl4.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(((AbstractC12782ctV) it4.next()).DbNXlk());
                }
                pUU.copydefault("WalletDeleteHelper", "delete rootWallet WalletDeletionNotifierExtension = " + arrayList4.size());
            }
        } else {
            for (java.lang.String str2 : c17289ezw.KWHzl()) {
                WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).ejfBZ(str2);
                C16058eck.Activity.getInstance$default(C16058eck.Companion, null, 1, null).OLrzqt(str2);
                C15935eaT.ActionBar.getInstance$default(C15935eaT.Companion, null, 1, null).OLrzqt(str2);
                C15689eRq.KWHzl.KWHzl(str2);
                dXK dxk3 = dXK.OLrzqt;
                dxk3.KWHzl(C56402yEa.EZpvd(str2));
                dxk3.copydefault(C56402yEa.EZpvd(str2));
                C15523eLm.KWHzl.AhwBna();
                C15530eLt.ActionBar.getInstance$default(C15530eLt.Companion, null, 1, null).KWHzl();
                try {
                    this.AEQbTJ.OLrzqt(str2);
                    pUU.EZpvd(this.KWHzl, "Cleared search history for wallet: " + str2);
                } catch (java.lang.Exception e2) {
                    pUU.AEQbTJ(this.KWHzl, "Failed to clear search history for wallet " + str2 + ": " + e2.getMessage(), e2);
                }
            }
            C10337bmZ.KWHzl.AEQbTJ(c17289ezw.KWHzl());
            pUU.copydefault("WalletDeleteHelper", "delete single WalletDeletionNotifierExtension = " + c17289ezw.KWHzl().size());
        }
        AbstractC12784ctX abstractC12784ctXOLrzqt2 = c17289ezw.EZpvd().OLrzqt();
        if (abstractC12784ctXOLrzqt2 != null && (strEZpvd = abstractC12784ctXOLrzqt2.EZpvd()) != null) {
            str = strEZpvd;
        }
        AEQbTJ(str, c17263ezW.OLrzqt(), c17263ezW.AYXKKw());
    }

    public static final void ORxRYg(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void AEQbTJ(final java.lang.String str, final AppCompatActivity appCompatActivity, final boolean z) {
        AbstractC58260yxt abstractC58260yxtValueOf = C11607cUn.valueOf(this.AhwBna.KWHzl(false));
        final Function1 function1 = new Function1() { // from class: o.eyU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17237eyx.copydefault(this.AEQbTJ, z, appCompatActivity, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eyX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C17237eyx.ORxRYg(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.eyV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17237eyx.copydefault(str, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtValueOf.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eza
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C17237eyx.OcIXYQ(function12, obj);
            }
        });
    }

    public static final Unit copydefault(C17237eyx c17237eyx, boolean z, AppCompatActivity appCompatActivity, java.lang.Boolean bool) {
        C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.accessgetOnBackPressedCallbacksp), 0, 1, (java.lang.Object) null);
        if (bool.booleanValue()) {
            c17237eyx.AhwBna.copydefault(WalletStatus.RealWallets);
            RxBus.AEQbTJ(new C14390dkZ());
            if (z) {
                appCompatActivity.finish();
            }
        } else {
            handleAllWalletRemoved$default(c17237eyx, appCompatActivity, false, 2, null);
        }
        return Unit.INSTANCE;
    }

    public static final void OcIXYQ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.String str, java.lang.Throwable th) {
        WalletIdsReq walletIdsReq = new WalletIdsReq(C56402yEa.EZpvd(str));
        C6777aVl.Companion.EZpvd(new java.lang.Throwable("Defi: delete wallet failed. Req: " + new Gson().toJson(walletIdsReq) + ". Message: " + th.getMessage()));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void handleAllWalletRemoved$default(C17237eyx c17237eyx, AppCompatActivity appCompatActivity, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c17237eyx.AEQbTJ(appCompatActivity, z);
    }

    public final void AEQbTJ(AppCompatActivity appCompatActivity, boolean z) {
        this.AhwBna.copydefault(WalletStatus.NoWallet);
        WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).OLrzqt();
        C16058eck.removeDAppSessions$default(C16058eck.Activity.getInstance$default(C16058eck.Companion, null, 1, null), null, 1, null);
        C15935eaT.removeDAppSessions$default(C15935eaT.ActionBar.getInstance$default(C15935eaT.Companion, null, 1, null), null, 1, null);
        C21027grx.copydefault.copydefault(true);
        fPD fpd = fPD.copydefault;
        fpd.copydefault(true);
        fpd.OLrzqt(true);
        fpd.KWHzl(true);
        C15538eMa.OLrzqt.EZpvd(true);
        if (z) {
            C21256gwN.Companion.OLrzqt();
            RxBus.AEQbTJ(new xXO());
            RxBus.AEQbTJ(new xXM());
            C10856bwO.EZpvd(this.KWHzl, new FingerprintLog("delFingerprint reset"));
            try {
                this.AEQbTJ.OLrzqt();
                pUU.EZpvd(this.KWHzl, "Cleared all search history on wallet reset");
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ(this.KWHzl, "Failed to clear all search history: " + e.getMessage(), e);
            }
        } else {
            C10856bwO.EZpvd(this.KWHzl, new FingerprintLog("delFingerprint handleJump"));
        }
        C13023cxy.Application.getInstance$default(C13023cxy.Companion, null, 1, null).djBIcL();
        dZK.AEQbTJ.AEQbTJ(appCompatActivity, new EnterWalletMainBean(java.lang.Boolean.valueOf(z), (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, false, false, (com.okinc.wallet.api.bean.ScanResult) null, WebSocketProtocol.PAYLOAD_SHORT, (DefaultConstructorMarker) null));
        C13912dbY.copydefault.AEQbTJ(true);
        C14471dmA.EZpvd.EZpvd();
        xXA.OLrzqt();
    }
}
