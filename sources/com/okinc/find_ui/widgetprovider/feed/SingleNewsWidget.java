package com.okinc.find_ui.widgetprovider.feed;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.camera.video.AudioStats;
import com.okinc.find_ui.widgetprovider.feed.FourNewsWidgetUpdateWorker;
import java.math.RoundingMode;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import o.C33070mpX;
import o.C33129mqd;
import o.C33512mxp;
import o.C35129npW;
import o.C43251rlk;
import o.C52761wXj;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC43033rhe;
import o.pTB;
import o.qZH;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes8.dex */
public final class SingleNewsWidget extends AppWidgetProvider {
    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appWidgetManager, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        AEQbTJ(context, appWidgetManager, iArr);
    }

    public final void AEQbTJ(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new SingleNewsWidget$fetchAndUpdateNews$1(this, context, appWidgetManager, iArr, null), 3, null);
    }

    /* JADX DEBUG: Duplicate block (B:164:0x042d) to fix multi-entry loop: BACK_EDGE: B:164:0x042d -> B:165:0x0437 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v41, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v43, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v45, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v48, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v51, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v54, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r10v11, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r10v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v23, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v19, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v8, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v18, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v21, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v24, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v27, resolved type: T */
    /* JADX WARN: Can't wrap try/catch for region: R(22:(1:173)|52|53|187|54|55|183|56|57|177|58|59|171|60|61|185|62|63|181|64|65|(1:67)(8:68|179|69|89|(0)|92|(0)(0)|(1:101)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(22:173|52|53|187|54|55|183|56|57|177|58|59|171|60|61|185|62|63|181|64|65|(1:67)(8:68|179|69|89|(0)|92|(0)(0)|(1:101)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(31:11|(3:175|12|13)|179|69|89|(1:91)|92|(1:95)(1:96)|(23:98|(1:100)|103|(1:105)(1:106)|107|(1:109)(1:110)|111|(1:113)(1:114)|115|(3:124|(1:126)|(1:128))(3:117|(1:119)(1:120)|(1:122)(1:123))|129|(1:131)|132|(3:134|(1:139)(1:138)|140)|141|(2:143|(1:145))|146|(2:148|(1:150)(1:151))|152|(3:154|(1:156)(1:157)|158)|159|165|(3:32|(1:34)(1:35)|(4:160|(2:162|164)(2:163|189)|165|(5:166|(1:168)|190|169|170)(0))(7:37|(1:39)(1:40)|(1:42)(1:43)|(3:47|(1:50)|(22:173|52|53|187|54|55|183|56|57|177|58|59|171|60|61|185|62|63|181|64|65|(1:67)(8:68|179|69|89|(0)|92|(0)(0)|(1:101)(0))))|93|(0)(0)|(0)(0)))(0))(0)|102|103|(0)(0)|107|(0)(0)|111|(0)(0)|115|(0)(0)|129|(0)|132|(0)|141|(0)|146|(0)|152|(0)|159|165|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01f9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01fb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01fc, code lost:
    
        r5 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ff, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0200, code lost:
    
        r19 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0203, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0204, code lost:
    
        r35 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0207, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0208, code lost:
    
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x020b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x020c, code lost:
    
        r34 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x020f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0210, code lost:
    
        r36 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0217, code lost:
    
        r17 = r2;
        r22 = r9;
        r21 = r11;
        r11 = r34;
        r9 = r35;
        r2 = r1;
        r1 = r6;
        r6 = r15;
        r15 = r12;
        r12 = r36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0284  */
    /* JADX WARN: Type inference failed for: r0v29, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v31, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v33, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v35, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v37, types: [T, java.lang.Integer] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x01e2 -> B:179:0x01f2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x0227 -> B:89:0x0231). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x025c -> B:94:0x0272). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(Context context, AppWidgetManager appWidgetManager, int[] iArr, List<NewsItem> list, Continuation<? super Unit> continuation) throws Throwable {
        SingleNewsWidget$updateWidget$1 singleNewsWidget$updateWidget$1;
        SingleNewsWidget singleNewsWidget;
        List<NewsItem> list2;
        RemoteViews remoteViews;
        SingleNewsWidget$updateWidget$1 singleNewsWidget$updateWidget$12;
        int i;
        int i2;
        int i3;
        int i4;
        Context context2;
        AppWidgetManager appWidgetManager2;
        int[] iArr2;
        Integer num;
        NewsItem newsItem;
        List<NewsItem> list3;
        int i5;
        int i6;
        TokenInfo tokenInfo;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        Object obj;
        Ref.ObjectRef objectRef4;
        Context context3;
        Throwable th;
        Object objM7377constructorimpl;
        Object obj2;
        int i7;
        int i8;
        TokenInfo tokenInfo2;
        String icon;
        String coinName;
        int i9;
        int i10;
        String strCopydefault;
        double dDivD$default;
        boolean z;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        String title;
        if (continuation instanceof SingleNewsWidget$updateWidget$1) {
            singleNewsWidget$updateWidget$1 = (SingleNewsWidget$updateWidget$1) continuation;
            int i11 = singleNewsWidget$updateWidget$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                singleNewsWidget$updateWidget$1.label = i11 - Integer.MIN_VALUE;
            } else {
                singleNewsWidget$updateWidget$1 = new SingleNewsWidget$updateWidget$1(this, continuation);
            }
        }
        Object objOLrzqt = singleNewsWidget$updateWidget$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i12 = singleNewsWidget$updateWidget$1.label;
        if (i12 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), qZH.ActionBar.svhCHd);
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            int iCopydefault = C33070mpX.copydefault(c33512mxp.isConnected() == 0 ? C52761wXj.Activity.HJWChPRAkuRW : C52761wXj.Activity.fhUrPt);
            int iCopydefault2 = C33070mpX.copydefault(c33512mxp.isConnected() != 0 ? C52761wXj.Activity.HJWChPRAkuRW : C52761wXj.Activity.fhUrPt);
            if (Build.VERSION.SDK_INT <= 29) {
                remoteViews2.setViewVisibility(qZH.StateListAnimator.QsIRgs, 8);
            } else {
                remoteViews2.setViewVisibility(qZH.StateListAnimator.QsIRgs, 0);
            }
            singleNewsWidget = this;
            list2 = list;
            remoteViews = remoteViews2;
            singleNewsWidget$updateWidget$12 = singleNewsWidget$updateWidget$1;
            i = iCopydefault2;
            i2 = iCopydefault;
            i3 = 0;
            i4 = 1;
            context2 = context;
            appWidgetManager2 = appWidgetManager;
            iArr2 = iArr;
            if (i3 < i4) {
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i13 = singleNewsWidget$updateWidget$1.I$4;
            int i14 = singleNewsWidget$updateWidget$1.I$3;
            int i15 = singleNewsWidget$updateWidget$1.I$2;
            int i16 = singleNewsWidget$updateWidget$1.I$1;
            int i17 = singleNewsWidget$updateWidget$1.I$0;
            TokenInfo tokenInfo3 = (TokenInfo) singleNewsWidget$updateWidget$1.L$13;
            NewsItem newsItem2 = (NewsItem) singleNewsWidget$updateWidget$1.L$12;
            Integer num7 = (Integer) singleNewsWidget$updateWidget$1.L$11;
            Ref.ObjectRef objectRef5 = (Ref.ObjectRef) singleNewsWidget$updateWidget$1.L$10;
            Ref.ObjectRef objectRef6 = (Ref.ObjectRef) singleNewsWidget$updateWidget$1.L$9;
            Ref.ObjectRef objectRef7 = (Ref.ObjectRef) singleNewsWidget$updateWidget$1.L$8;
            Ref.ObjectRef objectRef8 = (Ref.ObjectRef) singleNewsWidget$updateWidget$1.L$7;
            Ref.ObjectRef objectRef9 = (Ref.ObjectRef) singleNewsWidget$updateWidget$1.L$6;
            RemoteViews remoteViews3 = (RemoteViews) singleNewsWidget$updateWidget$1.L$5;
            List<NewsItem> list4 = (List) singleNewsWidget$updateWidget$1.L$4;
            int[] iArr3 = (int[]) singleNewsWidget$updateWidget$1.L$3;
            AppWidgetManager appWidgetManager3 = (AppWidgetManager) singleNewsWidget$updateWidget$1.L$2;
            Context context4 = (Context) singleNewsWidget$updateWidget$1.L$1;
            SingleNewsWidget singleNewsWidget2 = (SingleNewsWidget) singleNewsWidget$updateWidget$1.L$0;
            try {
                C56391yDq.AEQbTJ(objOLrzqt);
                list3 = list4;
                i5 = i13;
                newsItem = newsItem2;
                num = num7;
                iArr2 = iArr3;
                objectRef = objectRef8;
                tokenInfo = tokenInfo3;
                objectRef2 = objectRef9;
                obj = objCopydefault;
                objectRef4 = objectRef6;
                singleNewsWidget = singleNewsWidget2;
                context3 = context4;
                i6 = i15;
                objectRef3 = objectRef5;
                remoteViews = remoteViews3;
            } catch (Throwable th2) {
                th = th2;
                list3 = list4;
                i5 = i13;
                newsItem = newsItem2;
                num = num7;
                iArr2 = iArr3;
                objectRef = objectRef8;
                tokenInfo = tokenInfo3;
                objectRef2 = objectRef9;
                obj = objCopydefault;
                objectRef4 = objectRef6;
                singleNewsWidget = singleNewsWidget2;
                context3 = context4;
                i6 = i15;
                objectRef3 = objectRef5;
                remoteViews = remoteViews3;
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                Ref.ObjectRef objectRef10 = objectRef7;
                singleNewsWidget$updateWidget$12 = singleNewsWidget$updateWidget$1;
                context2 = context3;
                AppWidgetManager appWidgetManager4 = appWidgetManager3;
                Ref.ObjectRef objectRef11 = objectRef;
                Ref.ObjectRef objectRef12 = objectRef2;
                int i18 = i17;
                int i19 = i16;
                Ref.ObjectRef objectRef13 = objectRef3;
                int i20 = i14;
                Integer numAEQbTJ = num;
                int i21 = i5;
                int i22 = i6;
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                }
                Bitmap bitmap = (Bitmap) objM7377constructorimpl;
                AppWidgetManager appWidgetManager5 = appWidgetManager4;
                int[] iArr4 = iArr2;
                Ref.ObjectRef objectRef14 = objectRef11;
                Ref.ObjectRef objectRef15 = objectRef10;
                i6 = i22;
                i5 = i21;
                if (tokenInfo == null) {
                }
                if (tokenInfo == null) {
                }
                i9 = i19;
                i10 = i18;
                strCopydefault = null;
                if (strCopydefault != null) {
                }
                if (dDivD$default >= AudioStats.AUDIO_AMPLITUDE_NONE) {
                }
                if (z) {
                }
                if (i5 != 0) {
                }
                num2 = (Integer) objectRef4.element;
                if (num2 != null) {
                }
                num3 = (Integer) objectRef12.element;
                if (num3 != null) {
                }
                num4 = (Integer) objectRef14.element;
                if (num4 != null) {
                }
                num5 = (Integer) objectRef15.element;
                if (num5 != null) {
                }
                num6 = (Integer) objectRef13.element;
                if (num6 != null) {
                }
                appWidgetManager2 = appWidgetManager5;
                iArr2 = iArr4;
                singleNewsWidget$updateWidget$12 = singleNewsWidget$updateWidget$1;
                int i23 = i;
                i4 = i6;
                list2 = list3;
                i = i9;
                i2 = i10;
                i3 = i23 + 1;
                objCopydefault = obj2;
                if (i3 < i4) {
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl((Bitmap) objOLrzqt);
            Ref.ObjectRef objectRef102 = objectRef7;
            singleNewsWidget$updateWidget$12 = singleNewsWidget$updateWidget$1;
            context2 = context3;
            AppWidgetManager appWidgetManager42 = appWidgetManager3;
            Ref.ObjectRef objectRef112 = objectRef;
            Ref.ObjectRef objectRef122 = objectRef2;
            int i182 = i17;
            int i192 = i16;
            Ref.ObjectRef objectRef132 = objectRef3;
            int i202 = i14;
            Integer numAEQbTJ2 = num;
            int i212 = i5;
            int i222 = i6;
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            Bitmap bitmap2 = (Bitmap) objM7377constructorimpl;
            AppWidgetManager appWidgetManager52 = appWidgetManager42;
            int[] iArr42 = iArr2;
            Ref.ObjectRef objectRef142 = objectRef112;
            Ref.ObjectRef objectRef152 = objectRef102;
            i6 = i222;
            i5 = i212;
            if (tokenInfo == null) {
                obj2 = obj;
                coinName = tokenInfo.getCoinName();
            } else {
                obj2 = obj;
                coinName = null;
            }
            if (tokenInfo == null) {
                SingleNewsWidget$updateWidget$1 singleNewsWidget$updateWidget$13 = singleNewsWidget$updateWidget$12;
                InterfaceC43033rhe interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.OLrzqt(InterfaceC43033rhe.class);
                int i24 = i202;
                if (interfaceC43033rhe != null) {
                    i9 = i192;
                    i10 = i182;
                    strCopydefault = interfaceC43033rhe.copydefault(tokenInfo.getOpen24h(), tokenInfo.getSodUtc0(), tokenInfo.getSodUtc8());
                }
                if (strCopydefault != null) {
                    String str = strCopydefault;
                    dDivD$default = C33129mqd.divD$default(C33129mqd.subS$default(tokenInfo.getLast(), str, null, null, null, 14, null), str, C56443yFo.AEQbTJ(4), null, RoundingMode.HALF_UP, 4, null);
                } else {
                    dDivD$default = 0.0d;
                }
                boolean z2 = dDivD$default >= AudioStats.AUDIO_AMPLITUDE_NONE;
                String str2 = z2 ? Marker.ANY_NON_NULL_MARKER : "";
                if (i5 != 0) {
                    Integer num8 = (Integer) objectRef122.element;
                    if (num8 != null) {
                        num8.intValue();
                        z = z2;
                        remoteViews.setInt(((Number) objectRef122.element).intValue(), "setLines", 3);
                    } else {
                        z = z2;
                    }
                    if (numAEQbTJ2 != null) {
                        remoteViews.setViewVisibility(numAEQbTJ2.intValue(), 0);
                    }
                } else {
                    z = z2;
                    Integer num9 = (Integer) objectRef122.element;
                    if (num9 != null) {
                        num9.intValue();
                        remoteViews.setInt(((Number) objectRef122.element).intValue(), "setLines", 4);
                    }
                    if (numAEQbTJ2 != null) {
                        remoteViews.setViewVisibility(numAEQbTJ2.intValue(), 8);
                    }
                }
                num2 = (Integer) objectRef4.element;
                if (num2 != null) {
                    num2.intValue();
                    singleNewsWidget.EZpvd(context2, remoteViews, ((Number) objectRef4.element).intValue(), newsItem.getContentId());
                }
                num3 = (Integer) objectRef122.element;
                if (num3 != null) {
                    num3.intValue();
                    String translatedTitle = newsItem.getTranslatedTitle();
                    if (translatedTitle != null && translatedTitle.length() > 0) {
                        title = newsItem.getTranslatedTitle();
                    } else {
                        title = newsItem.getTitle();
                    }
                    remoteViews.setTextViewText(((Number) objectRef122.element).intValue(), title);
                }
                num4 = (Integer) objectRef142.element;
                if (num4 != null) {
                    num4.intValue();
                    if (bitmap2 != null) {
                        remoteViews.setImageViewBitmap(((Number) objectRef142.element).intValue(), bitmap2);
                    }
                }
                num5 = (Integer) objectRef152.element;
                if (num5 != null) {
                    num5.intValue();
                    if (coinName != null) {
                        remoteViews.setTextViewText(((Number) objectRef152.element).intValue(), coinName);
                    } else {
                        remoteViews.setTextViewText(((Number) objectRef152.element).intValue(), "");
                    }
                }
                num6 = (Integer) objectRef132.element;
                if (num6 != null) {
                    num6.intValue();
                    remoteViews.setTextViewText(((Number) objectRef132.element).intValue(), str2 + pTB.formatICUPercent$default(C33129mqd.EZpvd(C56443yFo.AEQbTJ(dDivD$default)), null, null, null, null, null, 31, null));
                    remoteViews.setTextColor(((Number) objectRef132.element).intValue(), z ? i10 : i9);
                }
                appWidgetManager2 = appWidgetManager52;
                iArr2 = iArr42;
                singleNewsWidget$updateWidget$12 = singleNewsWidget$updateWidget$13;
                int i232 = i24;
                i4 = i6;
                list2 = list3;
                i = i9;
                i2 = i10;
                i3 = i232 + 1;
                objCopydefault = obj2;
                if (i3 < i4) {
                    objectRef2 = new Ref.ObjectRef();
                    objectRef = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef16 = new Ref.ObjectRef();
                    obj2 = objCopydefault;
                    objectRef4 = new Ref.ObjectRef();
                    i6 = i4;
                    objectRef3 = new Ref.ObjectRef();
                    int i25 = i;
                    NewsItem newsItem3 = (NewsItem) CollectionsKt___CollectionsKt.AkhnZx(list2, i3);
                    if (i3 == 0) {
                        objectRef2.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.MediaBrowserCompatMediaBrowserImplBase2);
                        objectRef.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.zpGcln);
                        objectRef16.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.swzYdv);
                        objectRef4.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.dump);
                        objectRef3.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.zAEkPU);
                        i7 = i3;
                        numAEQbTJ2 = C56443yFo.AEQbTJ(qZH.StateListAnimator.gmHjFq);
                    } else {
                        i7 = i3;
                        numAEQbTJ2 = null;
                    }
                    if (newsItem3 != null) {
                        List<TokenInfo> tokens = newsItem3.getTokens();
                        if (tokens != null) {
                            i8 = i2;
                            tokenInfo2 = (TokenInfo) CollectionsKt___CollectionsKt.firstOrNull(tokens);
                        } else {
                            i8 = i2;
                            tokenInfo2 = null;
                        }
                        i5 = tokenInfo2 != null ? 1 : 0;
                        if (tokenInfo2 != null && (icon = tokenInfo2.getIcon()) != null) {
                            if (icon.length() <= 0) {
                                icon = null;
                            }
                            if (icon != null) {
                                try {
                                } catch (Throwable th3) {
                                    th = th3;
                                    list3 = list2;
                                }
                                Result.Application application2 = Result.Companion;
                                singleNewsWidget$updateWidget$12.L$0 = singleNewsWidget;
                                singleNewsWidget$updateWidget$12.L$1 = context2;
                                singleNewsWidget$updateWidget$12.L$2 = appWidgetManager2;
                                singleNewsWidget$updateWidget$12.L$3 = iArr2;
                                singleNewsWidget$updateWidget$12.L$4 = list2;
                                singleNewsWidget$updateWidget$12.L$5 = remoteViews;
                                singleNewsWidget$updateWidget$12.L$6 = objectRef2;
                                singleNewsWidget$updateWidget$12.L$7 = objectRef;
                                singleNewsWidget$updateWidget$12.L$8 = objectRef16;
                                singleNewsWidget$updateWidget$12.L$9 = objectRef4;
                                singleNewsWidget$updateWidget$12.L$10 = objectRef3;
                                singleNewsWidget$updateWidget$12.L$11 = numAEQbTJ2;
                                singleNewsWidget$updateWidget$12.L$12 = newsItem3;
                                singleNewsWidget$updateWidget$12.L$13 = tokenInfo2;
                                list3 = list2;
                                int i26 = i8;
                                singleNewsWidget$updateWidget$12.I$0 = i26;
                                i8 = i26;
                                singleNewsWidget$updateWidget$12.I$1 = i25;
                                i25 = i25;
                                singleNewsWidget$updateWidget$12.I$2 = i6;
                                i6 = i6;
                                int i27 = i7;
                                singleNewsWidget$updateWidget$12.I$3 = i27;
                                i7 = i27;
                                int i28 = i5;
                                singleNewsWidget$updateWidget$12.I$4 = i28;
                                i5 = i28;
                                singleNewsWidget$updateWidget$12.label = 1;
                                objOLrzqt = C35129npW.OLrzqt(context2, icon, singleNewsWidget$updateWidget$12);
                                obj = obj2;
                                if (objOLrzqt == obj) {
                                    return obj;
                                }
                                appWidgetManager3 = appWidgetManager2;
                                num = numAEQbTJ2;
                                newsItem = newsItem3;
                                i16 = i25;
                                i14 = i7;
                                context3 = context2;
                                singleNewsWidget$updateWidget$1 = singleNewsWidget$updateWidget$12;
                                objectRef7 = objectRef16;
                                tokenInfo = tokenInfo2;
                                i17 = i8;
                                objM7377constructorimpl = Result.m7377constructorimpl((Bitmap) objOLrzqt);
                                Ref.ObjectRef objectRef1022 = objectRef7;
                                singleNewsWidget$updateWidget$12 = singleNewsWidget$updateWidget$1;
                                context2 = context3;
                                AppWidgetManager appWidgetManager422 = appWidgetManager3;
                                Ref.ObjectRef objectRef1122 = objectRef;
                                Ref.ObjectRef objectRef1222 = objectRef2;
                                int i1822 = i17;
                                int i1922 = i16;
                                Ref.ObjectRef objectRef1322 = objectRef3;
                                int i2022 = i14;
                                Integer numAEQbTJ22 = num;
                                int i2122 = i5;
                                int i2222 = i6;
                                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                                }
                                Bitmap bitmap22 = (Bitmap) objM7377constructorimpl;
                                AppWidgetManager appWidgetManager522 = appWidgetManager422;
                                int[] iArr422 = iArr2;
                                Ref.ObjectRef objectRef1422 = objectRef1122;
                                Ref.ObjectRef objectRef1522 = objectRef1022;
                                i6 = i2222;
                                i5 = i2122;
                                if (tokenInfo == null) {
                                }
                                if (tokenInfo == null) {
                                    singleNewsWidget$updateWidget$13 = singleNewsWidget$updateWidget$12;
                                    i24 = i2022;
                                }
                            }
                        }
                        list3 = list2;
                        obj = obj2;
                        newsItem = newsItem3;
                        bitmap22 = null;
                        objectRef1322 = objectRef3;
                        i2022 = i7;
                        iArr422 = iArr2;
                        objectRef1522 = objectRef16;
                        tokenInfo = tokenInfo2;
                        i1922 = i25;
                        appWidgetManager522 = appWidgetManager2;
                        objectRef1422 = objectRef;
                        objectRef1222 = objectRef2;
                        i1822 = i8;
                        if (tokenInfo == null) {
                        }
                        if (tokenInfo == null) {
                        }
                    } else {
                        List<NewsItem> list5 = list2;
                        int i29 = i2;
                        Integer num10 = (Integer) objectRef4.element;
                        if (num10 != null) {
                            remoteViews.setViewVisibility(num10.intValue(), 8);
                            i = i25;
                            i232 = i7;
                            i2 = i29;
                            i4 = i6;
                            list2 = list5;
                        } else {
                            i = i25;
                            i232 = i7;
                            i2 = i29;
                            i4 = i6;
                            list2 = list5;
                        }
                        i3 = i232 + 1;
                        objCopydefault = obj2;
                        if (i3 < i4) {
                            for (int i30 : iArr2) {
                                appWidgetManager2.updateAppWidget(i30, remoteViews);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
            i9 = i1922;
            i10 = i1822;
            strCopydefault = null;
            if (strCopydefault != null) {
            }
            if (dDivD$default >= AudioStats.AUDIO_AMPLITUDE_NONE) {
            }
            if (z2) {
            }
            if (i5 != 0) {
            }
            num2 = (Integer) objectRef4.element;
            if (num2 != null) {
            }
            num3 = (Integer) objectRef1222.element;
            if (num3 != null) {
            }
            num4 = (Integer) objectRef1422.element;
            if (num4 != null) {
            }
            num5 = (Integer) objectRef1522.element;
            if (num5 != null) {
            }
            num6 = (Integer) objectRef1322.element;
            if (num6 != null) {
            }
            appWidgetManager2 = appWidgetManager522;
            iArr2 = iArr422;
            singleNewsWidget$updateWidget$12 = singleNewsWidget$updateWidget$13;
            int i2322 = i24;
            i4 = i6;
            list2 = list3;
            i = i9;
            i2 = i10;
            i3 = i2322 + 1;
            objCopydefault = obj2;
            if (i3 < i4) {
            }
        }
    }

    public final void EZpvd(Context context, RemoteViews remoteViews, int i, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("okx://miniapp?appid=market&pageurl=/feed/detail&fromPage=contentWidget&contentId=" + str));
        intent.addFlags(335544320);
        remoteViews.setOnClickPendingIntent(i, PendingIntent.getActivity(context, str.hashCode(), intent, 201326592));
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onEnabled(Context context) {
        super.onEnabled(context);
        if (context != null) {
            FourNewsWidgetUpdateWorker.TaskDescription.schedulePeriodicWork$default(FourNewsWidgetUpdateWorker.Companion, context, false, 2, null);
        }
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}
