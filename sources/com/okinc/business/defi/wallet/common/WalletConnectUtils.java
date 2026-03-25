package com.okinc.business.defi.wallet.common;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.ValueCallback;
import androidx.annotation.StringRes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.okinc.business.defi.api.bean.CustomNetworkInfo;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.api.bean.SignType;
import com.okinc.business.defi.api.model.tx.signdata.SolanaContractSignData;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaTxResult;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.CheckDappResonse;
import com.okinc.business.defi.biz.walletconnect.MetaxEthereumTransaction;
import com.okinc.business.defi.biz.walletconnect.OKXAuthPayloadParams;
import com.okinc.business.defi.biz.walletconnect.ShowWCAuthRequestArgs;
import com.okinc.business.defi.biz.walletconnect.SyncAllAddressesResponse;
import com.okinc.business.defi.biz.walletconnect.WCEthereumSignMessage;
import com.okinc.business.defi.biz.walletconnect.WCEthereumTransaction;
import com.okinc.business.defi.biz.walletconnect.WCSessionMeta;
import com.okinc.business.defi.biz.walletconnect.WalletSwitchEthereumChain;
import com.okinc.business.defi.biz.walletconnect.WalletWatchAsset;
import com.okinc.business.defi.biz.walletconnect.WalletWatchAssetOption;
import com.okinc.business.defi.wallet.common.WalletConnectUtils;
import com.okinc.network.okg.response.ResponseData;
import com.reown.android.Core;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import com.reown.walletkit.client.Wallet;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.rx2.RxAwaitKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonArrayBuilder;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AbstractC12782ctV;
import o.AbstractC58185ywX;
import o.AbstractC58260yxt;
import o.C10598brV;
import o.C10854bwM;
import o.C10948byA;
import o.C11607cUn;
import o.C12827cuN;
import o.C13458dMb;
import o.C13754dXa;
import o.C13934dbu;
import o.C13977dck;
import o.C13982dcp;
import o.C13983dcq;
import o.C13990dcx;
import o.C33070mpX;
import o.C33129mqd;
import o.C33489mxS;
import o.C43423rox;
import o.C54819xWm;
import o.C54892xZe;
import o.C54907xZt;
import o.C55326xho;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56402yEa;
import o.C56403yEb;
import o.C56406yEe;
import o.C56423yEv;
import o.C56424yEw;
import o.C56442yFn;
import o.C57259yez;
import o.C58171ywJ;
import o.C59449zhJ;
import o.C9678baC;
import o.InterfaceC13979dcm;
import o.InterfaceC13980dcn;
import o.InterfaceC13987dcu;
import o.InterfaceC33171mrS;
import o.InterfaceC56387yDm;
import o.InterfaceC58223yxI;
import o.InterfaceC58227yxM;
import o.InterfaceC58229yxO;
import o.InterfaceC58257yxq;
import o.InterfaceC58259yxs;
import o.InterfaceC9731bbC;
import o.InterfaceC9738bbJ;
import o.InterfaceC9780bbz;
import o.InterfaceC9852bdR;
import o.InterfaceC9854bdT;
import o.dZS;
import o.fPH;
import o.pUU;
import o.xWE;
import o.yBI;
import o.yDY;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletConnectUtils {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public String AEQbTJ;
    public final Activity AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC33171mrS AkhnZx;
    public final C13934dbu AuCTel;
    public final C13982dcp DbNXlk;
    public final C10948byA EZpvd;
    public DappInteractionArgs KWHzl;
    public final C10598brV OLrzqt;
    public final C54819xWm djBIcL;
    public final C12827cuN ejfBZ;
    public final xWE fARcdN;
    public final CopyOnWriteArrayList<StateListAnimator> fIwbmz;
    public final InterfaceC9854bdT fJNWhG;
    public final InterfaceC9852bdR fetchVPNInfo;
    public Long gEmmrt;
    public final C57259yez getNewProxyInstance;
    public String isConnected;
    public WCEthereumSignMessage valueOf;
    public final dZS values;

    public interface StateListAnimator {

        public static final class Activity {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static void AEQbTJ(@NotNull StateListAnimator stateListAnimator, @NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static void AEQbTJ(@NotNull StateListAnimator stateListAnimator, @NotNull String str, boolean z) {
                Intrinsics.checkNotNullParameter(str, "");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static void EZpvd(@NotNull StateListAnimator stateListAnimator, @NotNull ShowWCAuthRequestArgs showWCAuthRequestArgs) {
                Intrinsics.checkNotNullParameter(showWCAuthRequestArgs, "");
            }

            public static void EZpvd(@NotNull StateListAnimator stateListAnimator, String str) {
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static void EZpvd(@NotNull StateListAnimator stateListAnimator, @NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static void KWHzl(@NotNull StateListAnimator stateListAnimator, @NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static void KWHzl(@NotNull StateListAnimator stateListAnimator, @NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static void copydefault(@NotNull StateListAnimator stateListAnimator, @NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
            }
        }

        void AEQbTJ(@NotNull ShowWCAuthRequestArgs showWCAuthRequestArgs);

        void AEQbTJ(@NotNull String str, @NotNull String str2);

        void KWHzl(@NotNull String str);

        void KWHzl(@NotNull String str, @NotNull String str2);

        void KWHzl(@NotNull String str, boolean z);

        void OLrzqt(String str);

        void OLrzqt(@NotNull String str, @NotNull String str2);

        void copydefault(@NotNull String str, @NotNull String str2);
    }

    public WalletConnectUtils(@NotNull C10948byA c10948byA, @NotNull C10598brV c10598brV, @NotNull dZS dzs, @NotNull C13982dcp c13982dcp, @NotNull C13934dbu c13934dbu, @NotNull C12827cuN c12827cuN, @NotNull InterfaceC9852bdR interfaceC9852bdR, @NotNull InterfaceC9854bdT interfaceC9854bdT, @NotNull xWE xwe, @NotNull C57259yez c57259yez, @NotNull InterfaceC33171mrS interfaceC33171mrS, @NotNull C54819xWm c54819xWm) {
        Intrinsics.checkNotNullParameter(c10948byA, "");
        Intrinsics.checkNotNullParameter(c10598brV, "");
        Intrinsics.checkNotNullParameter(dzs, "");
        Intrinsics.checkNotNullParameter(c13982dcp, "");
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(interfaceC9852bdR, "");
        Intrinsics.checkNotNullParameter(interfaceC9854bdT, "");
        Intrinsics.checkNotNullParameter(xwe, "");
        Intrinsics.checkNotNullParameter(c57259yez, "");
        Intrinsics.checkNotNullParameter(interfaceC33171mrS, "");
        Intrinsics.checkNotNullParameter(c54819xWm, "");
        this.EZpvd = c10948byA;
        this.OLrzqt = c10598brV;
        this.values = dzs;
        this.DbNXlk = c13982dcp;
        this.AuCTel = c13934dbu;
        this.ejfBZ = c12827cuN;
        this.fetchVPNInfo = interfaceC9852bdR;
        this.fJNWhG = interfaceC9854bdT;
        this.fARcdN = xwe;
        this.getNewProxyInstance = c57259yez;
        this.AkhnZx = interfaceC33171mrS;
        this.djBIcL = c54819xWm;
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.dZW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return WalletConnectUtils.AEQbTJ();
            }
        });
        this.fIwbmz = new CopyOnWriteArrayList<>();
        Activity activity = new Activity();
        this.AYXKKw = activity;
        c13982dcp.OLrzqt(activity);
        djBIcL();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.WalletConnectUtils.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ WalletConnectUtils getInstance$default(ActionBar actionBar, Context context, int i, Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return actionBar.KWHzl(context);
        }

        public final WalletConnectUtils KWHzl(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).zuBGHE();
        }
    }

    public static final Handler AEQbTJ() {
        return new Handler(Looper.getMainLooper());
    }

    public final Handler AhwBna() {
        return (Handler) this.AhwBna.getValue();
    }

    public static final class Activity implements InterfaceC13979dcm {

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.common.WalletConnectUtils$Activity$Activity, reason: collision with other inner class name */
        public final /* synthetic */ class C0251Activity {
            public static final /* synthetic */ int[] OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[WCEthereumSignMessage.WCSignType.values().length];
                try {
                    iArr[WCEthereumSignMessage.WCSignType.MESSAGE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[WCEthereumSignMessage.WCSignType.PERSONAL_MESSAGE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[WCEthereumSignMessage.WCSignType.TYPED_MESSAGE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                OLrzqt = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC13979dcm
        public void AEQbTJ(String str) {
            Intrinsics.checkNotNullParameter(str, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC13979dcm
        public void KWHzl(String str) {
            Intrinsics.checkNotNullParameter(str, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC13979dcm
        public void KWHzl(String str, long j, String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
        }

        public Activity() {
        }

        public static final void values(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        @Override // o.InterfaceC13979dcm
        public void valueOf(final String str) {
            Intrinsics.checkNotNullParameter(str, "");
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = WalletConnectUtils.this.ejfBZ.copydefault(false);
            final WalletConnectUtils walletConnectUtils = WalletConnectUtils.this;
            final Function1 function1 = new Function1() { // from class: o.eaW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return WalletConnectUtils.Activity.copydefault(walletConnectUtils, str, this, (AbstractC12782ctV) obj);
                }
            };
            InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ead
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    WalletConnectUtils.Activity.values(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.eaa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return WalletConnectUtils.Activity.EZpvd((java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dZZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    WalletConnectUtils.Activity.isConnected(function12, obj);
                }
            });
        }

        public static final Unit copydefault(final WalletConnectUtils walletConnectUtils, final String str, final Activity activity, final AbstractC12782ctV abstractC12782ctV) {
            AbstractC58185ywX abstractC58185ywXKWHzl;
            AbstractC58185ywX abstractC58185ywXOLrzqt;
            boolean z = abstractC12782ctV.ORxRYg() || abstractC12782ctV.AEQbTJ(WalletType.MPCWallet);
            if (abstractC12782ctV.getFieldNames() || z) {
                Wallet.Model.SessionProposal sessionProposalValueOf = walletConnectUtils.DbNXlk.valueOf(str);
                String url = sessionProposalValueOf != null ? sessionProposalValueOf.getUrl() : null;
                if (abstractC12782ctV.getFieldNames()) {
                    abstractC58185ywXKWHzl = C43423rox.OLrzqt(walletConnectUtils.AuCTel.copydefault(url == null ? "" : url), new Function1() { // from class: o.eab
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return java.lang.Boolean.valueOf(WalletConnectUtils.Activity.AEQbTJ((ResponseData) obj));
                        }
                    });
                } else {
                    abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new CheckDappResonse(true));
                    Intrinsics.copydefault(abstractC58185ywXKWHzl);
                }
                if (abstractC12782ctV.ORxRYg() || abstractC12782ctV.AEQbTJ(WalletType.MPCWallet)) {
                    C13934dbu c13934dbu = walletConnectUtils.AuCTel;
                    if (url == null) {
                        url = "";
                    }
                    abstractC58185ywXOLrzqt = C43423rox.OLrzqt(c13934dbu.AEQbTJ(url), new Function1() { // from class: o.eac
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return java.lang.Boolean.valueOf(WalletConnectUtils.Activity.OLrzqt((ResponseData) obj));
                        }
                    });
                } else {
                    abstractC58185ywXOLrzqt = AbstractC58185ywX.KWHzl(new CheckDappResonse(true));
                    Intrinsics.copydefault(abstractC58185ywXOLrzqt);
                }
                final Function2 function2 = new Function2() { // from class: o.eaf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return WalletConnectUtils.Activity.KWHzl((CheckDappResonse) obj, (CheckDappResonse) obj2);
                    }
                };
                AbstractC58185ywX abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXOLrzqt, abstractC58185ywXKWHzl, new InterfaceC58223yxI() { // from class: o.eae
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58223yxI
                    public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                        return WalletConnectUtils.Activity.KWHzl(function2, obj, obj2);
                    }
                });
                final Function1 function1 = new Function1() { // from class: o.eai
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return WalletConnectUtils.Activity.KWHzl(walletConnectUtils, str, abstractC12782ctV, activity, (kotlin.Pair) obj);
                    }
                };
                InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eag
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        WalletConnectUtils.Activity.djBIcL(function1, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.eah
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return WalletConnectUtils.Activity.OLrzqt(walletConnectUtils, str, activity, abstractC12782ctV, (java.lang.Throwable) obj);
                    }
                };
                abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eam
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        WalletConnectUtils.Activity.gEmmrt(function12, obj);
                    }
                });
            } else {
                walletConnectUtils.AhwBna().post(new Runnable() { // from class: o.ean
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        WalletConnectUtils.Activity.KWHzl(walletConnectUtils, str, abstractC12782ctV);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        public static final Pair KWHzl(Function2 function2, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(obj2, "");
            return (Pair) function2.invoke(obj, obj2);
        }

        public static final Pair KWHzl(CheckDappResonse checkDappResonse, CheckDappResonse checkDappResonse2) {
            Intrinsics.checkNotNullParameter(checkDappResonse, "");
            Intrinsics.checkNotNullParameter(checkDappResonse2, "");
            return C56390yDp.OLrzqt(Boolean.valueOf(checkDappResonse.getResult()), Boolean.valueOf(checkDappResonse2.getResult()));
        }

        public static final void djBIcL(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        public static final Unit KWHzl(final WalletConnectUtils walletConnectUtils, final String str, final AbstractC12782ctV abstractC12782ctV, Activity activity, Pair pair) {
            final boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
            final boolean zBooleanValue2 = ((Boolean) pair.getSecond()).booleanValue();
            if (!zBooleanValue || !zBooleanValue2) {
                C13982dcp.rejectSession$default(walletConnectUtils.DbNXlk, str, false, 2, null);
                pUU.copydefault("WalletConnectUtils", "mpcCheck=" + zBooleanValue + ", aaCheck=" + zBooleanValue2 + ", rejecting session");
                Iterator it = walletConnectUtils.fIwbmz.iterator();
                while (it.hasNext()) {
                    Intrinsics.copydefault((StateListAnimator) it.next());
                    activity.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
                }
                walletConnectUtils.AhwBna().post(new Runnable() { // from class: o.eaP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        WalletConnectUtils.Activity.AEQbTJ(abstractC12782ctV, zBooleanValue, zBooleanValue2, walletConnectUtils);
                    }
                });
            } else {
                walletConnectUtils.AhwBna().post(new Runnable() { // from class: o.eaN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        WalletConnectUtils.Activity.EZpvd(walletConnectUtils, str, abstractC12782ctV);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        public static final void EZpvd(WalletConnectUtils walletConnectUtils, String str, AbstractC12782ctV abstractC12782ctV) {
            ComponentCallbacks2 componentCallbacks2KWHzl = walletConnectUtils.KWHzl();
            StateListAnimator stateListAnimator = componentCallbacks2KWHzl instanceof StateListAnimator ? (StateListAnimator) componentCallbacks2KWHzl : null;
            if (stateListAnimator != null) {
                stateListAnimator.copydefault(str, abstractC12782ctV.DbNXlk());
            }
            for (StateListAnimator stateListAnimator2 : walletConnectUtils.fIwbmz) {
                Intrinsics.copydefault(stateListAnimator2);
                stateListAnimator2.copydefault(str, abstractC12782ctV.DbNXlk());
            }
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.fPH.showDappCheckSupportDialog$default(o.fPH, android.content.Context, kotlin.jvm.functions.Function0, int, java.lang.Object):void */
        public static final void AEQbTJ(AbstractC12782ctV abstractC12782ctV, boolean z, boolean z2, WalletConnectUtils walletConnectUtils) {
            if (abstractC12782ctV.ORxRYg() && !z) {
                C55326xho.toast$default(C13754dXa.FragmentManager.findViewById, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                return;
            }
            if (abstractC12782ctV.getFieldNames() && !z2) {
                android.app.Activity activityKWHzl = walletConnectUtils.KWHzl();
                if (activityKWHzl != null) {
                    fPH.showDappCheckSupportDialog$default(fPH.OLrzqt, activityKWHzl, null, 2, null);
                    return;
                }
                return;
            }
            C55326xho.toast$default(C13754dXa.FragmentManager.findViewById, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        }

        public static final void gEmmrt(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        public static final Unit OLrzqt(final WalletConnectUtils walletConnectUtils, String str, Activity activity, final AbstractC12782ctV abstractC12782ctV, Throwable th) {
            C13982dcp.rejectSession$default(walletConnectUtils.DbNXlk, str, false, 2, null);
            pUU.AEQbTJ("WalletConnectUtils", "Error in mpcCheck or aaCheck", th);
            Iterator it = walletConnectUtils.fIwbmz.iterator();
            while (it.hasNext()) {
                Intrinsics.copydefault((StateListAnimator) it.next());
                activity.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
            }
            walletConnectUtils.AhwBna().post(new Runnable() { // from class: o.eas
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    WalletConnectUtils.Activity.EZpvd(abstractC12782ctV, walletConnectUtils);
                }
            });
            return Unit.INSTANCE;
        }

        public static final void EZpvd(AbstractC12782ctV abstractC12782ctV, WalletConnectUtils walletConnectUtils) {
            android.app.Activity activityKWHzl;
            if (abstractC12782ctV != null && abstractC12782ctV.ORxRYg()) {
                C55326xho.toast$default(C13754dXa.FragmentManager.findViewById, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            } else {
                if (abstractC12782ctV == null || !abstractC12782ctV.getFieldNames() || (activityKWHzl = walletConnectUtils.KWHzl()) == null) {
                    return;
                }
                fPH.showDappCheckSupportDialog$default(fPH.OLrzqt, activityKWHzl, null, 2, null);
            }
        }

        public static final void KWHzl(WalletConnectUtils walletConnectUtils, String str, AbstractC12782ctV abstractC12782ctV) {
            ComponentCallbacks2 componentCallbacks2KWHzl = walletConnectUtils.KWHzl();
            StateListAnimator stateListAnimator = componentCallbacks2KWHzl instanceof StateListAnimator ? (StateListAnimator) componentCallbacks2KWHzl : null;
            if (stateListAnimator != null) {
                stateListAnimator.copydefault(str, abstractC12782ctV.DbNXlk());
            }
            for (StateListAnimator stateListAnimator2 : walletConnectUtils.fIwbmz) {
                Intrinsics.copydefault(stateListAnimator2);
                stateListAnimator2.copydefault(str, abstractC12782ctV.DbNXlk());
            }
        }

        public static final void isConnected(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        public static final Unit EZpvd(Throwable th) {
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC13979dcm
        public void EZpvd(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            WalletConnectUtils walletConnectUtils = WalletConnectUtils.this;
            walletConnectUtils.AhwBna().post(walletConnectUtils.new Application(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKRKUgwx)));
        }

        @Override // o.InterfaceC13979dcm
        public void AEQbTJ(String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            WalletConnectUtils.this.AEQbTJ(str2, str);
            for (StateListAnimator stateListAnimator : WalletConnectUtils.this.fIwbmz) {
                Intrinsics.copydefault(stateListAnimator);
                stateListAnimator.KWHzl(str, str2);
            }
            WalletConnectUtils.this.AEQbTJ(str, str3, Integer.valueOf(C13754dXa.FragmentManager.getTitle));
        }

        @Override // o.InterfaceC13979dcm
        public void KWHzl(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            OLrzqt(str2);
        }

        @Override // o.InterfaceC13979dcm
        public void EZpvd(final String str, final String str2, long j) {
            Object next;
            final String str3;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            WalletConnectUtils.this.KWHzl(str, str2, j);
            Iterator<T> it = WalletConnectUtils.this.values.copydefault().entrySet().iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Iterable iterable = (Iterable) ((Map.Entry) next).getValue();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.EZpvd((Object) ((SessionTopicInfo) it2.next()).getTopic(), (Object) str2)) {
                            break loop0;
                        }
                    }
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry == null || (str3 = (String) entry.getKey()) == null) {
                return;
            }
            Handler handlerAhwBna = WalletConnectUtils.this.AhwBna();
            final WalletConnectUtils walletConnectUtils = WalletConnectUtils.this;
            handlerAhwBna.post(new Runnable() { // from class: o.eap
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    WalletConnectUtils.Activity.OLrzqt(walletConnectUtils, str, str2, str3);
                }
            });
        }

        public static final void OLrzqt(WalletConnectUtils walletConnectUtils, String str, String str2, String str3) {
            walletConnectUtils.EZpvd(str, str2);
            ComponentCallbacks2 componentCallbacks2KWHzl = walletConnectUtils.KWHzl();
            StateListAnimator stateListAnimator = componentCallbacks2KWHzl instanceof StateListAnimator ? (StateListAnimator) componentCallbacks2KWHzl : null;
            if (stateListAnimator != null) {
                stateListAnimator.OLrzqt(str2, str3);
            }
            for (StateListAnimator stateListAnimator2 : walletConnectUtils.fIwbmz) {
                Intrinsics.copydefault(stateListAnimator2);
                stateListAnimator2.OLrzqt(str2, str3);
            }
        }

        @Override // o.InterfaceC13979dcm
        public void copydefault(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            OLrzqt(str);
        }

        @Override // o.InterfaceC13979dcm
        public void KWHzl(String str, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            WalletConnectUtils.moveBackToDApp$default(WalletConnectUtils.this, str, null, Integer.valueOf(C13754dXa.FragmentManager.ComponentActivityReportFullyDrawnExecutorApi16ImplExternalSyntheticLambda0), 2, null);
        }

        @Override // o.InterfaceC13979dcm
        public void AEQbTJ(String str, long j, String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            OLrzqt(str2);
        }

        @Override // o.InterfaceC13979dcm
        public void AEQbTJ(String str, long j, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            if (z) {
                WalletConnectUtils.moveBackToDApp$default(WalletConnectUtils.this, str, null, Integer.valueOf(C13754dXa.FragmentManager.ComponentActivityReportFullyDrawnExecutorApi16ImplExternalSyntheticLambda0), 2, null);
            }
        }

        @Override // o.InterfaceC13979dcm
        public void KWHzl(long j) {
            WalletConnectUtils.moveBackToDApp$default(WalletConnectUtils.this, C33129mqd.gEmmrt(Long.valueOf(j)), null, Integer.valueOf(C13754dXa.FragmentManager.getTitle), 2, null);
            WalletConnectUtils.this.AuCTel(C33129mqd.gEmmrt(Long.valueOf(j)));
        }

        @Override // o.InterfaceC13979dcm
        public void OLrzqt(long j) {
            WalletConnectUtils.moveBackToDApp$default(WalletConnectUtils.this, C33129mqd.gEmmrt(Long.valueOf(j)), null, null, 6, null);
            WalletConnectUtils.this.AuCTel(C33129mqd.gEmmrt(Long.valueOf(j)));
        }

        @Override // o.InterfaceC13979dcm
        public void copydefault(final String str, final boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Handler handlerAhwBna = WalletConnectUtils.this.AhwBna();
            final WalletConnectUtils walletConnectUtils = WalletConnectUtils.this;
            handlerAhwBna.post(new Runnable() { // from class: o.eaq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    WalletConnectUtils.Activity.copydefault(walletConnectUtils, str, z);
                }
            });
        }

        public static final void copydefault(WalletConnectUtils walletConnectUtils, String str, boolean z) {
            boolean z2;
            Collection<List<SessionTopicInfo>> collectionValues = walletConnectUtils.values.copydefault().values();
            if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                z2 = false;
            } else {
                Iterator<T> it = collectionValues.iterator();
                loop1: while (it.hasNext()) {
                    List list = (List) it.next();
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.EZpvd((Object) ((SessionTopicInfo) it2.next()).getTopic(), (Object) str)) {
                                z2 = true;
                                break loop1;
                            }
                        }
                    }
                }
                z2 = false;
            }
            walletConnectUtils.fJNWhG(str);
            walletConnectUtils.AuCTel(str);
            if (z2) {
                ComponentCallbacks2 componentCallbacks2KWHzl = walletConnectUtils.KWHzl();
                StateListAnimator stateListAnimator = componentCallbacks2KWHzl instanceof StateListAnimator ? (StateListAnimator) componentCallbacks2KWHzl : null;
                if (stateListAnimator != null) {
                    stateListAnimator.KWHzl(str, z);
                }
                for (StateListAnimator stateListAnimator2 : walletConnectUtils.fIwbmz) {
                    Intrinsics.copydefault(stateListAnimator2);
                    stateListAnimator2.KWHzl(str, z);
                }
            }
        }

        @Override // o.InterfaceC13979dcm
        public void copydefault(final String str, final String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Handler handlerAhwBna = WalletConnectUtils.this.AhwBna();
            final WalletConnectUtils walletConnectUtils = WalletConnectUtils.this;
            handlerAhwBna.post(new Runnable() { // from class: o.ear
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    WalletConnectUtils.Activity.AEQbTJ(walletConnectUtils, str, str2);
                }
            });
        }

        public static final void AEQbTJ(WalletConnectUtils walletConnectUtils, String str, String str2) {
            ComponentCallbacks2 componentCallbacks2KWHzl = walletConnectUtils.KWHzl();
            StateListAnimator stateListAnimator = componentCallbacks2KWHzl instanceof StateListAnimator ? (StateListAnimator) componentCallbacks2KWHzl : null;
            if (stateListAnimator != null) {
                stateListAnimator.AEQbTJ(str, str2);
            }
            for (StateListAnimator stateListAnimator2 : walletConnectUtils.fIwbmz) {
                Intrinsics.copydefault(stateListAnimator2);
                stateListAnimator2.AEQbTJ(str, str2);
            }
        }

        @Override // o.InterfaceC13979dcm
        public void AEQbTJ(final String str, final long j, final WCEthereumSignMessage wCEthereumSignMessage) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(wCEthereumSignMessage, "");
            Handler handlerAhwBna = WalletConnectUtils.this.AhwBna();
            final WalletConnectUtils walletConnectUtils = WalletConnectUtils.this;
            handlerAhwBna.post(new Runnable() { // from class: o.eaQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    WalletConnectUtils.Activity.EZpvd(this.KWHzl, str, j, wCEthereumSignMessage, walletConnectUtils);
                }
            });
        }

        public static final void EZpvd(final Activity activity, final String str, final long j, final WCEthereumSignMessage wCEthereumSignMessage, WalletConnectUtils walletConnectUtils) {
            activity.OLrzqt(str, Long.valueOf(j), wCEthereumSignMessage);
            if (wCEthereumSignMessage.getType() == WCEthereumSignMessage.WCSignType.TYPED_MESSAGE) {
                walletConnectUtils.getNewProxyInstance.copydefault("okCalTypedData", new Gson().toJson(yDY.gEmmrt(wCEthereumSignMessage.getData(), Boolean.TRUE)), new ValueCallback() { // from class: o.eaR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(java.lang.Object obj) {
                        WalletConnectUtils.Activity.KWHzl(this.copydefault, str, j, wCEthereumSignMessage, (java.lang.String) obj);
                    }
                });
            } else {
                activity.AEQbTJ(str, j, wCEthereumSignMessage, (String) null);
            }
        }

        public static final void KWHzl(Activity activity, String str, long j, WCEthereumSignMessage wCEthereumSignMessage, String str2) {
            String strReplace$default = str2 != null ? C59449zhJ.replace$default(str2, "\\", "", false, 4, (Object) null) : null;
            if (strReplace$default == null) {
                strReplace$default = "";
            }
            activity.AEQbTJ(str, j, wCEthereumSignMessage, strReplace$default);
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.bdT.Application.startSignDapp$default(o.bdT, android.content.Context, com.okinc.business.defi.api.bean.DappSignArgs, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
        public final void AEQbTJ(String str, long j, WCEthereumSignMessage wCEthereumSignMessage, String str2) {
            String str3;
            android.app.Activity activityKWHzl = WalletConnectUtils.this.KWHzl();
            if (activityKWHzl != null) {
                WalletConnectUtils walletConnectUtils = WalletConnectUtils.this;
                OLrzqt((String) null, (Long) null, (WCEthereumSignMessage) null);
                Long lKWHzl = walletConnectUtils.KWHzl(str, j);
                String string = lKWHzl != null ? lKWHzl.toString() : null;
                if (string == null) {
                    string = "";
                }
                InterfaceC9854bdT interfaceC9854bdT = walletConnectUtils.fJNWhG;
                String strFetchVPNInfo = walletConnectUtils.fetchVPNInfo(str);
                PlatformItem platformItemOLrzqt = walletConnectUtils.OLrzqt(str);
                String data = str2 == null ? wCEthereumSignMessage.getData() : str2;
                boolean z = wCEthereumSignMessage.getType() == WCEthereumSignMessage.WCSignType.PERSONAL_MESSAGE || wCEthereumSignMessage.getType() == WCEthereumSignMessage.WCSignType.MESSAGE;
                int i = C0251Activity.OLrzqt[wCEthereumSignMessage.getType().ordinal()];
                if (i == 1) {
                    str3 = "eth_sign";
                } else if (i == 2) {
                    str3 = DappSignArgs.SIGN_PERSONALMESSAGE;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str3 = DappSignArgs.SIGN_TYPEDMESSAGE;
                }
                String str4 = str3;
                InterfaceC9854bdT.Application.startSignDapp$default(interfaceC9854bdT, activityKWHzl, new DappSignArgs(strFetchVPNInfo, string, platformItemOLrzqt, data, null, z, 5, "wallet_connect", Long.valueOf(j), str, false, false, str4, wCEthereumSignMessage.getType() == WCEthereumSignMessage.WCSignType.TYPED_MESSAGE ? SignType.TYPED_MESSAGE : null, null, wCEthereumSignMessage.getData(), null, null, false, null, null, null, 4148240, null), null, null, 12, null);
            }
        }

        public final void copydefault(String str, long j, String str2) {
            String str3;
            String string;
            android.app.Activity activityKWHzl = WalletConnectUtils.this.KWHzl();
            if (activityKWHzl != null) {
                WalletConnectUtils walletConnectUtils = WalletConnectUtils.this;
                OLrzqt((String) null, (Long) null, (WCEthereumSignMessage) null);
                try {
                    JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
                    byte[] bArrCopydefault = C58171ywJ.copydefault(str2);
                    Intrinsics.checkNotNullExpressionValue(bArrCopydefault, "");
                    JsonElementBuildersKt.add(jsonArrayBuilder, new String(bArrCopydefault, Charsets.UTF_8));
                    str3 = str2;
                    string = jsonArrayBuilder.build().toString();
                } catch (Exception e) {
                    pUU.AEQbTJ("WalletConnectUtils", "Failed to decode base58", e);
                    str3 = str2;
                    string = str3;
                }
                boolean zEZpvd = Intrinsics.EZpvd((Object) string, (Object) str3);
                InterfaceC9854bdT interfaceC9854bdT = walletConnectUtils.fJNWhG;
                String strFetchVPNInfo = walletConnectUtils.fetchVPNInfo(str);
                Long lKWHzl = walletConnectUtils.KWHzl(str, j);
                String string2 = lKWHzl != null ? lKWHzl.toString() : null;
                if (string2 == null) {
                    string2 = "";
                }
                InterfaceC9854bdT.Application.startSignDapp$default(interfaceC9854bdT, activityKWHzl, new DappSignArgs(strFetchVPNInfo, string2, walletConnectUtils.OLrzqt(str), string, null, false, 5, "wallet_connect", Long.valueOf(j), str, false, !zEZpvd, null, null, null, null, null, null, false, null, null, null, 4191280, null), null, null, 12, null);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: com.okinc.business.defi.wallet.common.WalletConnectUtils$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void handleSendTransaction$default(Activity activity, String str, long j, String str2, Object obj, String str3, String str4, Function1 function1, int i, Object obj2) {
            activity.copydefault(str, j, str2, obj, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : function1);
        }

        public final void copydefault(String str, long j, String str2, Object obj, String str3, String str4, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<String>>> function1) {
            Long lKWHzl = WalletConnectUtils.this.KWHzl(str, j);
            String string = lKWHzl != null ? lKWHzl.toString() : null;
            String str5 = string == null ? "" : string;
            String strFetchVPNInfo = WalletConnectUtils.this.fetchVPNInfo(str);
            PlatformItem platformItemOLrzqt = WalletConnectUtils.this.OLrzqt(str);
            String json = new GsonBuilder().disableHtmlEscaping().create().toJson(obj);
            Intrinsics.checkNotNullExpressionValue(json, "");
            OLrzqt(new DappInteractionArgs(strFetchVPNInfo, null, str5, platformItemOLrzqt, json, null, "wallet_connect", 5, Long.valueOf(j), str, str3, str4, str3 != null ? C33129mqd.OLrzqt((CharSequence) str3) : false, false, null, function1 != null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, -67149822, null), str2, function1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.common.WalletConnectUtils$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void operateHandleSendTransaction$default(Activity activity, DappInteractionArgs dappInteractionArgs, String str, Function1 function1, int i, Object obj) {
            if ((i & 4) != 0) {
                function1 = null;
            }
            activity.OLrzqt(dappInteractionArgs, str, (Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<String>>>) function1);
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.xWE.StateListAnimator.watchEvmAsset$default(o.xWE, android.content.Context, com.okinc.business.defi.api.bean.DappInteractionArgs, java.lang.String, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
        
            if (r14.equals(com.reown.android.internal.common.signing.eip1271.EIP1271Verifier.hexPrefix) != false) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
        
            if (r14.equals("") == false) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00cb, code lost:
        
            r5 = r12.KWHzl.KWHzl();
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00d1, code lost:
        
            if (r5 == null) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
        
            r14 = r12.KWHzl;
            AEQbTJ((com.okinc.business.defi.api.bean.DappInteractionArgs) null, (java.lang.String) null);
            o.InterfaceC9854bdT.Application.startTransferDapp$default(r14.fJNWhG, r5, r13, new o.C15921eaF(), r15, null, 16, null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00ea, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OLrzqt(DappInteractionArgs dappInteractionArgs, String str, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<String>>> function1) {
            Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
            Intrinsics.checkNotNullParameter(str, "");
            AEQbTJ(dappInteractionArgs, str);
            int iHashCode = str.hashCode();
            if (iHashCode != 0) {
                if (iHashCode != 1608) {
                    if (iHashCode != 1703976129) {
                        if (iHashCode == 1908006969 && str.equals("onWalletWatchAsset")) {
                            android.app.Activity activityKWHzl = WalletConnectUtils.this.KWHzl();
                            if (activityKWHzl != null) {
                                WalletConnectUtils walletConnectUtils = WalletConnectUtils.this;
                                AEQbTJ((DappInteractionArgs) null, (String) null);
                                xWE.StateListAnimator.watchEvmAsset$default(walletConnectUtils.fARcdN, activityKWHzl, dappInteractionArgs, null, null, 12, null);
                                return;
                            }
                            return;
                        }
                    } else if (str.equals("onWalletAddEthereumChain")) {
                        android.app.Activity activityKWHzl2 = WalletConnectUtils.this.KWHzl();
                        if (activityKWHzl2 != null) {
                            WalletConnectUtils walletConnectUtils2 = WalletConnectUtils.this;
                            AEQbTJ((DappInteractionArgs) null, (String) null);
                            xWE.StateListAnimator.addCustomEvmChain$default(walletConnectUtils2.fARcdN, activityKWHzl2, dappInteractionArgs, null, null, 12, null);
                            return;
                        }
                        return;
                    }
                }
                if (C59449zhJ.startsWith$default(str, EIP1271Verifier.hexPrefix, false, 2, null)) {
                    str = str.substring(2);
                    Intrinsics.checkNotNullExpressionValue(str, "");
                }
                if (C59449zhJ.startsWith$default(str, "095ea7b3", false, 2, null)) {
                    android.app.Activity activityKWHzl3 = WalletConnectUtils.this.KWHzl();
                    if (activityKWHzl3 != null) {
                        WalletConnectUtils walletConnectUtils3 = WalletConnectUtils.this;
                        AEQbTJ((DappInteractionArgs) null, (String) null);
                        walletConnectUtils3.fJNWhG.AEQbTJ(activityKWHzl3, dappInteractionArgs, new Function1() { // from class: o.eaG
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return WalletConnectUtils.Activity.EZpvd((android.os.Bundle) obj);
                            }
                        }, function1);
                        return;
                    }
                    return;
                }
                android.app.Activity activityKWHzl4 = WalletConnectUtils.this.KWHzl();
                if (activityKWHzl4 != null) {
                    WalletConnectUtils walletConnectUtils4 = WalletConnectUtils.this;
                    AEQbTJ((DappInteractionArgs) null, (String) null);
                    InterfaceC9854bdT.Application.startContractInteraction$default(walletConnectUtils4.fJNWhG, activityKWHzl4, dappInteractionArgs, new Function1() { // from class: o.eaH
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return WalletConnectUtils.Activity.valueOf((android.os.Bundle) obj);
                        }
                    }, function1, null, 16, null);
                }
            }
        }

        public static final Unit AEQbTJ(Bundle bundle) {
            return Unit.INSTANCE;
        }

        public static final Unit EZpvd(Bundle bundle) {
            return Unit.INSTANCE;
        }

        public static final Unit valueOf(Bundle bundle) {
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(DappInteractionArgs dappInteractionArgs, String str) {
            WalletConnectUtils.this.KWHzl = dappInteractionArgs;
            WalletConnectUtils.this.AEQbTJ = str;
        }

        public final void OLrzqt(String str, Long l, WCEthereumSignMessage wCEthereumSignMessage) {
            WalletConnectUtils.this.gEmmrt = l;
            WalletConnectUtils.this.isConnected = str;
            WalletConnectUtils.this.valueOf = wCEthereumSignMessage;
        }

        @Override // o.InterfaceC13979dcm
        public void AEQbTJ(final String str, final long j, final WCEthereumTransaction wCEthereumTransaction) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(wCEthereumTransaction, "");
            WalletConnectUtils.this.AhwBna().post(new Runnable() { // from class: o.eak
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    WalletConnectUtils.Activity.AEQbTJ(this.KWHzl, str, j, wCEthereumTransaction);
                }
            });
        }

        public static final void AEQbTJ(Activity activity, String str, long j, WCEthereumTransaction wCEthereumTransaction) {
            String data = wCEthereumTransaction.getData();
            if (data == null) {
                data = "";
            }
            handleSendTransaction$default(activity, str, j, data, wCEthereumTransaction, null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
        }

        @Override // o.InterfaceC13979dcm
        public void EZpvd(final String str, final long j, final String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            WalletConnectUtils.this.AhwBna().post(new Runnable() { // from class: o.eaO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    WalletConnectUtils.Activity.copydefault(this.EZpvd, str, j, str2);
                }
            });
        }

        public static final void copydefault(Activity activity, String str, long j, String str2) {
            activity.copydefault(str, j, str2);
        }

        @Override // o.InterfaceC13979dcm
        public void OLrzqt(final String str, final long j, final String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            WalletConnectUtils.this.AhwBna().post(new Runnable() { // from class: o.eaj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    WalletConnectUtils.Activity.OLrzqt(str2, this, str, j);
                }
            });
        }

        public static final void OLrzqt(String str, final Activity activity, final String str2, final long j) {
            C54892xZe.KWHzl.AEQbTJ(C9678baC.Companion.AEQbTJ(), str, new ValueCallback() { // from class: o.eaI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(java.lang.Object obj) {
                    WalletConnectUtils.Activity.AEQbTJ(this.AEQbTJ, str2, j, (java.lang.String) obj);
                }
            });
        }

        public static final void AEQbTJ(Activity activity, String str, long j, String str2) {
            Object objM7377constructorimpl;
            try {
                Result.Application application = Result.Companion;
                KSerializer<SolanaTxResult> kSerializerSerializer = SolanaTxResult.Companion.serializer();
                Intrinsics.copydefault((Object) str2);
                objM7377constructorimpl = Result.m7377constructorimpl((SolanaTxResult) C54907xZt.OLrzqt(kSerializerSerializer, str2));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                SolanaTxResult solanaTxResult = (SolanaTxResult) objM7377constructorimpl;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                handleSendTransaction$default(activity, str, j, "", new SolanaContractSignData(str3, str4, str5, str6, solanaTxResult.getEncodeTransactionStr(), solanaTxResult.getEncodeStr(), null, null, null, null, null, null, null, null, null, null, null, 131023, null), null, null, new Function1() { // from class: o.eaL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return WalletConnectUtils.Activity.EZpvd((NewCallbackBean) obj);
                    }
                }, 48, null);
            }
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("WalletConnectUtils", "deserialize transaction error", thM7380exceptionOrNullimpl);
            }
        }

        public static final AbstractC58185ywX EZpvd(NewCallbackBean newCallbackBean) {
            Intrinsics.checkNotNullParameter(newCallbackBean, "");
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o.InterfaceC13979dcm
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object copydefault(final String str, final long j, Continuation<? super Boolean> continuation) throws Throwable {
            WalletConnectUtils$listener$1$onPreSessionRequest$1 walletConnectUtils$listener$1$onPreSessionRequest$1;
            if (continuation instanceof WalletConnectUtils$listener$1$onPreSessionRequest$1) {
                walletConnectUtils$listener$1$onPreSessionRequest$1 = (WalletConnectUtils$listener$1$onPreSessionRequest$1) continuation;
                int i = walletConnectUtils$listener$1$onPreSessionRequest$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    walletConnectUtils$listener$1$onPreSessionRequest$1.label = i - Integer.MIN_VALUE;
                } else {
                    walletConnectUtils$listener$1$onPreSessionRequest$1 = new WalletConnectUtils$listener$1$onPreSessionRequest$1(this, continuation);
                }
            }
            Object objAwait = walletConnectUtils$listener$1$onPreSessionRequest$1.result;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = walletConnectUtils$listener$1$onPreSessionRequest$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwait);
                WalletConnectUtils.this.djBIcL();
                final WalletConnectUtils walletConnectUtils = WalletConnectUtils.this;
                AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.eaM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58259yxs
                    public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                        WalletConnectUtils.Activity.KWHzl(walletConnectUtils, str, j, interfaceC58257yxq);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
                walletConnectUtils$listener$1$onPreSessionRequest$1.label = 1;
                objAwait = RxAwaitKt.await(abstractC58260yxtOLrzqt, walletConnectUtils$listener$1$onPreSessionRequest$1);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAwait);
            }
            Intrinsics.checkNotNullExpressionValue(objAwait, "");
            return objAwait;
        }

        public static final void KWHzl(final WalletConnectUtils walletConnectUtils, final String str, final long j, final InterfaceC58257yxq interfaceC58257yxq) {
            Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
            walletConnectUtils.AhwBna().post(new Runnable() { // from class: o.dZU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    WalletConnectUtils.Activity.AEQbTJ(walletConnectUtils, str, j, interfaceC58257yxq);
                }
            });
        }

        public static final void AEQbTJ(WalletConnectUtils walletConnectUtils, String str, long j, InterfaceC58257yxq interfaceC58257yxq) {
            boolean z;
            if (walletConnectUtils.fetchVPNInfo(str).length() != 0) {
                if (!walletConnectUtils.AkhnZx.fIwbmz()) {
                    walletConnectUtils.DbNXlk.isConnected(C33070mpX.AYXKKw(C13754dXa.FragmentManager.cancel));
                    WalletConnectUtils.rejectRequest$default(walletConnectUtils, str, j, C33070mpX.AYXKKw(C13754dXa.FragmentManager.cancel), 0, 8, null);
                } else {
                    z = false;
                    interfaceC58257yxq.onSuccess(Boolean.valueOf(z));
                }
            } else {
                walletConnectUtils.DbNXlk.isConnected(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKDcMfJK));
                WalletConnectUtils.rejectRequest$default(walletConnectUtils, str, j, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKDcMfJK), 0, 8, null);
            }
            z = true;
            interfaceC58257yxq.onSuccess(Boolean.valueOf(z));
        }

        @Override // o.InterfaceC13979dcm
        public void OLrzqt(final String str, final long j, final MetaxEthereumTransaction metaxEthereumTransaction) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(metaxEthereumTransaction, "");
            WalletConnectUtils.this.AhwBna().post(new Runnable() { // from class: o.eau
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    WalletConnectUtils.Activity.EZpvd(this.KWHzl, str, j, metaxEthereumTransaction);
                }
            });
        }

        public static final void EZpvd(Activity activity, String str, long j, MetaxEthereumTransaction metaxEthereumTransaction) {
            handleSendTransaction$default(activity, str, j, metaxEthereumTransaction.getData(), metaxEthereumTransaction, metaxEthereumTransaction.getApprovalAddress(), metaxEthereumTransaction.getApprovalNum(), null, 64, null);
        }

        @Override // o.InterfaceC13979dcm
        public void AEQbTJ(final String str, final long j, final OKXAuthPayloadParams oKXAuthPayloadParams) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(oKXAuthPayloadParams, "");
            Handler handlerAhwBna = WalletConnectUtils.this.AhwBna();
            final WalletConnectUtils walletConnectUtils = WalletConnectUtils.this;
            handlerAhwBna.post(new Runnable() { // from class: o.eax
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    WalletConnectUtils.Activity.KWHzl(walletConnectUtils, str, j);
                }
            });
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = WalletConnectUtils.this.ejfBZ.copydefault(false);
            final WalletConnectUtils walletConnectUtils2 = WalletConnectUtils.this;
            final Function1 function1 = new Function1() { // from class: o.eaw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return WalletConnectUtils.Activity.AEQbTJ(oKXAuthPayloadParams, walletConnectUtils2, j, (AbstractC12782ctV) obj);
                }
            };
            AbstractC58260yxt<R> abstractC58260yxtCopydefault2 = abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.eat
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return WalletConnectUtils.Activity.valueOf(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault2, "");
            AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(abstractC58260yxtCopydefault2);
            Function1 function12 = new Function1() { // from class: o.eaB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return WalletConnectUtils.Activity.KWHzl(this.copydefault, (java.lang.Throwable) obj);
                }
            };
            final WalletConnectUtils walletConnectUtils3 = WalletConnectUtils.this;
            yBI.KWHzl(abstractC58260yxtKWHzl, (Function1<? super Throwable, Unit>) function12, new Function1() { // from class: o.eay
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return WalletConnectUtils.Activity.AEQbTJ(this.EZpvd, walletConnectUtils3, j, (WalletConnectUtils.TaskDescription) obj);
                }
            });
        }

        public static final void KWHzl(WalletConnectUtils walletConnectUtils, String str, long j) {
            walletConnectUtils.EZpvd(str, C33129mqd.gEmmrt(Long.valueOf(j)));
        }

        public static final TaskDescription valueOf(Function1 function1, Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (TaskDescription) function1.invoke(obj);
        }

        public static final TaskDescription AEQbTJ(OKXAuthPayloadParams oKXAuthPayloadParams, WalletConnectUtils walletConnectUtils, long j, AbstractC12782ctV abstractC12782ctV) {
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            if (abstractC12782ctV.gHZMYf()) {
                return TaskDescription.StateListAnimator.copydefault;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : oKXAuthPayloadParams.getChains()) {
                InterfaceC13987dcu interfaceC13987dcuAEQbTJ = InterfaceC13987dcu.Companion.AEQbTJ(str);
                if (interfaceC13987dcuAEQbTJ instanceof InterfaceC13987dcu.Dialog) {
                    ChainAddress chainAddress = (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(abstractC12782ctV, ((InterfaceC13987dcu.Dialog) interfaceC13987dcuAEQbTJ).OLrzqt(), null, 2, null);
                    String address = chainAddress != null ? chainAddress.getAddress() : null;
                    if (address != null && address.length() != 0) {
                        arrayList.add(str);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return TaskDescription.StateListAnimator.copydefault;
            }
            OKXAuthPayloadParams oKXAuthPayloadParamsOLrzqt = walletConnectUtils.DbNXlk.OLrzqt(C13977dck.EZpvd(oKXAuthPayloadParams), arrayList);
            InterfaceC13987dcu interfaceC13987dcuAEQbTJ2 = InterfaceC13987dcu.Companion.AEQbTJ((String) CollectionsKt___CollectionsKt.AuCTelauCTel(oKXAuthPayloadParamsOLrzqt.getChains()));
            Intrinsics.copydefault(interfaceC13987dcuAEQbTJ2);
            InterfaceC9780bbz interfaceC9780bbzAddressFromRealChainId$default = InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(abstractC12782ctV, interfaceC13987dcuAEQbTJ2.OLrzqt(), null, 2, null);
            Intrinsics.copydefault(interfaceC9780bbzAddressFromRealChainId$default);
            String address2 = ((ChainAddress) interfaceC9780bbzAddressFromRealChainId$default).getAddress();
            String strAEQbTJ = walletConnectUtils.DbNXlk.AEQbTJ(address2, (String) CollectionsKt___CollectionsKt.AuCTelauCTel(oKXAuthPayloadParamsOLrzqt.getChains()));
            String strAEQbTJ2 = walletConnectUtils.DbNXlk.AEQbTJ(C13977dck.EZpvd(oKXAuthPayloadParamsOLrzqt), strAEQbTJ);
            if (strAEQbTJ2 == null || strAEQbTJ2.length() == 0) {
                return TaskDescription.Activity.EZpvd;
            }
            WCEthereumSignMessage wCEthereumSignMessage = new WCEthereumSignMessage(yDY.gEmmrt(strAEQbTJ2, address2), WCEthereumSignMessage.WCSignType.PERSONAL_MESSAGE);
            walletConnectUtils.values.KWHzl().put(Long.valueOf(j), oKXAuthPayloadParamsOLrzqt);
            return new TaskDescription.C0252TaskDescription(new ShowWCAuthRequestArgs(j, strAEQbTJ, wCEthereumSignMessage, abstractC12782ctV.DbNXlk(), interfaceC13987dcuAEQbTJ2.OLrzqt(), oKXAuthPayloadParamsOLrzqt.getAud()));
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.dcp.rejectAuthRequest$default(o.dcp, long, java.lang.String, boolean, int, java.lang.Object):void */
        public static final Unit AEQbTJ(Activity activity, WalletConnectUtils walletConnectUtils, long j, TaskDescription taskDescription) {
            if (Intrinsics.EZpvd(taskDescription, TaskDescription.StateListAnimator.copydefault)) {
                activity.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKRKUgwx));
                C13982dcp.rejectAuthRequest$default(walletConnectUtils.DbNXlk, j, "OKX Wallet Rejected: Unsupported network", false, 4, null);
            } else if (Intrinsics.EZpvd(taskDescription, TaskDescription.Activity.EZpvd)) {
                pUU.copydefault("WalletConnectUtils", "onAuthRequest error: Failed to generate message");
                activity.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
                C13982dcp.rejectAuthRequest$default(walletConnectUtils.DbNXlk, j, "OKX Wallet Reject: Failed to generate message", false, 4, null);
            } else if (taskDescription instanceof TaskDescription.C0252TaskDescription) {
                ComponentCallbacks2 componentCallbacks2KWHzl = walletConnectUtils.KWHzl();
                StateListAnimator stateListAnimator = componentCallbacks2KWHzl instanceof StateListAnimator ? (StateListAnimator) componentCallbacks2KWHzl : null;
                if (stateListAnimator != null) {
                    stateListAnimator.AEQbTJ(((TaskDescription.C0252TaskDescription) taskDescription).EZpvd());
                }
                for (StateListAnimator stateListAnimator2 : walletConnectUtils.fIwbmz) {
                    Intrinsics.copydefault(stateListAnimator2);
                    stateListAnimator2.AEQbTJ(((TaskDescription.C0252TaskDescription) taskDescription).EZpvd());
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(Activity activity, Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            pUU.AEQbTJ("WalletConnectUtils", "onAuthRequest error", th);
            activity.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC13979dcm
        public void copydefault(final String str, final long j) {
            Intrinsics.checkNotNullParameter(str, "");
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = WalletConnectUtils.this.ejfBZ.OLrzqt(WalletConnectUtils.this.fetchVPNInfo(str), false);
            final Function1 function1 = new Function1() { // from class: o.dZY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return WalletConnectUtils.Activity.copydefault((AbstractC12782ctV) obj);
                }
            };
            AbstractC58260yxt<R> abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.eal
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return WalletConnectUtils.Activity.fetchVPNInfo(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
            AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(abstractC58260yxtCopydefault);
            final WalletConnectUtils walletConnectUtils = WalletConnectUtils.this;
            Function1 function12 = new Function1() { // from class: o.eav
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return WalletConnectUtils.Activity.copydefault(walletConnectUtils, str, j, (java.lang.Throwable) obj);
                }
            };
            final WalletConnectUtils walletConnectUtils2 = WalletConnectUtils.this;
            yBI.KWHzl(abstractC58260yxtKWHzl, (Function1<? super Throwable, Unit>) function12, new Function1() { // from class: o.eaE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return WalletConnectUtils.Activity.copydefault(walletConnectUtils2, str, j, (java.lang.String) obj);
                }
            });
        }

        public static final String fetchVPNInfo(Function1 function1, Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (String) function1.invoke(obj);
        }

        public static final String copydefault(AbstractC12782ctV abstractC12782ctV) {
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            ArrayList<ChainAddress> arrayListOBJEWx = abstractC12782ctV.isConnected();
            ArrayList<ChainAddress> arrayList = new ArrayList();
            for (Object obj : arrayListOBJEWx) {
                if (((ChainAddress) obj).isDefault()) {
                    arrayList.add(obj);
                }
            }
            C33489mxS c33489mxS = C33489mxS.KWHzl;
            KSerializer<SyncAllAddressesResponse> kSerializerSerializer = SyncAllAddressesResponse.Companion.serializer();
            int newProxyInstance = abstractC12782ctV.getNewProxyInstance();
            boolean zAuCTelauCTel = abstractC12782ctV.AuCTelauCTel();
            String strFJNWhG = abstractC12782ctV.fJNWhG();
            String strAkhnZx = abstractC12782ctV.AkhnZx();
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            for (ChainAddress chainAddress : arrayList) {
                arrayList2.add(new SyncAllAddressesResponse.Address(chainAddress.getChainId(), chainAddress.getCoinId(), chainAddress.getAddress()));
            }
            return c33489mxS.KWHzl(kSerializerSerializer, new SyncAllAddressesResponse(newProxyInstance, zAuCTelauCTel ? 1 : 0, strFJNWhG, strAkhnZx, arrayList2));
        }

        public static final Unit copydefault(WalletConnectUtils walletConnectUtils, String str, long j, Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            pUU.AEQbTJ("WalletConnectUtils", "onSyncAllAddresses error", th);
            WalletConnectUtils.rejectRequest$default(walletConnectUtils, str, j, "OKX Wallet Reject: Failed to sync all addresses", 0, 8, null);
            return Unit.INSTANCE;
        }

        public static final Unit copydefault(WalletConnectUtils walletConnectUtils, String str, long j, String str2) {
            pUU.KWHzl("WalletConnectUtils", "SYNC_ALL_ADDRESSES: " + str2);
            Intrinsics.copydefault((Object) str2);
            walletConnectUtils.AEQbTJ(str, j, str2);
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC13979dcm
        public void AEQbTJ(final String str, final long j, final String str2, final CustomNetworkInfo customNetworkInfo) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(customNetworkInfo, "");
            Handler handlerAhwBna = WalletConnectUtils.this.AhwBna();
            final WalletConnectUtils walletConnectUtils = WalletConnectUtils.this;
            handlerAhwBna.post(new Runnable() { // from class: o.eaJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    WalletConnectUtils.Activity.EZpvd(walletConnectUtils, str2, str, j, customNetworkInfo, this);
                }
            });
        }

        public static final void EZpvd(WalletConnectUtils walletConnectUtils, String str, String str2, long j, CustomNetworkInfo customNetworkInfo, Activity activity) {
            WalletConnectUtils walletConnectUtils2;
            String str3;
            String str4;
            if (walletConnectUtils.KWHzl() != null) {
                if (str == null) {
                    str4 = str2;
                    str3 = "";
                    walletConnectUtils2 = walletConnectUtils;
                } else {
                    walletConnectUtils2 = walletConnectUtils;
                    str3 = str;
                    str4 = str2;
                }
                operateHandleSendTransaction$default(activity, new DappInteractionArgs(walletConnectUtils2.fetchVPNInfo(str4), null, str3, null, null, null, "wallet_connect", 5, Long.valueOf(j), str2, null, null, false, false, null, false, null, null, null, null, null, customNetworkInfo, null, null, null, null, 0, null, null, null, null, null, -69206982, null), "onWalletAddEthereumChain", null, 4, null);
            }
        }

        @Override // o.InterfaceC13979dcm
        public void KWHzl(final String str, final long j, final List<WalletSwitchEthereumChain> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Handler handlerAhwBna = WalletConnectUtils.this.AhwBna();
            final WalletConnectUtils walletConnectUtils = WalletConnectUtils.this;
            handlerAhwBna.post(new Runnable() { // from class: o.eao
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    WalletConnectUtils.Activity.KWHzl(list, walletConnectUtils, str, j);
                }
            });
        }

        public static final void copydefault(WalletConnectUtils walletConnectUtils, String str, long j) {
            walletConnectUtils.EZpvd(str, j, "Unrecognized chain ID. Try adding the chain using `wallet_addEthereumChain` first.", 4902);
        }

        public static final void KWHzl(List list, final WalletConnectUtils walletConnectUtils, final String str, final long j) {
            String strKWHzl;
            WalletSwitchEthereumChain walletSwitchEthereumChain = (WalletSwitchEthereumChain) CollectionsKt___CollectionsKt.firstOrNull(list);
            final Long lGEmmrt = null;
            String chainId = walletSwitchEthereumChain != null ? walletSwitchEthereumChain.getChainId() : null;
            if (chainId != null && (strKWHzl = StringsKt__StringsKt.KWHzl(chainId, (CharSequence) EIP1271Verifier.hexPrefix)) != null) {
                lGEmmrt = StringsKt__StringNumberConversionsKt.gEmmrt(strKWHzl, 16);
            }
            if (lGEmmrt != null) {
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = walletConnectUtils.ejfBZ.OLrzqt(walletConnectUtils.fetchVPNInfo(str), false);
                final Function1 function1 = new Function1() { // from class: o.eaC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return WalletConnectUtils.Activity.OLrzqt(lGEmmrt, walletConnectUtils, (AbstractC12782ctV) obj);
                    }
                };
                AbstractC58260yxt<R> abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.eaz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return WalletConnectUtils.Activity.AkhnZx(function1, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
                yBI.KWHzl(C11607cUn.KWHzl(abstractC58260yxtCopydefault), (Function1<? super Throwable, Unit>) new Function1() { // from class: o.eaA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return WalletConnectUtils.Activity.EZpvd(walletConnectUtils, str, j, (java.lang.Throwable) obj);
                    }
                }, new Function1() { // from class: o.eaD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return WalletConnectUtils.Activity.AEQbTJ(walletConnectUtils, str, j, (java.lang.Boolean) obj);
                    }
                });
                return;
            }
            copydefault(walletConnectUtils, str, j);
        }

        public static final Boolean AkhnZx(Function1 function1, Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (Boolean) function1.invoke(obj);
        }

        public static final Boolean OLrzqt(Long l, WalletConnectUtils walletConnectUtils, AbstractC12782ctV abstractC12782ctV) {
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            ArrayList<ChainAddress> arrayListOBJEWx = abstractC12782ctV.isConnected();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = arrayListOBJEWx.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C10854bwM c10854bwMKWHzl = walletConnectUtils.EZpvd.KWHzl(Long.valueOf(((ChainAddress) it.next()).getCoinId()));
                Long lValueOf = c10854bwMKWHzl != null ? Long.valueOf(c10854bwMKWHzl.isConnected()) : null;
                if (lValueOf != null) {
                    arrayList.add(lValueOf);
                }
            }
            if (arrayList.contains(l)) {
                return Boolean.TRUE;
            }
            ArrayList<ChainAddress> arrayListAxsJAYsNCnLh = abstractC12782ctV.AxsJAYsNCnLh();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = arrayListAxsJAYsNCnLh.iterator();
            while (it2.hasNext()) {
                CustomChainCoinMeta customChainCoinMetaOLrzqt = walletConnectUtils.OLrzqt.OLrzqt(((ChainAddress) it2.next()).getCoinId());
                Long lValueOf2 = customChainCoinMetaOLrzqt != null ? Long.valueOf(customChainCoinMetaOLrzqt.DbNXlk()) : null;
                if (lValueOf2 != null) {
                    arrayList2.add(lValueOf2);
                }
            }
            return arrayList2.contains(l) ? Boolean.TRUE : Boolean.FALSE;
        }

        public static final Unit EZpvd(WalletConnectUtils walletConnectUtils, String str, long j, Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            pUU.AEQbTJ("WalletConnectUtils", "onWalletSwitchEthereumChain error", th);
            copydefault(walletConnectUtils, str, j);
            return Unit.INSTANCE;
        }

        public static final Unit AEQbTJ(WalletConnectUtils walletConnectUtils, String str, long j, Boolean bool) {
            if (bool.booleanValue()) {
                walletConnectUtils.AEQbTJ(str, j, AbstractJsonLexerKt.NULL);
            } else {
                copydefault(walletConnectUtils, str, j);
            }
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC13979dcm
        public void copydefault(final String str, final long j, final String str2, final WalletWatchAsset walletWatchAsset) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(walletWatchAsset, "");
            Handler handlerAhwBna = WalletConnectUtils.this.AhwBna();
            final WalletConnectUtils walletConnectUtils = WalletConnectUtils.this;
            handlerAhwBna.post(new Runnable() { // from class: o.eaK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    WalletConnectUtils.Activity.KWHzl(walletConnectUtils, str2, str, walletWatchAsset, j, this);
                }
            });
        }

        public static final void KWHzl(WalletConnectUtils walletConnectUtils, String str, String str2, WalletWatchAsset walletWatchAsset, long j, Activity activity) {
            Integer decimals;
            InterfaceC9731bbC interfaceC9731bbCOLrzqt = walletConnectUtils.fetchVPNInfo.copydefault().OLrzqt(C33129mqd.valueOf(str), true);
            C10854bwM c10854bwM = interfaceC9731bbCOLrzqt instanceof C10854bwM ? (C10854bwM) interfaceC9731bbCOLrzqt : null;
            String strAYXKKw = (c10854bwM == null || !c10854bwM.DarRvM()) ? "" : C33129mqd.AYXKKw(Long.valueOf(c10854bwM.fetchVPNInfo()));
            if (walletConnectUtils.KWHzl() != null) {
                String strFetchVPNInfo = walletConnectUtils.fetchVPNInfo(str2);
                WalletWatchAssetOption options = walletWatchAsset.getOptions();
                String image = options != null ? options.getImage() : null;
                WalletWatchAssetOption options2 = walletWatchAsset.getOptions();
                String symbol = options2 != null ? options2.getSymbol() : null;
                WalletWatchAssetOption options3 = walletWatchAsset.getOptions();
                int iIntValue = (options3 == null || (decimals = options3.getDecimals()) == null) ? -1 : decimals.intValue();
                WalletWatchAssetOption options4 = walletWatchAsset.getOptions();
                String str3 = null;
                operateHandleSendTransaction$default(activity, new DappInteractionArgs(strFetchVPNInfo, null, strAYXKKw, null, null, 0 == true ? 1 : 0, "wallet_connect", 5, Long.valueOf(j), str2, str3, null, false, false, 0 == true ? 1 : 0, false, null, null, null, null, null, new CustomNetworkInfo(image, null, null, null, null, symbol, str3, options4 != null ? options4.getAddress() : null, iIntValue, 94, null), null, null, null, null, 0, null, null, null, null, null, -69206982, null), "onWalletWatchAsset", null, 4, null);
            }
        }

        @Override // o.InterfaceC13979dcm
        public void EZpvd(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            WalletConnectUtils walletConnectUtils = WalletConnectUtils.this;
            walletConnectUtils.AhwBna().post(walletConnectUtils.new Application(str2));
        }

        @Override // o.InterfaceC13979dcm
        public void OLrzqt(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            WalletConnectUtils walletConnectUtils = WalletConnectUtils.this;
            walletConnectUtils.AhwBna().post(walletConnectUtils.new Application(str2));
        }

        @Override // o.InterfaceC13979dcm
        public void KWHzl(long j, String str) {
            Intrinsics.checkNotNullParameter(str, "");
            WalletConnectUtils walletConnectUtils = WalletConnectUtils.this;
            walletConnectUtils.AhwBna().post(walletConnectUtils.new Application(str));
        }

        @Override // o.InterfaceC13979dcm
        public void OLrzqt(long j, String str) {
            Intrinsics.checkNotNullParameter(str, "");
            WalletConnectUtils walletConnectUtils = WalletConnectUtils.this;
            walletConnectUtils.AhwBna().post(walletConnectUtils.new Application(str));
        }

        @Override // o.InterfaceC13979dcm
        public void OLrzqt(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            WalletConnectUtils walletConnectUtils = WalletConnectUtils.this;
            walletConnectUtils.AhwBna().post(walletConnectUtils.new Application(str));
        }

        public static final boolean AEQbTJ(ResponseData responseData) {
            Intrinsics.checkNotNullParameter(responseData, "");
            return responseData.getCode() == 0 && responseData.getData() != null;
        }

        public static final boolean OLrzqt(ResponseData responseData) {
            Intrinsics.checkNotNullParameter(responseData, "");
            return responseData.getCode() == 0 && responseData.getData() != null;
        }
    }

    public final void AEQbTJ(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        if (this.fIwbmz.contains(stateListAnimator)) {
            return;
        }
        this.fIwbmz.add(stateListAnimator);
    }

    public final void copydefault(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.fIwbmz.remove(stateListAnimator);
    }

    public final boolean copydefault(@NotNull String str, @NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return OLrzqt(abstractC12782ctV) && abstractC12782ctV.zLjUOn() && EZpvd(str, abstractC12782ctV);
    }

    public final boolean EZpvd(String str, AbstractC12782ctV abstractC12782ctV) {
        return this.DbNXlk.AEQbTJ(str, KWHzl(abstractC12782ctV));
    }

    public final boolean OLrzqt(AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV.QfsBiF()) {
            return false;
        }
        if (!abstractC12782ctV.AuCTelauCTel() && !abstractC12782ctV.KWHzl((Long) 501L)) {
            return false;
        }
        if (abstractC12782ctV.ORxRYg() || abstractC12782ctV.AEQbTJ(WalletType.MPCWallet)) {
            return abstractC12782ctV.Dmq();
        }
        return true;
    }

    public static final class Application implements Runnable {
        public final /* synthetic */ String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(String str) {
            this.EZpvd = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ComponentCallbacks2 componentCallbacks2KWHzl = WalletConnectUtils.this.KWHzl();
            StateListAnimator stateListAnimator = componentCallbacks2KWHzl instanceof StateListAnimator ? (StateListAnimator) componentCallbacks2KWHzl : null;
            if (stateListAnimator != null) {
                stateListAnimator.OLrzqt(this.EZpvd);
            }
            WalletConnectUtils walletConnectUtils = WalletConnectUtils.this;
            String str = this.EZpvd;
            for (StateListAnimator stateListAnimator2 : walletConnectUtils.fIwbmz) {
                Intrinsics.copydefault(stateListAnimator2);
                stateListAnimator2.OLrzqt(str);
            }
        }
    }

    public final void KWHzl(@NotNull String str, @NotNull AbstractC12782ctV abstractC12782ctV, String str2, @NotNull yHO<? super Boolean, ? super Integer, ? super String, Unit> yho) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(yho, "");
        InterfaceC13980dcn interfaceC13980dcnFARcdN = fARcdN(str);
        pUU.KWHzl("WalletConnectUtils", "connect: validateWCUri=" + interfaceC13980dcnFARcdN);
        if (interfaceC13980dcnFARcdN instanceof InterfaceC13980dcn.Activity) {
            return;
        }
        if (interfaceC13980dcnFARcdN instanceof InterfaceC13980dcn.TaskDescription) {
            yho.invoke(Boolean.FALSE, 3, C33070mpX.AYXKKw(C13754dXa.FragmentManager.Hx));
            return;
        }
        if (!(interfaceC13980dcnFARcdN instanceof InterfaceC13980dcn.Application)) {
            throw new NoWhenBranchMatchedException();
        }
        if (values(str)) {
            yho.invoke(Boolean.FALSE, 4, null);
        } else {
            if (abstractC12782ctV.zLjUOn()) {
                yho.invoke(Boolean.TRUE, 0, null);
                KWHzl(str, str2);
                this.DbNXlk.OLrzqt(str);
                return;
            }
            yho.invoke(Boolean.FALSE, 2, C33070mpX.AYXKKw(C13754dXa.FragmentManager.HJWChPdIKEqB));
        }
    }

    public final void copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull final Function2<? super Boolean, ? super String, Unit> function2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.DbNXlk.EZpvd(str, str2, str3, new Function2() { // from class: o.dZQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return WalletConnectUtils.AEQbTJ(this.EZpvd, function2, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2);
            }
        });
    }

    public static final Unit AEQbTJ(WalletConnectUtils walletConnectUtils, final Function2 function2, final boolean z, final String str) {
        walletConnectUtils.AhwBna().post(new Runnable() { // from class: o.dZV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                WalletConnectUtils.OLrzqt(function2, z, str);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function2 function2, boolean z, String str) {
        function2.invoke(Boolean.valueOf(z), str);
    }

    public final void DbNXlk(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C13982dcp.rejectSession$default(this.DbNXlk, str, false, 2, null);
    }

    public final void AEQbTJ(@NotNull String str, long j, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.DbNXlk.OLrzqt(str, j, str2);
    }

    public static /* synthetic */ void rejectRequest$default(WalletConnectUtils walletConnectUtils, String str, long j, String str2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = "User Reject";
        }
        String str3 = str2;
        if ((i2 & 8) != 0) {
            i = 5000;
        }
        walletConnectUtils.EZpvd(str, j, str3, i);
    }

    public final void EZpvd(@NotNull String str, long j, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C13982dcp.rejectRequest$default(this.DbNXlk, str, j, str2, i, false, 16, null);
    }

    public static /* synthetic */ void moveBackToDApp$default(WalletConnectUtils walletConnectUtils, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        walletConnectUtils.AEQbTJ(str, str2, num);
    }

    public final void AEQbTJ(@NotNull final String str, final String str2, @StringRes final Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        AhwBna().post(new Runnable() { // from class: o.dZX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                WalletConnectUtils.KWHzl(this.EZpvd, str2, str, num);
            }
        });
    }

    public static final void KWHzl(WalletConnectUtils walletConnectUtils, String str, String str2, Integer num) {
        android.app.Activity activityKWHzl = walletConnectUtils.KWHzl();
        if (activityKWHzl == null) {
            return;
        }
        if (str == null) {
            try {
                Wallet.Model.Session sessionAEQbTJ = walletConnectUtils.DbNXlk.AEQbTJ(str2);
                str = sessionAEQbTJ != null ? sessionAEQbTJ.getRedirect() : null;
            } catch (Exception e) {
                pUU.AEQbTJ("WalletConnectUtils", "Failed to move back to dApp", e);
                C55326xho.EZpvd(C13754dXa.FragmentManager.ComponentActivityReportFullyDrawnExecutorApi16ImplExternalSyntheticLambda0);
                return;
            }
        }
        if (!C33129mqd.OLrzqt((CharSequence) str)) {
            String strAYXKKw = walletConnectUtils.AYXKKw(str2);
            if (strAYXKKw != null && !Intrinsics.EZpvd((Object) activityKWHzl.getPackageName(), (Object) strAYXKKw)) {
                Intent launchIntentForPackage = activityKWHzl.getPackageManager().getLaunchIntentForPackage(strAYXKKw);
                if (launchIntentForPackage == null) {
                    throw new Exception("Intent not found");
                }
                launchIntentForPackage.addFlags(131072);
                activityKWHzl.startActivity(launchIntentForPackage);
            }
        } else {
            Intrinsics.copydefault((Object) str);
            Uri uri = Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(uri, "");
            activityKWHzl.startActivity(new Intent("android.intent.action.VIEW", uri));
        }
        int i = C13754dXa.FragmentManager.getTitle;
        if (num != null && num.intValue() == i) {
            C55326xho.toastWithSuccessfulIcon$default(num.intValue(), 0, 1, (Object) null);
            return;
        }
        if (num != null) {
            C55326xho.toast$default(num.intValue(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        }
    }

    public final void KWHzl(long j, @NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C13982dcp c13982dcp = this.DbNXlk;
        OKXAuthPayloadParams oKXAuthPayloadParamsRemove = this.values.KWHzl().remove(Long.valueOf(j));
        c13982dcp.EZpvd(j, oKXAuthPayloadParamsRemove != null ? C13977dck.EZpvd(oKXAuthPayloadParamsRemove) : null, str, str2, z);
    }

    public final void EZpvd(long j) {
        C13982dcp.rejectAuthRequest$default(this.DbNXlk, j, "OKX Wallet Reject: User rejected", false, 4, null);
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.DbNXlk.copydefault(str);
    }

    public final void djBIcL() {
        dZS dzs = this.values;
        Map mapOLrzqt = C56423yEv.OLrzqt();
        for (Map.Entry<String, List<SessionTopicInfo>> entry : this.values.copydefault().entrySet()) {
            String key = entry.getKey();
            List<SessionTopicInfo> value = entry.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : value) {
                if (System.currentTimeMillis() < ((SessionTopicInfo) obj).getExpiryInSeconds() * ((long) 1000)) {
                    arrayList.add(obj);
                }
            }
            mapOLrzqt.put(key, arrayList);
        }
        dzs.AEQbTJ(C56423yEv.AYXKKw(mapOLrzqt));
    }

    public final void AEQbTJ(String str, String str2) {
        List<SessionTopicInfo> listAhwBna = this.values.copydefault().get(str);
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listAhwBna) {
            if (!Intrinsics.EZpvd((Object) ((SessionTopicInfo) obj).getPairingTopic(), (Object) str2)) {
                arrayList.add(obj);
            }
        }
        List listCopydefault = CollectionsKt___CollectionsKt.copydefault((Collection<? extends SessionTopicInfo>) arrayList, new SessionTopicInfo(str2, (String) null, false, 0L, 14, (DefaultConstructorMarker) null));
        dZS dzs = this.values;
        dzs.AEQbTJ(C56424yEw.KWHzl((Map) dzs.copydefault(), C56390yDp.OLrzqt(str, listCopydefault)));
    }

    public final void KWHzl(String str, String str2, long j) {
        dZS dzs = this.values;
        Map<String, List<SessionTopicInfo>> mapCopydefault = dzs.copydefault();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(mapCopydefault.size()));
        Iterator<T> it = mapCopydefault.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            List<SessionTopicInfo> list = (List) entry.getValue();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (SessionTopicInfo sessionTopicInfoCopy$default : list) {
                if (Intrinsics.EZpvd((Object) sessionTopicInfoCopy$default.getPairingTopic(), (Object) str)) {
                    sessionTopicInfoCopy$default = SessionTopicInfo.copy$default(sessionTopicInfoCopy$default, null, str2, true, j, 1, null);
                }
                arrayList.add(sessionTopicInfoCopy$default);
            }
            linkedHashMap.put(key, arrayList);
        }
        dzs.AEQbTJ(linkedHashMap);
    }

    public final String fetchVPNInfo(@NotNull String str) {
        Object next;
        String key = "";
        Intrinsics.checkNotNullParameter(str, "");
        for (Map.Entry<String, List<SessionTopicInfo>> entry : this.values.copydefault().entrySet()) {
            Iterator<T> it = entry.getValue().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((SessionTopicInfo) next).getTopic(), (Object) str)) {
                    break;
                }
            }
            if (next != null) {
                key = entry.getKey();
            }
        }
        return key;
    }

    public final void fJNWhG(String str) {
        dZS dzs = this.values;
        Map mapOLrzqt = C56423yEv.OLrzqt();
        for (Map.Entry<String, List<SessionTopicInfo>> entry : this.values.copydefault().entrySet()) {
            String key = entry.getKey();
            List<SessionTopicInfo> value = entry.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : value) {
                if (!Intrinsics.EZpvd((Object) ((SessionTopicInfo) obj).getTopic(), (Object) str)) {
                    arrayList.add(obj);
                }
            }
            mapOLrzqt.put(key, arrayList);
        }
        dzs.AEQbTJ(C56423yEv.AYXKKw(mapOLrzqt));
    }

    public final void ejfBZ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        dZS dzs = this.values;
        Map<String, List<SessionTopicInfo>> mapCopydefault = dzs.copydefault();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, List<SessionTopicInfo>> entry : mapCopydefault.entrySet()) {
            if (!Intrinsics.EZpvd((Object) entry.getKey(), (Object) str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        dzs.AEQbTJ(linkedHashMap);
    }

    public final void OLrzqt() {
        this.values.AEQbTJ(C56424yEw.KWHzl());
    }

    public final void KWHzl(String str, String str2) {
        dZS dzs = this.values;
        List listOLrzqt = C56402yEa.OLrzqt();
        listOLrzqt.addAll(this.values.EZpvd());
        listOLrzqt.add(new OriginFromInfo(str, (String) null, str2, 2, (DefaultConstructorMarker) null));
        dzs.copydefault(C56402yEa.fARcdN(listOLrzqt));
    }

    public final void EZpvd(String str, String str2) {
        dZS dzs = this.values;
        List<OriginFromInfo> listEZpvd = dzs.EZpvd();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        for (OriginFromInfo originFromInfoCopy$default : listEZpvd) {
            if (StringsKt__StringsKt.contains$default((CharSequence) originFromInfoCopy$default.getPairingTopic(), (CharSequence) str, false, 2, (Object) null)) {
                originFromInfoCopy$default = OriginFromInfo.copy$default(originFromInfoCopy$default, null, str2, null, 5, null);
            }
            arrayList.add(originFromInfoCopy$default);
        }
        dzs.copydefault(arrayList);
    }

    public final void AuCTel(String str) {
        dZS dzs = this.values;
        List<OriginFromInfo> listEZpvd = dzs.EZpvd();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listEZpvd) {
            if (!Intrinsics.EZpvd((Object) ((OriginFromInfo) obj).getSessionTopic(), (Object) str)) {
                arrayList.add(obj);
            }
        }
        dzs.copydefault(arrayList);
    }

    public final String AYXKKw(String str) {
        Object next;
        Iterator<T> it = this.values.EZpvd().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            OriginFromInfo originFromInfo = (OriginFromInfo) next;
            if (Intrinsics.EZpvd((Object) originFromInfo.getSessionTopic(), (Object) str) || StringsKt__StringsKt.contains$default((CharSequence) originFromInfo.getPairingTopic(), (CharSequence) str, false, 2, (Object) null)) {
                break;
            }
        }
        OriginFromInfo originFromInfo2 = (OriginFromInfo) next;
        if (originFromInfo2 != null) {
            return originFromInfo2.getOriginFrom();
        }
        return null;
    }

    public final boolean values(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return isConnected(str) != null;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:56:0x004f */
    /* JADX DEBUG: Multi-variable search result rejected for r9v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r9v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object] */
    public final WCSessionMeta isConnected(@NotNull String str) {
        T next;
        Intrinsics.checkNotNullParameter(str, "");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        WCSessionMeta wCSessionMeta = null;
        for (Map.Entry<String, List<SessionTopicInfo>> entry : this.values.copydefault().entrySet()) {
            Iterator<T> it = entry.getValue().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = 0;
                    break;
                }
                next = it.next();
                if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) ((SessionTopicInfo) next).getPairingTopic(), false, 2, (Object) null)) {
                    break;
                }
            }
            objectRef.element = next;
            if (next != 0) {
                SessionTopicInfo sessionTopicInfo = (SessionTopicInfo) next;
                if (C33129mqd.OLrzqt((CharSequence) (sessionTopicInfo != null ? sessionTopicInfo.getTopic() : null))) {
                    C13982dcp c13982dcp = this.DbNXlk;
                    SessionTopicInfo sessionTopicInfo2 = (SessionTopicInfo) objectRef.element;
                    String topic = sessionTopicInfo2 != null ? sessionTopicInfo2.getTopic() : null;
                    if (topic == null) {
                        topic = "";
                    }
                    Wallet.Model.Session sessionAEQbTJ = c13982dcp.AEQbTJ(topic);
                    if (sessionAEQbTJ != null) {
                        String key = entry.getKey();
                        String pairingTopic = sessionAEQbTJ.getPairingTopic();
                        String topic2 = sessionAEQbTJ.getTopic();
                        Core.Model.AppMetaData metaData = sessionAEQbTJ.getMetaData();
                        String name = metaData != null ? metaData.getName() : null;
                        Core.Model.AppMetaData metaData2 = sessionAEQbTJ.getMetaData();
                        String url = metaData2 != null ? metaData2.getUrl() : null;
                        Core.Model.AppMetaData metaData3 = sessionAEQbTJ.getMetaData();
                        String description = metaData3 != null ? metaData3.getDescription() : null;
                        Core.Model.AppMetaData metaData4 = sessionAEQbTJ.getMetaData();
                        wCSessionMeta = new WCSessionMeta(key, pairingTopic, topic2, name, url, description, metaData4 != null ? metaData4.getIcons() : null);
                    }
                }
            }
        }
        return wCSessionMeta;
    }

    public final WCSessionMeta gEmmrt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String key = "";
        String topic = null;
        String pairingTopic = null;
        for (Map.Entry<String, List<SessionTopicInfo>> entry : this.values.copydefault().entrySet()) {
            Iterator<T> it = entry.getValue().iterator();
            while (true) {
                if (it.hasNext()) {
                    SessionTopicInfo sessionTopicInfo = (SessionTopicInfo) it.next();
                    if (Intrinsics.EZpvd((Object) sessionTopicInfo.getTopic(), (Object) str)) {
                        key = entry.getKey();
                        topic = sessionTopicInfo.getTopic();
                        break;
                    }
                    if (Intrinsics.EZpvd((Object) sessionTopicInfo.getPairingTopic(), (Object) str)) {
                        key = entry.getKey();
                        pairingTopic = sessionTopicInfo.getPairingTopic();
                        break;
                    }
                }
            }
        }
        if (topic != null) {
            Wallet.Model.Session sessionAEQbTJ = this.DbNXlk.AEQbTJ(topic);
            if (sessionAEQbTJ == null) {
                return null;
            }
            String str2 = key;
            String pairingTopic2 = sessionAEQbTJ.getPairingTopic();
            String topic2 = sessionAEQbTJ.getTopic();
            Core.Model.AppMetaData metaData = sessionAEQbTJ.getMetaData();
            String name = metaData != null ? metaData.getName() : null;
            Core.Model.AppMetaData metaData2 = sessionAEQbTJ.getMetaData();
            String url = metaData2 != null ? metaData2.getUrl() : null;
            Core.Model.AppMetaData metaData3 = sessionAEQbTJ.getMetaData();
            String description = metaData3 != null ? metaData3.getDescription() : null;
            Core.Model.AppMetaData metaData4 = sessionAEQbTJ.getMetaData();
            return new WCSessionMeta(str2, pairingTopic2, topic2, name, url, description, metaData4 != null ? metaData4.getIcons() : null);
        }
        if (pairingTopic != null) {
            Wallet.Model.SessionProposal sessionProposalValueOf = this.DbNXlk.valueOf(pairingTopic);
            if (sessionProposalValueOf == null) {
                return null;
            }
            String str3 = key;
            String pairingTopic3 = sessionProposalValueOf.getPairingTopic();
            String name2 = sessionProposalValueOf.getName();
            String url2 = sessionProposalValueOf.getUrl();
            String description2 = sessionProposalValueOf.getDescription();
            List<URI> icons = sessionProposalValueOf.getIcons();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(icons, 10));
            Iterator<T> it2 = icons.iterator();
            while (it2.hasNext()) {
                String string = ((URI) it2.next()).toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                arrayList.add(string);
            }
            return new WCSessionMeta(str3, pairingTopic3, null, name2, url2, description2, arrayList);
        }
        Wallet.Model.SessionProposal sessionProposalFetchVPNInfo = this.DbNXlk.fetchVPNInfo();
        if (sessionProposalFetchVPNInfo == null) {
            return null;
        }
        String str4 = key;
        String pairingTopic4 = sessionProposalFetchVPNInfo.getPairingTopic();
        String name3 = sessionProposalFetchVPNInfo.getName();
        String url3 = sessionProposalFetchVPNInfo.getUrl();
        String description3 = sessionProposalFetchVPNInfo.getDescription();
        List<URI> icons2 = sessionProposalFetchVPNInfo.getIcons();
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(icons2, 10));
        Iterator<T> it3 = icons2.iterator();
        while (it3.hasNext()) {
            String string2 = ((URI) it3.next()).toString();
            Intrinsics.checkNotNullExpressionValue(string2, "");
            arrayList2.add(string2);
        }
        return new WCSessionMeta(str4, pairingTopic4, null, name3, url3, description3, arrayList2);
    }

    public final Object copydefault(@NotNull String str, @NotNull Continuation<? super List<WCSessionMeta>> continuation) {
        return BuildersKt.withContext(Dispatchers.getDefault(), new WalletConnectUtils$getConnectedSessionDataByWalletIdSuspend$2(this, str, null), continuation);
    }

    public final List<WCSessionMeta> AhwBna(@NotNull String str) {
        WCSessionMeta wCSessionMeta;
        String name;
        Intrinsics.checkNotNullParameter(str, "");
        List<SessionTopicInfo> list = this.values.copydefault().get(str);
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (((SessionTopicInfo) obj).getTopic().length() > 0) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Wallet.Model.Session sessionAEQbTJ = this.DbNXlk.AEQbTJ(((SessionTopicInfo) it.next()).getTopic());
                if (sessionAEQbTJ != null) {
                    String pairingTopic = sessionAEQbTJ.getPairingTopic();
                    String topic = sessionAEQbTJ.getTopic();
                    Core.Model.AppMetaData metaData = sessionAEQbTJ.getMetaData();
                    String string = (metaData == null || (name = metaData.getName()) == null) ? null : StringsKt__StringsKt.hDKMBd((CharSequence) name).toString();
                    Core.Model.AppMetaData metaData2 = sessionAEQbTJ.getMetaData();
                    String url = metaData2 != null ? metaData2.getUrl() : null;
                    Core.Model.AppMetaData metaData3 = sessionAEQbTJ.getMetaData();
                    String description = metaData3 != null ? metaData3.getDescription() : null;
                    Core.Model.AppMetaData metaData4 = sessionAEQbTJ.getMetaData();
                    wCSessionMeta = new WCSessionMeta(str, pairingTopic, topic, string, url, description, metaData4 != null ? metaData4.getIcons() : null);
                } else {
                    wCSessionMeta = null;
                }
                if (wCSessionMeta != null) {
                    arrayList3.add(wCSessionMeta);
                }
            }
            arrayList = arrayList3;
        }
        return arrayList == null ? yDY.AhwBna() : arrayList;
    }

    public final PlatformItem OLrzqt(String str) {
        Core.Model.AppMetaData metaData;
        Wallet.Model.Session sessionAEQbTJ = this.DbNXlk.AEQbTJ(str);
        if (sessionAEQbTJ != null && (metaData = sessionAEQbTJ.getMetaData()) != null) {
            String str2 = (String) CollectionsKt___CollectionsKt.firstOrNull(metaData.getIcons());
            if (str2 == null) {
                str2 = "";
            }
            return new PlatformItem(0L, metaData.getName(), str2, (String) null, (String) null, (String) null, (List) null, (List) null, metaData.getUrl(), (String) null, 0L, 0, (String) null, (String) null, 16121, (DefaultConstructorMarker) null);
        }
        return new PlatformItem(0L, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, 0L, 0, (String) null, (String) null, 16383, (DefaultConstructorMarker) null);
    }

    public final android.app.Activity KWHzl() {
        return this.djBIcL.AEQbTJ();
    }

    public final String djBIcL(@NotNull String str) {
        Map<String, Wallet.Model.Namespace.Session> namespaces;
        Collection<Wallet.Model.Namespace.Session> collectionValues;
        Wallet.Model.Namespace.Session session;
        Intrinsics.checkNotNullParameter(str, "");
        Wallet.Model.Session sessionAEQbTJ = this.DbNXlk.AEQbTJ(str);
        return copydefault((sessionAEQbTJ == null || (namespaces = sessionAEQbTJ.getNamespaces()) == null || (collectionValues = namespaces.values()) == null || (session = (Wallet.Model.Namespace.Session) CollectionsKt___CollectionsKt.RcXXUw(collectionValues)) == null) ? null : session.getChains());
    }

    public final C10854bwM EZpvd(String str) {
        InterfaceC13987dcu interfaceC13987dcuAEQbTJ = InterfaceC13987dcu.Companion.AEQbTJ(str);
        Object obj = null;
        if (interfaceC13987dcuAEQbTJ == null) {
            return null;
        }
        Iterator<T> it = this.EZpvd.djBIcL().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C10854bwM) next).fetchVPNInfo() == interfaceC13987dcuAEQbTJ.OLrzqt()) {
                obj = next;
                break;
            }
        }
        C10854bwM c10854bwM = (C10854bwM) obj;
        return c10854bwM == null ? this.OLrzqt.AEQbTJ(interfaceC13987dcuAEQbTJ.OLrzqt()) : c10854bwM;
    }

    public final String AEQbTJ(String str) {
        C10854bwM c10854bwMEZpvd = EZpvd(str);
        if (c10854bwMEZpvd != null) {
            return c10854bwMEZpvd.djBIcL();
        }
        return null;
    }

    public final String copydefault(List<String> list) {
        String str;
        String strAEQbTJ = (list == null || (str = (String) CollectionsKt___CollectionsKt.firstOrNull(list)) == null) ? null : AEQbTJ(str);
        return strAEQbTJ == null ? "" : strAEQbTJ;
    }

    public final List<C10854bwM> KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Wallet.Model.Session sessionAEQbTJ = this.DbNXlk.AEQbTJ(str);
        if (sessionAEQbTJ == null) {
            return yDY.AhwBna();
        }
        Map<String, Wallet.Model.Namespace.Session> namespaces = sessionAEQbTJ.getNamespaces();
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, Wallet.Model.Namespace.Session>> it = namespaces.entrySet().iterator();
        while (it.hasNext()) {
            List<String> chains = it.next().getValue().getChains();
            if (chains == null) {
                chains = yDY.AhwBna();
            }
            C56406yEe.KWHzl(arrayList, chains);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C10854bwM c10854bwMEZpvd = EZpvd((String) it2.next());
            if (c10854bwMEZpvd != null) {
                arrayList2.add(c10854bwMEZpvd);
            }
        }
        return CollectionsKt___CollectionsKt.QbewEr(arrayList2);
    }

    public final List<C10854bwM> valueOf(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Wallet.Model.SessionProposal sessionProposalValueOf = this.DbNXlk.valueOf(str);
        if (sessionProposalValueOf == null) {
            return yDY.AhwBna();
        }
        List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((Collection) sessionProposalValueOf.getRequiredNamespaces().values(), (Iterable) sessionProposalValueOf.getOptionalNamespaces().values());
        ArrayList arrayList = new ArrayList();
        Iterator it = listDjBIcL.iterator();
        while (it.hasNext()) {
            List<String> chains = ((Wallet.Model.Namespace.Proposal) it.next()).getChains();
            if (chains == null) {
                chains = yDY.AhwBna();
            }
            C56406yEe.KWHzl(arrayList, chains);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C10854bwM c10854bwMEZpvd = EZpvd((String) it2.next());
            if (c10854bwMEZpvd != null) {
                arrayList2.add(c10854bwMEZpvd);
            }
        }
        return CollectionsKt___CollectionsKt.QbewEr(arrayList2);
    }

    public final InterfaceC13980dcn fARcdN(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.DbNXlk.values(str);
    }

    public final void EZpvd() {
        DappInteractionArgs dappInteractionArgs = this.KWHzl;
        if (dappInteractionArgs != null && this.AEQbTJ != null) {
            Activity activity = this.AYXKKw;
            Intrinsics.copydefault(dappInteractionArgs);
            String str = this.AEQbTJ;
            Intrinsics.copydefault((Object) str);
            Activity.operateHandleSendTransaction$default(activity, dappInteractionArgs, str, null, 4, null);
        }
        String str2 = this.isConnected;
        if (str2 == null || this.gEmmrt == null || this.valueOf == null) {
            return;
        }
        Activity activity2 = this.AYXKKw;
        Intrinsics.copydefault((Object) str2);
        Long l = this.gEmmrt;
        Intrinsics.copydefault(l);
        long jLongValue = l.longValue();
        WCEthereumSignMessage wCEthereumSignMessage = this.valueOf;
        Intrinsics.copydefault(wCEthereumSignMessage);
        activity2.AEQbTJ(str2, jLongValue, wCEthereumSignMessage);
    }

    public final void copydefault(@NotNull Context context, @NotNull ShowWCAuthRequestArgs showWCAuthRequestArgs) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(showWCAuthRequestArgs, "");
        InterfaceC9854bdT interfaceC9854bdT = this.fJNWhG;
        String walletId = showWCAuthRequestArgs.getWalletId();
        long generalChainId = showWCAuthRequestArgs.getGeneralChainId();
        String string = context.getString(C13754dXa.FragmentManager.DQzvGNdrmXxudrmXxu);
        Intrinsics.checkNotNullExpressionValue(string, "");
        PlatformItem platformItem = new PlatformItem(0L, string, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, showWCAuthRequestArgs.getUrl(), (String) null, 0L, C13754dXa.Activity.AxsJAYsNCnLh, (String) null, (String) null, 14077, (DefaultConstructorMarker) null);
        String data = showWCAuthRequestArgs.getMessage().getData();
        long requestId = showWCAuthRequestArgs.getRequestId();
        String data2 = showWCAuthRequestArgs.getMessage().getData();
        String issuer = showWCAuthRequestArgs.getIssuer();
        InterfaceC9854bdT.Application.startSignDapp$default(interfaceC9854bdT, context, new DappSignArgs(walletId, String.valueOf(generalChainId), platformItem, data, null, true, 5, "wallet_connect", Long.valueOf(requestId), null, false, false, DappSignArgs.SIGN_PERSONALMESSAGE, null, 0 == true ? 1 : 0, data2, issuer, null, false, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 4091408, null), null, null, 12, null);
    }

    public final List<C13983dcq> KWHzl(AbstractC12782ctV abstractC12782ctV) {
        List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((Collection) abstractC12782ctV.isConnected(), (Iterable) abstractC12782ctV.AxsJAYsNCnLh());
        ArrayList arrayList = new ArrayList();
        Iterator it = listDjBIcL.iterator();
        while (it.hasNext()) {
            C13983dcq c13983dcqOLrzqt = C13990dcx.OLrzqt((ChainAddress) it.next());
            if (c13983dcqOLrzqt != null) {
                arrayList.add(c13983dcqOLrzqt);
            }
        }
        return arrayList;
    }

    public final Long KWHzl(@NotNull String str, long j) {
        String chainId;
        InterfaceC13987dcu interfaceC13987dcuAEQbTJ;
        Intrinsics.checkNotNullParameter(str, "");
        Wallet.Model.SessionRequest sessionRequestCopydefault = this.DbNXlk.copydefault(str, j);
        if (sessionRequestCopydefault == null || (chainId = sessionRequestCopydefault.getChainId()) == null || (interfaceC13987dcuAEQbTJ = InterfaceC13987dcu.Companion.AEQbTJ(chainId)) == null) {
            return null;
        }
        return Long.valueOf(interfaceC13987dcuAEQbTJ.OLrzqt());
    }

    public final boolean AkhnZx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            new URL(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Serializable
    public static final class SessionTopicInfo {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final long expiryInSeconds;
        private final boolean isConnected;
        private final String pairingTopic;
        private final String topic;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SessionTopicInfo() {
            this((String) null, (String) null, false, 0L, 15, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SessionTopicInfo copy$default(SessionTopicInfo sessionTopicInfo, String str, String str2, boolean z, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sessionTopicInfo.pairingTopic;
            }
            if ((i & 2) != 0) {
                str2 = sessionTopicInfo.topic;
            }
            String str3 = str2;
            if ((i & 4) != 0) {
                z = sessionTopicInfo.isConnected;
            }
            boolean z2 = z;
            if ((i & 8) != 0) {
                j = sessionTopicInfo.expiryInSeconds;
            }
            return sessionTopicInfo.copy(str, str3, z2, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.pairingTopic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component3() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component4() {
            return this.expiryInSeconds;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionTopicInfo copy(@NotNull String str, @NotNull String str2, boolean z, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new SessionTopicInfo(str, str2, z, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionTopicInfo)) {
                return false;
            }
            SessionTopicInfo sessionTopicInfo = (SessionTopicInfo) obj;
            return Intrinsics.EZpvd((Object) this.pairingTopic, (Object) sessionTopicInfo.pairingTopic) && Intrinsics.EZpvd((Object) this.topic, (Object) sessionTopicInfo.topic) && this.isConnected == sessionTopicInfo.isConnected && this.expiryInSeconds == sessionTopicInfo.expiryInSeconds;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getExpiryInSeconds() {
            return this.expiryInSeconds;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPairingTopic() {
            return this.pairingTopic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTopic() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.pairingTopic.hashCode() * 31) + this.topic.hashCode()) * 31) + Boolean.hashCode(this.isConnected)) * 31) + Long.hashCode(this.expiryInSeconds);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isConnected() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionTopicInfo(pairingTopic=" + this.pairingTopic + ", topic=" + this.topic + ", isConnected=" + this.isConnected + ", expiryInSeconds=" + this.expiryInSeconds + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.WalletConnectUtils.SessionTopicInfo.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SessionTopicInfo> serializer() {
                return WalletConnectUtils$SessionTopicInfo$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SessionTopicInfo(int i, String str, String str2, boolean z, long j, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.pairingTopic = "";
            } else {
                this.pairingTopic = str;
            }
            if ((i & 2) == 0) {
                this.topic = "";
            } else {
                this.topic = str2;
            }
            if ((i & 4) == 0) {
                this.isConnected = false;
            } else {
                this.isConnected = z;
            }
            if ((i & 8) == 0) {
                this.expiryInSeconds = 0L;
            } else {
                this.expiryInSeconds = j;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SessionTopicInfo sessionTopicInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) sessionTopicInfo.pairingTopic, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 0, sessionTopicInfo.pairingTopic);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) sessionTopicInfo.topic, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 1, sessionTopicInfo.topic);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || sessionTopicInfo.isConnected) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 2, sessionTopicInfo.isConnected);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && sessionTopicInfo.expiryInSeconds == 0) {
                return;
            }
            compositeEncoder.encodeLongElement(serialDescriptor, 3, sessionTopicInfo.expiryInSeconds);
        }

        public SessionTopicInfo(@NotNull String str, @NotNull String str2, boolean z, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.pairingTopic = str;
            this.topic = str2;
            this.isConnected = z;
            this.expiryInSeconds = j;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r8v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r8v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r4v0 java.lang.String) : (""))
  (wrap:boolean:0x0014: TERNARY null = ((wrap:int:0x000f: ARITH (r8v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0015: ARITH (r8v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r6v0 long))
 A[MD:(java.lang.String, java.lang.String, boolean, long):void (m)] (LINE:1456) call: com.okinc.business.defi.wallet.common.WalletConnectUtils.SessionTopicInfo.<init>(java.lang.String, java.lang.String, boolean, long):void type: THIS */
        public /* synthetic */ SessionTopicInfo(String str, String str2, boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? false : z, (i & 8) != 0 ? 0L : j);
        }
    }

    @Serializable
    public static final class OriginFromInfo {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String originFrom;
        private final String pairingTopic;
        private final String sessionTopic;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public OriginFromInfo() {
            this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ OriginFromInfo copy$default(OriginFromInfo originFromInfo, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = originFromInfo.pairingTopic;
            }
            if ((i & 2) != 0) {
                str2 = originFromInfo.sessionTopic;
            }
            if ((i & 4) != 0) {
                str3 = originFromInfo.originFrom;
            }
            return originFromInfo.copy(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.pairingTopic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.sessionTopic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.originFrom;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OriginFromInfo copy(@NotNull String str, @NotNull String str2, String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new OriginFromInfo(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OriginFromInfo)) {
                return false;
            }
            OriginFromInfo originFromInfo = (OriginFromInfo) obj;
            return Intrinsics.EZpvd((Object) this.pairingTopic, (Object) originFromInfo.pairingTopic) && Intrinsics.EZpvd((Object) this.sessionTopic, (Object) originFromInfo.sessionTopic) && Intrinsics.EZpvd((Object) this.originFrom, (Object) originFromInfo.originFrom);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getOriginFrom() {
            return this.originFrom;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPairingTopic() {
            return this.pairingTopic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSessionTopic() {
            return this.sessionTopic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.pairingTopic.hashCode();
            int iHashCode2 = this.sessionTopic.hashCode();
            String str = this.originFrom;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "OriginFromInfo(pairingTopic=" + this.pairingTopic + ", sessionTopic=" + this.sessionTopic + ", originFrom=" + this.originFrom + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.WalletConnectUtils.OriginFromInfo.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<OriginFromInfo> serializer() {
                return WalletConnectUtils$OriginFromInfo$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ OriginFromInfo(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.pairingTopic = "";
            } else {
                this.pairingTopic = str;
            }
            if ((i & 2) == 0) {
                this.sessionTopic = "";
            } else {
                this.sessionTopic = str2;
            }
            if ((i & 4) == 0) {
                this.originFrom = null;
            } else {
                this.originFrom = str3;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(OriginFromInfo originFromInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) originFromInfo.pairingTopic, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 0, originFromInfo.pairingTopic);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) originFromInfo.sessionTopic, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 1, originFromInfo.sessionTopic);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && originFromInfo.originFrom == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, originFromInfo.originFrom);
        }

        public OriginFromInfo(@NotNull String str, @NotNull String str2, String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.pairingTopic = str;
            this.sessionTopic = str2;
            this.originFrom = str3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1465) call: com.okinc.business.defi.wallet.common.WalletConnectUtils.OriginFromInfo.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ OriginFromInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3);
        }
    }

    public interface TaskDescription {

        public static final class StateListAnimator implements TaskDescription {
            public static final StateListAnimator copydefault = new StateListAnimator();

            private StateListAnimator() {
            }
        }

        public static final class Activity implements TaskDescription {
            public static final Activity EZpvd = new Activity();

            private Activity() {
            }
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.common.WalletConnectUtils$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public static final class C0252TaskDescription implements TaskDescription {
            public final ShowWCAuthRequestArgs EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0252TaskDescription copy$default(C0252TaskDescription c0252TaskDescription, ShowWCAuthRequestArgs showWCAuthRequestArgs, int i, Object obj) {
                if ((i & 1) != 0) {
                    showWCAuthRequestArgs = c0252TaskDescription.EZpvd;
                }
                return c0252TaskDescription.EZpvd(showWCAuthRequestArgs);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ShowWCAuthRequestArgs EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0252TaskDescription EZpvd(@NotNull ShowWCAuthRequestArgs showWCAuthRequestArgs) {
                Intrinsics.checkNotNullParameter(showWCAuthRequestArgs, "");
                return new C0252TaskDescription(showWCAuthRequestArgs);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0252TaskDescription) && Intrinsics.EZpvd(this.EZpvd, ((C0252TaskDescription) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Success(data=" + this.EZpvd + ")";
            }

            public C0252TaskDescription(@NotNull ShowWCAuthRequestArgs showWCAuthRequestArgs) {
                Intrinsics.checkNotNullParameter(showWCAuthRequestArgs, "");
                this.EZpvd = showWCAuthRequestArgs;
            }
        }
    }

    public final void OLrzqt(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull String str) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(str, "");
        for (StateListAnimator stateListAnimator : this.fIwbmz) {
            Intrinsics.copydefault(stateListAnimator);
            stateListAnimator.KWHzl(str);
        }
        this.DbNXlk.KWHzl(str, abstractC12782ctV.DbNXlk(), KWHzl(abstractC12782ctV));
    }
}
