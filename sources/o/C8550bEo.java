package o;

import com.amplifyframework.ui.liveness.camera.LivenessCoordinator;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.api.model.IRegisterTransaction;
import com.okinc.business.defi.api.model.tx.signdata.BTCMessageSignData;
import com.okinc.business.defi.api.model.tx.signdata.CeDefiTransferSignData;
import com.okinc.business.defi.api.model.tx.signdata.EVMMessageSignData;
import com.okinc.business.defi.api.model.tx.signdata.PlatformItem;
import com.okinc.business.defi.biz.constant.KYSAssetType;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.core.transaction.sign.tron.OKWTronSignContract;
import com.okinc.business.defi.biz.core.tx.transaction.impl.OkUTXOTransaction;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.Asset;
import com.okinc.business.defi.biz.net.bean.DappBTCUTXOAllInfo;
import com.okinc.business.defi.biz.net.bean.DappBTCUTXOInfo;
import com.okinc.business.defi.biz.net.bean.DappBTCXRCAssetChange;
import com.okinc.business.defi.biz.net.bean.ExposureInfo;
import com.okinc.business.defi.biz.net.bean.Intention;
import com.okinc.business.defi.biz.net.bean.KYSPreTxCheckInfo;
import com.okinc.business.defi.biz.net.bean.Spender;
import com.okinc.business.defi.biz.net.bean.UTXONftInfo;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.AddressModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.AddressPermissionModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.AddressSwitchModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.Advance;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.AppBarTitleModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.ApproveInfoModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.AssetDiffModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.BaseModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.ButtonGroupModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DappInfoModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataShowModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DivideModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.InputsOutputsModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.NetworkFeeModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.PreExecTransactionRes;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.PsbtsModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.ShowInformationModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.SimpleTextModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TabListModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.Tabs;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TitleModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxExplain;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxInfoItem;
import com.okinc.business.defi.wallet.transaction.ui.transfer.TransferConfig;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.p2p.api.OtcExtraKeys;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC8601bFm;
import o.C13754dXa;
import o.C52761wXj;
import o.C8550bEo;
import o.C9678baC;
import o.InterfaceC9730bbB;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.bEo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8550bEo {
    public final OKWBaseTransaction<?> EZpvd;

    /* JADX INFO: renamed from: o.bEo$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKWBaseTransaction.TransactionType.values().length];
            try {
                iArr[OKWBaseTransaction.TransactionType.Approve.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKWBaseTransaction.TransactionType.CancelApprove.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OKWBaseTransaction.TransactionType.DappTransfer.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
            int[] iArr2 = new int[IRegisterTransaction.RegisterType.values().length];
            try {
                iArr2[IRegisterTransaction.RegisterType.RegisterToken.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[IRegisterTransaction.RegisterType.RegisterAddress.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            AEQbTJ = iArr2;
        }
    }

    public C8550bEo(@NotNull OKWBaseTransaction<?> oKWBaseTransaction) {
        Intrinsics.checkNotNullParameter(oKWBaseTransaction, "");
        this.EZpvd = oKWBaseTransaction;
    }

    public final PreExecTransactionRes EZpvd() {
        return new PreExecTransactionRes(null, AEQbTJ());
    }

    public final TxInfoItem AEQbTJ() {
        return new TxInfoItem(null, OLrzqt(), null, java.lang.Boolean.TRUE, java.lang.Boolean.FALSE, null, null, null, null, false, 672, null);
    }

    public final java.util.List<BaseModel<?>> OLrzqt() {
        java.lang.Object obj = this.EZpvd;
        if (obj instanceof AbstractC8664bGw) {
            return OLrzqt((AbstractC8664bGw<?, ?>) obj);
        }
        if (obj instanceof AbstractC8610bFv) {
            if (obj instanceof C12152chZ) {
                return ((C12152chZ) obj).fetchVPNInfo() ? ((C12152chZ) this.EZpvd).values() ? OLrzqt((C12152chZ) this.EZpvd) : buildSignPsbtModuleList$default(this, (C12152chZ) this.EZpvd, 0, false, null, 12, null) : ((C12152chZ) this.EZpvd).DbNXlk() ? buildSignPsbtModuleList$default(this, (C12152chZ) this.EZpvd, 0, false, null, 12, null) : ((C12152chZ) this.EZpvd).valueOf() ? KWHzl((AbstractC8610bFv<?>) this.EZpvd) : KWHzl((AbstractC8610bFv<?>) this.EZpvd);
            }
            return KWHzl((AbstractC8610bFv<?>) obj);
        }
        if (obj instanceof IRegisterTransaction) {
            return OLrzqt((IRegisterTransaction) obj);
        }
        if (!(obj instanceof AbstractC8601bFm)) {
            if (obj instanceof AbstractC8727bIF) {
                return AEQbTJ((AbstractC8727bIF<?>) obj);
            }
            return null;
        }
        int i = Application.KWHzl[((AbstractC8601bFm) obj).aUsmxb().ordinal()];
        if (i == 1) {
            return AEQbTJ((AbstractC8601bFm<?, ?>) this.EZpvd, false);
        }
        if (i == 2) {
            return AEQbTJ((AbstractC8601bFm<?, ?>) this.EZpvd, true);
        }
        if (i == 3) {
            return KWHzl((AbstractC8601bFm<?, ?>) this.EZpvd);
        }
        if (((AbstractC8601bFm) this.EZpvd).ak_()) {
            return EZpvd((AbstractC8601bFm<?, ?>) this.EZpvd);
        }
        return OLrzqt((AbstractC8601bFm<?, ?>) this.EZpvd);
    }

    public final java.util.List<BaseModel<?>> AEQbTJ(AbstractC8727bIF<?> abstractC8727bIF) {
        return EZpvd(new C8561bEz(this, abstractC8727bIF));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C8550bEo c8550bEo, AbstractC8727bIF abstractC8727bIF, StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        stateListAnimator.copydefault(titleModuleModel$default(c8550bEo, C33070mpX.AYXKKw(C13754dXa.FragmentManager.gkZNMa), "", null, null, false, 28, null));
        stateListAnimator.copydefault(c8550bEo.copydefault());
        CeDefiTransferSignData ceDefiTransferSignData = (CeDefiTransferSignData) abstractC8727bIF.QVsKAR();
        stateListAnimator.copydefault(c8550bEo.OLrzqt(C56402yEa.EZpvd(new AssetDiffModuleModel.AssetDiff(null, C56402yEa.EZpvd(new AssetDiffModuleModel.TokenAssetDifflist(null, new AssetDiffModuleModel.TokenInfo(ceDefiTransferSignData.getTokenAddress(), ceDefiTransferSignData.getDecimalNum(), ceDefiTransferSignData.getImgUrl(), ceDefiTransferSignData.getSymbol(), "", null, null, null, null, LivenessCoordinator.TARGET_WIDTH, null), "", ceDefiTransferSignData.getUsdValue(), "-" + C54870xYj.EZpvd(ceDefiTransferSignData.getTokenAmount(), ceDefiTransferSignData.getDecimalNum(), ceDefiTransferSignData.getDisplayPrecision(), null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null), null, null, 96, null))))));
        stateListAnimator.copydefault(c8550bEo.copydefault());
        stateListAnimator.copydefault(networkFeeModuleModel$default(c8550bEo, true, null, 2, null));
        stateListAnimator.copydefault(addressModuleModel$default(c8550bEo, C33070mpX.AYXKKw(C13754dXa.FragmentManager.generateConfigDelta_locale), abstractC8727bIF.zLjUOn(), null, ((CeDefiTransferSignData) abstractC8727bIF.QVsKAR()).getDisplayName(), null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        return Unit.INSTANCE;
    }

    public final java.util.List<BaseModel<?>> OLrzqt(final C12152chZ c12152chZ) {
        return EZpvd(new Function1() { // from class: o.bEF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8550bEo.KWHzl(this.AEQbTJ, c12152chZ, (C8550bEo.StateListAnimator) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C8550bEo c8550bEo, C12152chZ c12152chZ, StateListAnimator stateListAnimator) {
        java.util.List listAhwBna;
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        stateListAnimator.copydefault(titleModuleModel$default(c8550bEo, C33070mpX.AYXKKw(C13754dXa.FragmentManager.generateConfigDelta_colorMode), "", null, null, false, 28, null));
        stateListAnimator.copydefault(c8550bEo.copydefault());
        PlatformItem dapp = c12152chZ.OJuSTm().getDapp();
        android.app.Activity activeActivity$default = C9678baC.Activity.getActiveActivity$default(C9678baC.Companion, false, 1, null);
        android.content.Context baseContext = activeActivity$default != null ? activeActivity$default.getBaseContext() : null;
        if (baseContext != null) {
            java.lang.String urlOnlyHost = dapp != null ? dapp.getUrlOnlyHost() : null;
            java.lang.String platform = dapp != null ? dapp.getPlatform() : null;
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) urlOnlyHost)) {
                urlOnlyHost = C33129mqd.OLrzqt((java.lang.CharSequence) platform) ? platform : C33070mpX.AYXKKw(C13754dXa.FragmentManager.onCreatePanelView);
            }
            java.lang.Object image = dapp != null ? dapp.getImage(baseContext) : null;
            java.lang.String str = image instanceof java.lang.String ? (java.lang.String) image : null;
            if (str == null) {
                str = "";
            }
            stateListAnimator.copydefault(dappInfoModuleModel$default(c8550bEo, urlOnlyHost, str, "", null, 8, null));
            stateListAnimator.copydefault(c8550bEo.copydefault());
        }
        java.util.List<java.lang.String> psbtHexs = ((BTCMessageSignData) c12152chZ.QVsKAR()).getPsbtHexs();
        if (psbtHexs == null) {
            listAhwBna = yDY.AhwBna();
        } else {
            listAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(psbtHexs, 10));
            int i = 0;
            for (java.lang.Object obj : psbtHexs) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                java.lang.String strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.sTbpmZ, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C33129mqd.addS$default(java.lang.Integer.valueOf(i), 1, null, null, null, 14, null))));
                listAhwBna.add(new PsbtsModuleModel.PsbtHex(strCopydefault, (java.lang.String) obj, c8550bEo.AEQbTJ(c12152chZ, i, false, strCopydefault)));
                i++;
            }
        }
        stateListAnimator.copydefault(c8550bEo.KWHzl(new PsbtsModuleModel.Psbts(listAhwBna)));
        stateListAnimator.copydefault(addressModuleModel$default(c8550bEo, C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImplApi26ImplExternalSyntheticApiModelOutline1), c12152chZ.htlTjW(), c12152chZ.fERRXa().getAddressTypeText(), C14733dqy.copydefault.KWHzl(c12152chZ.dUDNAs()).toString(), null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null));
        stateListAnimator.copydefault(c8550bEo.EZpvd(new ButtonGroupModuleModel.ButtonGroup(C33070mpX.AYXKKw(C13754dXa.FragmentManager.OFnBcz), C33070mpX.AYXKKw(C13754dXa.FragmentManager.UPzgla))));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.util.List buildSignPsbtModuleList$default(C8550bEo c8550bEo, C12152chZ c12152chZ, int i, boolean z, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            str = null;
        }
        return c8550bEo.AEQbTJ(c12152chZ, i, z, str);
    }

    public final java.util.List<BaseModel<?>> AEQbTJ(final C12152chZ c12152chZ, final int i, final boolean z, final java.lang.String str) {
        return EZpvd(new Function1() { // from class: o.bEB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8550bEo.EZpvd(c12152chZ, i, str, z, this, (C8550bEo.StateListAnimator) obj);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(C12152chZ c12152chZ, int i, java.lang.String str, boolean z, C8550bEo c8550bEo, StateListAnimator stateListAnimator) {
        java.lang.String strKWHzl;
        java.lang.String valuationFromFee$default;
        InputsOutputsModuleModel inputsOutputsModuleModelCopydefault;
        int i2;
        java.lang.String gasFee;
        java.util.List<DappBTCXRCAssetChange> assetChange;
        java.lang.String strOLrzqt;
        java.lang.String valuationFromAsset$default;
        java.lang.String strOLrzqt2;
        java.lang.String usdAmount;
        java.lang.String urlOnlyHost;
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        c12152chZ.KWHzl(i);
        if (str != null) {
            stateListAnimator.copydefault(c8550bEo.EZpvd(str));
        }
        if (z) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.generateConfigDelta_colorMode);
            PlatformItem dapp = c12152chZ.OJuSTm().getDapp();
            stateListAnimator.copydefault(titleModuleModel$default(c8550bEo, strAYXKKw, (dapp == null || (urlOnlyHost = dapp.getUrlOnlyHost()) == null) ? "" : urlOnlyHost, null, null, false, 28, null));
            stateListAnimator.copydefault(c8550bEo.copydefault());
        }
        DappBTCUTXOAllInfo dappBTCUTXOAllInfoOLrzqt = c12152chZ.OLrzqt();
        if (dappBTCUTXOAllInfoOLrzqt != null && (assetChange = dappBTCUTXOAllInfoOLrzqt.getAssetChange()) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList<DappBTCXRCAssetChange> arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : assetChange) {
                java.lang.Integer direction = ((DappBTCXRCAssetChange) obj).getDirection();
                if (direction != null && direction.intValue() == 2) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
                for (DappBTCXRCAssetChange dappBTCXRCAssetChange : arrayList2) {
                    java.lang.String logo = dappBTCXRCAssetChange.getLogo();
                    java.lang.String str2 = logo == null ? "" : logo;
                    java.lang.String symbol = dappBTCXRCAssetChange.getSymbol();
                    AssetDiffModuleModel.TokenInfo tokenInfo = new AssetDiffModuleModel.TokenInfo("", 8, str2, (symbol == null || symbol.length() == 0) ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.ensureSubDecor) : symbol, "", null, "", null, null, 416, null);
                    java.lang.String amount = dappBTCXRCAssetChange.getAmount();
                    if (amount != null) {
                        java.lang.Integer vdecimal = dappBTCXRCAssetChange.getVdecimal();
                        strOLrzqt2 = C54870xYj.OLrzqt(amount, (249 & 1) != 0 ? 0 : 0, vdecimal != null ? vdecimal.intValue() : 8, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
                    } else {
                        strOLrzqt2 = null;
                    }
                    java.lang.String str3 = "-" + strOLrzqt2;
                    java.lang.String usdAmount2 = dappBTCXRCAssetChange.getUsdAmount();
                    arrayList3.add(new AssetDiffModuleModel.TokenAssetDifflist(null, tokenInfo, "-", null, str3, (usdAmount2 == null || usdAmount2.length() == 0 || (usdAmount = dappBTCXRCAssetChange.getUsdAmount()) == null) ? null : C54880xYt.formatValuationFromAsset$default(usdAmount, null, false, 0, false, 15, null), null, 64, null));
                }
                arrayList.add(new AssetDiffModuleModel.AssetDiff(null, arrayList3));
            }
            java.util.ArrayList<DappBTCXRCAssetChange> arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj2 : assetChange) {
                java.lang.Integer direction2 = ((DappBTCXRCAssetChange) obj2).getDirection();
                if (direction2 != null && direction2.intValue() == 1) {
                    arrayList4.add(obj2);
                }
            }
            if ((!arrayList2.isEmpty()) && (!arrayList4.isEmpty())) {
                arrayList.add(new AssetDiffModuleModel.AssetDiff(AssetDiffModuleModel.AssetDiff.segmentation, null));
            }
            if (!arrayList4.isEmpty()) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList4, 10));
                for (DappBTCXRCAssetChange dappBTCXRCAssetChange2 : arrayList4) {
                    java.lang.String usdAmount3 = dappBTCXRCAssetChange2.getUsdAmount();
                    java.lang.String logo2 = dappBTCXRCAssetChange2.getLogo();
                    java.lang.String str4 = logo2 == null ? "" : logo2;
                    java.lang.String symbol2 = dappBTCXRCAssetChange2.getSymbol();
                    AssetDiffModuleModel.TokenInfo tokenInfo2 = new AssetDiffModuleModel.TokenInfo("", 8, str4, (symbol2 == null || symbol2.length() == 0) ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.ensureSubDecor) : symbol2, "", null, "", null, null, 416, null);
                    java.lang.String amount2 = dappBTCXRCAssetChange2.getAmount();
                    if (amount2 != null) {
                        java.lang.Integer vdecimal2 = dappBTCXRCAssetChange2.getVdecimal();
                        strOLrzqt = C54870xYj.OLrzqt(amount2, (249 & 1) != 0 ? 0 : 0, vdecimal2 != null ? vdecimal2.intValue() : 8, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
                    } else {
                        strOLrzqt = null;
                    }
                    java.lang.String str5 = Marker.ANY_NON_NULL_MARKER + strOLrzqt;
                    java.lang.String usdAmount4 = dappBTCXRCAssetChange2.getUsdAmount();
                    if (usdAmount4 == null) {
                        valuationFromAsset$default = null;
                    } else {
                        java.lang.String str6 = usdAmount4.length() > 0 ? usdAmount4 : null;
                        if (str6 != null) {
                            valuationFromAsset$default = C54880xYt.formatValuationFromAsset$default(str6, null, false, 0, false, 15, null);
                        }
                    }
                    arrayList5.add(new AssetDiffModuleModel.TokenAssetDifflist(null, tokenInfo2, Marker.ANY_NON_NULL_MARKER, usdAmount3, str5, valuationFromAsset$default, null, 64, null));
                }
                arrayList.add(new AssetDiffModuleModel.AssetDiff(null, arrayList5));
            }
            stateListAnimator.copydefault(c8550bEo.OLrzqt(arrayList));
            stateListAnimator.copydefault(c8550bEo.copydefault());
        }
        DappBTCUTXOAllInfo dappBTCUTXOAllInfoOLrzqt2 = c12152chZ.OLrzqt();
        C10854bwM c10854bwMDHguZz = c12152chZ.dHguZz();
        if (dappBTCUTXOAllInfoOLrzqt2 == null || (gasFee = dappBTCUTXOAllInfoOLrzqt2.getGasFee()) == null) {
            strKWHzl = null;
        } else {
            strKWHzl = C54870xYj.KWHzl(gasFee, c10854bwMDHguZz.valueOf(), c10854bwMDHguZz.fZBcTu(), c10854bwMDHguZz.fJNWhG(), (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? DisplaySign.AUTO : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? RoundingMode.DOWN : null);
        }
        java.lang.String usdGasFee = dappBTCUTXOAllInfoOLrzqt2 != null ? dappBTCUTXOAllInfoOLrzqt2.getUsdGasFee() : null;
        if (usdGasFee == null || usdGasFee.length() == 0) {
            valuationFromFee$default = "--";
        } else {
            java.lang.String usdGasFee2 = dappBTCUTXOAllInfoOLrzqt2.getUsdGasFee();
            valuationFromFee$default = usdGasFee2 != null ? C54880xYt.formatValuationFromFee$default(usdGasFee2, null, false, false, 7, null) : null;
        }
        boolean zEZpvd = dappBTCUTXOAllInfoOLrzqt != null ? Intrinsics.EZpvd(dappBTCUTXOAllInfoOLrzqt.isShowFee(), java.lang.Boolean.TRUE) : false;
        stateListAnimator.copydefault(c8550bEo.EZpvd(zEZpvd, pTF.KWHzl.EZpvd(strKWHzl + " (" + valuationFromFee$default + ")")));
        stateListAnimator.copydefault(addressModuleModel$default(c8550bEo, C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImplApi26ImplExternalSyntheticApiModelOutline1), c12152chZ.htlTjW(), c12152chZ.fERRXa().getAddressTypeText(), C14733dqy.copydefault.KWHzl(c12152chZ.dUDNAs()).toString(), null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null));
        if (dappBTCUTXOAllInfoOLrzqt == null || !(C33129mqd.KWHzl((java.util.Collection) dappBTCUTXOAllInfoOLrzqt.getInputInfo()) || C33129mqd.KWHzl((java.util.Collection) dappBTCUTXOAllInfoOLrzqt.getOutputInfo()))) {
            inputsOutputsModuleModelCopydefault = null;
        } else {
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImpl2);
            java.util.List<DappBTCUTXOInfo> inputInfo = dappBTCUTXOAllInfoOLrzqt.getInputInfo();
            Intrinsics.copydefault(inputInfo);
            java.util.List<DappBTCUTXOInfo> outputInfo = dappBTCUTXOAllInfoOLrzqt.getOutputInfo();
            Intrinsics.copydefault(outputInfo);
            inputsOutputsModuleModelCopydefault = c8550bEo.copydefault(new InputsOutputsModuleModel.InputsOutputs(strAYXKKw2, inputInfo, outputInfo));
        }
        Tabs tabsAEQbTJ = C33129mqd.OLrzqt((java.lang.CharSequence) c12152chZ.AEQbTJ(true)) ? c8550bEo.AEQbTJ(C56402yEa.EZpvd(new Tabs.Children(c12152chZ.AEQbTJ(true), C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialDPHOMC), null))) : null;
        if (inputsOutputsModuleModelCopydefault == null && tabsAEQbTJ == null) {
            i2 = 0;
        } else {
            i2 = 0;
            stateListAnimator.copydefault(advanceModuleModel$default(c8550bEo, yDY.valueOf(inputsOutputsModuleModelCopydefault, tabsAEQbTJ), false, 2, null));
        }
        c12152chZ.KWHzl(i2);
        return Unit.INSTANCE;
    }

    public final java.util.List<BaseModel<?>> KWHzl(final AbstractC8610bFv<?> abstractC8610bFv) {
        return EZpvd(new Function1() { // from class: o.bEC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8550bEo.OLrzqt(abstractC8610bFv, this, (C8550bEo.StateListAnimator) obj);
            }
        });
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:117:0x024e */
    /* JADX DEBUG: Type inference failed for r1v10. Raw type applied. Possible types: com.okinc.business.defi.api.model.tx.signdata.SignDataArgs<SignData>, com.okinc.business.defi.api.model.tx.signdata.SignDataArgs */
    /* JADX DEBUG: Type inference failed for r1v5. Raw type applied. Possible types: SignData */
    /* JADX DEBUG: Type inference failed for r2v7. Raw type applied. Possible types: SignData */
    /* JADX DEBUG: Type inference failed for r3v18. Raw type applied. Possible types: com.okinc.business.defi.api.model.tx.signdata.SignDataArgs<SignData>, com.okinc.business.defi.api.model.tx.signdata.SignDataArgs */
    /* JADX DEBUG: Type inference failed for r3v4. Raw type applied. Possible types: com.okinc.business.defi.api.model.tx.signdata.SignDataArgs<SignData>, com.okinc.business.defi.api.model.tx.signdata.SignDataArgs */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x030b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0164  */
    /* JADX WARN: Type inference failed for: r36v0, types: [o.bEo] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [o.cef] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.Set] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OLrzqt(AbstractC8610bFv abstractC8610bFv, C8550bEo c8550bEo, StateListAnimator stateListAnimator) {
        java.lang.String strAYXKKw;
        java.lang.String urlOnlyHost;
        java.lang.Integer numValueOf;
        java.lang.String str;
        ?? AhwBna;
        boolean z;
        boolean z2;
        java.lang.String strAEQbTJ;
        boolean zFARcdN;
        boolean z3;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.List listOLrzqt;
        java.util.List listFARcdN;
        java.lang.String strOLrzqt;
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        C10854bwM c10854bwMDHguZz = abstractC8610bFv.dHguZz();
        C9701baZ c9701baZCopydefault = c8550bEo.copydefault(abstractC8610bFv, c10854bwMDHguZz);
        boolean z4 = abstractC8610bFv instanceof C11999cef;
        boolean z5 = z4 && c9701baZCopydefault != null;
        boolean zAEQbTJ = abstractC8610bFv.UlJrfe().AEQbTJ(C56524yIo.AEQbTJ(C9838bdD.class));
        if (c9701baZCopydefault != null) {
            stateListAnimator.copydefault(c8550bEo.KWHzl());
        }
        if (z4) {
            if (zAEQbTJ) {
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.onProvideKeyboardShortcuts);
            } else if (c9701baZCopydefault != null) {
                int i = C13754dXa.FragmentManager.GVpNrsfQMcgE;
                java.lang.String strGEmmrt = ((C11999cef) abstractC8610bFv).gEmmrt();
                java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImpl);
                if (strGEmmrt == null || strGEmmrt.length() == 0) {
                    strGEmmrt = strAYXKKw2;
                }
                strAYXKKw = C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("dappname", strGEmmrt)));
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.closeSocket);
            }
        } else if (abstractC8610bFv instanceof AbstractC8918bLl) {
            java.lang.Object objQVsKAR = ((AbstractC8918bLl) abstractC8610bFv).QVsKAR();
            EVMMessageSignData eVMMessageSignData = objQVsKAR instanceof EVMMessageSignData ? (EVMMessageSignData) objQVsKAR : null;
            if ((eVMMessageSignData != null ? eVMMessageSignData.getWcAuthRequestIssuer() : null) != null) {
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.initializePanelDecor);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.closeSocket);
            }
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.closeSocket);
        }
        if (z5) {
            PlatformItem dapp = ((C11999cef) abstractC8610bFv).OJuSTm().getDapp();
            urlOnlyHost = dapp != null ? dapp.getUrlOnlyHost() : null;
            if (urlOnlyHost == null) {
            }
        } else {
            urlOnlyHost = "";
        }
        if (zAEQbTJ) {
            numValueOf = java.lang.Integer.valueOf(C13754dXa.Activity.htlTjW);
        } else {
            numValueOf = z5 ? java.lang.Integer.valueOf(C13754dXa.Activity.spnCvw) : null;
        }
        stateListAnimator.copydefault(c8550bEo.KWHzl(strAYXKKw, urlOnlyHost, numValueOf, zAEQbTJ ? java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl) : null, !z5));
        stateListAnimator.copydefault(c8550bEo.copydefault());
        if (z5) {
            if (C33129mqd.AEQbTJ(c9701baZCopydefault.EZpvd(), java.lang.Double.valueOf(java.lang.Math.pow(10.0d, 13.0d)))) {
                strOLrzqt = C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialaGOrKO);
            } else {
                java.lang.String strEZpvd = c9701baZCopydefault.EZpvd();
                if (strEZpvd != null) {
                    strOLrzqt = C54870xYj.OLrzqt(strEZpvd, (249 & 1) != 0 ? 0 : 0, c10854bwMDHguZz.DTwDnp(), null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
                } else {
                    strOLrzqt = null;
                }
                if (strOLrzqt == null) {
                    str2 = "";
                }
                java.lang.String strKWHzl = c9701baZCopydefault.KWHzl();
                java.lang.String str3 = strKWHzl != null ? "" : strKWHzl;
                int iValueOf = c10854bwMDHguZz.valueOf();
                java.lang.String strOLrzqt2 = c9701baZCopydefault.OLrzqt();
                java.lang.String str4 = strOLrzqt2 != null ? "" : strOLrzqt2;
                java.lang.String strAEQbTJ2 = c9701baZCopydefault.AEQbTJ();
                stateListAnimator.copydefault(c8550bEo.OLrzqt(C56402yEa.EZpvd(new AssetDiffModuleModel.AssetDiff(null, C56402yEa.EZpvd(new AssetDiffModuleModel.TokenAssetDifflist("", new AssetDiffModuleModel.TokenInfo(str3, iValueOf, str4, (strAEQbTJ2 != null || strAEQbTJ2.length() == 0) ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.ensureSubDecor) : strAEQbTJ2, "", null, "", null, null, 416, null), "-", "", str2, null, null, 96, null))))));
                stateListAnimator.copydefault(c8550bEo.copydefault());
            }
            str2 = strOLrzqt;
            java.lang.String strKWHzl2 = c9701baZCopydefault.KWHzl();
            if (strKWHzl2 != null) {
            }
            int iValueOf2 = c10854bwMDHguZz.valueOf();
            java.lang.String strOLrzqt22 = c9701baZCopydefault.OLrzqt();
            if (strOLrzqt22 != null) {
            }
            java.lang.String strAEQbTJ22 = c9701baZCopydefault.AEQbTJ();
            if (strAEQbTJ22 != null) {
                stateListAnimator.copydefault(c8550bEo.OLrzqt(C56402yEa.EZpvd(new AssetDiffModuleModel.AssetDiff(null, C56402yEa.EZpvd(new AssetDiffModuleModel.TokenAssetDifflist("", new AssetDiffModuleModel.TokenInfo(str3, iValueOf2, str4, (strAEQbTJ22 != null || strAEQbTJ22.length() == 0) ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.ensureSubDecor) : strAEQbTJ22, "", null, "", null, null, 416, null), "-", "", str2, null, null, 96, null))))));
                stateListAnimator.copydefault(c8550bEo.copydefault());
            }
            ?? r7 = z4 ? (C11999cef) abstractC8610bFv : str;
            AhwBna = r7 != 0 ? r7.AhwBna() : str;
            if (AhwBna == 0) {
                AhwBna = yEE.copydefault();
            }
            c8550bEo.EZpvd(stateListAnimator, AhwBna);
            stateListAnimator.copydefault(networkFeeModuleModel$default(c8550bEo, false, str, 2, str));
            if (z5 && C33129mqd.OLrzqt((java.lang.CharSequence) c9701baZCopydefault.copydefault())) {
                java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.DjzMc);
                java.lang.String strCopydefault = c9701baZCopydefault.copydefault();
                Intrinsics.copydefault((java.lang.Object) strCopydefault);
                z = false;
                z2 = z4;
                stateListAnimator.copydefault(addressModuleModel$default(c8550bEo, strAYXKKw3, strCopydefault, null, null, null, java.lang.Boolean.valueOf(c8550bEo.KWHzl(abstractC8610bFv)), null, 92, null));
            } else {
                z = false;
                z2 = z4;
            }
            stateListAnimator.copydefault(addressModuleModel$default(c8550bEo, C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImplApi26ImplExternalSyntheticApiModelOutline1), abstractC8610bFv.htlTjW(), abstractC8610bFv.dHguZz().iRxXKY() ? abstractC8610bFv.fERRXa().getAddressTypeText() : "", C14733dqy.copydefault.KWHzl(abstractC8610bFv.dUDNAs()).toString(), null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null));
            strAEQbTJ = abstractC8610bFv.AEQbTJ(true);
            if (c10854bwMDHguZz.QkdxfA()) {
                if (strAEQbTJ != null) {
                    zFARcdN = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ);
                    z3 = !zFARcdN;
                }
                z3 = z;
            } else {
                if ((c10854bwMDHguZz.fARcdN() || c10854bwMDHguZz.fIwbmz()) && strAEQbTJ != null) {
                    zFARcdN = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ);
                    z3 = !zFARcdN;
                }
                z3 = z;
            }
            arrayList = new java.util.ArrayList();
            if (!z2 || c9701baZCopydefault == null) {
                arrayList2 = arrayList;
            } else {
                int i2 = C13754dXa.FragmentManager.sGvRiA;
                java.lang.String strAEQbTJ3 = c9701baZCopydefault.AEQbTJ();
                java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ensureSubDecor);
                if (strAEQbTJ3 == null || strAEQbTJ3.length() == 0) {
                    strAEQbTJ3 = strAYXKKw4;
                }
                java.lang.String strCopydefault2 = C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", strAEQbTJ3)));
                java.lang.String strKWHzl3 = c9701baZCopydefault.KWHzl();
                arrayList2 = arrayList;
                arrayList2.add(addressModuleModel$default(c8550bEo, strCopydefault2, strKWHzl3 == null ? "" : strKWHzl3, null, null, null, null, null, 124, null));
            }
            listOLrzqt = C56402yEa.OLrzqt();
            if (strAEQbTJ != null && strAEQbTJ.length() != 0) {
                listOLrzqt.add(new Tabs.Children(strAEQbTJ, C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialDPHOMC), MTPushConstants.Analysis.KEY_JSON));
            }
            listFARcdN = C56402yEa.fARcdN(listOLrzqt);
            if (C33129mqd.KWHzl((java.util.Collection) listFARcdN)) {
                arrayList2.add(c8550bEo.AEQbTJ(listFARcdN));
            }
            if (C33129mqd.KWHzl((java.util.Collection) arrayList2)) {
                stateListAnimator.copydefault(c8550bEo.OLrzqt(arrayList2, z3));
            }
            return Unit.INSTANCE;
        }
        java.lang.Object objQVsKAR2 = abstractC8610bFv.QVsKAR();
        EVMMessageSignData eVMMessageSignData2 = objQVsKAR2 instanceof EVMMessageSignData ? (EVMMessageSignData) objQVsKAR2 : null;
        if ((eVMMessageSignData2 != null ? eVMMessageSignData2.getWcAuthRequestIssuer() : null) != null) {
            stateListAnimator.copydefault(c8550bEo.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DQzvGNdrmXxudrmXxu), null, "", C33070mpX.KWHzl(C13754dXa.Activity.AxsJAYsNCnLh)));
            stateListAnimator.copydefault(c8550bEo.copydefault());
        } else {
            PlatformItem dapp2 = abstractC8610bFv.OJuSTm().getDapp();
            java.lang.String urlOnlyHost2 = dapp2 != null ? dapp2.getUrlOnlyHost() : null;
            android.app.Activity activeActivity$default = C9678baC.Activity.getActiveActivity$default(C9678baC.Companion, false, 1, null);
            android.content.Context baseContext = activeActivity$default != null ? activeActivity$default.getBaseContext() : null;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) urlOnlyHost2) && baseContext != null) {
                PlatformItem dapp3 = abstractC8610bFv.OJuSTm().getDapp();
                java.lang.Object image = dapp3 != null ? dapp3.getImage(baseContext) : null;
                java.lang.String str5 = image instanceof java.lang.String ? (java.lang.String) image : null;
                str = null;
                stateListAnimator.copydefault(dappInfoModuleModel$default(c8550bEo, urlOnlyHost2, str5 == null ? "" : str5, "", null, 8, null));
                stateListAnimator.copydefault(c8550bEo.copydefault());
            }
            if (z4) {
            }
            if (r7 != 0) {
            }
            if (AhwBna == 0) {
            }
            c8550bEo.EZpvd(stateListAnimator, AhwBna);
            stateListAnimator.copydefault(networkFeeModuleModel$default(c8550bEo, false, str, 2, str));
            if (z5) {
                z = false;
                z2 = z4;
            }
            stateListAnimator.copydefault(addressModuleModel$default(c8550bEo, C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImplApi26ImplExternalSyntheticApiModelOutline1), abstractC8610bFv.htlTjW(), abstractC8610bFv.dHguZz().iRxXKY() ? abstractC8610bFv.fERRXa().getAddressTypeText() : "", C14733dqy.copydefault.KWHzl(abstractC8610bFv.dUDNAs()).toString(), null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null));
            strAEQbTJ = abstractC8610bFv.AEQbTJ(true);
            if (c10854bwMDHguZz.QkdxfA()) {
            }
            arrayList = new java.util.ArrayList();
            if (z2) {
                arrayList2 = arrayList;
            }
            listOLrzqt = C56402yEa.OLrzqt();
            if (strAEQbTJ != null) {
                listOLrzqt.add(new Tabs.Children(strAEQbTJ, C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialDPHOMC), MTPushConstants.Analysis.KEY_JSON));
            }
            listFARcdN = C56402yEa.fARcdN(listOLrzqt);
            if (C33129mqd.KWHzl((java.util.Collection) listFARcdN)) {
            }
            if (C33129mqd.KWHzl((java.util.Collection) arrayList2)) {
            }
            return Unit.INSTANCE;
        }
        str = null;
        if (z4) {
        }
        if (r7 != 0) {
        }
        if (AhwBna == 0) {
        }
        c8550bEo.EZpvd(stateListAnimator, AhwBna);
        stateListAnimator.copydefault(networkFeeModuleModel$default(c8550bEo, false, str, 2, str));
        if (z5) {
        }
        stateListAnimator.copydefault(addressModuleModel$default(c8550bEo, C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImplApi26ImplExternalSyntheticApiModelOutline1), abstractC8610bFv.htlTjW(), abstractC8610bFv.dHguZz().iRxXKY() ? abstractC8610bFv.fERRXa().getAddressTypeText() : "", C14733dqy.copydefault.KWHzl(abstractC8610bFv.dUDNAs()).toString(), null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null));
        strAEQbTJ = abstractC8610bFv.AEQbTJ(true);
        if (c10854bwMDHguZz.QkdxfA()) {
        }
        arrayList = new java.util.ArrayList();
        if (z2) {
        }
        listOLrzqt = C56402yEa.OLrzqt();
        if (strAEQbTJ != null) {
        }
        listFARcdN = C56402yEa.fARcdN(listOLrzqt);
        if (C33129mqd.KWHzl((java.util.Collection) listFARcdN)) {
        }
        if (C33129mqd.KWHzl((java.util.Collection) arrayList2)) {
        }
        return Unit.INSTANCE;
    }

    public final C9701baZ copydefault(AbstractC8610bFv<?> abstractC8610bFv, C10854bwM c10854bwM) {
        C9758bbd c9758bbdCopydefault;
        if (!c10854bwM.run()) {
            return null;
        }
        java.util.HashMap<java.lang.Integer, AbstractC9832bcy> mapCopydefault = abstractC8610bFv.UlJrfe().copydefault();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<java.lang.Integer, AbstractC9832bcy> entry : mapCopydefault.entrySet()) {
            if (entry.getValue() instanceof C9835bdA) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.lang.Object objRcXXUw = CollectionsKt___CollectionsKt.RcXXUw(linkedHashMap.values());
        C9835bdA c9835bdA = objRcXXUw instanceof C9835bdA ? (C9835bdA) objRcXXUw : null;
        if (c9835bdA == null || (c9758bbdCopydefault = c9835bdA.copydefault()) == null) {
            return null;
        }
        return c9758bbdCopydefault.OLrzqt();
    }

    public final java.util.List<BaseModel<?>> OLrzqt(final AbstractC8664bGw<?, ?> abstractC8664bGw) {
        return EZpvd(new Function1() { // from class: o.bEw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8550bEo.EZpvd(abstractC8664bGw, this, (C8550bEo.StateListAnimator) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r35v0, resolved type: o.bGw */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0328 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0334  */
    /* JADX WARN: Type inference failed for: r23v9, types: [o.bCW] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(final AbstractC8664bGw abstractC8664bGw, C8550bEo c8550bEo, StateListAnimator stateListAnimator) {
        java.lang.String strAYXKKw;
        boolean z;
        int i;
        java.lang.String strConvertToString$default;
        boolean z2;
        boolean zOLrzqt;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        TransferConfig transferConfig;
        boolean z7;
        java.lang.String localized$default;
        int i2;
        java.util.List listAhwBna;
        java.util.List listAhwBna2;
        kotlin.Pair pairOLrzqt;
        java.lang.String strEZpvd;
        int i3;
        java.lang.String strAYXKKw2;
        java.lang.String str;
        java.lang.String string;
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        java.util.Collection<AbstractC9832bcy> collectionValues = abstractC8664bGw.UlJrfe().copydefault().values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        AbstractC9832bcy abstractC9832bcy = (AbstractC9832bcy) CollectionsKt___CollectionsKt.RcXXUw(collectionValues);
        boolean z8 = abstractC9832bcy instanceof C9870bdj;
        if (z8) {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.OYuSWK);
        } else {
            strAYXKKw = abstractC8664bGw instanceof C12266cjh ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.applyFixedSizeWindow) : C33070mpX.AYXKKw(C13754dXa.FragmentManager.gkZNMa);
        }
        java.lang.String str2 = strAYXKKw;
        PlatformItem dapp = abstractC8664bGw.OJuSTm().getDapp();
        java.lang.String urlOnlyHost = dapp != null ? dapp.getUrlOnlyHost() : null;
        stateListAnimator.copydefault(titleModuleModel$default(c8550bEo, str2, urlOnlyHost == null ? "" : urlOnlyHost, null, null, false, 28, null));
        stateListAnimator.copydefault(c8550bEo.copydefault());
        boolean z9 = abstractC8664bGw instanceof C12149chW;
        if (z9) {
            C12149chW c12149chW = (C12149chW) abstractC8664bGw;
            java.util.List<UTXONftInfo> listAlsFma = c12149chW.alsFma();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAlsFma, 10));
            for (UTXONftInfo uTXONftInfo : listAlsFma) {
                java.lang.String name = uTXONftInfo.getName();
                java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ensureSubDecor);
                if (name == null || name.length() == 0) {
                    name = strAYXKKw3;
                }
                java.lang.String strValueOf = java.lang.String.valueOf(name);
                java.lang.String imgUrl = uTXONftInfo.getImgUrl();
                arrayList.add(new AssetDiffModuleModel.TokenAssetDifflist(null, new AssetDiffModuleModel.TokenInfo("", 0, (imgUrl == null || imgUrl.length() == 0) ? c12149chW.dHguZz().DbNXlk() : imgUrl, "", "", null, null, null, "", 224, null), "-", null, strValueOf, null, java.lang.Integer.valueOf(C55298xhM.dp2px$default(8.0f, null, 1, null)), 32, null));
            }
            stateListAnimator.copydefault(c8550bEo.OLrzqt(C56402yEa.EZpvd(new AssetDiffModuleModel.AssetDiff(null, arrayList))));
        } else if (abstractC8664bGw instanceof C12207cib) {
            C12207cib c12207cib = (C12207cib) abstractC8664bGw;
            C10854bwM c10854bwMFHqPtx = c12207cib.fHqPtx();
            c12207cib.b_(c12207cib.values(c12207cib.Ufzxmz()));
            AssetDiffModuleModel assetDiffModuleModelOLrzqt = c8550bEo.OLrzqt(C56402yEa.EZpvd(new AssetDiffModuleModel.AssetDiff(null, C56402yEa.EZpvd(new AssetDiffModuleModel.TokenAssetDifflist(null, new AssetDiffModuleModel.TokenInfo(c10854bwMFHqPtx.OLrzqt(), c10854bwMFHqPtx.valueOf(), c10854bwMFHqPtx.DbNXlk(), c10854bwMFHqPtx.fJNWhG(), "", null, c10854bwMFHqPtx.dNCPSb(), null, null, 416, null), "-", null, "-" + C54870xYj.EZpvd(c12207cib.Ufzxmz(), c10854bwMFHqPtx.valueOf(), c10854bwMFHqPtx.DTwDnp(), null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null), c12207cib.EZpvd(true), null, 64, null)))));
            assetDiffModuleModelOLrzqt.setModuleId("asset_diff");
            stateListAnimator.copydefault(assetDiffModuleModelOLrzqt);
        } else {
            C10854bwM c10854bwMFHqPtx2 = abstractC8664bGw.fHqPtx();
            C8423bCT c8423bCTAm_ = abstractC8664bGw.am_();
            AssetDiffModuleModel assetDiffModuleModelOLrzqt2 = c8550bEo.OLrzqt(C56402yEa.EZpvd(new AssetDiffModuleModel.AssetDiff(null, C56402yEa.EZpvd(new AssetDiffModuleModel.TokenAssetDifflist(null, new AssetDiffModuleModel.TokenInfo(c10854bwMFHqPtx2.OLrzqt(), c10854bwMFHqPtx2.valueOf(), c10854bwMFHqPtx2.DbNXlk(), "", "", null, C10854bwM.isXRCToken$default(c10854bwMFHqPtx2, null, 1, null) ? c10854bwMFHqPtx2.dNCPSb() : "", null, c8423bCTAm_.OLrzqt(), CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256, null), "-", null, c8423bCTAm_.AEQbTJ(), c8423bCTAm_.copydefault(), null, 64, null)))));
            assetDiffModuleModelOLrzqt2.setModuleId("asset_diff");
            stateListAnimator.copydefault(assetDiffModuleModelOLrzqt2);
        }
        stateListAnimator.copydefault(c8550bEo.copydefault());
        stateListAnimator.copydefault(networkFeeModuleModel$default(c8550bEo, abstractC8664bGw.QKudOq().copydefault().isShowFee(), null, 2, null));
        if (z9) {
            java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcqEDu);
            ChainAddress chainAddressRcXXUw = ((C12149chW) abstractC8664bGw).RcXXUw();
            java.lang.String addressTypeText = chainAddressRcXXUw != null ? chainAddressRcXXUw.getAddressTypeText() : null;
            if (addressTypeText == null) {
                addressTypeText = "";
            }
            stateListAnimator.copydefault(c8550bEo.EZpvd(strAYXKKw4, addressTypeText));
            stateListAnimator.copydefault(c8550bEo.copydefault());
        }
        boolean z10 = abstractC8664bGw instanceof C12266cjh;
        java.lang.String strAYXKKw5 = z10 ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImplApi26ImplExternalSyntheticApiModelOutline1) : C33070mpX.AYXKKw(C13754dXa.FragmentManager.onPrepareActionMode);
        java.lang.String strSpnCvw = abstractC8664bGw.spnCvw();
        java.lang.String addressTypeText2 = abstractC8664bGw.dHguZz().iRxXKY() ? abstractC8664bGw.fERRXa().getAddressTypeText() : "";
        C14733dqy c14733dqy = C14733dqy.copydefault;
        stateListAnimator.copydefault(addressModuleModel$default(c8550bEo, strAYXKKw5, strSpnCvw, addressTypeText2, c14733dqy.KWHzl(abstractC8664bGw.dUDNAs()).toString(), null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null));
        if (z10) {
            z = false;
            i = 2;
        } else {
            java.lang.Integer txSource = abstractC8664bGw.OJuSTm().getTxSource();
            if (txSource == null) {
                i3 = 2;
            } else {
                i3 = 2;
                if (txSource.intValue() == 2 && !z9) {
                    strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.setDrawerSlideAnimationEnabled);
                }
                java.lang.String str3 = strAYXKKw2;
                java.lang.String strAn_ = abstractC8664bGw.an_();
                if (!C33129mqd.OLrzqt((java.lang.CharSequence) abstractC8664bGw.z_())) {
                    string = abstractC8664bGw.z_();
                } else if (C33129mqd.OLrzqt((java.lang.CharSequence) abstractC8664bGw.A_())) {
                    string = abstractC8664bGw.A_();
                } else if (Intrinsics.EZpvd((java.lang.Object) abstractC8664bGw.zLjUOn(), (java.lang.Object) abstractC8664bGw.htlTjW())) {
                    string = c14733dqy.KWHzl(abstractC8664bGw.dUDNAs()).toString();
                } else {
                    str = null;
                    boolean z11 = (abstractC9832bcy == null || !z8 || ((C9870bdj) abstractC9832bcy).gEmmrt()) ? false : true;
                    i = i3;
                    z = false;
                    stateListAnimator.copydefault(addressModuleModel$default(c8550bEo, str3, strAn_, null, str, null, java.lang.Boolean.valueOf(z11), null, 84, null));
                }
                str = string;
                if (abstractC9832bcy == null) {
                    i = i3;
                    z = false;
                    stateListAnimator.copydefault(addressModuleModel$default(c8550bEo, str3, strAn_, null, str, null, java.lang.Boolean.valueOf(z11), null, 84, null));
                }
            }
            strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.generateConfigDelta_locale);
            java.lang.String str32 = strAYXKKw2;
            java.lang.String strAn_2 = abstractC8664bGw.an_();
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) abstractC8664bGw.z_())) {
            }
            str = string;
            if (abstractC9832bcy == null) {
            }
        }
        if (z9) {
            java.lang.String strAYXKKw6 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImpl7);
            C12149chW c12149chW2 = (C12149chW) abstractC8664bGw;
            java.lang.String strOcIXYQ = c12149chW2.OcIXYQ();
            SimpleTextModuleModel simpleTextModuleModelSimpleTextModuleModel$default = simpleTextModuleModel$default(c8550bEo, strAYXKKw6, (strOcIXYQ == null || (strEZpvd = C54870xYj.EZpvd(strOcIXYQ, c12149chW2.dHguZz().valueOf(), c12149chW2.dHguZz().AkhnZx(), c12149chW2.dHguZz().fJNWhG(), (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null)) == null) ? "--" : strEZpvd, null, 4, null);
            simpleTextModuleModelSimpleTextModuleModel$default.setModuleId("available_balance");
            stateListAnimator.copydefault(simpleTextModuleModelSimpleTextModuleModel$default);
        }
        if (z10) {
            C12266cjh c12266cjh = (C12266cjh) abstractC8664bGw;
            stateListAnimator.copydefault(simpleTextModuleModel$default(c8550bEo, C33070mpX.AYXKKw(C13754dXa.FragmentManager.attachToWindow), c12266cjh.TarCU() + " Sats = " + AbstractC8426bCW.formatToFeeCurrencyAmount$default(c12266cjh.QKudOq(), c12266cjh.TarCU(), false, false, false, 6, null), null, 4, null));
        }
        if (z10) {
            strConvertToString$default = ((C12266cjh) abstractC8664bGw).ULRxlR();
        } else {
            java.lang.Integer txSource2 = abstractC8664bGw.OJuSTm().getTxSource();
            strConvertToString$default = (txSource2 == null || txSource2.intValue() != i || z9) ? null : C54862xYb.convertToString$default(C54862xYb.KWHzl(AbstractC8704bHj.getTransferAmount$default(abstractC8664bGw, z, z, 3, null), abstractC8664bGw.QKudOq().AEQbTJ()), false, null, null, 7, null);
        }
        if (strConvertToString$default != null) {
            java.lang.String str4 = strConvertToString$default;
            SimpleTextModuleModel simpleTextModuleModelSimpleTextModuleModel$default2 = simpleTextModuleModel$default(c8550bEo, C33070mpX.AYXKKw(C13754dXa.FragmentManager.dcEsSD), c8550bEo.AYXKKw() ? "--" : AbstractC8426bCW.formatToFeeCoinAmount$default(abstractC8664bGw.QKudOq(), str4, false, false, false, 14, null) + " " + AbstractC8426bCW.formatToFeeCurrencyAmount$default(abstractC8664bGw.QKudOq(), str4, false, false, false, 14, null), null, 4, null);
            simpleTextModuleModelSimpleTextModuleModel$default2.setModuleId("total_cost");
            stateListAnimator.copydefault(simpleTextModuleModelSimpleTextModuleModel$default2);
            Unit unit = Unit.INSTANCE;
        }
        if (abstractC8664bGw instanceof InterfaceC9747bbS) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) abstractC8664bGw.y_())) {
                java.lang.String strAYXKKw7 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.fAklCm);
                java.lang.String strY_ = abstractC8664bGw.y_();
                if (strY_ == null) {
                    strY_ = "";
                }
                stateListAnimator.copydefault(c8550bEo.EZpvd(strAYXKKw7, strY_, C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImplApi17Impl)));
            } else {
                if (abstractC8664bGw instanceof C11945cde) {
                    if (((C11945cde) abstractC8664bGw).QKVWgx()) {
                        pairOLrzqt = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ComponentDialog), C33070mpX.AYXKKw(C13754dXa.FragmentManager.FullyDrawnReporter));
                    } else {
                        pairOLrzqt = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.r8lambdaKrBLxNpMJdSxVU3Lsj65hn0UyA), C33070mpX.AYXKKw(C13754dXa.FragmentManager.FullyDrawnReporter));
                    }
                } else {
                    pairOLrzqt = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.fAklCm), C33070mpX.AYXKKw(C13754dXa.FragmentManager.RhjxDW));
                }
                java.lang.String str5 = (java.lang.String) pairOLrzqt.component1();
                java.lang.String str6 = (java.lang.String) pairOLrzqt.component2();
                InterfaceC9747bbS interfaceC9747bbS = (InterfaceC9747bbS) abstractC8664bGw;
                stateListAnimator.copydefault(dataInputModuleModel$default(c8550bEo, "memo", DataInputModuleModel.DataInputItem.HEIGHT_TALL, str5, str6, interfaceC9747bbS.copydefault(), null, interfaceC9747bbS.KWHzl(), 0, new Function1() { // from class: o.bEy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C8550bEo.OLrzqt(abstractC8664bGw, (java.lang.String) obj);
                    }
                }, CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256, null));
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (abstractC8664bGw instanceof C12207cib) {
            z2 = false;
            OkUTXOTransaction.InputsAndOutputs inputsAndOutputsOLrzqt = ((C12207cib) abstractC8664bGw).OLrzqt(false);
            if (C33129mqd.KWHzl((java.util.Collection) inputsAndOutputsOLrzqt.getInputs()) && C33129mqd.KWHzl((java.util.Collection) inputsAndOutputsOLrzqt.getOutputs())) {
                java.lang.String strAYXKKw8 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.hQkvHM);
                java.util.List<OkUTXOTransaction.InputsAndOutputs.UTXOSimpleBean> inputs = inputsAndOutputsOLrzqt.getInputs();
                if (inputs != null) {
                    i2 = 10;
                    listAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(inputs, 10));
                    for (OkUTXOTransaction.InputsAndOutputs.UTXOSimpleBean uTXOSimpleBean : inputs) {
                        listAhwBna.add(new DappBTCUTXOInfo(C56402yEa.EZpvd(uTXOSimpleBean.getAddress()), (java.lang.String) null, uTXOSimpleBean.getAmount(), java.lang.Boolean.TRUE, (java.lang.Boolean) null, (java.util.List) null, 50, (DefaultConstructorMarker) null));
                    }
                } else {
                    i2 = 10;
                    listAhwBna = null;
                }
                if (listAhwBna == null) {
                    listAhwBna = yDY.AhwBna();
                }
                java.util.List<OkUTXOTransaction.InputsAndOutputs.UTXOSimpleBean> outputs = inputsAndOutputsOLrzqt.getOutputs();
                if (outputs != null) {
                    listAhwBna2 = new java.util.ArrayList(C56403yEb.AYXKKw(outputs, i2));
                    for (OkUTXOTransaction.InputsAndOutputs.UTXOSimpleBean uTXOSimpleBean2 : outputs) {
                        listAhwBna2.add(new DappBTCUTXOInfo(C56402yEa.EZpvd(uTXOSimpleBean2.getAddress()), (java.lang.String) null, uTXOSimpleBean2.getAmount(), (java.lang.Boolean) null, (java.lang.Boolean) null, (java.util.List) null, 58, (DefaultConstructorMarker) null));
                    }
                } else {
                    listAhwBna2 = null;
                }
                if (listAhwBna2 == null) {
                    listAhwBna2 = yDY.AhwBna();
                }
                arrayList2.add(c8550bEo.copydefault(new InputsOutputsModuleModel.InputsOutputs(strAYXKKw8, listAhwBna, listAhwBna2)));
                zOLrzqt = true;
            }
            z3 = abstractC8664bGw instanceof C9303bSz;
            if (z3) {
                z4 = z3;
                z5 = z2;
                z6 = true;
            } else {
                java.lang.String strOcIXYQ2 = ((C9303bSz) abstractC8664bGw).OcIXYQ();
                java.lang.String strAYXKKw9 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.hKJZrr);
                if (strOcIXYQ2 != null) {
                    z7 = true;
                    localized$default = pTB.formatLocalized$default(strOcIXYQ2, null, 1, null);
                } else {
                    z7 = true;
                    localized$default = null;
                }
                z6 = z7;
                z4 = z3;
                z5 = z2;
                arrayList2.add(dataInputModuleModel$default(c8550bEo, "nonce", "normal", strAYXKKw9, localized$default, strOcIXYQ2, DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, 0, 0, new Function1() { // from class: o.bEx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C8550bEo.AEQbTJ(abstractC8664bGw, (java.lang.String) obj);
                    }
                }, 192, null));
            }
            if (abstractC8664bGw instanceof InterfaceC9778bbx) {
                boolean z12 = (((InterfaceC9778bbx) abstractC8664bGw).KWHzl() && (transferConfig = (TransferConfig) C48787ucK.AEQbTJ.EZpvd(C20446ggz.Companion.EZpvd(), TransferConfig.class)) != null && Intrinsics.EZpvd(transferConfig.getShouldShowTransferEditableData(), java.lang.Boolean.TRUE)) ? z6 : z5;
                boolean z13 = (z4 && ((C9303bSz) abstractC8664bGw).fHqPtx().AuCTel()) ? z6 : z5;
                if (z4 && !((C9303bSz) abstractC8664bGw).fHqPtx().AuCTel()) {
                    z5 = z6;
                }
                if (z12 || z13) {
                    arrayList2.add(dataInputModuleModel$default(c8550bEo, "hex_data", DataInputModuleModel.DataInputItem.HEIGHT_TALL, C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImpl4), C33070mpX.AYXKKw(C13754dXa.FragmentManager.onDetachedFromWindow), AEQbTJ((AbstractC8664bGw<?, ?>) abstractC8664bGw), null, 0, 0, null, LivenessCoordinator.TARGET_WIDTH, null));
                    zOLrzqt = C33129mqd.OLrzqt((java.lang.CharSequence) AEQbTJ((AbstractC8664bGw<?, ?>) abstractC8664bGw));
                }
                if (z5) {
                    java.lang.String strAYXKKw10 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialDPHOMC);
                    java.lang.String strAEQbTJ = AEQbTJ((AbstractC8664bGw<?, ?>) abstractC8664bGw);
                    if (strAEQbTJ == null) {
                        strAEQbTJ = "";
                    }
                    arrayList2.add(c8550bEo.EZpvd(strAYXKKw10, strAEQbTJ, (java.lang.String) null));
                }
            }
            boolean z14 = zOLrzqt;
            if (!arrayList2.isEmpty()) {
                stateListAnimator.copydefault(c8550bEo.OLrzqt(arrayList2, z14));
            }
            return Unit.INSTANCE;
        }
        z2 = false;
        zOLrzqt = z2;
        z3 = abstractC8664bGw instanceof C9303bSz;
        if (z3) {
        }
        if (abstractC8664bGw instanceof InterfaceC9778bbx) {
        }
        boolean z142 = zOLrzqt;
        if (!arrayList2.isEmpty()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.bGw */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(AbstractC8664bGw abstractC8664bGw, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ((InterfaceC9747bbS) abstractC8664bGw).EZpvd(str);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(AbstractC8664bGw abstractC8664bGw, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ((C9303bSz) abstractC8664bGw).valueOf(str);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.bGw<?, ?> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.String AEQbTJ(AbstractC8664bGw<?, ?> abstractC8664bGw) {
        java.lang.String strAEQbTJ = ((InterfaceC9778bbx) abstractC8664bGw).AEQbTJ();
        if (strAEQbTJ == null || Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) EIP1271Verifier.hexPrefix)) {
            return null;
        }
        return strAEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.bFm<?, ?> */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.List<BaseModel<?>> AEQbTJ(final AbstractC8601bFm<?, ?> abstractC8601bFm, final boolean z) {
        final InterfaceC9730bbB.StateListAnimator stateListAnimatorEZpvd;
        InterfaceC9730bbB interfaceC9730bbB = abstractC8601bFm instanceof InterfaceC9730bbB ? (InterfaceC9730bbB) abstractC8601bFm : null;
        if (interfaceC9730bbB == null || (stateListAnimatorEZpvd = interfaceC9730bbB.EZpvd()) == null) {
            return yDY.AhwBna();
        }
        return EZpvd(new Function1() { // from class: o.bEv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8550bEo.OLrzqt(this.OLrzqt, z, abstractC8601bFm, stateListAnimatorEZpvd, (C8550bEo.StateListAnimator) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r32v0, resolved type: o.bFm */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C8550bEo c8550bEo, boolean z, final AbstractC8601bFm abstractC8601bFm, InterfaceC9730bbB.StateListAnimator stateListAnimator, StateListAnimator stateListAnimator2) {
        boolean z2;
        java.lang.String strA_;
        java.lang.String str;
        boolean z3;
        java.lang.Object obj;
        C8550bEo c8550bEo2;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(stateListAnimator2, "");
        stateListAnimator2.copydefault(c8550bEo.KWHzl());
        if (z) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.IResultReceiver2Default);
            PlatformItem dapp = abstractC8601bFm.OJuSTm().getDapp();
            java.lang.String urlOnlyHost = dapp != null ? dapp.getUrlOnlyHost() : null;
            stateListAnimator2.copydefault(titleModuleModel$default(c8550bEo, strAYXKKw, urlOnlyHost == null ? "" : urlOnlyHost, java.lang.Integer.valueOf(C13754dXa.Activity.Dmq), null, false, 24, null));
        } else {
            java.lang.String strWlaJM = abstractC8601bFm.wlaJM();
            if (strWlaJM == null || strWlaJM.length() == 0) {
                strWlaJM = C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImpl);
                z2 = false;
            } else {
                z2 = true;
            }
            java.lang.String strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.GVpNrsfQMcgE, C56423yEv.EZpvd(C56390yDp.OLrzqt("dappname", strWlaJM)));
            PlatformItem dapp2 = abstractC8601bFm.OJuSTm().getDapp();
            java.lang.String urlOnlyHost2 = dapp2 != null ? dapp2.getUrlOnlyHost() : null;
            stateListAnimator2.copydefault(titleModuleModel$default(c8550bEo, strCopydefault, urlOnlyHost2 == null ? "" : urlOnlyHost2, java.lang.Integer.valueOf(C13754dXa.Activity.spnCvw), null, z2, 8, null));
        }
        stateListAnimator2.copydefault(c8550bEo.copydefault());
        java.lang.String strAYXKKw2 = stateListAnimator.AYXKKw();
        java.lang.String strAYXKKw3 = (strAYXKKw2 == null || strAYXKKw2.length() == 0) ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.ensureSubDecor) : strAYXKKw2;
        if (z) {
            java.lang.String strEZpvd = stateListAnimator.EZpvd();
            stateListAnimator2.copydefault(c8550bEo.OLrzqt(C56402yEa.EZpvd(new AssetDiffModuleModel.AssetDiff(null, C56402yEa.EZpvd(new AssetDiffModuleModel.TokenAssetDifflist(null, new AssetDiffModuleModel.TokenInfo("", 0, strEZpvd == null ? "" : strEZpvd, strAYXKKw3, "", null, "", null, null, 416, null), "", null, null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null))))));
        } else {
            InterfaceC9730bbB interfaceC9730bbB = (InterfaceC9730bbB) abstractC8601bFm;
            boolean zAEQbTJ = interfaceC9730bbB.AEQbTJ();
            boolean zKWHzl = interfaceC9730bbB.KWHzl();
            java.lang.String strW_ = abstractC8601bFm.W_();
            ApproveInfoModuleModel.TxInfoItem txInfoItem = new ApproveInfoModuleModel.TxInfoItem(java.lang.Integer.valueOf(stateListAnimator.copydefault()), stateListAnimator.KWHzl(), stateListAnimator.EZpvd(), stateListAnimator.AYXKKw(), null, java.lang.Integer.valueOf(stateListAnimator.valueOf()));
            ApproveInfoModuleModel.AuthQuantity authQuantity = new ApproveInfoModuleModel.AuthQuantity(java.lang.Boolean.valueOf(zKWHzl && !C59449zhJ.equals$default(abstractC8601bFm.W_(), "SKIP_EDIT", false, 2, null)), java.lang.Boolean.valueOf(zKWHzl && (Intrinsics.EZpvd((java.lang.Object) strW_, (java.lang.Object) "EDIT_DEFAULT_NUM") || Intrinsics.EZpvd((java.lang.Object) strW_, (java.lang.Object) "EDIT_NUM"))), (Intrinsics.EZpvd((java.lang.Object) strW_, (java.lang.Object) "EDIT_DEFAULT_NUM") || Intrinsics.EZpvd((java.lang.Object) strW_, (java.lang.Object) "SKIP_EDIT")) ? "115792089237316195423570985008687907853269984665640564039457584007913129639935" : null, Intrinsics.EZpvd((java.lang.Object) strW_, (java.lang.Object) "SKIP_EDIT") ? abstractC8601bFm.X_() : "");
            if (zAEQbTJ) {
                if (Intrinsics.EZpvd((java.lang.Object) interfaceC9730bbB.a_(false), (java.lang.Object) "115792089237316195423570985008687907853269984665640564039457584007913129639935")) {
                    strA_ = C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialaGOrKO);
                } else {
                    strA_ = interfaceC9730bbB.a_(true);
                }
                str2 = strA_;
            }
            stateListAnimator2.copydefault(c8550bEo.KWHzl(C56402yEa.EZpvd(new ApproveInfoModuleModel.ApproveInfoListItem(null, null, txInfoItem, null, authQuantity, null, str2))));
        }
        stateListAnimator2.copydefault(c8550bEo.copydefault());
        stateListAnimator2.copydefault(networkFeeModuleModel$default(c8550bEo, true, null, 2, null));
        if (z) {
            str = strAYXKKw3;
            stateListAnimator2.copydefault(addressModuleModel$default(c8550bEo, C33070mpX.AYXKKw(C13754dXa.FragmentManager.dESsmu), ((InterfaceC9730bbB) abstractC8601bFm).OLrzqt(), null, null, null, null, null, 124, null));
        } else {
            str = strAYXKKw3;
            stateListAnimator2.copydefault(addressModuleModel$default(c8550bEo, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DjzMc), ((InterfaceC9730bbB) abstractC8601bFm).OLrzqt(), null, null, null, java.lang.Boolean.valueOf(c8550bEo.KWHzl((OKWBaseTransaction<?>) abstractC8601bFm)), null, 92, null));
        }
        stateListAnimator2.copydefault(addressModuleModel$default(c8550bEo, C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImplApi26ImplExternalSyntheticApiModelOutline1), abstractC8601bFm.htlTjW(), null, C14733dqy.copydefault.KWHzl(abstractC8601bFm.dUDNAs()).toString(), null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        if (abstractC8601bFm instanceof C9216bRR) {
            java.lang.String strRcXXUw = ((C9216bRR) abstractC8601bFm).RcXXUw();
            z3 = true;
            stateListAnimator2.copydefault(dataInputModuleModel$default(c8550bEo, "nonce", "normal", C33070mpX.AYXKKw(C13754dXa.FragmentManager.hKJZrr), strRcXXUw != null ? pTB.formatLocalized$default(strRcXXUw, null, 1, null) : null, strRcXXUw, null, 0, 0, new Function1() { // from class: o.bEt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C8550bEo.AEQbTJ(abstractC8601bFm, (java.lang.String) obj2);
                }
            }, 224, null));
        } else {
            z3 = true;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(addressModuleModel$default(c8550bEo, C33069mpW.copydefault(C13754dXa.FragmentManager.sGvRiA, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", str))), stateListAnimator.KWHzl(), null, null, null, null, null, 124, null));
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        java.lang.String strAEQbTJ = abstractC8601bFm.AEQbTJ(z3);
        if (strAEQbTJ == null || strAEQbTJ.length() == 0) {
            obj = null;
        } else {
            obj = null;
            listOLrzqt.add(new Tabs.Children(strAEQbTJ, C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialDPHOMC), null));
            java.lang.String strZ_ = abstractC8601bFm.Z_();
            if (strZ_ != null && strZ_.length() != 0) {
                listOLrzqt.add(new Tabs.Children(strZ_, C33070mpX.AYXKKw(C13754dXa.FragmentManager.sanitizeWindowFeatureId), MTPushConstants.Analysis.KEY_JSON));
            }
        }
        java.util.List<Tabs.Children> listFARcdN = C56402yEa.fARcdN(listOLrzqt);
        if (listFARcdN.isEmpty() ^ z3) {
            c8550bEo2 = c8550bEo;
            arrayList.add(c8550bEo2.AEQbTJ(listFARcdN));
        } else {
            c8550bEo2 = c8550bEo;
        }
        stateListAnimator2.copydefault(advanceModuleModel$default(c8550bEo2, arrayList, false, 2, obj));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(AbstractC8601bFm abstractC8601bFm, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ((C9216bRR) abstractC8601bFm).AhwBna(str);
        return Unit.INSTANCE;
    }

    public final java.util.List<BaseModel<?>> KWHzl(final AbstractC8601bFm<?, ?> abstractC8601bFm) {
        return EZpvd(new Function1() { // from class: o.bEE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8550bEo.copydefault(abstractC8601bFm, this, (C8550bEo.StateListAnimator) obj);
            }
        });
    }

    public static final Unit copydefault(final AbstractC8601bFm abstractC8601bFm, C8550bEo c8550bEo, StateListAnimator stateListAnimator) {
        java.lang.Integer num;
        java.lang.Integer numValueOf;
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.gkZNMa);
        boolean z = abstractC8601bFm instanceof OKWTronSignContract;
        if (z && ((OKWTronSignContract) abstractC8601bFm).UlJrfe().AEQbTJ(C56524yIo.AEQbTJ(C9838bdD.class))) {
            int i = C13754dXa.Activity.htlTjW;
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.onProvideKeyboardShortcuts);
            int i2 = C52761wXj.Activity.fdOvFl;
            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i);
            numValueOf = java.lang.Integer.valueOf(i2);
            num = numValueOf2;
            strAYXKKw = strAYXKKw2;
        } else {
            num = null;
            numValueOf = null;
        }
        PlatformItem dapp = abstractC8601bFm.OJuSTm().getDapp();
        java.lang.String urlOnlyHost = dapp != null ? dapp.getUrlOnlyHost() : null;
        if (urlOnlyHost == null) {
            urlOnlyHost = "";
        }
        stateListAnimator.copydefault(titleModuleModel$default(c8550bEo, strAYXKKw, urlOnlyHost, num, numValueOf, false, 16, null));
        stateListAnimator.copydefault(c8550bEo.copydefault());
        int iOLrzqt = stateListAnimator.OLrzqt();
        java.util.List<? extends AbstractC8601bFm<?, ?>.Activity> listOLrzqt = abstractC8601bFm.OLrzqt(true);
        if (listOLrzqt != null && !listOLrzqt.isEmpty()) {
            stateListAnimator.copydefault(c8550bEo.OLrzqt(C56402yEa.EZpvd(new AssetDiffModuleModel.AssetDiff(null, c8550bEo.EZpvd(listOLrzqt)))));
        }
        if (stateListAnimator.OLrzqt() > iOLrzqt) {
            stateListAnimator.copydefault(c8550bEo.copydefault());
        }
        OKWTronSignContract oKWTronSignContract = z ? (OKWTronSignContract) abstractC8601bFm : null;
        java.util.Set<java.lang.String> setDcqEDu = oKWTronSignContract != null ? oKWTronSignContract.DcqEDu() : null;
        if (setDcqEDu == null) {
            setDcqEDu = yEE.copydefault();
        }
        c8550bEo.EZpvd(stateListAnimator, setDcqEDu);
        stateListAnimator.copydefault(networkFeeModuleModel$default(c8550bEo, true, null, 2, null));
        stateListAnimator.copydefault(addressModuleModel$default(c8550bEo, C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImplApi26ImplExternalSyntheticApiModelOutline1), abstractC8601bFm.htlTjW(), null, C14733dqy.copydefault.KWHzl(abstractC8601bFm.dUDNAs()).toString(), null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        java.lang.String strZLjUOn = abstractC8601bFm.zLjUOn();
        if (strZLjUOn.length() > 0) {
            stateListAnimator.copydefault(addressModuleModel$default(c8550bEo, C33070mpX.AYXKKw(C13754dXa.FragmentManager.setDrawerSlideAnimationEnabled), strZLjUOn, null, null, null, null, null, 124, null));
        }
        if (abstractC8601bFm instanceof C9216bRR) {
            java.lang.String strRcXXUw = ((C9216bRR) abstractC8601bFm).RcXXUw();
            stateListAnimator.copydefault(dataInputModuleModel$default(c8550bEo, "nonce", "normal", C33070mpX.AYXKKw(C13754dXa.FragmentManager.hKJZrr), strRcXXUw != null ? pTB.formatLocalized$default(strRcXXUw, null, 1, null) : null, strRcXXUw, null, 0, 0, new Function1() { // from class: o.bEs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C8550bEo.djBIcL(abstractC8601bFm, (java.lang.String) obj);
                }
            }, 224, null));
        } else if (z) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List listOLrzqt2 = C56402yEa.OLrzqt();
            java.lang.String strAEQbTJ = ((OKWTronSignContract) abstractC8601bFm).AEQbTJ(true);
            if (strAEQbTJ != null && strAEQbTJ.length() != 0) {
                listOLrzqt2.add(new Tabs.Children(strAEQbTJ, C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialDPHOMC), null));
            }
            java.util.List<Tabs.Children> listFARcdN = C56402yEa.fARcdN(listOLrzqt2);
            if (!listFARcdN.isEmpty()) {
                arrayList.add(c8550bEo.AEQbTJ(listFARcdN));
            }
            if (!arrayList.isEmpty()) {
                stateListAnimator.copydefault(advanceModuleModel$default(c8550bEo, arrayList, false, 2, null));
            }
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) abstractC8601bFm.RlQdEF())) {
            stateListAnimator.copydefault(c8550bEo.OLrzqt(abstractC8601bFm.RlQdEF()));
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(AbstractC8601bFm abstractC8601bFm, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ((C9216bRR) abstractC8601bFm).AhwBna(str);
        return Unit.INSTANCE;
    }

    public final java.util.List<BaseModel<?>> EZpvd(final AbstractC8601bFm<?, ?> abstractC8601bFm) {
        return EZpvd(new Function1() { // from class: o.bED
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8550bEo.OLrzqt(this.AEQbTJ, abstractC8601bFm, (C8550bEo.StateListAnimator) obj);
            }
        });
    }

    public static final Unit OLrzqt(C8550bEo c8550bEo, AbstractC8601bFm abstractC8601bFm, StateListAnimator stateListAnimator) {
        boolean z;
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        stateListAnimator.copydefault(c8550bEo.KWHzl());
        java.lang.String strWlaJM = abstractC8601bFm.wlaJM();
        if (strWlaJM == null || strWlaJM.length() == 0) {
            strWlaJM = C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImpl);
            z = false;
        } else {
            z = true;
        }
        java.lang.String strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.GVpNrsfQMcgE, C56423yEv.EZpvd(C56390yDp.OLrzqt("dappname", strWlaJM)));
        PlatformItem dapp = abstractC8601bFm.OJuSTm().getDapp();
        java.lang.String urlOnlyHost = dapp != null ? dapp.getUrlOnlyHost() : null;
        if (urlOnlyHost == null) {
            urlOnlyHost = "";
        }
        stateListAnimator.copydefault(titleModuleModel$default(c8550bEo, strCopydefault, urlOnlyHost, java.lang.Integer.valueOf(C13754dXa.Activity.spnCvw), null, z, 8, null));
        stateListAnimator.copydefault(c8550bEo.copydefault());
        KYSPreTxCheckInfo kYSPreTxCheckInfoAb_ = abstractC8601bFm.ab_();
        java.util.List<ExposureInfo> exposures = kYSPreTxCheckInfoAb_ != null ? kYSPreTxCheckInfoAb_.getExposures() : null;
        c8550bEo.copydefault(stateListAnimator, exposures, (AbstractC8601bFm<?, ?>) abstractC8601bFm);
        stateListAnimator.copydefault(c8550bEo.copydefault());
        stateListAnimator.copydefault(networkFeeModuleModel$default(c8550bEo, true, null, 2, null));
        c8550bEo.AEQbTJ(stateListAnimator, exposures, (AbstractC8601bFm<?, ?>) abstractC8601bFm);
        stateListAnimator.copydefault(addressModuleModel$default(c8550bEo, C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImplApi26ImplExternalSyntheticApiModelOutline1), abstractC8601bFm.htlTjW(), null, C14733dqy.copydefault.KWHzl(abstractC8601bFm.dUDNAs()).toString(), null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        c8550bEo.AEQbTJ(arrayList, exposures);
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        java.lang.String strAEQbTJ = abstractC8601bFm.AEQbTJ(true);
        if (strAEQbTJ != null && strAEQbTJ.length() != 0) {
            listOLrzqt.add(new Tabs.Children(strAEQbTJ, C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialDPHOMC), null));
            java.lang.String strZ_ = abstractC8601bFm.Z_();
            if (strZ_ != null && strZ_.length() != 0) {
                listOLrzqt.add(new Tabs.Children(strZ_, C33070mpX.AYXKKw(C13754dXa.FragmentManager.sanitizeWindowFeatureId), MTPushConstants.Analysis.KEY_JSON));
            }
        }
        java.util.List<Tabs.Children> listFARcdN = C56402yEa.fARcdN(listOLrzqt);
        if (!listFARcdN.isEmpty()) {
            arrayList.add(c8550bEo.AEQbTJ(listFARcdN));
        }
        stateListAnimator.copydefault(advanceModuleModel$default(c8550bEo, arrayList, false, 2, null));
        return Unit.INSTANCE;
    }

    public final java.util.List<BaseModel<?>> OLrzqt(final AbstractC8601bFm<?, ?> abstractC8601bFm) {
        return EZpvd(new Function1() { // from class: o.bEu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8550bEo.EZpvd(abstractC8601bFm, this, (C8550bEo.StateListAnimator) obj);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(final AbstractC8601bFm abstractC8601bFm, C8550bEo c8550bEo, StateListAnimator stateListAnimator) {
        boolean z;
        boolean z2;
        java.lang.Integer numValueOf;
        java.lang.Integer numValueOf2;
        java.lang.String urlOnlyHost;
        boolean zAl_;
        int iOLrzqt;
        java.util.ArrayList arrayList;
        java.util.List<? extends AbstractC8601bFm<?, ?>.Activity> listOLrzqt;
        java.util.List<? extends AbstractC8601bFm<?, ?>.Activity> listOLrzqt2;
        java.util.Set<java.lang.String> setDcqEDu;
        java.lang.String strZLjUOn;
        boolean z3;
        java.util.ArrayList arrayList2;
        java.util.List listOLrzqt3;
        java.lang.String strAEQbTJ;
        java.util.List<Tabs.Children> listFARcdN;
        java.lang.String strZ_;
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        KYSPreTxCheckInfo kYSPreTxCheckInfoAb_ = abstractC8601bFm.ab_();
        Intention contractIntention = kYSPreTxCheckInfoAb_ != null ? kYSPreTxCheckInfoAb_.getContractIntention() : null;
        if (kYSPreTxCheckInfoAb_ == null) {
            z = false;
        } else {
            if (!Intrinsics.EZpvd((java.lang.Object) (contractIntention != null ? contractIntention.getSupportIntentionFlag() : null), (java.lang.Object) "UNKNOWN")) {
                z = true;
            }
        }
        java.lang.String intentionTypeLanguageText = contractIntention != null ? contractIntention.getIntentionTypeLanguageText() : null;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getAutoTimeNightModeManager);
        if (intentionTypeLanguageText == null || intentionTypeLanguageText.length() == 0) {
            intentionTypeLanguageText = strAYXKKw;
        }
        boolean z4 = abstractC8601bFm instanceof OKWTronSignContract;
        if (z4) {
            boolean zAEQbTJ = ((OKWTronSignContract) abstractC8601bFm).UlJrfe().AEQbTJ(C56524yIo.AEQbTJ(C9838bdD.class));
            if (zAEQbTJ) {
                int i = C13754dXa.Activity.htlTjW;
                java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.onProvideKeyboardShortcuts);
                numValueOf2 = java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl);
                z2 = zAEQbTJ;
                numValueOf = java.lang.Integer.valueOf(i);
                intentionTypeLanguageText = strAYXKKw2;
                PlatformItem dapp = abstractC8601bFm.OJuSTm().getDapp();
                urlOnlyHost = dapp == null ? dapp.getUrlOnlyHost() : null;
                if (urlOnlyHost == null) {
                    urlOnlyHost = "";
                }
                stateListAnimator.copydefault(c8550bEo.KWHzl(intentionTypeLanguageText, urlOnlyHost, numValueOf, numValueOf2, z));
                stateListAnimator.copydefault(c8550bEo.copydefault());
                zAl_ = abstractC8601bFm.al_();
                iOLrzqt = stateListAnimator.OLrzqt();
                java.util.List<ExposureInfo> exposures = kYSPreTxCheckInfoAb_ == null ? kYSPreTxCheckInfoAb_.getExposures() : null;
                if (zAl_) {
                    c8550bEo.copydefault(stateListAnimator, exposures, (AbstractC8601bFm<?, ?>) abstractC8601bFm);
                }
                arrayList = new java.util.ArrayList();
                listOLrzqt = abstractC8601bFm.OLrzqt(true);
                if (listOLrzqt != null && !listOLrzqt.isEmpty()) {
                    arrayList.add(new AssetDiffModuleModel.AssetDiff(null, c8550bEo.EZpvd(listOLrzqt)));
                }
                listOLrzqt2 = abstractC8601bFm.OLrzqt(false);
                if (listOLrzqt2 != null && !listOLrzqt2.isEmpty()) {
                    if (listOLrzqt != null && !listOLrzqt.isEmpty()) {
                        arrayList.add(new AssetDiffModuleModel.AssetDiff(AssetDiffModuleModel.AssetDiff.segmentation, null));
                    }
                    arrayList.add(new AssetDiffModuleModel.AssetDiff(null, c8550bEo.EZpvd(listOLrzqt2)));
                }
                if (!arrayList.isEmpty()) {
                    stateListAnimator.copydefault(c8550bEo.OLrzqt(arrayList));
                }
                if (stateListAnimator.OLrzqt() <= iOLrzqt) {
                    stateListAnimator.copydefault(c8550bEo.copydefault());
                } else if (!z2 && !z) {
                    abstractC8601bFm.UlJrfe().AEQbTJ(new C9872bdl(false, C33070mpX.AYXKKw(C13754dXa.FragmentManager.doInvalidatePanelMenu), null, 4, null));
                }
                OKWTronSignContract oKWTronSignContract = !z4 ? (OKWTronSignContract) abstractC8601bFm : null;
                setDcqEDu = oKWTronSignContract == null ? oKWTronSignContract.DcqEDu() : null;
                if (setDcqEDu == null) {
                    setDcqEDu = yEE.copydefault();
                }
                c8550bEo.EZpvd(stateListAnimator, setDcqEDu);
                stateListAnimator.copydefault(networkFeeModuleModel$default(c8550bEo, true, null, 2, null));
                if (zAl_) {
                    c8550bEo.AEQbTJ(stateListAnimator, exposures, (AbstractC8601bFm<?, ?>) abstractC8601bFm);
                }
                java.util.List<ExposureInfo> list = exposures;
                stateListAnimator.copydefault(addressModuleModel$default(c8550bEo, C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImplApi26ImplExternalSyntheticApiModelOutline1), abstractC8601bFm.htlTjW(), null, C14733dqy.copydefault.KWHzl(abstractC8601bFm.dUDNAs()).toString(), null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
                strZLjUOn = abstractC8601bFm.zLjUOn();
                if (strZLjUOn.length() > 0) {
                    stateListAnimator.copydefault(addressModuleModel$default(c8550bEo, C33070mpX.AYXKKw(C13754dXa.FragmentManager.setDrawerSlideAnimationEnabled), strZLjUOn, null, null, null, null, null, 124, null));
                }
                if (abstractC8601bFm instanceof C9216bRR) {
                    z3 = true;
                } else {
                    java.lang.String strRcXXUw = ((C9216bRR) abstractC8601bFm).RcXXUw();
                    z3 = true;
                    stateListAnimator.copydefault(dataInputModuleModel$default(c8550bEo, "nonce", "normal", C33070mpX.AYXKKw(C13754dXa.FragmentManager.hKJZrr), strRcXXUw != null ? pTB.formatLocalized$default(strRcXXUw, null, 1, null) : null, strRcXXUw, null, 0, 0, new Function1() { // from class: o.bEA
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C8550bEo.EZpvd(abstractC8601bFm, (java.lang.String) obj);
                        }
                    }, 224, null));
                }
                arrayList2 = new java.util.ArrayList();
                if (zAl_) {
                    c8550bEo.AEQbTJ(arrayList2, list);
                }
                listOLrzqt3 = C56402yEa.OLrzqt();
                strAEQbTJ = abstractC8601bFm.AEQbTJ(z3);
                if (strAEQbTJ != null && strAEQbTJ.length() != 0) {
                    listOLrzqt3.add(new Tabs.Children(strAEQbTJ, C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialDPHOMC), null));
                    strZ_ = abstractC8601bFm.Z_();
                    if (strZ_ != null && strZ_.length() != 0) {
                        listOLrzqt3.add(new Tabs.Children(strZ_, C33070mpX.AYXKKw(C13754dXa.FragmentManager.sanitizeWindowFeatureId), MTPushConstants.Analysis.KEY_JSON));
                    }
                }
                listFARcdN = C56402yEa.fARcdN(listOLrzqt3);
                if (listFARcdN.isEmpty() ^ z3) {
                    arrayList2.add(c8550bEo.AEQbTJ(listFARcdN));
                }
                if (arrayList2.isEmpty() ^ z3) {
                    stateListAnimator.copydefault(advanceModuleModel$default(c8550bEo, arrayList2, false, 2, null));
                }
                return Unit.INSTANCE;
            }
            z2 = zAEQbTJ;
        } else {
            z2 = false;
        }
        numValueOf = null;
        numValueOf2 = null;
        PlatformItem dapp2 = abstractC8601bFm.OJuSTm().getDapp();
        if (dapp2 == null) {
        }
        if (urlOnlyHost == null) {
        }
        stateListAnimator.copydefault(c8550bEo.KWHzl(intentionTypeLanguageText, urlOnlyHost, numValueOf, numValueOf2, z));
        stateListAnimator.copydefault(c8550bEo.copydefault());
        zAl_ = abstractC8601bFm.al_();
        iOLrzqt = stateListAnimator.OLrzqt();
        if (kYSPreTxCheckInfoAb_ == null) {
        }
        if (zAl_) {
        }
        arrayList = new java.util.ArrayList();
        listOLrzqt = abstractC8601bFm.OLrzqt(true);
        if (listOLrzqt != null) {
            arrayList.add(new AssetDiffModuleModel.AssetDiff(null, c8550bEo.EZpvd(listOLrzqt)));
        }
        listOLrzqt2 = abstractC8601bFm.OLrzqt(false);
        if (listOLrzqt2 != null) {
            if (listOLrzqt != null) {
                arrayList.add(new AssetDiffModuleModel.AssetDiff(AssetDiffModuleModel.AssetDiff.segmentation, null));
            }
            arrayList.add(new AssetDiffModuleModel.AssetDiff(null, c8550bEo.EZpvd(listOLrzqt2)));
        }
        if (!arrayList.isEmpty()) {
        }
        if (stateListAnimator.OLrzqt() <= iOLrzqt) {
        }
        if (!z4) {
        }
        if (oKWTronSignContract == null) {
        }
        if (setDcqEDu == null) {
        }
        c8550bEo.EZpvd(stateListAnimator, setDcqEDu);
        stateListAnimator.copydefault(networkFeeModuleModel$default(c8550bEo, true, null, 2, null));
        if (zAl_) {
        }
        java.util.List<ExposureInfo> list2 = exposures;
        stateListAnimator.copydefault(addressModuleModel$default(c8550bEo, C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImplApi26ImplExternalSyntheticApiModelOutline1), abstractC8601bFm.htlTjW(), null, C14733dqy.copydefault.KWHzl(abstractC8601bFm.dUDNAs()).toString(), null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        strZLjUOn = abstractC8601bFm.zLjUOn();
        if (strZLjUOn.length() > 0) {
        }
        if (abstractC8601bFm instanceof C9216bRR) {
        }
        arrayList2 = new java.util.ArrayList();
        if (zAl_) {
        }
        listOLrzqt3 = C56402yEa.OLrzqt();
        strAEQbTJ = abstractC8601bFm.AEQbTJ(z3);
        if (strAEQbTJ != null) {
            listOLrzqt3.add(new Tabs.Children(strAEQbTJ, C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialDPHOMC), null));
            strZ_ = abstractC8601bFm.Z_();
            if (strZ_ != null) {
                listOLrzqt3.add(new Tabs.Children(strZ_, C33070mpX.AYXKKw(C13754dXa.FragmentManager.sanitizeWindowFeatureId), MTPushConstants.Analysis.KEY_JSON));
            }
        }
        listFARcdN = C56402yEa.fARcdN(listOLrzqt3);
        if (listFARcdN.isEmpty() ^ z3) {
        }
        if (arrayList2.isEmpty() ^ z3) {
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(AbstractC8601bFm abstractC8601bFm, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ((C9216bRR) abstractC8601bFm).AhwBna(str);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(StateListAnimator stateListAnimator, java.util.List<ExposureInfo> list, AbstractC8601bFm<?, ?> abstractC8601bFm) {
        java.lang.String strSubstring;
        int iDTwDnp;
        java.lang.String strEZpvd;
        java.lang.String address;
        java.lang.Long chainId;
        java.lang.Integer decimals;
        if (list == null || list.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (ExposureInfo exposureInfo : list) {
            Asset asset = exposureInfo.getAsset();
            Spender spenderValue = exposureInfo.getSpenderValue();
            if (spenderValue == null || (strSubstring = spenderValue.getApprovalRaw()) == null) {
                strSubstring = "";
            }
            int iValueOf = 0;
            boolean zStartsWith$default = C59449zhJ.startsWith$default(strSubstring, "-", false, 2, null);
            if (asset != null && (decimals = asset.getDecimals()) != null) {
                iValueOf = decimals.intValue();
            } else if (asset != null) {
                java.lang.Integer assetType = asset.getAssetType();
                int value = KYSAssetType.NFT_TYPE.getValue();
                if (assetType == null || assetType.intValue() != value) {
                    iValueOf = abstractC8601bFm.dHguZz().valueOf();
                }
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (asset != null ? asset.getAddress() : null))) {
                C10948byA c10948byAValueOf = C10954byG.EZpvd.valueOf();
                if (asset == null || (address = asset.getAddress()) == null) {
                    address = "";
                }
                C10854bwM c10854bwMEZpvd = c10948byAValueOf.EZpvd(address, (asset == null || (chainId = asset.getChainId()) == null) ? -1L : chainId.longValue());
                iDTwDnp = c10854bwMEZpvd != null ? c10854bwMEZpvd.DTwDnp() : 8;
            }
            if (zStartsWith$default) {
                strSubstring = strSubstring.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            }
            if (C59449zhJ.gEmmrt(strSubstring, "0x0", true)) {
                strEZpvd = "0";
            } else if (strSubstring.length() == 0) {
                strEZpvd = C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialaGOrKO);
            } else if (C9700baY.EZpvd(strSubstring)) {
                java.lang.String strOLrzqt = C33491mxU.OLrzqt(strSubstring);
                strEZpvd = C33129mqd.AEQbTJ(strOLrzqt, java.lang.Double.valueOf(java.lang.Math.pow(10.0d, (double) 13))) ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialaGOrKO) : C54870xYj.EZpvd(strOLrzqt, iValueOf, iDTwDnp, null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
            } else if (!C33129mqd.AEQbTJ(strSubstring, java.lang.Double.valueOf(java.lang.Math.pow(10.0d, 13)))) {
                strEZpvd = C54870xYj.EZpvd(strSubstring, iValueOf, iDTwDnp, null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
            } else {
                strEZpvd = C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialaGOrKO);
            }
            java.lang.String str = strEZpvd;
            java.lang.String expiration = exposureInfo.getExpiration();
            ApproveInfoModuleModel.TxInfoItem txInfoItem = new ApproveInfoModuleModel.TxInfoItem(java.lang.Integer.valueOf(iValueOf), asset != null ? asset.getAddress() : null, asset != null ? asset.getImageUrl() : null, asset != null ? asset.getSymbol() : null, null, java.lang.Integer.valueOf(iDTwDnp));
            Spender spenderValue2 = exposureInfo.getSpenderValue();
            ApproveInfoModuleModel.Spender spender = new ApproveInfoModuleModel.Spender(null, spenderValue2 != null ? spenderValue2.getApprovalType() : null);
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            arrayList.add(new ApproveInfoModuleModel.ApproveInfoListItem(null, expiration, txInfoItem, spender, new ApproveInfoModuleModel.AuthQuantity(bool, bool, null, null), null, str));
        }
        stateListAnimator.copydefault(KWHzl(arrayList));
    }

    public final void AEQbTJ(java.util.List<BaseModel<?>> list, java.util.List<ExposureInfo> list2) {
        java.lang.String address;
        java.lang.String address2;
        if (list2 != null && !list2.isEmpty()) {
            if (list2.size() == 1) {
                Asset asset = ((ExposureInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(list2)).getAsset();
                java.lang.String str = (asset == null || (address2 = asset.getAddress()) == null) ? "" : address2;
                java.lang.String symbol = asset != null ? asset.getSymbol() : null;
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ensureSubDecor);
                if (symbol == null || symbol.length() == 0) {
                    symbol = strAYXKKw;
                }
                list.add(addressModuleModel$default(this, C33069mpW.copydefault(C13754dXa.FragmentManager.sGvRiA, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", symbol))), str, null, null, null, null, null, 124, null));
            } else {
                java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.addSocket);
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
                java.util.Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    Asset asset2 = ((ExposureInfo) it.next()).getAsset();
                    java.lang.String str2 = (asset2 == null || (address = asset2.getAddress()) == null) ? "" : address;
                    java.lang.String symbol2 = asset2 != null ? asset2.getSymbol() : null;
                    arrayList.add(new TabListModuleModel.TabsItem((symbol2 == null || symbol2.length() == 0) ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.ensureSubDecor) : symbol2, str2, null, 4, null));
                }
                list.add(EZpvd(new TabListModuleModel.TabListItem(strAYXKKw2, arrayList)));
            }
        }
    }

    public final boolean KWHzl(OKWBaseTransaction<?> oKWBaseTransaction) {
        java.util.HashMap<java.lang.String, AbstractC9832bcy> mapEZpvd = oKWBaseTransaction.UlJrfe().EZpvd(3);
        java.lang.Object obj = null;
        java.util.Collection<AbstractC9832bcy> collectionValues = mapEZpvd != null ? mapEZpvd.values() : null;
        if (collectionValues == null) {
            collectionValues = yDY.AhwBna();
        }
        for (java.lang.Object obj2 : collectionValues) {
            AbstractC9832bcy abstractC9832bcy = (AbstractC9832bcy) obj2;
            if (!abstractC9832bcy.AhwBna() && ((abstractC9832bcy instanceof C9870bdj) || (abstractC9832bcy instanceof C9814bcg))) {
                obj = obj2;
                break;
            }
        }
        return obj != null;
    }

    public final java.util.List<BaseModel<?>> OLrzqt(final IRegisterTransaction iRegisterTransaction) {
        return EZpvd(new Function1() { // from class: o.bEr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8550bEo.EZpvd(iRegisterTransaction, this, (C8550bEo.StateListAnimator) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: com.okinc.business.defi.api.model.IRegisterTransaction */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(IRegisterTransaction iRegisterTransaction, C8550bEo c8550bEo, StateListAnimator stateListAnimator) {
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.copydefault(iRegisterTransaction, "");
        AbstractC8601bFm abstractC8601bFm = (AbstractC8601bFm) iRegisterTransaction;
        int i = Application.AEQbTJ[iRegisterTransaction.copydefault().ordinal()];
        if (i == 1) {
            java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.AlertController5);
            strAYXKKw = abstractC8601bFm.QwvEab() == 3 ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsPickVisualMediaCompanion) : "";
            strAYXKKw2 = strAYXKKw3;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.prepareFromSearch);
            strAYXKKw = C33069mpW.copydefault(C13754dXa.FragmentManager.setSubscription, C56423yEv.EZpvd(C56390yDp.OLrzqt("net", abstractC8601bFm.dHguZz().djBIcL())));
        }
        stateListAnimator.copydefault(titleModuleModel$default(c8550bEo, strAYXKKw2, strAYXKKw, null, null, false, 28, null));
        stateListAnimator.copydefault(c8550bEo.copydefault());
        stateListAnimator.copydefault(networkFeeModuleModel$default(c8550bEo, true, null, 2, null));
        stateListAnimator.copydefault(addressModuleModel$default(c8550bEo, C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImplApi26ImplExternalSyntheticApiModelOutline1), abstractC8601bFm.htlTjW(), null, C14733dqy.copydefault.KWHzl(abstractC8601bFm.dUDNAs()).toString(), null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        java.lang.String strKWHzl = iRegisterTransaction.KWHzl();
        if (strKWHzl != null && strKWHzl.length() != 0 && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl))) {
            stateListAnimator.copydefault(simpleTextModuleModel$default(c8550bEo, C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatSubscriptionCallbackSubscriptionCallbackApi26), strKWHzl, null, 4, null));
        }
        return Unit.INSTANCE;
    }

    public final TxExplain KWHzl() {
        TxExplain txExplain = new TxExplain();
        txExplain.setData(new TxExplain.ExplainItem(null, yDY.gEmmrt(new TxExplain.Desc(C33070mpX.AYXKKw(C13754dXa.FragmentManager.svUkWZ), C33070mpX.AYXKKw(C13754dXa.FragmentManager.fhwtiV)), new TxExplain.Desc(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DKr), C33070mpX.AYXKKw(C13754dXa.FragmentManager.isAvailable))), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.iflRwn), java.lang.Integer.valueOf(C13754dXa.Activity.DCUTEIdCUTEI)));
        return txExplain;
    }

    public static /* synthetic */ TitleModuleModel titleModuleModel$default(C8550bEo c8550bEo, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, boolean z, int i, java.lang.Object obj) {
        java.lang.Integer num3 = (i & 4) != 0 ? null : num;
        java.lang.Integer num4 = (i & 8) != 0 ? null : num2;
        if ((i & 16) != 0) {
            z = true;
        }
        return c8550bEo.KWHzl(str, str2, num3, num4, z);
    }

    public final TitleModuleModel KWHzl(java.lang.String str, java.lang.String str2, @androidx.annotation.DrawableRes java.lang.Integer num, @androidx.annotation.ColorRes java.lang.Integer num2, boolean z) {
        TitleModuleModel titleModuleModel = new TitleModuleModel();
        titleModuleModel.setData(new TitleModuleModel.TitleModel(null, num == null ? null : new TitleModuleModel.ImageItem(null, null, num), new TitleModuleModel.TitleItem(str, java.lang.Boolean.valueOf(z), num2), str2, null, null));
        return titleModuleModel;
    }

    public final DivideModuleModel copydefault() {
        return new DivideModuleModel();
    }

    public final AssetDiffModuleModel OLrzqt(java.util.List<AssetDiffModuleModel.AssetDiff> list) {
        AssetDiffModuleModel assetDiffModuleModel = new AssetDiffModuleModel();
        assetDiffModuleModel.setData(new AssetDiffModuleModel.AssetDiffItem(null, null, null, list, null));
        return assetDiffModuleModel;
    }

    public final ApproveInfoModuleModel KWHzl(java.util.List<ApproveInfoModuleModel.ApproveInfoListItem> list) {
        ApproveInfoModuleModel approveInfoModuleModel = new ApproveInfoModuleModel();
        approveInfoModuleModel.setData(new ApproveInfoModuleModel.ApproveInfoItem(null, null, null, list, null, null));
        return approveInfoModuleModel;
    }

    public static /* synthetic */ NetworkFeeModuleModel networkFeeModuleModel$default(C8550bEo c8550bEo, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return c8550bEo.EZpvd(z, str);
    }

    public final NetworkFeeModuleModel EZpvd(boolean z, java.lang.String str) {
        NetworkFeeModuleModel networkFeeModuleModel = new NetworkFeeModuleModel();
        networkFeeModuleModel.setData(new NetworkFeeModuleModel.NetworkFeeItem(java.lang.Boolean.valueOf(z), str));
        return networkFeeModuleModel;
    }

    public static /* synthetic */ AddressModuleModel addressModuleModel$default(C8550bEo c8550bEo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Boolean bool, java.lang.Boolean bool2, int i, java.lang.Object obj) {
        return c8550bEo.KWHzl(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : bool2);
    }

    public final AddressModuleModel KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Boolean bool, java.lang.Boolean bool2) {
        AddressModuleModel addressModuleModel = new AddressModuleModel();
        addressModuleModel.setData(new AddressModuleModel.AddressItem(str2, bool, str, java.lang.Boolean.valueOf(C33129mqd.OLrzqt((java.lang.CharSequence) str4)), str5 == null ? str4 : str5, str3, bool2));
        return addressModuleModel;
    }

    public final AddressSwitchModuleModel EZpvd(java.lang.String str, java.lang.String str2) {
        AddressSwitchModuleModel addressSwitchModuleModel = new AddressSwitchModuleModel();
        addressSwitchModuleModel.setData(new AddressSwitchModuleModel.AddressItem(str, str2));
        return addressSwitchModuleModel;
    }

    public static /* synthetic */ Advance advanceModuleModel$default(C8550bEo c8550bEo, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c8550bEo.OLrzqt((java.util.List<? extends BaseModel<?>>) list, z);
    }

    public final Advance OLrzqt(java.util.List<? extends BaseModel<?>> list, boolean z) {
        Advance advance = new Advance();
        advance.setModuleId("advance");
        advance.setData(new Advance.AdvanceItem(list, null, java.lang.Boolean.valueOf(z)));
        return advance;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: o.bEo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataInputModuleModel dataInputModuleModel$default(C8550bEo c8550bEo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, int i2, Function1 function1, int i3, java.lang.Object obj) {
        return c8550bEo.OLrzqt(str, str2, str3, str4, str5, (i3 & 32) != 0 ? "text" : str6, (i3 & 64) != 0 ? -1 : i, (i3 & 128) != 0 ? 0 : i2, (i3 & 256) != 0 ? null : function1);
    }

    public final DataInputModuleModel OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, int i2, Function1<? super java.lang.String, Unit> function1) {
        DataInputModuleModel dataInputModuleModel = new DataInputModuleModel();
        dataInputModuleModel.setModuleId(str);
        dataInputModuleModel.setData(new DataInputModuleModel.DataInputItem(str2, str3, str4, str5, str6, i, i2, function1));
        return dataInputModuleModel;
    }

    public static /* synthetic */ DataShowModuleModel dataShowModuleModel$default(C8550bEo c8550bEo, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        return c8550bEo.EZpvd(str, str2, str3);
    }

    public final DataShowModuleModel EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        DataShowModuleModel dataShowModuleModel = new DataShowModuleModel();
        dataShowModuleModel.setData(new DataShowModuleModel.DataShowItem(str, str2, str3));
        return dataShowModuleModel;
    }

    public static /* synthetic */ SimpleTextModuleModel simpleTextModuleModel$default(C8550bEo c8550bEo, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        return c8550bEo.copydefault(str, str2, str3);
    }

    public final SimpleTextModuleModel copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        SimpleTextModuleModel simpleTextModuleModel = new SimpleTextModuleModel();
        simpleTextModuleModel.setData(new SimpleTextModuleModel.TextItem(str2, str, str3));
        return simpleTextModuleModel;
    }

    public static /* synthetic */ DappInfoModuleModel dappInfoModuleModel$default(C8550bEo c8550bEo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 8) != 0) {
            obj = null;
        }
        return c8550bEo.EZpvd(str, str2, str3, obj);
    }

    public final DappInfoModuleModel EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj) {
        DappInfoModuleModel dappInfoModuleModel = new DappInfoModuleModel();
        dappInfoModuleModel.setData(new DappInfoModuleModel.DappItem(null, str2, str3, str, obj));
        return dappInfoModuleModel;
    }

    public final Tabs AEQbTJ(java.util.List<Tabs.Children> list) {
        Tabs tabs = new Tabs();
        tabs.setData(new Tabs.TabItem(list));
        return tabs;
    }

    public final TabListModuleModel EZpvd(TabListModuleModel.TabListItem tabListItem) {
        TabListModuleModel tabListModuleModel = new TabListModuleModel();
        tabListModuleModel.setData(tabListItem);
        return tabListModuleModel;
    }

    public final PsbtsModuleModel KWHzl(PsbtsModuleModel.Psbts psbts) {
        PsbtsModuleModel psbtsModuleModel = new PsbtsModuleModel();
        psbtsModuleModel.setData(psbts);
        return psbtsModuleModel;
    }

    public final ButtonGroupModuleModel EZpvd(ButtonGroupModuleModel.ButtonGroup buttonGroup) {
        ButtonGroupModuleModel buttonGroupModuleModel = new ButtonGroupModuleModel();
        buttonGroupModuleModel.setData(buttonGroup);
        return buttonGroupModuleModel;
    }

    public final InputsOutputsModuleModel copydefault(InputsOutputsModuleModel.InputsOutputs inputsOutputs) {
        InputsOutputsModuleModel inputsOutputsModuleModel = new InputsOutputsModuleModel();
        inputsOutputsModuleModel.setData(inputsOutputs);
        return inputsOutputsModuleModel;
    }

    public final AddressPermissionModuleModel AEQbTJ(java.lang.String str, java.util.List<AddressPermissionModuleModel.AddressPermission.AddressPermissionDataBean> list) {
        AddressPermissionModuleModel addressPermissionModuleModel = new AddressPermissionModuleModel();
        addressPermissionModuleModel.setData(new AddressPermissionModuleModel.AddressPermission(str, list));
        return addressPermissionModuleModel;
    }

    public final ShowInformationModuleModel OLrzqt(java.lang.String str) {
        ShowInformationModuleModel showInformationModuleModel = new ShowInformationModuleModel();
        showInformationModuleModel.setData(new ShowInformationModuleModel.InformationItem(str));
        return showInformationModuleModel;
    }

    public final AppBarTitleModuleModel EZpvd(java.lang.String str) {
        AppBarTitleModuleModel appBarTitleModuleModel = new AppBarTitleModuleModel();
        appBarTitleModuleModel.setData(new AppBarTitleModuleModel.AppBarTitleItem(str));
        return appBarTitleModuleModel;
    }

    public final boolean AYXKKw() {
        java.util.Set<Map.Entry<java.lang.Integer, AbstractC9832bcy>> setEntrySet = this.EZpvd.UlJrfe().copydefault().entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        Map.Entry entry = (Map.Entry) CollectionsKt___CollectionsKt.RcXXUw(setEntrySet);
        AbstractC9832bcy abstractC9832bcy = entry != null ? (AbstractC9832bcy) entry.getValue() : null;
        return (abstractC9832bcy instanceof C9784bcC) || (abstractC9832bcy instanceof C9808bca) || (abstractC9832bcy instanceof C9754bbZ) || (abstractC9832bcy instanceof C9811bcd);
    }

    public final java.util.List<BaseModel<?>> EZpvd(Function1<? super StateListAnimator, Unit> function1) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        function1.invoke(stateListAnimator);
        return stateListAnimator.KWHzl();
    }

    public final void EZpvd(StateListAnimator stateListAnimator, java.util.Set<java.lang.String> set) {
        if (!set.isEmpty()) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.startAsSupportActionMode);
            java.util.Set<java.lang.String> set2 = set;
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(set2, 10));
            int i = 0;
            for (java.lang.Object obj : set2) {
                int i2 = i + 1;
                if (i < 0) {
                    yDY.AYXKKw();
                }
                arrayList.add(new AddressPermissionModuleModel.AddressPermission.AddressPermissionDataBean(C33069mpW.copydefault(C13754dXa.FragmentManager.bypassOnContentChanged, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(java.lang.Integer.valueOf(i2))))), (java.lang.String) obj));
                i = i2;
            }
            stateListAnimator.copydefault(AEQbTJ(strAYXKKw, arrayList));
            stateListAnimator.copydefault(copydefault());
        }
    }

    /* JADX INFO: renamed from: o.bEo$StateListAnimator */
    public static final class StateListAnimator {
        public final java.util.List<BaseModel<?>> copydefault = new java.util.ArrayList();

        public final void copydefault(BaseModel<?> baseModel) {
            if (baseModel != null) {
                this.copydefault.add(baseModel);
            }
        }

        public final int OLrzqt() {
            return this.copydefault.size();
        }

        public final java.util.List<BaseModel<?>> KWHzl() {
            return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.copydefault);
        }
    }

    public final java.util.List<AssetDiffModuleModel.TokenAssetDifflist> EZpvd(java.util.List<? extends AbstractC8601bFm<?, ?>.Activity> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            AbstractC8601bFm.Activity activity = (AbstractC8601bFm.Activity) it.next();
            java.lang.String strKWHzl = activity.KWHzl();
            if (strKWHzl.length() == 0) {
                strKWHzl = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ensureSubDecor);
            }
            arrayList.add(new AssetDiffModuleModel.TokenAssetDifflist(null, new AssetDiffModuleModel.TokenInfo("", 0, "", strKWHzl, "", null, "", activity.EZpvd(), null, 288, null), "", null, activity.AEQbTJ(), activity.OLrzqt(), null, 64, null));
        }
        return arrayList;
    }

    public final void AEQbTJ(StateListAnimator stateListAnimator, java.util.List<ExposureInfo> list, AbstractC8601bFm<?, ?> abstractC8601bFm) {
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                java.lang.String spenderKey = ((ExposureInfo) it.next()).getSpenderKey();
                if (spenderKey != null) {
                    stateListAnimator.copydefault(addressModuleModel$default(this, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DjzMc), spenderKey, null, null, null, java.lang.Boolean.valueOf(KWHzl((OKWBaseTransaction<?>) abstractC8601bFm)), null, 92, null));
                }
            }
        }
    }
}
