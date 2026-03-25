package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.okinc.biz.share.ShareFileProvider;
import com.okinc.business.defi.share.bean.ShareLinkBean;
import com.okinc.business.defi.share.bean.Web3ShareBaseInfo;
import com.okinc.business.defi.share.bean.Web3ShareFooterInfo;
import com.okinc.business.defi.share.bean.Web3ShareImageInfo;
import com.okinc.business.defi.share.bean.Web3ShareModel;
import com.okinc.share.bean.MultiShareConfig;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.image.ImageShareParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dTt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13665dTt extends AbstractC13657dTl {
    public static final ActionBar Companion = new ActionBar(null);

    /* JADX INFO: renamed from: o.dTt$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dTt.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final android.graphics.Canvas EZpvd(@NotNull android.graphics.Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "");
            return new android.graphics.Canvas(bitmap);
        }
    }

    @Override // o.AbstractC13657dTl
    public void copydefault(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull Web3ShareModel web3ShareModel, ShareLinkBean shareLinkBean) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(web3ShareModel, "");
        if (shareLinkBean != null) {
            if (web3ShareModel.getShareInfoList().size() == 1) {
                OLrzqt(abstractActivityC33041mov, web3ShareModel, shareLinkBean);
            } else {
                EZpvd(abstractActivityC33041mov, web3ShareModel, shareLinkBean);
            }
        }
    }

    public final void OLrzqt(final AbstractActivityC33041mov abstractActivityC33041mov, final Web3ShareModel web3ShareModel, ShareLinkBean shareLinkBean) {
        final java.lang.String finalShareLink = shareLinkBean.getFinalShareLink();
        final Web3ShareBaseInfo web3ShareBaseInfo = web3ShareModel.getShareInfoList().get(0);
        if (web3ShareBaseInfo instanceof Web3ShareImageInfo) {
            AbstractC58247yxg abstractC58247yxgJust = AbstractC58247yxg.just(web3ShareBaseInfo);
            final Function1 function1 = new Function1() { // from class: o.dTG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C13665dTt.EZpvd(this.KWHzl, abstractActivityC33041mov, web3ShareBaseInfo, finalShareLink, (Web3ShareImageInfo) obj);
                }
            };
            AbstractC58247yxg abstractC58247yxgObserveOn = abstractC58247yxgJust.map(new InterfaceC58229yxO() { // from class: o.dTD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C13665dTt.djBIcL(function1, obj);
                }
            }).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt());
            Intrinsics.checkNotNullExpressionValue(abstractC58247yxgObserveOn, "");
            AbstractC58247yxg abstractC58247yxgCopydefault = C58156yvv.copydefault(abstractC58247yxgObserveOn, abstractActivityC33041mov);
            final Function1 function12 = new Function1() { // from class: o.dTE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C13665dTt.copydefault(this.AEQbTJ, web3ShareBaseInfo, abstractActivityC33041mov, web3ShareModel, finalShareLink, (java.lang.String) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dTC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C13665dTt.isConnected(function12, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.dTu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C13665dTt.AEQbTJ((java.lang.Throwable) obj);
                }
            };
            abstractC58247yxgCopydefault.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dTB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C13665dTt.values(function13, obj);
                }
            });
            return;
        }
        pUU.copydefault("Web3ShareImageHandler", "handleSingleImage error: type mismatch");
    }

    public static final java.lang.String djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final java.lang.String EZpvd(C13665dTt c13665dTt, AbstractActivityC33041mov abstractActivityC33041mov, Web3ShareBaseInfo web3ShareBaseInfo, java.lang.String str, Web3ShareImageInfo web3ShareImageInfo) {
        Intrinsics.checkNotNullParameter(web3ShareImageInfo, "");
        return c13665dTt.copydefault(abstractActivityC33041mov, (Web3ShareImageInfo) web3ShareBaseInfo, str);
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C13665dTt c13665dTt, Web3ShareBaseInfo web3ShareBaseInfo, AbstractActivityC33041mov abstractActivityC33041mov, Web3ShareModel web3ShareModel, java.lang.String str, java.lang.String str2) {
        if (str2 != null) {
            ShareConfig.ActionBar actionBar = ShareConfig.Companion;
            ImageShareParams imageShareParamsCreate$default = ImageShareParams.ActionBar.create$default(ImageShareParams.Companion, str2, null, 2, null);
            imageShareParamsCreate$default.setShareFrom(web3ShareModel.getShareFrom());
            if (str == null) {
                str = "";
            }
            imageShareParamsCreate$default.setBody(str);
            ShareConfig shareConfigCreate$default = ShareConfig.ActionBar.create$default(actionBar, imageShareParamsCreate$default, null, 2, null);
            c13665dTt.KWHzl(shareConfigCreate$default, web3ShareBaseInfo);
            ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).copydefault(abstractActivityC33041mov, shareConfigCreate$default);
        }
        return Unit.INSTANCE;
    }

    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        pUU.copydefault("Web3ShareImageHandler", "error:" + th.getMessage());
        return Unit.INSTANCE;
    }

    public final void EZpvd(final AbstractActivityC33041mov abstractActivityC33041mov, final Web3ShareModel web3ShareModel, ShareLinkBean shareLinkBean) {
        final java.lang.String finalShareLink = shareLinkBean.getFinalShareLink();
        AbstractC58247yxg abstractC58247yxgJust = AbstractC58247yxg.just(web3ShareModel.getShareInfoList());
        final Function1 function1 = new Function1() { // from class: o.dTs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13665dTt.AEQbTJ(this.EZpvd, abstractActivityC33041mov, finalShareLink, web3ShareModel, (java.util.List) obj);
            }
        };
        AbstractC58247yxg abstractC58247yxgObserveOn = abstractC58247yxgJust.map(new InterfaceC58229yxO() { // from class: o.dTw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13665dTt.AYXKKw(function1, obj);
            }
        }).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgObserveOn, "");
        AbstractC58247yxg abstractC58247yxgCopydefault = C58156yvv.copydefault(abstractC58247yxgObserveOn, abstractActivityC33041mov);
        final Function1 function12 = new Function1() { // from class: o.dTz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13665dTt.AEQbTJ(abstractActivityC33041mov, (java.util.ArrayList) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dTA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C13665dTt.gEmmrt(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.dTx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13665dTt.OLrzqt((java.lang.Throwable) obj);
            }
        };
        abstractC58247yxgCopydefault.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dTy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C13665dTt.AhwBna(function13, obj);
            }
        });
    }

    public static final java.util.ArrayList AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.ArrayList) function1.invoke(obj);
    }

    public static final java.util.ArrayList AEQbTJ(C13665dTt c13665dTt, AbstractActivityC33041mov abstractActivityC33041mov, java.lang.String str, Web3ShareModel web3ShareModel, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            Web3ShareBaseInfo web3ShareBaseInfo = (Web3ShareBaseInfo) it.next();
            if (web3ShareBaseInfo instanceof Web3ShareImageInfo) {
                java.lang.String strCopydefault = c13665dTt.copydefault(abstractActivityC33041mov, (Web3ShareImageInfo) web3ShareBaseInfo, str);
                if (strCopydefault != null) {
                    ShareConfig.ActionBar actionBar = ShareConfig.Companion;
                    ImageShareParams imageShareParamsCreate$default = ImageShareParams.ActionBar.create$default(ImageShareParams.Companion, strCopydefault, null, 2, null);
                    imageShareParamsCreate$default.setShareFrom(web3ShareModel.getShareFrom());
                    imageShareParamsCreate$default.setBody(str == null ? "" : str);
                    ShareConfig shareConfigCreate$default = ShareConfig.ActionBar.create$default(actionBar, imageShareParamsCreate$default, null, 2, null);
                    c13665dTt.KWHzl(shareConfigCreate$default, web3ShareBaseInfo);
                    arrayList.add(shareConfigCreate$default);
                }
            } else {
                pUU.copydefault("Web3ShareImageHandler", "handleMultiImage error: type mismatch");
            }
        }
        return arrayList;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(AbstractActivityC33041mov abstractActivityC33041mov, java.util.ArrayList arrayList) {
        MultiShareConfig.ActionBar actionBar = MultiShareConfig.Companion;
        Intrinsics.copydefault(arrayList);
        ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).OLrzqt(abstractActivityC33041mov, MultiShareConfig.ActionBar.create$default(actionBar, arrayList, true, 0.0f, true, null, null, 52, null));
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        pUU.copydefault("Web3ShareImageHandler", "error:" + th.getMessage());
        return Unit.INSTANCE;
    }

    public final java.lang.String copydefault(AbstractActivityC33041mov abstractActivityC33041mov, Web3ShareImageInfo web3ShareImageInfo, java.lang.String str) {
        java.io.File fileAEQbTJ;
        try {
            if (web3ShareImageInfo.getFooterInfo() != null) {
                android.graphics.Bitmap imageBitmap = web3ShareImageInfo.getImageBitmap();
                if (imageBitmap == null) {
                    android.net.Uri uri = android.net.Uri.parse(web3ShareImageInfo.getImagePath());
                    Intrinsics.checkNotNullExpressionValue(uri, "");
                    imageBitmap = EZpvd(uri, false);
                }
                Web3ShareFooterInfo footerInfo = web3ShareImageInfo.getFooterInfo();
                Intrinsics.copydefault(footerInfo);
                java.lang.CharSequence footTitle = footerInfo.getFootTitle();
                Web3ShareFooterInfo footerInfo2 = web3ShareImageInfo.getFooterInfo();
                Intrinsics.copydefault(footerInfo2);
                web3ShareImageInfo.setFooterInfo(new Web3ShareFooterInfo(footTitle, footerInfo2.getFootSubTitle(), str));
                Intrinsics.copydefault(imageBitmap);
                Web3ShareFooterInfo footerInfo3 = web3ShareImageInfo.getFooterInfo();
                Intrinsics.copydefault(footerInfo3);
                java.io.File fileAEQbTJ2 = ShareFileProvider.Companion.AEQbTJ(OLrzqt(abstractActivityC33041mov, imageBitmap, footerInfo3));
                if (fileAEQbTJ2 != null) {
                    return fileAEQbTJ2.getAbsolutePath();
                }
                return null;
            }
            java.lang.String imagePath = web3ShareImageInfo.getImagePath();
            if (imagePath != null && imagePath.length() != 0) {
                return imagePath;
            }
            android.graphics.Bitmap imageBitmap2 = web3ShareImageInfo.getImageBitmap();
            if (imageBitmap2 == null || (fileAEQbTJ = ShareFileProvider.Companion.AEQbTJ(imageBitmap2)) == null) {
                return null;
            }
            return fileAEQbTJ.getAbsolutePath();
        } catch (java.lang.Throwable th) {
            pUU.copydefault("generateShareImagePath error: " + th.getMessage());
            return null;
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[INVOKE, IGET]}, finally: {[INVOKE] complete} */
    public final android.graphics.Bitmap EZpvd(android.net.Uri uri, boolean z) throws java.io.FileNotFoundException {
        int i;
        android.graphics.Bitmap bitmapCreateBitmap;
        C32979mnm c32979mnm = C32979mnm.EZpvd;
        android.content.ContentResolver contentResolver = c32979mnm.OLrzqt().getContentResolver();
        java.io.InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
        if (inputStreamOpenInputStream == null) {
            throw new java.lang.IllegalArgumentException("openInputStream failed:" + uri);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
        C33486mxP.AEQbTJ(inputStreamOpenInputStream);
        int i2 = options.outHeight;
        if (i2 <= 0 || (i = options.outWidth) <= 0) {
            throw new java.lang.IllegalArgumentException("invalid image file");
        }
        int iAEQbTJ = C33094mpv.AEQbTJ(options, 1080, (int) (1080 * (i2 / i)));
        options.inJustDecodeBounds = false;
        options.inSampleSize = iAEQbTJ;
        java.io.InputStream inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
        if (inputStreamOpenInputStream2 == null) {
            throw new java.lang.IllegalArgumentException("openInputStream failed:" + uri);
        }
        try {
            android.graphics.Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options);
            if (bitmapDecodeStream == null) {
                return null;
            }
            int iGEmmrt = C33570myu.gEmmrt(c32979mnm.OLrzqt());
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            if (bitmapDecodeStream.getWidth() > 1080) {
                float width = 1080.0f / bitmapDecodeStream.getWidth();
                matrix.setScale(width, width);
            }
            if (z) {
                bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmapDecodeStream, 0, iGEmmrt, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight() - iGEmmrt, matrix, true);
            } else {
                bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, true);
            }
            return bitmapCreateBitmap;
        } catch (java.lang.Throwable th) {
            try {
                pUU.copydefault("Web3ShareImageHandler", "decodeBitmapFromFile error:" + th.getMessage());
                return null;
            } finally {
                C33486mxP.AEQbTJ(inputStreamOpenInputStream2);
            }
        }
    }

    public final android.graphics.Bitmap OLrzqt(android.app.Activity activity, android.graphics.Bitmap bitmap, Web3ShareFooterInfo web3ShareFooterInfo) {
        pUU.KWHzl("Web3ShareImageHandler", "buildShareBitmap start->sourceImage.w:" + (bitmap != null ? java.lang.Integer.valueOf(bitmap.getWidth()) : null) + "  sourceImage.h:" + (bitmap != null ? java.lang.Integer.valueOf(bitmap.getHeight()) : null));
        try {
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int iMin = java.lang.Math.min(java.lang.Math.min(bitmap.getWidth(), displayMetrics.widthPixels), 1080);
            float f = iMin;
            int height = (int) ((bitmap.getHeight() / bitmap.getWidth()) * f);
            android.view.View viewInflate = android.view.LayoutInflater.from(activity).inflate(C13754dXa.TaskDescription.znKlvJ, (android.view.ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            C49352umt c49352umt = (C49352umt) viewInflate.findViewById(C13754dXa.ActionBar.ONJgbh);
            java.lang.CharSequence footTitle = web3ShareFooterInfo.getFootTitle();
            if (footTitle != null && C33129mqd.OLrzqt(footTitle)) {
                c49352umt.setTitle(footTitle);
            }
            java.lang.CharSequence footSubTitle = web3ShareFooterInfo.getFootSubTitle();
            if (footSubTitle != null && C33129mqd.OLrzqt(footSubTitle)) {
                c49352umt.setSubTitle(footSubTitle);
            }
            java.lang.String footQRCode = web3ShareFooterInfo.getFootQRCode();
            if (footQRCode != null) {
                c49352umt.setQRCode(footQRCode);
            }
            C33487mxQ.EZpvd(viewInflate, displayMetrics.widthPixels, displayMetrics.heightPixels);
            android.graphics.Bitmap bitmapCopydefault = C33570myu.copydefault(viewInflate, true);
            int height2 = (int) (bitmapCopydefault.getHeight() * (f / bitmapCopydefault.getWidth()));
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iMin, height + height2, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
            android.graphics.Canvas canvasEZpvd = Companion.EZpvd(bitmapCreateBitmap);
            canvasEZpvd.drawBitmap(bitmap, (android.graphics.Rect) null, new android.graphics.Rect(0, 0, bitmapCreateBitmap.getWidth(), height), (android.graphics.Paint) null);
            canvasEZpvd.drawBitmap(bitmapCopydefault, (android.graphics.Rect) null, new android.graphics.Rect(0, bitmapCreateBitmap.getHeight() - height2, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight()), (android.graphics.Paint) null);
            pUU.KWHzl("Web3ShareImageHandler", "buildShareBitmap->bmp->w:" + java.lang.Integer.valueOf(bitmapCreateBitmap.getWidth()) + "  h:" + java.lang.Integer.valueOf(bitmapCreateBitmap.getHeight()));
            return bitmapCreateBitmap;
        } catch (java.lang.Throwable th) {
            pUU.copydefault("Web3ShareImageHandler", "combineShareBitmap error:" + th.getMessage());
            return bitmap;
        }
    }
}
