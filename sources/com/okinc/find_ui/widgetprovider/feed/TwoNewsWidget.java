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
import com.okinc.find_ui.widgetprovider.feed.TwoNewsWidgetUpdateWorker;
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
public final class TwoNewsWidget extends AppWidgetProvider {
    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appWidgetManager, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        AEQbTJ(context, appWidgetManager, iArr);
    }

    public final void AEQbTJ(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new TwoNewsWidget$fetchAndUpdateNews$1(this, context, appWidgetManager, iArr, null), 3, null);
    }

    /* JADX DEBUG: Duplicate block (B:170:0x046d) to fix multi-entry loop: BACK_EDGE: B:170:0x046d -> B:171:0x0477 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v54, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v57, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v60, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v63, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v15, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v19, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v25, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v11, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v22, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v9, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v15, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v18, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v21, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v24, resolved type: T */
    /* JADX WARN: Can't wrap try/catch for region: R(22:(1:183)|56|57|179|58|59|193|60|61|187|62|63|181|64|65|177|66|67|191|68|69|(1:71)(8:72|189|73|93|(0)|96|(0)(0)|(1:105)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(22:183|56|57|179|58|59|193|60|61|187|62|63|181|64|65|177|66|67|191|68|69|(1:71)(8:72|189|73|93|(0)|96|(0)(0)|(1:105)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(31:11|(3:185|12|13)|189|73|93|(1:95)|96|(1:99)(1:100)|(23:102|(1:104)|107|(1:109)(1:110)|111|(1:113)(1:114)|115|(1:117)(1:118)|119|(3:129|(1:131)(1:132)|(1:134))(4:121|(1:123)(1:124)|(1:126)(1:127)|128)|135|(1:137)|138|(3:140|(1:145)(1:144)|146)|147|(2:149|(1:151))|152|(2:154|(1:156)(1:157))|158|(3:160|(1:162)(1:163)|164)|165|171|(4:32|(2:34|(2:36|(4:166|(2:168|170)(2:169|195)|171|(5:172|(1:174)|196|175|176)(0))(7:41|(1:43)(1:44)|(1:46)(1:47)|(3:51|(1:54)|(22:183|56|57|179|58|59|193|60|61|187|62|63|181|64|65|177|66|67|191|68|69|(1:71)(8:72|189|73|93|(0)|96|(0)(0)|(1:105)(0))))|97|(0)(0)|(0)(0)))(1:37))(1:38)|39|(0)(0))(0))(0)|106|107|(0)(0)|111|(0)(0)|115|(0)(0)|119|(0)(0)|135|(0)|138|(0)|147|(0)|152|(0)|158|(0)|165|171|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x022c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x022e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x022f, code lost:
    
        r5 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0232, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0233, code lost:
    
        r18 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0236, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0237, code lost:
    
        r35 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x023a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x023b, code lost:
    
        r17 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x023e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x023f, code lost:
    
        r33 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0242, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0243, code lost:
    
        r34 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x024a, code lost:
    
        r16 = r2;
        r20 = r10;
        r21 = r12;
        r12 = r33;
        r10 = r35;
        r2 = r1;
        r1 = r6;
        r6 = r14;
        r14 = r34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02b1  */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v42, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v44, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v46, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v48, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v50, types: [T, java.lang.Integer] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0216 -> B:189:0x0225). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x0259 -> B:93:0x0263). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x0298 -> B:98:0x02af). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(Context context, AppWidgetManager appWidgetManager, int[] iArr, List<NewsItem> list, Continuation<? super Unit> continuation) throws Throwable {
        TwoNewsWidget$updateWidget$1 twoNewsWidget$updateWidget$1;
        TwoNewsWidget twoNewsWidget;
        List<NewsItem> list2;
        RemoteViews remoteViews;
        TwoNewsWidget$updateWidget$1 twoNewsWidget$updateWidget$12;
        int i;
        int i2;
        int i3;
        int i4;
        Context context2;
        AppWidgetManager appWidgetManager2;
        int[] iArr2;
        NewsItem newsItem;
        TokenInfo tokenInfo;
        List<NewsItem> list3;
        int i5;
        int i6;
        Ref.ObjectRef objectRef;
        int i7;
        Integer num;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        Object obj;
        Ref.ObjectRef objectRef4;
        Context context3;
        Throwable th;
        Object objM7377constructorimpl;
        int i8;
        Integer numAEQbTJ;
        Object obj2;
        int i9;
        TokenInfo tokenInfo2;
        String icon;
        String coinName;
        Ref.ObjectRef objectRef5;
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
        if (continuation instanceof TwoNewsWidget$updateWidget$1) {
            twoNewsWidget$updateWidget$1 = (TwoNewsWidget$updateWidget$1) continuation;
            int i11 = twoNewsWidget$updateWidget$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                twoNewsWidget$updateWidget$1.label = i11 - Integer.MIN_VALUE;
            } else {
                twoNewsWidget$updateWidget$1 = new TwoNewsWidget$updateWidget$1(this, continuation);
            }
        }
        Object objOLrzqt = twoNewsWidget$updateWidget$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i12 = twoNewsWidget$updateWidget$1.label;
        if (i12 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), qZH.ActionBar.v);
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            int iCopydefault = C33070mpX.copydefault(c33512mxp.isConnected() == 0 ? C52761wXj.Activity.HJWChPRAkuRW : C52761wXj.Activity.fhUrPt);
            int iCopydefault2 = C33070mpX.copydefault(c33512mxp.isConnected() != 0 ? C52761wXj.Activity.HJWChPRAkuRW : C52761wXj.Activity.fhUrPt);
            if (Build.VERSION.SDK_INT <= 29) {
                remoteViews2.setViewVisibility(qZH.StateListAnimator.QsIRgs, 8);
            } else {
                remoteViews2.setViewVisibility(qZH.StateListAnimator.QsIRgs, 0);
            }
            twoNewsWidget = this;
            list2 = list;
            remoteViews = remoteViews2;
            twoNewsWidget$updateWidget$12 = twoNewsWidget$updateWidget$1;
            i = iCopydefault2;
            i2 = iCopydefault;
            i3 = 0;
            i4 = 2;
            context2 = context;
            appWidgetManager2 = appWidgetManager;
            iArr2 = iArr;
            if (i3 < i4) {
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i13 = twoNewsWidget$updateWidget$1.I$4;
            int i14 = twoNewsWidget$updateWidget$1.I$3;
            int i15 = twoNewsWidget$updateWidget$1.I$2;
            int i16 = twoNewsWidget$updateWidget$1.I$1;
            int i17 = twoNewsWidget$updateWidget$1.I$0;
            TokenInfo tokenInfo3 = (TokenInfo) twoNewsWidget$updateWidget$1.L$13;
            NewsItem newsItem2 = (NewsItem) twoNewsWidget$updateWidget$1.L$12;
            Integer num7 = (Integer) twoNewsWidget$updateWidget$1.L$11;
            Ref.ObjectRef objectRef6 = (Ref.ObjectRef) twoNewsWidget$updateWidget$1.L$10;
            Ref.ObjectRef objectRef7 = (Ref.ObjectRef) twoNewsWidget$updateWidget$1.L$9;
            Ref.ObjectRef objectRef8 = (Ref.ObjectRef) twoNewsWidget$updateWidget$1.L$8;
            Ref.ObjectRef objectRef9 = (Ref.ObjectRef) twoNewsWidget$updateWidget$1.L$7;
            Ref.ObjectRef objectRef10 = (Ref.ObjectRef) twoNewsWidget$updateWidget$1.L$6;
            RemoteViews remoteViews3 = (RemoteViews) twoNewsWidget$updateWidget$1.L$5;
            List<NewsItem> list4 = (List) twoNewsWidget$updateWidget$1.L$4;
            int[] iArr3 = (int[]) twoNewsWidget$updateWidget$1.L$3;
            AppWidgetManager appWidgetManager3 = (AppWidgetManager) twoNewsWidget$updateWidget$1.L$2;
            Context context4 = (Context) twoNewsWidget$updateWidget$1.L$1;
            TwoNewsWidget twoNewsWidget2 = (TwoNewsWidget) twoNewsWidget$updateWidget$1.L$0;
            try {
                C56391yDq.AEQbTJ(objOLrzqt);
                list3 = list4;
                i5 = i13;
                tokenInfo = tokenInfo3;
                newsItem = newsItem2;
                iArr2 = iArr3;
                objectRef = objectRef8;
                i7 = i17;
                remoteViews = remoteViews3;
                num = num7;
                twoNewsWidget = twoNewsWidget2;
                context3 = context4;
                i6 = i15;
                objectRef2 = objectRef6;
                obj = objCopydefault;
                objectRef4 = objectRef7;
                objectRef3 = objectRef10;
            } catch (Throwable th2) {
                th = th2;
                list3 = list4;
                i5 = i13;
                tokenInfo = tokenInfo3;
                newsItem = newsItem2;
                iArr2 = iArr3;
                objectRef = objectRef8;
                i7 = i17;
                remoteViews = remoteViews3;
                num = num7;
                twoNewsWidget = twoNewsWidget2;
                context3 = context4;
                i6 = i15;
                objectRef2 = objectRef6;
                obj = objCopydefault;
                objectRef4 = objectRef7;
                objectRef3 = objectRef10;
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                Ref.ObjectRef objectRef11 = objectRef9;
                twoNewsWidget$updateWidget$12 = twoNewsWidget$updateWidget$1;
                context2 = context3;
                AppWidgetManager appWidgetManager4 = appWidgetManager3;
                Integer num8 = num;
                int i18 = i16;
                NewsItem newsItem3 = newsItem;
                int i19 = i5;
                int i20 = i6;
                Ref.ObjectRef objectRef12 = objectRef;
                int i21 = i7;
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                }
                Bitmap bitmap = (Bitmap) objM7377constructorimpl;
                AppWidgetManager appWidgetManager5 = appWidgetManager4;
                int[] iArr4 = iArr2;
                Ref.ObjectRef objectRef13 = objectRef11;
                Ref.ObjectRef objectRef14 = objectRef12;
                i6 = i20;
                i5 = i19;
                int i22 = i21;
                Integer num9 = num8;
                int i23 = i18;
                NewsItem newsItem4 = newsItem3;
                Ref.ObjectRef objectRef15 = objectRef2;
                int i24 = i14;
                tokenInfo2 = tokenInfo;
                if (tokenInfo2 == null) {
                }
                if (tokenInfo2 == null) {
                }
                objectRef5 = objectRef15;
                i10 = i23;
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
                num3 = (Integer) objectRef3.element;
                if (num3 != null) {
                }
                num4 = (Integer) objectRef13.element;
                if (num4 != null) {
                }
                num5 = (Integer) objectRef14.element;
                if (num5 != null) {
                }
                Ref.ObjectRef objectRef16 = objectRef5;
                num6 = (Integer) objectRef16.element;
                if (num6 != null) {
                }
                appWidgetManager2 = appWidgetManager5;
                iArr2 = iArr4;
                twoNewsWidget$updateWidget$12 = twoNewsWidget$updateWidget$1;
                int i25 = i;
                i2 = i22;
                i4 = i6;
                list2 = list3;
                i = i10;
                i3 = i25 + 1;
                objCopydefault = obj2;
                if (i3 < i4) {
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl((Bitmap) objOLrzqt);
            Ref.ObjectRef objectRef112 = objectRef9;
            twoNewsWidget$updateWidget$12 = twoNewsWidget$updateWidget$1;
            context2 = context3;
            AppWidgetManager appWidgetManager42 = appWidgetManager3;
            Integer num82 = num;
            int i182 = i16;
            NewsItem newsItem32 = newsItem;
            int i192 = i5;
            int i202 = i6;
            Ref.ObjectRef objectRef122 = objectRef;
            int i212 = i7;
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            Bitmap bitmap2 = (Bitmap) objM7377constructorimpl;
            AppWidgetManager appWidgetManager52 = appWidgetManager42;
            int[] iArr42 = iArr2;
            Ref.ObjectRef objectRef132 = objectRef112;
            Ref.ObjectRef objectRef142 = objectRef122;
            i6 = i202;
            i5 = i192;
            int i222 = i212;
            Integer num92 = num82;
            int i232 = i182;
            NewsItem newsItem42 = newsItem32;
            Ref.ObjectRef objectRef152 = objectRef2;
            int i242 = i14;
            tokenInfo2 = tokenInfo;
            if (tokenInfo2 == null) {
                obj2 = obj;
                coinName = tokenInfo2.getCoinName();
            } else {
                obj2 = obj;
                coinName = null;
            }
            if (tokenInfo2 == null) {
                TwoNewsWidget$updateWidget$1 twoNewsWidget$updateWidget$13 = twoNewsWidget$updateWidget$12;
                InterfaceC43033rhe interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.OLrzqt(InterfaceC43033rhe.class);
                int i26 = i242;
                if (interfaceC43033rhe != null) {
                    i10 = i232;
                    objectRef5 = objectRef152;
                    strCopydefault = interfaceC43033rhe.copydefault(tokenInfo2.getOpen24h(), tokenInfo2.getSodUtc0(), tokenInfo2.getSodUtc8());
                }
                if (strCopydefault != null) {
                    String str = strCopydefault;
                    dDivD$default = C33129mqd.divD$default(C33129mqd.subS$default(tokenInfo2.getLast(), str, null, null, null, 14, null), str, C56443yFo.AEQbTJ(4), null, RoundingMode.HALF_UP, 4, null);
                } else {
                    dDivD$default = 0.0d;
                }
                boolean z2 = dDivD$default >= AudioStats.AUDIO_AMPLITUDE_NONE;
                String str2 = z2 ? Marker.ANY_NON_NULL_MARKER : "";
                if (i5 != 0) {
                    Integer num10 = (Integer) objectRef3.element;
                    if (num10 != null) {
                        num10.intValue();
                        z = z2;
                        remoteViews.setInt(((Number) objectRef3.element).intValue(), "setLines", 1);
                    } else {
                        z = z2;
                    }
                    if (num92 != null) {
                        remoteViews.setViewVisibility(num92.intValue(), 0);
                    }
                } else {
                    z = z2;
                    Integer num11 = (Integer) objectRef3.element;
                    if (num11 != null) {
                        num11.intValue();
                        remoteViews.setInt(((Number) objectRef3.element).intValue(), "setLines", 2);
                    }
                    if (num92 != null) {
                        remoteViews.setViewVisibility(num92.intValue(), 8);
                    }
                }
                num2 = (Integer) objectRef4.element;
                if (num2 != null) {
                    num2.intValue();
                    twoNewsWidget.OLrzqt(context2, remoteViews, ((Number) objectRef4.element).intValue(), newsItem42.getContentId());
                }
                num3 = (Integer) objectRef3.element;
                if (num3 != null) {
                    num3.intValue();
                    String translatedTitle = newsItem42.getTranslatedTitle();
                    if (translatedTitle != null && translatedTitle.length() > 0) {
                        title = newsItem42.getTranslatedTitle();
                    } else {
                        title = newsItem42.getTitle();
                    }
                    remoteViews.setTextViewText(((Number) objectRef3.element).intValue(), title);
                }
                num4 = (Integer) objectRef132.element;
                if (num4 != null) {
                    num4.intValue();
                    if (bitmap2 != null) {
                        remoteViews.setImageViewBitmap(((Number) objectRef132.element).intValue(), bitmap2);
                    }
                }
                num5 = (Integer) objectRef142.element;
                if (num5 != null) {
                    num5.intValue();
                    if (coinName != null) {
                        remoteViews.setTextViewText(((Number) objectRef142.element).intValue(), coinName);
                    } else {
                        remoteViews.setTextViewText(((Number) objectRef142.element).intValue(), "");
                    }
                }
                Ref.ObjectRef objectRef162 = objectRef5;
                num6 = (Integer) objectRef162.element;
                if (num6 != null) {
                    num6.intValue();
                    remoteViews.setTextViewText(((Number) objectRef162.element).intValue(), str2 + pTB.formatICUPercent$default(C33129mqd.EZpvd(C56443yFo.AEQbTJ(dDivD$default)), null, null, null, null, null, 31, null));
                    remoteViews.setTextColor(((Number) objectRef162.element).intValue(), z ? i222 : i10);
                }
                appWidgetManager2 = appWidgetManager52;
                iArr2 = iArr42;
                twoNewsWidget$updateWidget$12 = twoNewsWidget$updateWidget$13;
                int i252 = i26;
                i2 = i222;
                i4 = i6;
                list2 = list3;
                i = i10;
                i3 = i252 + 1;
                objCopydefault = obj2;
                if (i3 < i4) {
                    objectRef3 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef17 = new Ref.ObjectRef();
                    objectRef = new Ref.ObjectRef();
                    Object obj3 = objCopydefault;
                    objectRef4 = new Ref.ObjectRef();
                    i6 = i4;
                    objectRef2 = new Ref.ObjectRef();
                    int i27 = i;
                    NewsItem newsItem5 = (NewsItem) CollectionsKt___CollectionsKt.AkhnZx(list2, i3);
                    if (i3 != 0) {
                        i8 = i2;
                        if (i3 != 1) {
                            num = null;
                            if (newsItem5 != null) {
                                List<TokenInfo> tokens = newsItem5.getTokens();
                                if (tokens != null) {
                                    i9 = i3;
                                    tokenInfo2 = (TokenInfo) CollectionsKt___CollectionsKt.firstOrNull(tokens);
                                } else {
                                    i9 = i3;
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
                                        twoNewsWidget$updateWidget$12.L$0 = twoNewsWidget;
                                        twoNewsWidget$updateWidget$12.L$1 = context2;
                                        twoNewsWidget$updateWidget$12.L$2 = appWidgetManager2;
                                        twoNewsWidget$updateWidget$12.L$3 = iArr2;
                                        twoNewsWidget$updateWidget$12.L$4 = list2;
                                        twoNewsWidget$updateWidget$12.L$5 = remoteViews;
                                        twoNewsWidget$updateWidget$12.L$6 = objectRef3;
                                        twoNewsWidget$updateWidget$12.L$7 = objectRef17;
                                        twoNewsWidget$updateWidget$12.L$8 = objectRef;
                                        twoNewsWidget$updateWidget$12.L$9 = objectRef4;
                                        twoNewsWidget$updateWidget$12.L$10 = objectRef2;
                                        twoNewsWidget$updateWidget$12.L$11 = num;
                                        twoNewsWidget$updateWidget$12.L$12 = newsItem5;
                                        twoNewsWidget$updateWidget$12.L$13 = tokenInfo2;
                                        list3 = list2;
                                        int i28 = i8;
                                        twoNewsWidget$updateWidget$12.I$0 = i28;
                                        i8 = i28;
                                        twoNewsWidget$updateWidget$12.I$1 = i27;
                                        i27 = i27;
                                        twoNewsWidget$updateWidget$12.I$2 = i6;
                                        i6 = i6;
                                        int i29 = i9;
                                        twoNewsWidget$updateWidget$12.I$3 = i29;
                                        i9 = i29;
                                        int i30 = i5;
                                        twoNewsWidget$updateWidget$12.I$4 = i30;
                                        i5 = i30;
                                        twoNewsWidget$updateWidget$12.label = 1;
                                        objOLrzqt = C35129npW.OLrzqt(context2, icon, twoNewsWidget$updateWidget$12);
                                        obj = obj3;
                                        if (objOLrzqt == obj) {
                                            return obj;
                                        }
                                        appWidgetManager3 = appWidgetManager2;
                                        tokenInfo = tokenInfo2;
                                        newsItem = newsItem5;
                                        i16 = i27;
                                        i14 = i9;
                                        context3 = context2;
                                        twoNewsWidget$updateWidget$1 = twoNewsWidget$updateWidget$12;
                                        objectRef9 = objectRef17;
                                        i7 = i8;
                                        objM7377constructorimpl = Result.m7377constructorimpl((Bitmap) objOLrzqt);
                                        Ref.ObjectRef objectRef1122 = objectRef9;
                                        twoNewsWidget$updateWidget$12 = twoNewsWidget$updateWidget$1;
                                        context2 = context3;
                                        AppWidgetManager appWidgetManager422 = appWidgetManager3;
                                        Integer num822 = num;
                                        int i1822 = i16;
                                        NewsItem newsItem322 = newsItem;
                                        int i1922 = i5;
                                        int i2022 = i6;
                                        Ref.ObjectRef objectRef1222 = objectRef;
                                        int i2122 = i7;
                                        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                                        }
                                        Bitmap bitmap22 = (Bitmap) objM7377constructorimpl;
                                        AppWidgetManager appWidgetManager522 = appWidgetManager422;
                                        int[] iArr422 = iArr2;
                                        Ref.ObjectRef objectRef1322 = objectRef1122;
                                        Ref.ObjectRef objectRef1422 = objectRef1222;
                                        i6 = i2022;
                                        i5 = i1922;
                                        int i2222 = i2122;
                                        Integer num922 = num822;
                                        int i2322 = i1822;
                                        NewsItem newsItem422 = newsItem322;
                                        Ref.ObjectRef objectRef1522 = objectRef2;
                                        int i2422 = i14;
                                        tokenInfo2 = tokenInfo;
                                        if (tokenInfo2 == null) {
                                        }
                                        if (tokenInfo2 == null) {
                                            twoNewsWidget$updateWidget$13 = twoNewsWidget$updateWidget$12;
                                            i26 = i2422;
                                        }
                                    }
                                }
                                list3 = list2;
                                obj = obj3;
                                i2222 = i8;
                                iArr422 = iArr2;
                                objectRef1422 = objectRef;
                                bitmap22 = null;
                                num922 = num;
                                newsItem422 = newsItem5;
                                objectRef1522 = objectRef2;
                                i2422 = i9;
                                i2322 = i27;
                                appWidgetManager522 = appWidgetManager2;
                                objectRef1322 = objectRef17;
                                if (tokenInfo2 == null) {
                                }
                                if (tokenInfo2 == null) {
                                }
                            } else {
                                List<NewsItem> list5 = list2;
                                int i31 = i3;
                                obj2 = obj3;
                                Integer num12 = (Integer) objectRef4.element;
                                if (num12 != null) {
                                    remoteViews.setViewVisibility(num12.intValue(), 8);
                                    i = i27;
                                    i2 = i8;
                                    i252 = i31;
                                    i4 = i6;
                                    list2 = list5;
                                } else {
                                    i = i27;
                                    i2 = i8;
                                    i252 = i31;
                                    i4 = i6;
                                    list2 = list5;
                                }
                                i3 = i252 + 1;
                                objCopydefault = obj2;
                                if (i3 < i4) {
                                    for (int i32 : iArr2) {
                                        appWidgetManager2.updateAppWidget(i32, remoteViews);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        } else {
                            objectRef3.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.forceCloseConnection);
                            objectRef17.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.profile);
                            objectRef.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.sVXHln);
                            objectRef4.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.MediaBrowserCompatMediaBrowserImplBase);
                            objectRef2.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.tIwhY);
                            numAEQbTJ = C56443yFo.AEQbTJ(qZH.StateListAnimator.hlkKmr);
                        }
                    } else {
                        i8 = i2;
                        objectRef3.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.MediaBrowserCompatMediaBrowserImplBase2);
                        objectRef17.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.zpGcln);
                        objectRef.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.swzYdv);
                        objectRef4.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.dump);
                        objectRef2.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.zAEkPU);
                        numAEQbTJ = C56443yFo.AEQbTJ(qZH.StateListAnimator.gmHjFq);
                    }
                    num = numAEQbTJ;
                    if (newsItem5 != null) {
                    }
                }
            }
            objectRef5 = objectRef1522;
            i10 = i2322;
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
            num3 = (Integer) objectRef3.element;
            if (num3 != null) {
            }
            num4 = (Integer) objectRef1322.element;
            if (num4 != null) {
            }
            num5 = (Integer) objectRef1422.element;
            if (num5 != null) {
            }
            Ref.ObjectRef objectRef1622 = objectRef5;
            num6 = (Integer) objectRef1622.element;
            if (num6 != null) {
            }
            appWidgetManager2 = appWidgetManager522;
            iArr2 = iArr422;
            twoNewsWidget$updateWidget$12 = twoNewsWidget$updateWidget$13;
            int i2522 = i26;
            i2 = i2222;
            i4 = i6;
            list2 = list3;
            i = i10;
            i3 = i2522 + 1;
            objCopydefault = obj2;
            if (i3 < i4) {
            }
        }
    }

    public final void OLrzqt(Context context, RemoteViews remoteViews, int i, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("okx://miniapp?appid=market&pageurl=/feed/detail&fromPage=contentWidget&contentId=" + str));
        intent.addFlags(335544320);
        remoteViews.setOnClickPendingIntent(i, PendingIntent.getActivity(context, str.hashCode(), intent, 201326592));
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onEnabled(Context context) {
        super.onEnabled(context);
        if (context != null) {
            TwoNewsWidgetUpdateWorker.StateListAnimator.schedulePeriodicWork$default(TwoNewsWidgetUpdateWorker.Companion, context, false, 2, null);
        }
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}
