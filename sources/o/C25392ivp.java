package o;

import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.share.Web3ShareService;
import com.okinc.business.defi.share.bean.Web3ShareModel;
import com.okinc.business.dexlogic.bean.MemeTradePnLShareBean;
import com.okinc.business.dexlogic.bean.ShareLinkVO;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.wallet.api.WalletReferralSource;
import java.math.BigDecimal;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ivp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25392ivp {

    /* JADX INFO: renamed from: o.ivp$ActionBar */
    public static final class ActionBar extends TypeToken<ShareLinkVO> {
    }

    /* JADX INFO: renamed from: o.ivp$Application */
    public static final class Application extends TypeToken<ShareLinkVO> {
    }

    /* JADX INFO: renamed from: o.ivp$TaskDescription */
    public static final class TaskDescription extends TypeToken<MemeTradePnLShareBean> {
    }

    public static final java.lang.String copydefault(java.lang.Float f) {
        if (f == null || java.lang.Float.isNaN(f.floatValue())) {
            return "--";
        }
        return C23311hvo.formatPercentWithoutSymbol$default(C33129mqd.copydefault(java.lang.Integer.valueOf(C33129mqd.AhwBna(f)), java.lang.Integer.valueOf(C33129mqd.AhwBna("100"))) ? "100" : f.toString(), false, 0, new BigDecimal(0.01d), true, null, 19, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.defi.share.bean.Web3ShareModel.Application.createShareLinkByModelId$default(com.okinc.business.defi.share.bean.Web3ShareModel$Application, java.lang.String, java.util.Map, java.lang.String, java.lang.String, com.okinc.business.defi.share.bean.Web3ShareLinkInfo, java.lang.String, com.okinc.wallet.api.WalletReferralSource, int, java.lang.Object):com.okinc.business.defi.share.bean.Web3ShareModel */
    public static final <T extends AbstractActivityC33041mov> void KWHzl(@NotNull T t, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        java.util.Map mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("chainId", str), C56390yDp.OLrzqt("tokenContractAddress", str2));
        java.lang.String string = t.getString(C23274hvD.Fragment.zDUObI);
        Intrinsics.checkNotNullExpressionValue(string, "");
        ((Web3ShareService) C43248rlh.KWHzl.AEQbTJ(Web3ShareService.class)).share(t, Web3ShareModel.Companion.OLrzqt("1", (80 & 2) != 0 ? null : mapGEmmrt, (80 & 4) != 0 ? null : string, str3, (80 & 16) != 0 ? null : null, str4, (80 & 64) != 0 ? null : null), new StateListAnimator(t));
    }

    /* JADX INFO: renamed from: o.ivp$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC13655dTj {

        /* JADX INFO: Incorrect field signature: TT; */
        public final /* synthetic */ AbstractActivityC33041mov KWHzl;

        /* JADX WARN: Incorrect types in method signature: (TT;)V */
        public StateListAnimator(AbstractActivityC33041mov abstractActivityC33041mov) {
            this.KWHzl = abstractActivityC33041mov;
        }

        @Override // o.InterfaceC13655dTj
        public void copydefault() {
            this.KWHzl.showLoadingAtOnce();
        }

        @Override // o.InterfaceC13655dTj
        public void AEQbTJ() {
            this.KWHzl.dismissLoading();
        }
    }

    public static /* synthetic */ void loadImageBitmap$default(android.widget.ImageView imageView, java.lang.String str, AbstractC5396Qc[] abstractC5396QcArr, android.graphics.drawable.Drawable drawable, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            drawable = null;
        }
        AEQbTJ(imageView, str, abstractC5396QcArr, drawable, (Function2<? super android.graphics.Bitmap, ? super java.lang.Throwable, Unit>) function2);
    }

    public static final void AEQbTJ(@NotNull android.widget.ImageView imageView, @NotNull java.lang.String str, @NotNull AbstractC5396Qc[] abstractC5396QcArr, android.graphics.drawable.Drawable drawable, @NotNull Function2<? super android.graphics.Bitmap, ? super java.lang.Throwable, Unit> function2) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC5396QcArr, "");
        Intrinsics.checkNotNullParameter(function2, "");
        C5335Nt c5335NtOLrzqt = Glide.AEQbTJ(imageView.getContext()).EZpvd().copydefault(str).AEQbTJ(drawable).OLrzqt((RY) new Activity(str, function2));
        Intrinsics.checkNotNullExpressionValue(c5335NtOLrzqt, "");
        if (!(abstractC5396QcArr.length == 0)) {
            C5448Sc c5448ScAEQbTJ = new C5448Sc().AEQbTJ((NN<android.graphics.Bitmap>[]) java.util.Arrays.copyOf(abstractC5396QcArr, abstractC5396QcArr.length));
            Intrinsics.checkNotNullExpressionValue(c5448ScAEQbTJ, "");
            c5335NtOLrzqt = c5335NtOLrzqt.OLrzqt((RX<?>) c5448ScAEQbTJ);
        }
        c5335NtOLrzqt.EZpvd(imageView);
    }

    /* JADX INFO: renamed from: o.ivp$Activity */
    public static final class Activity implements RY<android.graphics.Bitmap> {
        public final /* synthetic */ Function2<android.graphics.Bitmap, java.lang.Throwable, Unit> AEQbTJ;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super android.graphics.Bitmap, ? super java.lang.Throwable, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(java.lang.String str, Function2<? super android.graphics.Bitmap, ? super java.lang.Throwable, Unit> function2) {
            this.copydefault = str;
            this.AEQbTJ = function2;
        }

        @Override // o.RY
        public boolean OLrzqt(GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.Bitmap> interfaceC5462Sq, boolean z) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(interfaceC5462Sq, "");
            pUU.copydefault("loadImageBitmap", this.copydefault + " failed: " + (glideException != null ? glideException.getMessage() : null));
            this.AEQbTJ.invoke(null, glideException);
            return true;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
        @Override // o.RY
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean copydefault(android.graphics.Bitmap bitmap, java.lang.Object obj, InterfaceC5462Sq<android.graphics.Bitmap> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
            Intrinsics.checkNotNullParameter(bitmap, "");
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(interfaceC5462Sq, "");
            Intrinsics.checkNotNullParameter(dataSource, "");
            this.AEQbTJ.invoke(bitmap, null);
            return false;
        }
    }

    public static /* synthetic */ void shareTokenDetailsPosterByMiniProgram$default(AbstractActivityC33041mov abstractActivityC33041mov, java.lang.String str, java.lang.String str2, C22398hec c22398hec, InterfaceC13655dTj interfaceC13655dTj, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            interfaceC13655dTj = null;
        }
        AEQbTJ(abstractActivityC33041mov, str, str2, c22398hec, interfaceC13655dTj);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071 A[Catch: all -> 0x014c, CancellationException -> 0x0162, TryCatch #3 {CancellationException -> 0x0162, all -> 0x014c, blocks: (B:7:0x0025, B:9:0x0031, B:17:0x005e, B:22:0x006d, B:24:0x0071, B:29:0x007c, B:35:0x0088, B:38:0x009b, B:39:0x00c6, B:41:0x00ce, B:42:0x0105, B:44:0x0111, B:45:0x0118, B:20:0x0065, B:16:0x0054), top: B:56:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c A[Catch: all -> 0x014c, CancellationException -> 0x0162, TryCatch #3 {CancellationException -> 0x0162, all -> 0x014c, blocks: (B:7:0x0025, B:9:0x0031, B:17:0x005e, B:22:0x006d, B:24:0x0071, B:29:0x007c, B:35:0x0088, B:38:0x009b, B:39:0x00c6, B:41:0x00ce, B:42:0x0105, B:44:0x0111, B:45:0x0118, B:20:0x0065, B:16:0x0054), top: B:56:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends AbstractActivityC33041mov> void AEQbTJ(@NotNull T t, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull C22398hec c22398hec, InterfaceC13655dTj interfaceC13655dTj) {
        java.lang.Object objM7377constructorimpl;
        java.lang.String strOLrzqt;
        java.lang.Object objM7377constructorimpl2;
        java.lang.String deeplink;
        java.lang.String webUrl;
        java.lang.String strOLrzqt2 = "";
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(c22398hec, "");
        if (C7863arp.KWHzl(t)) {
            if (c22398hec.EZpvd() == null) {
                pUU.copydefault("shareTokenDetailsPosterByMiniProgram", "token info is null: " + str + ", " + str2);
                KWHzl(t, str, str2, "DEX_Market_Tokendetail", c22398hec.OLrzqt());
                return;
            }
            try {
                Result.Application application = Result.Companion;
            } catch (CancellationException e) {
                throw e;
            } catch (java.lang.Throwable th) {
                pUU.AEQbTJ("DEX", "dexRunCatching", th);
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (c22398hec.EZpvd().has("shareLinkVO")) {
                JsonElement jsonElement = c22398hec.EZpvd().get("shareLinkVO");
                if (jsonElement == null) {
                    objM7377constructorimpl2 = null;
                    ShareLinkVO shareLinkVO = (ShareLinkVO) objM7377constructorimpl2;
                    deeplink = shareLinkVO != null ? shareLinkVO.getDeeplink() : null;
                    if (deeplink == null) {
                        deeplink = "";
                    }
                    webUrl = shareLinkVO != null ? shareLinkVO.getWebUrl() : null;
                    if (webUrl != null) {
                        strOLrzqt2 = webUrl;
                    }
                    strOLrzqt = strOLrzqt2;
                    strOLrzqt2 = deeplink;
                } else {
                    try {
                        objM7377constructorimpl2 = Result.m7377constructorimpl(C23316hvt.KWHzl().fromJson(jsonElement, new Application().getType()));
                    } catch (java.lang.Throwable th2) {
                        Result.Application application3 = Result.Companion;
                        objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
                    }
                    java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
                    if (thM7380exceptionOrNullimpl == null) {
                        ShareLinkVO shareLinkVO2 = (ShareLinkVO) objM7377constructorimpl2;
                        if (shareLinkVO2 != null) {
                        }
                        if (deeplink == null) {
                        }
                        if (shareLinkVO2 != null) {
                        }
                        if (webUrl != null) {
                        }
                        strOLrzqt = strOLrzqt2;
                        strOLrzqt2 = deeplink;
                    } else {
                        pUU.AEQbTJ("JsonExt", "fromJson parse error", thM7380exceptionOrNullimpl);
                        objM7377constructorimpl2 = null;
                        ShareLinkVO shareLinkVO22 = (ShareLinkVO) objM7377constructorimpl2;
                        if (shareLinkVO22 != null) {
                        }
                        if (deeplink == null) {
                        }
                        if (shareLinkVO22 != null) {
                        }
                        if (webUrl != null) {
                        }
                        strOLrzqt = strOLrzqt2;
                        strOLrzqt2 = deeplink;
                    }
                }
                Result.m7376boximpl(objM7377constructorimpl);
            }
            strOLrzqt = "";
            if (strOLrzqt2.length() == 0) {
                gKZ gkz = gKZ.EZpvd;
                strOLrzqt2 = gkz.OLrzqt(gkz.KWHzl("dex/coin/detail"), C56390yDp.OLrzqt("chainId", str), C56390yDp.OLrzqt("tokenContractAddress", str2), C56390yDp.OLrzqt("from_module", "market_token"), C56390yDp.OLrzqt("from_channel_id", "none"));
            }
            java.lang.String str3 = strOLrzqt2;
            if (strOLrzqt.length() == 0) {
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.vLaW);
                strOLrzqt = gKZ.EZpvd.OLrzqt(strAYXKKw + "/detail/" + str + "/" + str2, C56390yDp.OLrzqt("from_module", "market_token"), C56390yDp.OLrzqt("from_channel_id", "none"));
            }
            java.lang.String str4 = strOLrzqt;
            if (!c22398hec.EZpvd().has("chainId")) {
                c22398hec.EZpvd().addProperty("chainId", str);
            }
            ((Web3ShareService) C43248rlh.KWHzl.AEQbTJ(Web3ShareService.class)).share(t, Web3ShareModel.Companion.AEQbTJ(str4, str3, "DEX_Market_Tokendetail", dTJ.Companion.KWHzl("dex_token_share", 1, c22398hec.copydefault(), t.getLifecycle()), c22398hec.OLrzqt(), WalletReferralSource.TOKEN_INFO), interfaceC13655dTj);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            Result.m7376boximpl(objM7377constructorimpl);
        }
    }

    public static final <T extends androidx.fragment.app.Fragment> void AEQbTJ(@NotNull final T t, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final C22338hdV c22338hdV) {
        java.lang.String str4;
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(c22338hdV, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "DEX_Trade_CEFI")) {
            str4 = "advanced_mode_pnl";
        } else {
            Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "DEX_Trade_MEME");
            str4 = "meme_mode_pnl";
        }
        kotlin.Pair[] pairArr = {C56390yDp.OLrzqt("chainId", str), C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, ""), C56390yDp.OLrzqt("from_module", str4), C56390yDp.OLrzqt("from_channel_id", "none")};
        gKZ gkz = gKZ.EZpvd;
        java.lang.String strKWHzl = gkz.KWHzl("dex/meme/swap");
        C56533yIx c56533yIx = new C56533yIx(3);
        c56533yIx.EZpvd(pairArr);
        c56533yIx.copydefault(C56390yDp.OLrzqt("tokenContractAddress", str2));
        c56533yIx.copydefault(C56390yDp.OLrzqt("transaction_direction", 0));
        final java.lang.String strOLrzqt = gkz.OLrzqt(strKWHzl, (kotlin.Pair[]) c56533yIx.copydefault((java.lang.Object[]) new kotlin.Pair[c56533yIx.KWHzl()]));
        java.lang.String strKWHzl2 = gkz.KWHzl("dex/advanced/buy");
        C56533yIx c56533yIx2 = new C56533yIx(2);
        c56533yIx2.EZpvd(pairArr);
        c56533yIx2.copydefault(C56390yDp.OLrzqt("buyTokenContractAddress", str2));
        final java.lang.String strOLrzqt2 = gkz.OLrzqt(strKWHzl2, (kotlin.Pair[]) c56533yIx2.copydefault((java.lang.Object[]) new kotlin.Pair[c56533yIx2.KWHzl()]));
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) CollectionsKt___CollectionsKt.AkhnZx(((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).gEmmrt().copydefault(), 0);
        java.lang.String strEZpvd = interfaceC9738bbJ != null ? interfaceC9738bbJ.EZpvd(C33129mqd.valueOf(str)) : null;
        java.lang.String str5 = strEZpvd == null ? "" : strEZpvd;
        java.lang.String strDbNXlk = interfaceC9738bbJ != null ? interfaceC9738bbJ.DbNXlk() : null;
        java.lang.String str6 = strDbNXlk == null ? "" : strDbNXlk;
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(C58156yvv.EZpvd(C33024moe.KWHzl((AbstractC58185ywX) InterfaceC23229huL.Companion.EZpvd(C23222huE.AEQbTJ).copydefault(str, str2, str5, str6, 1)), t), (Function1) null, 1, (java.lang.Object) null);
        final java.lang.String str7 = str6;
        final Function1 function1 = new Function1() { // from class: o.ivs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25392ivp.EZpvd(c22338hdV, str, str3, strOLrzqt2, strOLrzqt, str2, t, str7, (JsonObject) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ivq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C25392ivp.djBIcL(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.ivx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25392ivp.EZpvd(c22338hdV, str, str3, strOLrzqt2, strOLrzqt, str2, t, str7, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXUnwrapResponseData$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ivw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C25392ivp.gEmmrt(function12, obj);
            }
        });
    }

    public static /* synthetic */ void shareTradePnL$callShare$default(C22338hdV c22338hdV, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, androidx.fragment.app.Fragment fragment, java.lang.String str6, java.util.List list, java.lang.String str7, ShareLinkVO shareLinkVO, java.util.List list2, int i, java.lang.Object obj) {
        KWHzl(c22338hdV, str, str2, str3, str4, str5, fragment, str6, (i & 256) != 0 ? null : list, (i & 512) != 0 ? "" : str7, (i & 1024) != 0 ? null : shareLinkVO, (i & 2048) != 0 ? null : list2);
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C22338hdV c22338hdV, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, androidx.fragment.app.Fragment fragment, java.lang.String str6, java.lang.Throwable th) {
        pUU.copydefault("shareMemePoster getPnlShareInfo error: " + th.getMessage());
        shareTradePnL$callShare$default(c22338hdV, str, str2, str3, str4, str5, fragment, str6, null, null, null, null, 3840, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.String] */
    public static final <T extends androidx.fragment.app.Fragment> void copydefault(@NotNull final T t, @NotNull final java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        gKZ gkz = gKZ.EZpvd;
        objectRef.element = gkz.OLrzqt(gkz.KWHzl("dex/coin/detail"), C56390yDp.OLrzqt("chainId", str), C56390yDp.OLrzqt("tokenContractAddress", str2), C56390yDp.OLrzqt("from_module", "market_pnl"), C56390yDp.OLrzqt("from_channel_id", "none"));
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.vLaW);
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = gkz.OLrzqt(strAYXKKw + "/detail/" + str + "/" + str2, C56390yDp.OLrzqt("from_module", "market_pnl"), C56390yDp.OLrzqt("from_channel_id", "none"));
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) CollectionsKt___CollectionsKt.AkhnZx(((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).gEmmrt().copydefault(), 0);
        java.lang.String strEZpvd = interfaceC9738bbJ != null ? interfaceC9738bbJ.EZpvd(C33129mqd.valueOf(str)) : null;
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        java.lang.String strDbNXlk = interfaceC9738bbJ != null ? interfaceC9738bbJ.DbNXlk() : null;
        java.lang.String str3 = strDbNXlk == null ? "" : strDbNXlk;
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(C58156yvv.EZpvd(C33024moe.KWHzl((AbstractC58185ywX) InterfaceC23229huL.Companion.EZpvd(C23222huE.AEQbTJ).copydefault(str, str2, strEZpvd, str3, 2)), t), (Function1) null, 1, (java.lang.Object) null);
        final java.lang.String str4 = "DEX_Market_PnL";
        final java.lang.String str5 = str3;
        final Function1 function1 = new Function1() { // from class: o.ivl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25392ivp.AEQbTJ(str, t, str4, objectRef2, objectRef, str5, (JsonObject) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ivt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C25392ivp.AEQbTJ(function1, obj);
            }
        };
        final java.lang.String str6 = "DEX_Market_PnL";
        final java.lang.String str7 = str3;
        final Function1 function12 = new Function1() { // from class: o.ivu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25392ivp.copydefault(t, objectRef2, objectRef, str6, str7, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXUnwrapResponseData$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ivr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C25392ivp.AYXKKw(function12, obj);
            }
        });
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(java.lang.String str, androidx.fragment.app.Fragment fragment, java.lang.String str2, final Ref.ObjectRef objectRef, final Ref.ObjectRef objectRef2, java.lang.String str3, JsonObject jsonObject) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(jsonObject, "");
        if (!jsonObject.has("chainId")) {
            jsonObject.addProperty("chainId", str);
        }
        if (jsonObject.has("shareLinkVO")) {
            JsonElement jsonElement = jsonObject.get("shareLinkVO");
            if (jsonElement == null) {
                objM7377constructorimpl = null;
                ShareLinkVO shareLinkVO = (ShareLinkVO) objM7377constructorimpl;
                C31256lqb.EZpvd(shareLinkVO == null ? shareLinkVO.getDeeplink() : null, new Function1() { // from class: o.ivv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C25392ivp.copydefault(objectRef2, (java.lang.String) obj);
                    }
                });
                C31256lqb.EZpvd(shareLinkVO != null ? shareLinkVO.getWebUrl() : null, new Function1() { // from class: o.ivy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C25392ivp.EZpvd(objectRef, (java.lang.String) obj);
                    }
                });
            } else {
                try {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C23316hvt.KWHzl().fromJson(jsonElement, new ActionBar().getType()));
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("JsonExt", "fromJson parse error", thM7380exceptionOrNullimpl);
                    objM7377constructorimpl = null;
                }
                ShareLinkVO shareLinkVO2 = (ShareLinkVO) objM7377constructorimpl;
                C31256lqb.EZpvd(shareLinkVO2 == null ? shareLinkVO2.getDeeplink() : null, new Function1() { // from class: o.ivv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C25392ivp.copydefault(objectRef2, (java.lang.String) obj);
                    }
                });
                C31256lqb.EZpvd(shareLinkVO2 != null ? shareLinkVO2.getWebUrl() : null, new Function1() { // from class: o.ivy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C25392ivp.EZpvd(objectRef, (java.lang.String) obj);
                    }
                });
            }
        }
        Web3ShareService.Application.shareByMiniProgram$default((Web3ShareService) C43248rlh.KWHzl.AEQbTJ(Web3ShareService.class), fragment, str2, "dex_market_pnl", 1, (java.lang.String) objectRef.element, (java.lang.String) objectRef2.element, C33129mqd.gEmmrt(jsonObject), str3, null, WalletReferralSource.MARKET_PNL, 256, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(Ref.ObjectRef objectRef, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        objectRef.element = str;
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(Ref.ObjectRef objectRef, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        objectRef.element = str;
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r10v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(androidx.fragment.app.Fragment fragment, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        pUU.copydefault("shareMarketPnL getPnlShareInfo error: " + th.getMessage());
        if (fragment.getActivity() instanceof AbstractActivityC33041mov) {
            Web3ShareModel web3ShareModelEZpvd = Web3ShareModel.Companion.EZpvd((java.lang.String) objectRef.element, (java.lang.String) objectRef2.element, str, (40 & 8) != 0 ? null : null, str2, (40 & 32) != 0 ? null : null);
            Web3ShareService web3ShareService = (Web3ShareService) C43248rlh.KWHzl.AEQbTJ(Web3ShareService.class);
            FragmentActivity activity = fragment.getActivity();
            Intrinsics.copydefault(activity, "");
            Web3ShareService.Application.share$default(web3ShareService, (AbstractActivityC33041mov) activity, web3ShareModelEZpvd, null, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static final <T extends androidx.fragment.app.Fragment> void KWHzl(C22338hdV c22338hdV, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, T t, java.lang.String str6, java.util.List<? extends java.lang.Object> list, java.lang.String str7, ShareLinkVO shareLinkVO, java.util.List<java.lang.String> list2) {
        java.lang.String str8;
        WalletReferralSource walletReferralSource;
        try {
            Result.Application application = Result.Companion;
            MemeTradePnLShareBean memeTradePnLShareBean = new MemeTradePnLShareBean(c22338hdV.KWHzl(), c22338hdV.AEQbTJ(), c22338hdV.EZpvd(), c22338hdV.AYXKKw(), c22338hdV.valueOf(), c22338hdV.copydefault(), c22338hdV.OLrzqt(), list, str, str7, null, list2, 1024, null);
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "DEX_Trade_CEFI")) {
                str8 = str3;
            } else {
                Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "DEX_Trade_MEME");
                str8 = str4;
            }
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "DEX_Trade_CEFI")) {
                walletReferralSource = WalletReferralSource.ADVANCED_MODE_PNL;
            } else {
                walletReferralSource = Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "DEX_Trade_MEME") ? WalletReferralSource.MEME_MODE_PNL : WalletReferralSource.MEME_MODE_PNL;
            }
            WalletReferralSource walletReferralSource2 = walletReferralSource;
            java.lang.String webUrl = shareLinkVO != null ? shareLinkVO.getWebUrl() : null;
            if (webUrl == null || webUrl.length() == 0) {
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.vLaW);
                webUrl = gKZ.EZpvd.OLrzqt(strAYXKKw + "/detail/" + str + "/" + str5, C56390yDp.OLrzqt("from_module", "meme_mode_pnl"), C56390yDp.OLrzqt("from_channel_id", "none"));
            }
            Web3ShareService.Application.shareByMiniProgram$default((Web3ShareService) C43248rlh.KWHzl.AEQbTJ(Web3ShareService.class), t, str2, "dex_trade_pnl", 1, webUrl, str8, C33488mxR.EZpvd(memeTradePnLShareBean), str6, null, walletReferralSource2, 256, null);
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public static final Unit EZpvd(C22338hdV c22338hdV, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, androidx.fragment.app.Fragment fragment, java.lang.String str6, JsonObject jsonObject) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(jsonObject, "");
        try {
            Result.Application application = Result.Companion;
            try {
                objM7377constructorimpl = Result.m7377constructorimpl(C23316hvt.KWHzl().fromJson(jsonObject, new TaskDescription().getType()));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("JsonExt", "fromJson parse error", thM7380exceptionOrNullimpl);
                objM7377constructorimpl = null;
            }
            MemeTradePnLShareBean memeTradePnLShareBean = (MemeTradePnLShareBean) objM7377constructorimpl;
            KWHzl(c22338hdV, str, str2, str3, str4, str5, fragment, str6, memeTradePnLShareBean != null ? memeTradePnLShareBean.getKLinesData() : null, memeTradePnLShareBean != null ? memeTradePnLShareBean.getTwitterAvatar() : null, memeTradePnLShareBean != null ? memeTradePnLShareBean.getShareLinkVO() : null, memeTradePnLShareBean != null ? memeTradePnLShareBean.getShareIcon() : null);
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th2) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th2);
            Result.Application application3 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        return Unit.INSTANCE;
    }
}
