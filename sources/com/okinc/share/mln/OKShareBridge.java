package com.okinc.share.mln;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.immomo.mls.fun.ud.UDStyleString;
import com.immomo.mls.fun.ud.view.UDViewGroup;
import com.immomo.mls.fun.ui.custom.data.JDImageInfo;
import com.okinc.biz.share.ShareFileProvider;
import com.okinc.rxutils.RxBus;
import com.okinc.share.api.RedirectBehavior;
import com.okinc.share.api.preview.PreviewBottomTipsMode;
import com.okinc.share.bean.ImagePreviewType;
import com.okinc.share.bean.MultiShareConfig;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.ShareFooterInfo;
import com.okinc.share.bean.image.ImageCustomLuaPreviewConfig;
import com.okinc.share.bean.image.ImageDefaultPreviewConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.share.bean.image.ImageSource;
import com.okinc.share.bean.link.LinkDefaultPreviewConfig;
import com.okinc.share.bean.link.LinkShareParams;
import com.okinc.share.mln.OKShareBridge;
import com.okinc.share.mln.bean.LuaImagePreviewBuildType;
import com.okinc.share.mln.bean.LuaImagePreviewType;
import com.okinc.share.mln.bean.LuaShareContentType;
import com.okinc.share.platforms.SharePlatform;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.AbstractActivityC33041mov;
import o.AbstractC58185ywX;
import o.C33024moe;
import o.C33487mxQ;
import o.C33569myt;
import o.C33570myu;
import o.C43248rlh;
import o.C48887ueE;
import o.C48891ueI;
import o.C49036ugv;
import o.C49040ugz;
import o.C49045uhD;
import o.C49046uhE;
import o.C49286ulg;
import o.C55326xho;
import o.C58156yvv;
import o.C7322ahe;
import o.C7323ahf;
import o.C7869arv;
import o.C7872ary;
import o.C7910asj;
import o.InterfaceC48892ueJ;
import o.InterfaceC48893ueK;
import o.InterfaceC48901ueS;
import o.InterfaceC49121uia;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC7855arh;
import o.pUU;
import org.json.JSONException;
import org.json.JSONObject;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes11.dex */
@LuaClass
public class OKShareBridge {
    public Globals AEQbTJ;
    public LuaFunction EZpvd;
    public InterfaceC58217yxC KWHzl = RxBus.KWHzl(C49286ulg.class, new String[0]).AEQbTJ(new InterfaceC58227yxM() { // from class: o.uhQ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58227yxM
        public final void accept(java.lang.Object obj) throws java.lang.Exception {
            this.EZpvd.OLrzqt((C49286ulg) obj);
        }
    }, new InterfaceC58227yxM() { // from class: o.uhP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58227yxM
        public final void accept(java.lang.Object obj) throws java.lang.Exception {
            OKShareBridge.EZpvd((java.lang.Throwable) obj);
        }
    });
    public LuaFunction OLrzqt;
    public LuaFunction copydefault;
    public LuaFunction djBIcL;

