package o;

import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.wallet.metricsmonitor.CreateOrImportType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.czt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13124czt {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final C12827cuN AEQbTJ;
    public final InterfaceC18445fiY OLrzqt;

    public C13124czt(@NotNull InterfaceC18445fiY interfaceC18445fiY, @NotNull C12827cuN c12827cuN) {
        Intrinsics.checkNotNullParameter(interfaceC18445fiY, "");
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        this.OLrzqt = interfaceC18445fiY;
        this.AEQbTJ = c12827cuN;
    }

    public static /* synthetic */ void monitorMnemonicWalletExistError$sendMnemonicWalletExistMetrics$default(C13124czt c13124czt, java.lang.String str, java.lang.String str2, java.lang.String str3, WalletType walletType, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            walletType = null;
        }
        OLrzqt(c13124czt, str, str2, str3, walletType);
    }

    public static final void OLrzqt(C13124czt c13124czt, java.lang.String str, java.lang.String str2, java.lang.String str3, WalletType walletType) {
        c13124czt.OLrzqt.copydefault(str, 100, "Mnemonic already exists.", str3, CreateOrImportType.IMPORT_WALLET, WalletType.HDWallet, walletType, str2);
    }

    public final void copydefault(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C11607cUn.OLrzqt(this.AEQbTJ.copydefault(false), (Function1<? super java.lang.Throwable, Unit>) new Function1() { // from class: o.czy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13124czt.AYXKKw(this.KWHzl, str, str2, (java.lang.Throwable) obj);
            }
        }, new Function1() { // from class: o.czv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13124czt.AhwBna(this.KWHzl, str, str2, (AbstractC12782ctV) obj);
            }
        });
    }

    public static final Unit AYXKKw(C13124czt c13124czt, java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        monitorMnemonicWalletExistError$sendMnemonicWalletExistMetrics$default(c13124czt, str, str2, null, null, 24, null);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C13124czt c13124czt, java.lang.String str, java.lang.String str2, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        OLrzqt(c13124czt, str, str2, abstractC12782ctV.DbNXlk(), abstractC12782ctV.QwvEab());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void monitorPrivateKeyWalletExistError$sendPrivateKeyWalletExistMetrics$default(C13124czt c13124czt, java.lang.String str, java.lang.String str2, java.lang.String str3, WalletType walletType, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            walletType = null;
        }
        EZpvd(c13124czt, str, str2, str3, walletType);
    }

    public static final void EZpvd(C13124czt c13124czt, java.lang.String str, java.lang.String str2, java.lang.String str3, WalletType walletType) {
        c13124czt.OLrzqt.copydefault(str, 101, "private key exist error.", str3, CreateOrImportType.IMPORT_WALLET, WalletType.KeyWallet, walletType, str2);
    }

    public final void EZpvd(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C11607cUn.OLrzqt(this.AEQbTJ.copydefault(false), (Function1<? super java.lang.Throwable, Unit>) new Function1() { // from class: o.czz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13124czt.valueOf(this.copydefault, str, str2, (java.lang.Throwable) obj);
            }
        }, new Function1() { // from class: o.czB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13124czt.gEmmrt(this.EZpvd, str, str2, (AbstractC12782ctV) obj);
            }
        });
    }

    public static final Unit valueOf(C13124czt c13124czt, java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        monitorPrivateKeyWalletExistError$sendPrivateKeyWalletExistMetrics$default(c13124czt, str, str2, null, null, 24, null);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C13124czt c13124czt, java.lang.String str, java.lang.String str2, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        EZpvd(c13124czt, str, str2, abstractC12782ctV.DbNXlk(), abstractC12782ctV.QwvEab());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void monitorChainNotSupportedError$sendChainNotSupportedMetrics$default(C13124czt c13124czt, java.lang.String str, java.lang.String str2, CreateOrImportType createOrImportType, WalletType walletType, java.lang.String str3, java.lang.String str4, WalletType walletType2, int i, java.lang.Object obj) {
        AEQbTJ(c13124czt, str, str2, createOrImportType, walletType, str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : walletType2);
    }

    public static final void AEQbTJ(C13124czt c13124czt, java.lang.String str, java.lang.String str2, CreateOrImportType createOrImportType, WalletType walletType, java.lang.String str3, java.lang.String str4, WalletType walletType2) {
        c13124czt.OLrzqt.copydefault(str, 103, str2, str4, createOrImportType, walletType, walletType2, str3);
    }

    public final void EZpvd(@NotNull final java.lang.String str, @NotNull final WalletType walletType, @NotNull final java.lang.String str2, @NotNull final CreateOrImportType createOrImportType, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(walletType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(createOrImportType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C11607cUn.OLrzqt(this.AEQbTJ.copydefault(false), (Function1<? super java.lang.Throwable, Unit>) new Function1() { // from class: o.czA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13124czt.OLrzqt(this.OLrzqt, str, str2, createOrImportType, walletType, str3, (java.lang.Throwable) obj);
            }
        }, new Function1() { // from class: o.czC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13124czt.OLrzqt(this.KWHzl, str, str2, createOrImportType, walletType, str3, (AbstractC12782ctV) obj);
            }
        });
    }

    public static final Unit OLrzqt(C13124czt c13124czt, java.lang.String str, java.lang.String str2, CreateOrImportType createOrImportType, WalletType walletType, java.lang.String str3, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        monitorChainNotSupportedError$sendChainNotSupportedMetrics$default(c13124czt, str, str2, createOrImportType, walletType, str3, null, null, 192, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C13124czt c13124czt, java.lang.String str, java.lang.String str2, CreateOrImportType createOrImportType, WalletType walletType, java.lang.String str3, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        AEQbTJ(c13124czt, str, str2, createOrImportType, walletType, str3, abstractC12782ctV.DbNXlk(), abstractC12782ctV.QwvEab());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void monitorAddressExistError$sendAddressExistMetrics$default(C13124czt c13124czt, java.lang.String str, CreateOrImportType createOrImportType, WalletType walletType, java.lang.String str2, java.lang.String str3, WalletType walletType2, int i, java.lang.Object obj) {
        AEQbTJ(c13124czt, str, createOrImportType, walletType, str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : walletType2);
    }

    public static final void AEQbTJ(C13124czt c13124czt, java.lang.String str, CreateOrImportType createOrImportType, WalletType walletType, java.lang.String str2, java.lang.String str3, WalletType walletType2) {
        c13124czt.OLrzqt.copydefault(str, 102, "Address already exists.", str3, createOrImportType, walletType, walletType2, str2);
    }

    public final void copydefault(@NotNull final java.lang.String str, @NotNull final WalletType walletType, @NotNull final CreateOrImportType createOrImportType, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(walletType, "");
        Intrinsics.checkNotNullParameter(createOrImportType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C11607cUn.OLrzqt(this.AEQbTJ.copydefault(false), (Function1<? super java.lang.Throwable, Unit>) new Function1() { // from class: o.czD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13124czt.AEQbTJ(this.AEQbTJ, str, createOrImportType, walletType, str2, (java.lang.Throwable) obj);
            }
        }, new Function1() { // from class: o.czF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13124czt.OLrzqt(this.EZpvd, str, createOrImportType, walletType, str2, (AbstractC12782ctV) obj);
            }
        });
    }

    public static final Unit AEQbTJ(C13124czt c13124czt, java.lang.String str, CreateOrImportType createOrImportType, WalletType walletType, java.lang.String str2, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        monitorAddressExistError$sendAddressExistMetrics$default(c13124czt, str, createOrImportType, walletType, str2, null, null, 96, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C13124czt c13124czt, java.lang.String str, CreateOrImportType createOrImportType, WalletType walletType, java.lang.String str2, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        AEQbTJ(c13124czt, str, createOrImportType, walletType, str2, abstractC12782ctV.DbNXlk(), abstractC12782ctV.QwvEab());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void monitorMpcWalletExistError$sendMpcWalletExistMetrics$default(C13124czt c13124czt, java.lang.String str, java.lang.String str2, java.lang.String str3, WalletType walletType, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            walletType = null;
        }
        copydefault(c13124czt, str, str2, str3, walletType);
    }

    public static final void copydefault(C13124czt c13124czt, java.lang.String str, java.lang.String str2, java.lang.String str3, WalletType walletType) {
        c13124czt.OLrzqt.copydefault(str, 106, "MPC wallet already exists.", str3, CreateOrImportType.IMPORT_WALLET, WalletType.MPCWallet, walletType, str2);
    }

    public final void OLrzqt(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C11607cUn.OLrzqt(this.AEQbTJ.copydefault(false), (Function1<? super java.lang.Throwable, Unit>) new Function1() { // from class: o.czJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13124czt.djBIcL(this.OLrzqt, str, str2, (java.lang.Throwable) obj);
            }
        }, new Function1() { // from class: o.czL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13124czt.AYXKKw(this.KWHzl, str, str2, (AbstractC12782ctV) obj);
            }
        });
    }

    public static final Unit djBIcL(C13124czt c13124czt, java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        monitorMpcWalletExistError$sendMpcWalletExistMetrics$default(c13124czt, str, str2, null, null, 24, null);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C13124czt c13124czt, java.lang.String str, java.lang.String str2, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        copydefault(c13124czt, str, str2, abstractC12782ctV.DbNXlk(), abstractC12782ctV.QwvEab());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void monitorMpcDataError$sendMpcDataErrorMetrics$default(C13124czt c13124czt, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, WalletType walletType, int i, java.lang.Object obj) {
        KWHzl(c13124czt, str, str2, str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : walletType);
    }

    public static final void KWHzl(C13124czt c13124czt, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, WalletType walletType) {
        c13124czt.OLrzqt.copydefault(str, 107, str2, str4, CreateOrImportType.CREATE_WALLET, WalletType.MPCWallet, walletType, str3);
    }

    public final void OLrzqt(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C11607cUn.OLrzqt(this.AEQbTJ.copydefault(false), (Function1<? super java.lang.Throwable, Unit>) new Function1() { // from class: o.czI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13124czt.EZpvd(this.KWHzl, str, str3, str2, (java.lang.Throwable) obj);
            }
        }, new Function1() { // from class: o.czE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13124czt.copydefault(this.copydefault, str, str3, str2, (AbstractC12782ctV) obj);
            }
        });
    }

    public static final Unit EZpvd(C13124czt c13124czt, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        monitorMpcDataError$sendMpcDataErrorMetrics$default(c13124czt, str, str2, str3, null, null, 48, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C13124czt c13124czt, java.lang.String str, java.lang.String str2, java.lang.String str3, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        KWHzl(c13124czt, str, str2, str3, abstractC12782ctV.DbNXlk(), abstractC12782ctV.QwvEab());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void monitorCreateMnemonicOrPrivateKeyError$sendMnemonicOrPrivateKeyErrorMetrics$default(C13124czt c13124czt, java.lang.String str, java.lang.String str2, CreateOrImportType createOrImportType, WalletType walletType, java.lang.String str3, java.lang.String str4, WalletType walletType2, int i, java.lang.Object obj) {
        OLrzqt(c13124czt, str, str2, createOrImportType, walletType, str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : walletType2);
    }

    public static final void OLrzqt(C13124czt c13124czt, java.lang.String str, java.lang.String str2, CreateOrImportType createOrImportType, WalletType walletType, java.lang.String str3, java.lang.String str4, WalletType walletType2) {
        c13124czt.OLrzqt.copydefault(str, 109, str2, str4, createOrImportType, walletType, walletType2, str3);
    }

    public final void EZpvd(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final WalletType walletType, @NotNull final java.lang.String str3, @NotNull final CreateOrImportType createOrImportType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(walletType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(createOrImportType, "");
        C11607cUn.OLrzqt(this.AEQbTJ.copydefault(false), (Function1<? super java.lang.Throwable, Unit>) new Function1() { // from class: o.czs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13124czt.copydefault(this.AEQbTJ, str, str3, createOrImportType, walletType, str2, (java.lang.Throwable) obj);
            }
        }, new Function1() { // from class: o.czx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13124czt.copydefault(this.OLrzqt, str, str3, createOrImportType, walletType, str2, (AbstractC12782ctV) obj);
            }
        });
    }

    public static final Unit copydefault(C13124czt c13124czt, java.lang.String str, java.lang.String str2, CreateOrImportType createOrImportType, WalletType walletType, java.lang.String str3, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        monitorCreateMnemonicOrPrivateKeyError$sendMnemonicOrPrivateKeyErrorMetrics$default(c13124czt, str, str2, createOrImportType, walletType, str3, null, null, 192, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C13124czt c13124czt, java.lang.String str, java.lang.String str2, CreateOrImportType createOrImportType, WalletType walletType, java.lang.String str3, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        OLrzqt(c13124czt, str, str2, createOrImportType, walletType, str3, abstractC12782ctV.DbNXlk(), abstractC12782ctV.QwvEab());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void monitorCreateHDWalletAAError$sendCreateHDWalletAAErrorMetrics$default(C13124czt c13124czt, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, WalletType walletType, int i, java.lang.Object obj) {
        copydefault(c13124czt, str, str2, str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : walletType);
    }

    public static final void copydefault(C13124czt c13124czt, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, WalletType walletType) {
        c13124czt.OLrzqt.copydefault(str, java.lang.Integer.valueOf(WalletImportError.ERROR_CODE_AA_CREATE_KEY), str2, str4, CreateOrImportType.CREATE_WALLET, WalletType.HDWallet, walletType, str3);
    }

    public final void KWHzl(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C11607cUn.OLrzqt(this.AEQbTJ.copydefault(false), (Function1<? super java.lang.Throwable, Unit>) new Function1() { // from class: o.czG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13124czt.OLrzqt(this.copydefault, str, str3, str2, (java.lang.Throwable) obj);
            }
        }, new Function1() { // from class: o.czH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13124czt.OLrzqt(this.EZpvd, str, str3, str2, (AbstractC12782ctV) obj);
            }
        });
    }

    public static final Unit OLrzqt(C13124czt c13124czt, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        monitorCreateHDWalletAAError$sendCreateHDWalletAAErrorMetrics$default(c13124czt, str, str2, str3, null, null, 48, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C13124czt c13124czt, java.lang.String str, java.lang.String str2, java.lang.String str3, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        copydefault(c13124czt, str, str2, str3, abstractC12782ctV.DbNXlk(), abstractC12782ctV.QwvEab());
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C13124czt c13124czt, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, WalletType walletType) {
        c13124czt.OLrzqt.copydefault(str, java.lang.Integer.valueOf(WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY), str2, str4, CreateOrImportType.CREATE_WALLET, WalletType.HDWallet, walletType, str3);
    }

    public static /* synthetic */ void monitorCreateAAExistError$sendCreateAAExistErrorMetrics$default(C13124czt c13124czt, java.lang.String str, WalletType walletType, java.lang.String str2, java.lang.String str3, WalletType walletType2, int i, java.lang.Object obj) {
        copydefault(c13124czt, str, walletType, str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : walletType2);
    }

    public static final void copydefault(C13124czt c13124czt, java.lang.String str, WalletType walletType, java.lang.String str2, java.lang.String str3, WalletType walletType2) {
        c13124czt.OLrzqt.copydefault(str, java.lang.Integer.valueOf(WalletImportError.ERROR_CODE_AA_EXIST), "AA wallet already exists.", str3, CreateOrImportType.CREATE_WALLET, walletType, walletType2, str2);
    }

    public final void copydefault(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final WalletType walletType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(walletType, "");
        C11607cUn.OLrzqt(this.AEQbTJ.copydefault(false), (Function1<? super java.lang.Throwable, Unit>) new Function1() { // from class: o.czK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13124czt.AEQbTJ(this.EZpvd, str, walletType, str2, (java.lang.Throwable) obj);
            }
        }, new Function1() { // from class: o.czM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13124czt.KWHzl(this.KWHzl, str, walletType, str2, (AbstractC12782ctV) obj);
            }
        });
    }

    public static final Unit AEQbTJ(C13124czt c13124czt, java.lang.String str, WalletType walletType, java.lang.String str2, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        monitorCreateAAExistError$sendCreateAAExistErrorMetrics$default(c13124czt, str, walletType, str2, null, null, 48, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C13124czt c13124czt, java.lang.String str, WalletType walletType, java.lang.String str2, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        copydefault(c13124czt, str, walletType, str2, abstractC12782ctV.DbNXlk(), abstractC12782ctV.QwvEab());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void monitorHardwareAccountExistError$sendHardwareAccountExistMetrics$default(C13124czt c13124czt, java.lang.String str, java.lang.String str2, java.lang.String str3, WalletType walletType, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            walletType = null;
        }
        AEQbTJ(c13124czt, str, str2, str3, walletType);
    }

    public static final void AEQbTJ(C13124czt c13124czt, java.lang.String str, java.lang.String str2, java.lang.String str3, WalletType walletType) {
        c13124czt.OLrzqt.copydefault(str, java.lang.Integer.valueOf(WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST), "this account already exists.", str3, CreateOrImportType.IMPORT_WALLET, WalletType.HardwareWallet, walletType, str2);
    }

    public final void AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C11607cUn.OLrzqt(this.AEQbTJ.copydefault(false), (Function1<? super java.lang.Throwable, Unit>) new Function1() { // from class: o.czu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13124czt.OLrzqt(this.copydefault, str, str2, (java.lang.Throwable) obj);
            }
        }, new Function1() { // from class: o.czw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13124czt.copydefault(this.OLrzqt, str, str2, (AbstractC12782ctV) obj);
            }
        });
    }

    public static final Unit OLrzqt(C13124czt c13124czt, java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        monitorHardwareAccountExistError$sendHardwareAccountExistMetrics$default(c13124czt, str, str2, null, null, 24, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C13124czt c13124czt, java.lang.String str, java.lang.String str2, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        AEQbTJ(c13124czt, str, str2, abstractC12782ctV.DbNXlk(), abstractC12782ctV.QwvEab());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.czt$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.czt.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ C13124czt getInstance$default(Application application, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return application.OLrzqt(context);
        }

        public final C13124czt OLrzqt(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).zsXlph();
        }
    }
}