    public static /* synthetic */ Unit AEQbTJ(MultiShareConfig multiShareConfig) {
        return null;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: RETURN  */
    public static /* synthetic */ void EZpvd(Throwable th) throws Exception {
    }

    public static /* synthetic */ Unit copydefault(ImageCustomLuaPreviewConfig imageCustomLuaPreviewConfig) {
        return null;
    }

    public OKShareBridge(@NonNull Globals globals, @NonNull LuaValue[] luaValueArr) {
        this.AEQbTJ = globals;
    }

    public final /* synthetic */ void OLrzqt(C49286ulg c49286ulg) throws Exception {
        LuaValue[] luaValueArrCopydefault = copydefault(c49286ulg);
        LuaFunction luaFunction = this.EZpvd;
        if (luaFunction != null) {
            luaFunction.invoke(luaValueArrCopydefault);
        }
    }

    public final LuaValue[] copydefault(C49286ulg c49286ulg) {
        return LuaValue.varargsOf(LuaNumber.valueOf(!TextUtils.equals(c49286ulg.EZpvd(), "true") ? 1 : 0), LuaString.copydefault(c49286ulg.AEQbTJ()));
    }

    public final LuaValue[] EZpvd(String str, int i) {
        return LuaValue.varargsOf(LuaNumber.valueOf(i), LuaString.copydefault(str));
    }

    @LuaBridge
    public void showSharePopup(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.EZpvd;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        if (luaValueArr.length < 2) {
            C55326xho.OLrzqt("OKShare.showSharePopup()->invalid params length");
            return;
        }
        Context contextEZpvd = EZpvd(this.AEQbTJ);
        if (contextEZpvd == null) {
            return;
        }
        try {
            Map<String, Object> mapAEQbTJ = C7910asj.AEQbTJ(luaValueArr[0].toLuaTable());
            ShareConfig shareConfigEZpvd = EZpvd(contextEZpvd, mapAEQbTJ);
            if (shareConfigEZpvd == null) {
                C55326xho.OLrzqt("OKShare.showSharePopup()->invalid shareConfig:" + mapAEQbTJ);
                return;
            }
            InterfaceC48892ueJ interfaceC48892ueJCopydefault = ((InterfaceC48893ueK) C43248rlh.KWHzl.AEQbTJ(InterfaceC48893ueK.class)).copydefault((AbstractActivityC33041mov) contextEZpvd, shareConfigEZpvd);
            if (interfaceC48892ueJCopydefault != null) {
                interfaceC48892ueJCopydefault.EZpvd(new Function1<Boolean, Unit>() { // from class: com.okinc.share.mln.OKShareBridge.5
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                    public Unit invoke(Boolean bool) {
                        if (OKShareBridge.this.copydefault == null) {
                            return null;
                        }
                        OKShareBridge.this.copydefault.invoke(LuaValue.empty());
                        return null;
                    }
                });
            }
            this.EZpvd = C49046uhE.EZpvd.EZpvd(luaValueArr, 1);
        } catch (Exception e) {
            C55326xho.OLrzqt("showSharePopup->" + e.getMessage());
            e.printStackTrace();
        }
    }

    @LuaBridge
    public void showMultiSharePopup(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.EZpvd;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        if (luaValueArr.length < 2) {
            C55326xho.OLrzqt("OKShare.showMultiSharePopup()->invalid params length");
            return;
        }
        Context contextEZpvd = EZpvd(this.AEQbTJ);
        if (contextEZpvd == null) {
            return;
        }
        boolean z = false;
        try {
            Map map = (Map) C7910asj.AEQbTJ(luaValueArr[0].toLuaTable()).get("configs");
            ArrayList arrayList = new ArrayList(map.size());
            Iterator it = map.entrySet().iterator();
            while (it.hasNext() && !z) {
                ShareConfig shareConfigEZpvd = EZpvd(contextEZpvd, (Map<String, Object>) ((Map.Entry) it.next()).getValue());
                if (shareConfigEZpvd != null) {
                    arrayList.add(shareConfigEZpvd);
                } else {
                    z = true;
                }
            }
            if (z) {
                C55326xho.OLrzqt("OKShare.showMultiSharePopup()->occurError，skip share:");
                return;
            }
            InterfaceC48892ueJ interfaceC48892ueJOLrzqt = ((InterfaceC48893ueK) C43248rlh.KWHzl.AEQbTJ(InterfaceC48893ueK.class)).OLrzqt((AbstractActivityC33041mov) contextEZpvd, MultiShareConfig.Companion.OLrzqt(arrayList, false, 1.0f, true, null, new Function1() { // from class: o.uhL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return OKShareBridge.AEQbTJ((MultiShareConfig) obj);
                }
            }));
            if (interfaceC48892ueJOLrzqt != null) {
                interfaceC48892ueJOLrzqt.EZpvd(new Function1<Boolean, Unit>() { // from class: com.okinc.share.mln.OKShareBridge.3
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                    public Unit invoke(Boolean bool) {
                        if (OKShareBridge.this.copydefault == null) {
                            return null;
                        }
                        OKShareBridge.this.copydefault.invoke(LuaValue.empty());
                        return null;
                    }
                });
            }
            this.EZpvd = C49046uhE.EZpvd.EZpvd(luaValueArr, 1);
        } catch (Exception e) {
            C55326xho.OLrzqt("showMultiSharePopup->" + e.getMessage());
            e.printStackTrace();
        }
    }

    @LuaBridge
    public void registerDismissCallback(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length <= 0 || !luaValueArr[0].isFunction()) {
            return;
        }
        LuaFunction luaFunction = this.copydefault;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.copydefault = luaValueArr[0].toLuaFunction();
    }

    @LuaBridge
    public void updateInviterInfo(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.djBIcL;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        if (luaValueArr.length < 1) {
            C55326xho.OLrzqt("OKShare.updateInviterInfo()->invalid params length");
            return;
        }
        LuaFunction luaFunctionEZpvd = C49046uhE.EZpvd.EZpvd(luaValueArr, 0);
        if (luaFunctionEZpvd != null) {
            this.djBIcL = luaFunctionEZpvd;
            luaFunctionEZpvd.invoke(null);
        }
    }

    @LuaBridge
    public void performShareAction(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.OLrzqt;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        if (luaValueArr.length < 3) {
            C55326xho.OLrzqt("OKShare.performShareAction()->invalid params length");
            return;
        }
        Context contextEZpvd = EZpvd(this.AEQbTJ);
        if (contextEZpvd == null) {
            return;
        }
        try {
            Map<String, Object> mapAEQbTJ = C7910asj.AEQbTJ(luaValueArr[0].toLuaTable());
            String javaString = luaValueArr[1].toJavaString();
            SharePlatform sharePlatformValueOf = SharePlatform.CREATOR.valueOf(javaString);
            if (sharePlatformValueOf == null) {
                C55326xho.OLrzqt("OKShare.performShareAction()->invalid platformName:" + javaString);
                return;
            }
            ShareConfig shareConfigEZpvd = EZpvd(contextEZpvd, mapAEQbTJ);
            if (shareConfigEZpvd == null) {
                C55326xho.OLrzqt("OKShare.performShareAction()->invalid shareConfig:" + mapAEQbTJ);
                return;
            }
            InterfaceC48893ueK interfaceC48893ueK = (InterfaceC48893ueK) C43248rlh.KWHzl.AEQbTJ(InterfaceC48893ueK.class);
            this.OLrzqt = C49046uhE.EZpvd.EZpvd(luaValueArr, 2);
            interfaceC48893ueK.KWHzl((AbstractActivityC33041mov) contextEZpvd, shareConfigEZpvd.shareParams, sharePlatformValueOf, new InterfaceC49121uia.Activity() { // from class: com.okinc.share.mln.OKShareBridge.4
                @Override // o.InterfaceC49121uia.Activity
                public void KWHzl(@NonNull SharePlatform sharePlatform) {
                    if (OKShareBridge.this.OLrzqt != null) {
                        OKShareBridge.this.OLrzqt.invoke(OKShareBridge.this.EZpvd(sharePlatform.getPlatformName(), 0));
                    }
                }

                @Override // o.InterfaceC49121uia.Activity
                public void EZpvd(@NonNull SharePlatform sharePlatform, @NonNull Throwable th) {
                    if (OKShareBridge.this.OLrzqt != null) {
                        OKShareBridge.this.OLrzqt.invoke(OKShareBridge.this.EZpvd(sharePlatform.getPlatformName(), 1));
                    }
                }
            });
        } catch (Exception e) {
            C55326xho.OLrzqt("OKShare.performShareAction->" + e.getMessage());
            e.printStackTrace();
        }
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [android.view.View] */
    @LuaBridge
    public void saveViewToLocalAndGetAbsPath(LuaValue[] luaValueArr) {
        final LuaFunction luaFunctionEZpvd = null;
        try {
            Context contextEZpvd = EZpvd(this.AEQbTJ);
            Map<String, ? extends Object> mapAEQbTJ = C7910asj.AEQbTJ(luaValueArr[0].toLuaTable());
            C49046uhE c49046uhE = C49046uhE.EZpvd;
            luaFunctionEZpvd = c49046uhE.EZpvd(luaValueArr, 1);
            UDViewGroup uDViewGroup = (UDViewGroup) c49046uhE.KWHzl(mapAEQbTJ, TtmlNode.TAG_IMAGE);
            boolean zBooleanValue = ((Boolean) c49046uhE.KWHzl(mapAEQbTJ, "isAsyncGetLocalPath")).booleanValue();
            int iIntValue = ((Integer) c49046uhE.KWHzl(mapAEQbTJ, "width")).intValue();
            int iIntValue2 = ((Integer) c49046uhE.KWHzl(mapAEQbTJ, "height")).intValue();
            int iEZpvd = C33570myu.EZpvd(contextEZpvd, iIntValue);
            int iEZpvd2 = C33570myu.EZpvd(contextEZpvd, iIntValue2);
            ?? F_ = uDViewGroup.f_();
            C33487mxQ.EZpvd(F_, iEZpvd, iEZpvd2);
            Bitmap bitmapAEQbTJ = C33570myu.AEQbTJ((View) F_, true);
            if (zBooleanValue) {
                ShareFileProvider.Companion.copydefault(bitmapAEQbTJ, (AbstractActivityC33041mov) contextEZpvd, new ShareFileProvider.TaskDescription() { // from class: o.uhN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.okinc.biz.share.ShareFileProvider.TaskDescription
                    public final void OLrzqt(java.io.File file) {
                        OKShareBridge.AEQbTJ(luaFunctionEZpvd, file);
                    }
                });
            } else {
                File fileAEQbTJ = ShareFileProvider.Companion.AEQbTJ(bitmapAEQbTJ);
                if (fileAEQbTJ != null) {
                    luaFunctionEZpvd.invoke(LuaValue.rString(fileAEQbTJ.getAbsolutePath()));
                } else {
                    luaFunctionEZpvd.invoke(LuaValue.rString(""));
                }
            }
        } catch (Exception e) {
            pUU.copydefault("OKShareBridge", "saveViewToLocalAndGetAbsPath occurs error:" + e.getMessage());
            if (luaFunctionEZpvd != null) {
                luaFunctionEZpvd.invoke(LuaValue.rString(""));
            }
        }
    }

    public static /* synthetic */ void AEQbTJ(LuaFunction luaFunction, File file) {
        luaFunction.invoke(LuaValue.rString(file != null ? file.getAbsolutePath() : ""));
    }

    @LuaBridge
    public LuaValue getCefiReferralInfo() {
        ShareFooterInfo referralFooterInfo = ((InterfaceC48893ueK) C43248rlh.KWHzl.AEQbTJ(InterfaceC48893ueK.class)).zuBGHE().getReferralFooterInfo();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("inviteLink", Objects.toString(referralFooterInfo.getShareUrl(), ""));
            jSONObject.put("inviteCode", Objects.toString(referralFooterInfo.getReferralCode(), ""));
            jSONObject.put("downloadLink", Objects.toString(referralFooterInfo.getDownloadUrl(), ""));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return C7869arv.KWHzl(this.AEQbTJ, jSONObject);
    }

    @LuaBridge
    public void generateShareUniversalLinkParams(LuaValue[] luaValueArr) {
        final LuaFunction luaFunctionEZpvd;
        if (luaValueArr != null) {
            try {
                if (luaValueArr.length >= 2) {
                    C49046uhE c49046uhE = C49046uhE.EZpvd;
                    luaFunctionEZpvd = c49046uhE.EZpvd(luaValueArr, 1);
                    try {
                        if (luaFunctionEZpvd == null) {
                            pUU.copydefault("OKShareBridge", "generateShareUniversalLinkParams->callback is null");
                            return;
                        }
                        LuaValue luaValue = luaValueArr[0];
                        Context contextEZpvd = EZpvd(this.AEQbTJ);
                        Map<String, ? extends Object> mapAEQbTJ = C7910asj.AEQbTJ(luaValue.toLuaTable());
                        String str = (String) c49046uhE.KWHzl(mapAEQbTJ, "originalLink");
                        String str2 = (String) c49046uhE.KWHzl(mapAEQbTJ, "contentScene");
                        String str3 = (String) c49046uhE.KWHzl(mapAEQbTJ, "deeplink");
                        Integer num = (Integer) c49046uhE.KWHzl(mapAEQbTJ, "redirectBehavior");
                        AbstractC58185ywX<C48887ueE> abstractC58185ywXAEQbTJ = ((InterfaceC48893ueK) C43248rlh.KWHzl.AEQbTJ(InterfaceC48893ueK.class)).AEQbTJ(str, new C48891ueI(str2, str3, false, num != null ? RedirectBehavior.Companion.OLrzqt(num.intValue()) : RedirectBehavior.DEFAULT_ALLOW_DEEPLINK, null));
                        Activity activityOLrzqt = C33569myt.OLrzqt(contextEZpvd);
                        if (activityOLrzqt instanceof AbstractActivityC33041mov) {
                            abstractC58185ywXAEQbTJ = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, (AbstractActivityC33041mov) activityOLrzqt);
                        }
                        C33024moe.KWHzl((AbstractC58185ywX) abstractC58185ywXAEQbTJ).AEQbTJ(new InterfaceC58227yxM() { // from class: o.uhM
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58227yxM
                            public final void accept(java.lang.Object obj) throws java.lang.Exception {
                                this.EZpvd.OLrzqt(luaFunctionEZpvd, (C48887ueE) obj);
                            }
                        }, new InterfaceC58227yxM() { // from class: o.uhJ
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58227yxM
                            public final void accept(java.lang.Object obj) throws java.lang.Exception {
                                this.EZpvd.OLrzqt(luaFunctionEZpvd, (java.lang.Throwable) obj);
                            }
                        });
                        return;
                    } catch (Exception e) {
                        e = e;
                        pUU.copydefault("OKShareBridge", "generateShareUniversalLinkParams->exception:" + e);
                        if (luaFunctionEZpvd != null) {
                            EZpvd(luaFunctionEZpvd, false, null, null);
                            return;
                        }
                        return;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                luaFunctionEZpvd = null;
            }
        }
        C55326xho.OLrzqt("generateShareUniversalLinkParams()->invalid params length");
    }

    public final /* synthetic */ void OLrzqt(LuaFunction luaFunction, C48887ueE c48887ueE) throws Exception {
        pUU.KWHzl("OKShareBridge", "generateShareUniversalLinkParams->success  fullLink:" + c48887ueE.EZpvd() + " shortLink:" + c48887ueE.OLrzqt());
        EZpvd(luaFunction, true, c48887ueE.EZpvd(), c48887ueE.OLrzqt());
    }

    public final /* synthetic */ void OLrzqt(LuaFunction luaFunction, Throwable th) throws Exception {
        pUU.copydefault("OKShareBridge", "generateShareUniversalLinkParams->onError:" + th);
        EZpvd(luaFunction, false, null, null);
    }

    public final void EZpvd(LuaFunction luaFunction, boolean z, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("success", z);
            jSONObject2.put("appendedLink", Objects.toString(str, ""));
            jSONObject2.put("universalLink", Objects.toString(str2, ""));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        luaFunction.invoke(LuaValue.varargsOf(C7869arv.KWHzl(this.AEQbTJ, jSONObject), C7869arv.KWHzl(this.AEQbTJ, jSONObject2)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r18v3, resolved type: com.okinc.share.bean.image.ImageCustomLuaPreviewConfig$TaskDescription */
    /* JADX DEBUG: Multi-variable search result rejected for r18v4, resolved type: com.okinc.share.bean.image.ImageCustomLuaPreviewConfig$TaskDescription */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0 A[Catch: OutOfMemoryError -> 0x024a, Exception -> 0x0269, TRY_ENTER, TryCatch #3 {Exception -> 0x0269, OutOfMemoryError -> 0x024a, blocks: (B:3:0x0008, B:11:0x007b, B:13:0x007f, B:15:0x0085, B:20:0x00a0, B:22:0x00d8, B:25:0x00fc, B:27:0x0112, B:29:0x0117, B:31:0x0150, B:28:0x0115, B:30:0x0148, B:23:0x00e5, B:32:0x015d, B:34:0x0163), top: B:63:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015d A[Catch: OutOfMemoryError -> 0x024a, Exception -> 0x0269, TryCatch #3 {Exception -> 0x0269, OutOfMemoryError -> 0x024a, blocks: (B:3:0x0008, B:11:0x007b, B:13:0x007f, B:15:0x0085, B:20:0x00a0, B:22:0x00d8, B:25:0x00fc, B:27:0x0112, B:29:0x0117, B:31:0x0150, B:28:0x0115, B:30:0x0148, B:23:0x00e5, B:32:0x015d, B:34:0x0163), top: B:63:0x0008 }] */
    /* JADX WARN: Type inference failed for: r1v28, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r21v1, types: [android.view.View] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ShareConfig EZpvd(Context context, Map<String, Object> map) {
        ShareConfig shareConfig;
        C49046uhE c49046uhE;
        final Map<String, ? extends Object> map2;
        Map<String, ? extends Object> map3;
        final String str;
        final String str2;
        final String str3;
        final Bundle bundleEZpvd;
        InterfaceC48893ueK interfaceC48893ueK;
        int i;
        final LinkDefaultPreviewConfig linkDefaultPreviewConfigAEQbTJ;
        LuaImagePreviewBuildType luaImagePreviewBuildTypeValueOf;
        final ImageCustomLuaPreviewConfig imageCustomLuaPreviewConfigEZpvd;
        ImageShareParams imageShareParamsKWHzl;
        final ImageDefaultPreviewConfig imageDefaultPreviewConfigAEQbTJ;
        try {
            c49046uhE = C49046uhE.EZpvd;
            map2 = (Map) c49046uhE.KWHzl(map, "shareParams");
            map3 = (Map) c49046uhE.KWHzl(map, "previewConfig");
            Integer num = (Integer) c49046uhE.KWHzl(map2, "contentType");
            str = (String) c49046uhE.KWHzl(map2, "title");
            str2 = (String) c49046uhE.KWHzl(map2, "body");
            str3 = (String) c49046uhE.KWHzl(map2, "shareFrom");
            bundleEZpvd = EZpvd((Map<String, Object>) c49046uhE.KWHzl(map2, "extras"));
            LuaShareContentType luaShareContentTypeValueOf = LuaShareContentType.CREATOR.valueOf(num.intValue());
            interfaceC48893ueK = (InterfaceC48893ueK) C43248rlh.KWHzl.AEQbTJ(InterfaceC48893ueK.class);
            i = AnonymousClass2.AEQbTJ[luaShareContentTypeValueOf.ordinal()];
        } catch (Exception e) {
            e = e;
            shareConfig = null;
        } catch (OutOfMemoryError e2) {
            e = e2;
            shareConfig = null;
        }
        try {
        } catch (Exception e3) {
            e = e3;
            C55326xho.OLrzqt("OKShare.resolveShareConfig->occur error" + e.getMessage());
            e.printStackTrace();
        } catch (OutOfMemoryError e4) {
            e = e4;
            C55326xho.OLrzqt("OKShare.resolveShareConfig->OutOfMemoryError:" + e.getMessage());
            e.printStackTrace();
        }
        if (i == 1) {
            LinkShareParams linkShareParamsAEQbTJ = LinkShareParams.Companion.AEQbTJ((String) c49046uhE.KWHzl(map2, "linkUrl"), new Function1() { // from class: o.uhG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return OKShareBridge.OLrzqt(str, str2, str3, bundleEZpvd, (LinkShareParams) obj);
                }
            });
            if (map3 != null) {
                String str4 = (String) c49046uhE.KWHzl(map3, "previewTitle");
                String str5 = (String) c49046uhE.KWHzl(map3, "previewSubtitle");
                final Boolean bool = (Boolean) c49046uhE.KWHzl(map3, "isEditorEnable");
                ImageSource imageSourceOLrzqt = OLrzqt(context, (JDImageInfo) c49046uhE.KWHzl(map3, "previewImage"));
                CharSequence charSequenceCopydefault = copydefault(map3, "previewAttributeContent");
                final CharSequence charSequenceCopydefault2 = copydefault(map3, "previewBottomTips");
                linkDefaultPreviewConfigAEQbTJ = LinkDefaultPreviewConfig.Companion.AEQbTJ(str4, str5, null, charSequenceCopydefault, imageSourceOLrzqt, new Function1() { // from class: o.uhR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return OKShareBridge.EZpvd(bool, charSequenceCopydefault2, (LinkDefaultPreviewConfig) obj);
                    }
                });
            } else {
                linkDefaultPreviewConfigAEQbTJ = (LinkDefaultPreviewConfig) interfaceC48893ueK.KWHzl(linkShareParamsAEQbTJ);
            }
            return ShareConfig.Companion.copydefault(linkShareParamsAEQbTJ, new Function1() { // from class: o.uhO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return OKShareBridge.KWHzl(linkDefaultPreviewConfigAEQbTJ, (ShareConfig) obj);
                }
            });
        }
        if (i == 2 || i == 3) {
            LuaImagePreviewBuildType luaImagePreviewBuildType = LuaImagePreviewBuildType.DEFAULT;
            if (map3 == null || !map3.containsKey("type")) {
                luaImagePreviewBuildTypeValueOf = luaImagePreviewBuildType;
                if (luaImagePreviewBuildTypeValueOf != luaImagePreviewBuildType) {
                    UDViewGroup uDViewGroup = (UDViewGroup) c49046uhE.KWHzl(map2, TtmlNode.TAG_IMAGE);
                    int iIntValue = ((Integer) c49046uhE.KWHzl(map2, "width")).intValue();
                    int iIntValue2 = ((Integer) c49046uhE.KWHzl(map2, "height")).intValue();
                    int iEZpvd = C33570myu.EZpvd(context, iIntValue);
                    int iEZpvd2 = C33570myu.EZpvd(context, iIntValue2);
                    ?? F_ = uDViewGroup.f_();
                    C33487mxQ.EZpvd(F_, iEZpvd, iEZpvd2);
                    Bitmap bitmapAEQbTJ = C33570myu.AEQbTJ((View) F_, true);
                    Activity activityOLrzqt = C33569myt.OLrzqt(context);
                    if (activityOLrzqt != null) {
                        imageShareParamsKWHzl = ImageShareParams.Companion.OLrzqt(activityOLrzqt, bitmapAEQbTJ, null, new Function1() { // from class: o.uhW
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return OKShareBridge.KWHzl(str, str2, str3, bundleEZpvd, (ImageShareParams) obj);
                            }
                        });
                    } else {
                        imageShareParamsKWHzl = ImageShareParams.Companion.KWHzl(ShareFileProvider.Companion.AEQbTJ(bitmapAEQbTJ).getAbsolutePath(), new Function1() { // from class: o.uhT
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return OKShareBridge.AEQbTJ(str, str2, str3, bundleEZpvd, (ImageShareParams) obj);
                            }
                        });
                    }
                    if (map3 != null) {
                        ImagePreviewType imagePreviewType = LuaImagePreviewType.FIT_WIDTH == LuaImagePreviewType.CREATOR.valueOf(((Integer) c49046uhE.KWHzl(map3, "previewType")).intValue()) ? ImagePreviewType.CENTER_CROP : ImagePreviewType.CENTER_INSIDE;
                        final String str6 = (String) c49046uhE.KWHzl(map3, "previewTitle");
                        final String str7 = (String) c49046uhE.KWHzl(map3, "previewSubtitle");
                        final Boolean bool2 = (Boolean) c49046uhE.KWHzl(map3, "isEditorEnable");
                        final CharSequence charSequenceCopydefault3 = copydefault(map3, "previewBottomTips");
                        final Integer num2 = (Integer) c49046uhE.KWHzl(map3, "previewBottomTipsMode");
                        imageDefaultPreviewConfigAEQbTJ = ImageDefaultPreviewConfig.Companion.AEQbTJ(imagePreviewType, true, null, new Function1() { // from class: o.uhS
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return OKShareBridge.OLrzqt(bool2, str6, str7, charSequenceCopydefault3, num2, (ImageDefaultPreviewConfig) obj);
                            }
                        });
                    } else {
                        imageDefaultPreviewConfigAEQbTJ = (ImageDefaultPreviewConfig) interfaceC48893ueK.KWHzl(imageShareParamsKWHzl);
                    }
                    return ShareConfig.Companion.copydefault(imageShareParamsKWHzl, new Function1() { // from class: o.uhU
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return OKShareBridge.KWHzl(imageDefaultPreviewConfigAEQbTJ, (ShareConfig) obj);
                        }
                    });
                }
                if (luaImagePreviewBuildTypeValueOf == LuaImagePreviewBuildType.CUSTOM) {
                    final Activity activityOLrzqt2 = C33569myt.OLrzqt(context);
                    if (activityOLrzqt2 == null) {
                        return null;
                    }
                    ?? F_2 = ((UDViewGroup) c49046uhE.KWHzl(map2, TtmlNode.TAG_IMAGE)).f_();
                    ImageShareParams imageShareParamsOLrzqt = ImageShareParams.Companion.OLrzqt(new Function1() { // from class: o.uhV
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return this.copydefault.copydefault(str, str2, str3, bundleEZpvd, map2, activityOLrzqt2, (ImageShareParams) obj);
                        }
                    });
                    if (map3 != null) {
                        List<InterfaceC48901ueS> listOLrzqt = OLrzqt(map3);
                        String str8 = (String) c49046uhE.KWHzl(map3, "previewTitle");
                        final String str9 = (String) c49046uhE.KWHzl(map3, "previewSubtitle");
                        final Boolean bool3 = (Boolean) c49046uhE.KWHzl(map3, "isEditorEnable");
                        final Integer num3 = (Integer) c49046uhE.KWHzl(map3, "previewBottomTipsMode");
                        final CharSequence charSequenceCopydefault4 = copydefault(map3, "previewBottomTips");
                        imageCustomLuaPreviewConfigEZpvd = ImageCustomLuaPreviewConfig.Companion.EZpvd(activityOLrzqt2, listOLrzqt, F_2, str8, new Function1() { // from class: o.uhY
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return OKShareBridge.copydefault(bool3, str9, charSequenceCopydefault4, num3, (ImageCustomLuaPreviewConfig) obj);
                            }
                        });
                    } else {
                        imageCustomLuaPreviewConfigEZpvd = ImageCustomLuaPreviewConfig.Companion.EZpvd(activityOLrzqt2, null, F_2, null, new Function1() { // from class: o.uhK
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return OKShareBridge.copydefault((ImageCustomLuaPreviewConfig) obj);
                            }
                        });
                    }
                    return ShareConfig.Companion.copydefault(imageShareParamsOLrzqt, new Function1() { // from class: o.uhI
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return OKShareBridge.KWHzl(imageCustomLuaPreviewConfigEZpvd, (ShareConfig) obj);
                        }
                    });
                }
            } else {
                luaImagePreviewBuildTypeValueOf = LuaImagePreviewBuildType.CREATOR.valueOf(((Integer) c49046uhE.KWHzl(map3, "type")).intValue());
                if (luaImagePreviewBuildTypeValueOf == null) {
                }
                if (luaImagePreviewBuildTypeValueOf != luaImagePreviewBuildType) {
                }
            }
            return shareConfig;
        }
        shareConfig = null;
        return shareConfig;
    }

    /* JADX INFO: renamed from: com.okinc.share.mln.OKShareBridge$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] AEQbTJ;

        static {
            int[] iArr = new int[LuaShareContentType.values().length];
            AEQbTJ = iArr;
            try {
                iArr[LuaShareContentType.LINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AEQbTJ[LuaShareContentType.IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AEQbTJ[LuaShareContentType.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static /* synthetic */ Unit OLrzqt(String str, String str2, String str3, Bundle bundle, LinkShareParams linkShareParams) {
        linkShareParams.setTitle(str);
        linkShareParams.setBody(str2);
        linkShareParams.setShareFrom(str3);
        if (bundle == null) {
            return null;
        }
        linkShareParams.getExtras().putAll(bundle);
        return null;
    }

    public static /* synthetic */ Unit EZpvd(Boolean bool, CharSequence charSequence, LinkDefaultPreviewConfig linkDefaultPreviewConfig) {
        linkDefaultPreviewConfig.setEditable(bool.booleanValue());
        linkDefaultPreviewConfig.setPreviewBottomTips(charSequence);
        return null;
    }

    public static /* synthetic */ Unit KWHzl(LinkDefaultPreviewConfig linkDefaultPreviewConfig, ShareConfig shareConfig) {
        shareConfig.setPreviewConfig(linkDefaultPreviewConfig);
        return null;
    }

    public static /* synthetic */ Unit KWHzl(String str, String str2, String str3, Bundle bundle, ImageShareParams imageShareParams) {
        imageShareParams.setTitle(str);
        imageShareParams.setBody(str2);
        imageShareParams.setShareFrom(str3);
        if (bundle == null) {
            return null;
        }
        imageShareParams.getExtras().putAll(bundle);
        return null;
    }

    public static /* synthetic */ Unit AEQbTJ(String str, String str2, String str3, Bundle bundle, ImageShareParams imageShareParams) {
        imageShareParams.setTitle(str);
        imageShareParams.setBody(str2);
        imageShareParams.setShareFrom(str3);
        if (bundle == null) {
            return null;
        }
        imageShareParams.getExtras().putAll(bundle);
        return null;
    }

    public static /* synthetic */ Unit OLrzqt(Boolean bool, String str, String str2, CharSequence charSequence, Integer num, ImageDefaultPreviewConfig imageDefaultPreviewConfig) {
        PreviewBottomTipsMode previewBottomTipsModeValueOf;
        imageDefaultPreviewConfig.setEditable(bool.booleanValue());
        imageDefaultPreviewConfig.setPreviewTitle(str);
        imageDefaultPreviewConfig.setPreviewContent(str2);
        imageDefaultPreviewConfig.setPreviewBottomTips(charSequence);
        if (num == null || (previewBottomTipsModeValueOf = PreviewBottomTipsMode.CREATOR.valueOf(num.intValue())) == null) {
            return null;
        }
        imageDefaultPreviewConfig.setPreviewBottomTipsMode(previewBottomTipsModeValueOf);
        return null;
    }

    public static /* synthetic */ Unit KWHzl(ImageDefaultPreviewConfig imageDefaultPreviewConfig, ShareConfig shareConfig) {
        shareConfig.setPreviewConfig(imageDefaultPreviewConfig);
        return null;
    }

    public final /* synthetic */ Unit copydefault(String str, String str2, String str3, Bundle bundle, Map map, Activity activity, ImageShareParams imageShareParams) {
        imageShareParams.setTitle(str);
        imageShareParams.setBody(str2);
        imageShareParams.setShareFrom(str3);
        if (bundle != null) {
            imageShareParams.getExtras().putAll(bundle);
        }
        imageShareParams.setPendingShareParamsTransformer(activity, copydefault((Map<String, Object>) map));
        return null;
    }

    public static /* synthetic */ Unit copydefault(Boolean bool, String str, CharSequence charSequence, Integer num, ImageCustomLuaPreviewConfig imageCustomLuaPreviewConfig) {
        PreviewBottomTipsMode previewBottomTipsModeValueOf;
        imageCustomLuaPreviewConfig.setEditable(bool.booleanValue());
        imageCustomLuaPreviewConfig.setPreviewContent(str);
        imageCustomLuaPreviewConfig.setPreviewBottomTips(charSequence);
        if (num == null || (previewBottomTipsModeValueOf = PreviewBottomTipsMode.CREATOR.valueOf(num.intValue())) == null) {
            return null;
        }
        imageCustomLuaPreviewConfig.setPreviewBottomTipsMode(previewBottomTipsModeValueOf);
        return null;
    }

    public static /* synthetic */ Unit KWHzl(ImageCustomLuaPreviewConfig imageCustomLuaPreviewConfig, ShareConfig shareConfig) {
        shareConfig.setPreviewConfig(imageCustomLuaPreviewConfig);
        return null;
    }

    public final CharSequence copydefault(Map<String, Object> map, String str) {
        try {
            UDStyleString uDStyleString = (UDStyleString) C49046uhE.EZpvd.KWHzl(map, str);
            if (uDStyleString != null) {
                Spanned spanned = (Spanned) uDStyleString.copydefault();
                pUU.KWHzl("OKShareBridge", "resolveStyleString->getText: " + spanned.getClass().getSimpleName() + ":" + uDStyleString);
                return spanned;
            }
        } catch (Exception e) {
            e.printStackTrace();
            C55326xho.OLrzqt("OKShare.resolveStyleString->occur error" + e.getMessage());
            pUU.copydefault("OKShareBridge", "resolveStyleString->error: " + Log.getStackTraceString(e));
        }
        return null;
    }

    public final ImageSource OLrzqt(Context context, JDImageInfo jDImageInfo) {
        if (context != null && jDImageInfo != null) {
            try {
                String absolutePath = jDImageInfo.getAbsolutePath();
                String netUrl = jDImageInfo.getNetUrl();
                String localUrl = jDImageInfo.getLocalUrl();
                InterfaceC7855arh interfaceC7855arhAYXKKw = C7323ahf.AYXKKw();
                if (!TextUtils.isEmpty(absolutePath)) {
                    return ImageSource.Companion.EZpvd(absolutePath);
                }
                if (jDImageInfo.isNetUrl() && !TextUtils.isEmpty(netUrl)) {
                    return ImageSource.Companion.OLrzqt(netUrl);
                }
                Drawable drawableKWHzl = interfaceC7855arhAYXKKw.KWHzl(context, jDImageInfo);
                if (drawableKWHzl != null) {
                    Bitmap bitmapCopydefault = C49045uhD.EZpvd.copydefault(drawableKWHzl);
                    Activity activityOLrzqt = C33569myt.OLrzqt(context);
                    if (bitmapCopydefault == null || activityOLrzqt == null) {
                        return null;
                    }
                    return ImageSource.Companion.EZpvd(activityOLrzqt, bitmapCopydefault);
                }
                if (C7872ary.gEmmrt(localUrl)) {
                    String strReplace = localUrl.replace("file://", "");
                    File file = new File(strReplace);
                    if (file.exists() && file.isFile()) {
                        return ImageSource.Companion.EZpvd(strReplace);
                    }
                }
                return null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public final Bundle EZpvd(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                bundle.putString(key, (String) value);
            } else if (value instanceof Boolean) {
                bundle.putBoolean(key, ((Boolean) value).booleanValue());
            } else if (value instanceof Integer) {
                bundle.putInt(key, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                bundle.putDouble(key, ((Long) value).longValue());
            } else if (value instanceof Double) {
                bundle.putDouble(key, ((Double) value).doubleValue());
            } else {
                pUU.copydefault("OKShareBridge", "resolveExtrasParams ->unknown params type->key:" + key + "value:" + value);
            }
        }
        return bundle;
    }

    public final C49036ugv copydefault(Map<String, Object> map) {
        try {
            OKShareCustomParamsTransform oKShareCustomParamsTransform = (OKShareCustomParamsTransform) C49046uhE.EZpvd.KWHzl(map, "customParamsTransform");
            if (oKShareCustomParamsTransform != null) {
                return new C49036ugv(oKShareCustomParamsTransform);
            }
        } catch (Exception e) {
            C55326xho.OLrzqt("getLuaShareParamTransformer error->" + e.getMessage());
            pUU.copydefault("OKShareBridge", "getLuaShareParamTransformer error->" + e.getMessage());
        }
        return null;
    }

    public final List<InterfaceC48901ueS> OLrzqt(Map<String, Object> map) {
        ArrayList arrayList = null;
        try {
            Map map2 = (Map) C49046uhE.EZpvd.KWHzl(map, "customEditors");
            if (map2 == null || map2.isEmpty()) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                Iterator it = map2.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList2.add(new C49040ugz((OKShareEditor) ((Map.Entry) it.next()).getValue()));
                }
                return arrayList2;
            } catch (Exception e) {
                e = e;
                arrayList = arrayList2;
            }
        } catch (Exception e2) {
            e = e2;
        }
        C55326xho.OLrzqt("getCustomEditor error->:" + e.getMessage());
        pUU.copydefault("OKShareBridge", "getCustomEditor error->" + e.getMessage());
        return arrayList;
    }

    public Context EZpvd(@NonNull Globals globals) {
        C7322ahe c7322ahe = (C7322ahe) globals.AuCTel();
        if (c7322ahe != null) {
            return c7322ahe.AEQbTJ;
        }
        return null;
    }

    public void copydefault() {
        InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
            this.KWHzl = null;
        }
        LuaFunction luaFunction = this.djBIcL;
        if (luaFunction != null) {
            luaFunction.destroy();
            this.djBIcL = null;
        }
        LuaFunction luaFunction2 = this.EZpvd;
        if (luaFunction2 != null) {
            luaFunction2.destroy();
            this.EZpvd = null;
        }
        LuaFunction luaFunction3 = this.OLrzqt;
        if (luaFunction3 != null) {
            luaFunction3.destroy();
            this.OLrzqt = null;
        }
        LuaFunction luaFunction4 = this.copydefault;
        if (luaFunction4 != null) {
            luaFunction4.destroy();
            this.copydefault = null;
        }
    }
}
