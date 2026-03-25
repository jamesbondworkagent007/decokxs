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
public final class FourNewsWidget extends AppWidgetProvider {
    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appWidgetManager, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        copydefault(context, appWidgetManager, iArr);
    }

    public final void copydefault(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new FourNewsWidget$fetchAndUpdateNews$1(this, context, appWidgetManager, iArr, null), 3, null);
    }

    /* JADX DEBUG: Duplicate block (B:176:0x04d4) to fix multi-entry loop: BACK_EDGE: B:176:0x04d4 -> B:177:0x04de */
    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v79, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v81, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v83, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v86, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v89, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v92, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r15v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r15v8, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v14, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v22, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v8, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v14, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v17, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v20, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v23, resolved type: T */
    /* JADX WARN: Can't wrap try/catch for region: R(22:199|62|63|195|64|65|191|66|67|183|68|69|197|70|71|193|72|73|189|74|75|(1:77)(8:78|185|79|99|(0)|102|(0)(0)|(1:111)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0297, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0298, code lost:
    
        r5 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x029b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x029c, code lost:
    
        r18 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x029f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02a0, code lost:
    
        r36 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02a3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02a4, code lost:
    
        r17 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02a7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02a8, code lost:
    
        r34 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02ab, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02ac, code lost:
    
        r35 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02b3, code lost:
    
        r20 = r35;
        r16 = r2;
        r21 = r11;
        r2 = r19;
        r19 = r34;
        r11 = r36;
        r31 = r17;
        r17 = r1;
        r1 = r6;
        r6 = r14;
        r14 = r31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
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
    /* JADX WARN: Type inference failed for: r0v54, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v56, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v58, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v60, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v62, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v67, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v69, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v71, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v73, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v75, types: [T, java.lang.Integer] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x02f6 -> B:104:0x0313). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x027a -> B:185:0x028e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x02c7 -> B:99:0x02d1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(Context context, AppWidgetManager appWidgetManager, int[] iArr, List<NewsItem> list, Continuation<? super Unit> continuation) throws Throwable {
        FourNewsWidget$updateWidget$1 fourNewsWidget$updateWidget$1;
        FourNewsWidget fourNewsWidget;
        List<NewsItem> list2;
        RemoteViews remoteViews;
        FourNewsWidget$updateWidget$1 fourNewsWidget$updateWidget$12;
        int i;
        int i2;
        int i3;
        int i4;
        Context context2;
        AppWidgetManager appWidgetManager2;
        int[] iArr2;
        TokenInfo tokenInfo;
        int i5;
        int i6;
        int i7;
        Ref.ObjectRef objectRef;
        int i8;
        NewsItem newsItem;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Object obj;
        Ref.ObjectRef objectRef5;
        List<NewsItem> list3;
        Throwable th;
        Object objM7377constructorimpl;
        int i9;
        Integer numAEQbTJ;
        Integer num;
        int i10;
        TokenInfo tokenInfo2;
        String icon;
        List<NewsItem> list4;
        int[] iArr3;
        String coinName;
        FourNewsWidget$updateWidget$1 fourNewsWidget$updateWidget$13;
        int i11;
        String strCopydefault;
        double dDivD$default;
        boolean z;
        int i12;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        String title;
        if (continuation instanceof FourNewsWidget$updateWidget$1) {
            fourNewsWidget$updateWidget$1 = (FourNewsWidget$updateWidget$1) continuation;
            int i13 = fourNewsWidget$updateWidget$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fourNewsWidget$updateWidget$1.label = i13 - Integer.MIN_VALUE;
            } else {
                fourNewsWidget$updateWidget$1 = new FourNewsWidget$updateWidget$1(this, continuation);
            }
        }
        Object objOLrzqt = fourNewsWidget$updateWidget$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i14 = fourNewsWidget$updateWidget$1.label;
        if (i14 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), qZH.ActionBar.DCUTEIddSDPG);
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            int iCopydefault = C33070mpX.copydefault(c33512mxp.isConnected() == 0 ? C52761wXj.Activity.HJWChPRAkuRW : C52761wXj.Activity.fhUrPt);
            int iCopydefault2 = C33070mpX.copydefault(c33512mxp.isConnected() != 0 ? C52761wXj.Activity.HJWChPRAkuRW : C52761wXj.Activity.fhUrPt);
            if (Build.VERSION.SDK_INT <= 29) {
                remoteViews2.setViewVisibility(qZH.StateListAnimator.QsIRgs, 8);
            } else {
                remoteViews2.setViewVisibility(qZH.StateListAnimator.QsIRgs, 0);
            }
            fourNewsWidget = this;
            list2 = list;
            remoteViews = remoteViews2;
            fourNewsWidget$updateWidget$12 = fourNewsWidget$updateWidget$1;
            i = iCopydefault2;
            i2 = iCopydefault;
            i3 = 0;
            i4 = 4;
            context2 = context;
            appWidgetManager2 = appWidgetManager;
            iArr2 = iArr;
            if (i3 < i4) {
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i15 = fourNewsWidget$updateWidget$1.I$4;
            int i16 = fourNewsWidget$updateWidget$1.I$3;
            int i17 = fourNewsWidget$updateWidget$1.I$2;
            int i18 = fourNewsWidget$updateWidget$1.I$1;
            int i19 = fourNewsWidget$updateWidget$1.I$0;
            TokenInfo tokenInfo3 = (TokenInfo) fourNewsWidget$updateWidget$1.L$13;
            NewsItem newsItem2 = (NewsItem) fourNewsWidget$updateWidget$1.L$12;
            Integer num7 = (Integer) fourNewsWidget$updateWidget$1.L$11;
            Ref.ObjectRef objectRef6 = (Ref.ObjectRef) fourNewsWidget$updateWidget$1.L$10;
            Ref.ObjectRef objectRef7 = (Ref.ObjectRef) fourNewsWidget$updateWidget$1.L$9;
            Ref.ObjectRef objectRef8 = (Ref.ObjectRef) fourNewsWidget$updateWidget$1.L$8;
            Ref.ObjectRef objectRef9 = (Ref.ObjectRef) fourNewsWidget$updateWidget$1.L$7;
            Ref.ObjectRef objectRef10 = (Ref.ObjectRef) fourNewsWidget$updateWidget$1.L$6;
            RemoteViews remoteViews3 = (RemoteViews) fourNewsWidget$updateWidget$1.L$5;
            List<NewsItem> list5 = (List) fourNewsWidget$updateWidget$1.L$4;
            int[] iArr4 = (int[]) fourNewsWidget$updateWidget$1.L$3;
            AppWidgetManager appWidgetManager3 = (AppWidgetManager) fourNewsWidget$updateWidget$1.L$2;
            Context context3 = (Context) fourNewsWidget$updateWidget$1.L$1;
            FourNewsWidget fourNewsWidget2 = (FourNewsWidget) fourNewsWidget$updateWidget$1.L$0;
            try {
                C56391yDq.AEQbTJ(objOLrzqt);
                i7 = i15;
                i6 = i18;
                i5 = i19;
                tokenInfo = tokenInfo3;
                iArr2 = iArr4;
                objectRef = objectRef8;
                newsItem = newsItem2;
                i8 = i17;
                objectRef4 = objectRef10;
                fourNewsWidget = fourNewsWidget2;
                objectRef2 = objectRef6;
                list3 = list5;
                obj = objCopydefault;
                objectRef5 = objectRef7;
                objectRef3 = objectRef9;
                remoteViews = remoteViews3;
            } catch (Throwable th2) {
                th = th2;
                i7 = i15;
                i6 = i18;
                i5 = i19;
                tokenInfo = tokenInfo3;
                iArr2 = iArr4;
                objectRef = objectRef8;
                newsItem = newsItem2;
                i8 = i17;
                objectRef4 = objectRef10;
                fourNewsWidget = fourNewsWidget2;
                objectRef2 = objectRef6;
                list3 = list5;
                obj = objCopydefault;
                objectRef5 = objectRef7;
                objectRef3 = objectRef9;
                remoteViews = remoteViews3;
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                RemoteViews remoteViews4 = remoteViews;
                FourNewsWidget$updateWidget$1 fourNewsWidget$updateWidget$14 = fourNewsWidget$updateWidget$1;
                context2 = context3;
                Ref.ObjectRef objectRef11 = objectRef;
                int i20 = i8;
                NewsItem newsItem3 = newsItem;
                Ref.ObjectRef objectRef12 = objectRef2;
                int i21 = i16;
                Ref.ObjectRef objectRef13 = objectRef3;
                Ref.ObjectRef objectRef14 = objectRef4;
                FourNewsWidget fourNewsWidget3 = fourNewsWidget;
                RemoteViews remoteViews5 = remoteViews4;
                Integer num8 = num7;
                List<NewsItem> list6 = list3;
                AppWidgetManager appWidgetManager4 = appWidgetManager3;
                Integer num9 = num8;
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                }
                Bitmap bitmap = (Bitmap) objM7377constructorimpl;
                AppWidgetManager appWidgetManager5 = appWidgetManager4;
                Ref.ObjectRef objectRef15 = objectRef11;
                if (tokenInfo == null) {
                }
                if (tokenInfo == null) {
                }
                fourNewsWidget$updateWidget$13 = fourNewsWidget$updateWidget$14;
                i11 = i21;
                strCopydefault = null;
                if (strCopydefault != null) {
                }
                if (dDivD$default >= AudioStats.AUDIO_AMPLITUDE_NONE) {
                }
                if (z) {
                }
                if (i7 != 0) {
                }
                num2 = (Integer) objectRef5.element;
                if (num2 != null) {
                }
                num3 = (Integer) objectRef14.element;
                if (num3 != null) {
                }
                num4 = (Integer) objectRef13.element;
                if (num4 != null) {
                }
                num5 = (Integer) objectRef15.element;
                if (num5 != null) {
                }
                num6 = (Integer) objectRef12.element;
                if (num6 != null) {
                }
                appWidgetManager2 = appWidgetManager5;
                iArr2 = iArr3;
                list2 = list;
                fourNewsWidget$updateWidget$12 = fourNewsWidget$updateWidget$13;
                remoteViews = remoteViews5;
                fourNewsWidget = fourNewsWidget3;
                int i22 = i11;
                i4 = i12;
                i = i6;
                i2 = i5;
                i3 = i22 + 1;
                objCopydefault = obj;
                if (i3 < i4) {
                }
            }
            try {
            } catch (Throwable th3) {
                th = th3;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                RemoteViews remoteViews42 = remoteViews;
                FourNewsWidget$updateWidget$1 fourNewsWidget$updateWidget$142 = fourNewsWidget$updateWidget$1;
                context2 = context3;
                Ref.ObjectRef objectRef112 = objectRef;
                int i202 = i8;
                NewsItem newsItem32 = newsItem;
                Ref.ObjectRef objectRef122 = objectRef2;
                int i212 = i16;
                Ref.ObjectRef objectRef132 = objectRef3;
                Ref.ObjectRef objectRef142 = objectRef4;
                FourNewsWidget fourNewsWidget32 = fourNewsWidget;
                RemoteViews remoteViews52 = remoteViews42;
                Integer num82 = num7;
                List<NewsItem> list62 = list3;
                AppWidgetManager appWidgetManager42 = appWidgetManager3;
                Integer num92 = num82;
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                }
                Bitmap bitmap2 = (Bitmap) objM7377constructorimpl;
                AppWidgetManager appWidgetManager52 = appWidgetManager42;
                Ref.ObjectRef objectRef152 = objectRef112;
                if (tokenInfo == null) {
                }
                if (tokenInfo == null) {
                }
                fourNewsWidget$updateWidget$13 = fourNewsWidget$updateWidget$142;
                i11 = i212;
                strCopydefault = null;
                if (strCopydefault != null) {
                }
                if (dDivD$default >= AudioStats.AUDIO_AMPLITUDE_NONE) {
                }
                if (z) {
                }
                if (i7 != 0) {
                }
                num2 = (Integer) objectRef5.element;
                if (num2 != null) {
                }
                num3 = (Integer) objectRef142.element;
                if (num3 != null) {
                }
                num4 = (Integer) objectRef132.element;
                if (num4 != null) {
                }
                num5 = (Integer) objectRef152.element;
                if (num5 != null) {
                }
                num6 = (Integer) objectRef122.element;
                if (num6 != null) {
                }
                appWidgetManager2 = appWidgetManager52;
                iArr2 = iArr3;
                list2 = list;
                fourNewsWidget$updateWidget$12 = fourNewsWidget$updateWidget$13;
                remoteViews = remoteViews52;
                fourNewsWidget = fourNewsWidget32;
                int i222 = i11;
                i4 = i12;
                i = i6;
                i2 = i5;
                i3 = i222 + 1;
                objCopydefault = obj;
                if (i3 < i4) {
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl((Bitmap) objOLrzqt);
            RemoteViews remoteViews422 = remoteViews;
            FourNewsWidget$updateWidget$1 fourNewsWidget$updateWidget$1422 = fourNewsWidget$updateWidget$1;
            context2 = context3;
            Ref.ObjectRef objectRef1122 = objectRef;
            int i2022 = i8;
            NewsItem newsItem322 = newsItem;
            Ref.ObjectRef objectRef1222 = objectRef2;
            int i2122 = i16;
            Ref.ObjectRef objectRef1322 = objectRef3;
            Ref.ObjectRef objectRef1422 = objectRef4;
            FourNewsWidget fourNewsWidget322 = fourNewsWidget;
            RemoteViews remoteViews522 = remoteViews422;
            Integer num822 = num7;
            List<NewsItem> list622 = list3;
            AppWidgetManager appWidgetManager422 = appWidgetManager3;
            Integer num922 = num822;
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            Bitmap bitmap22 = (Bitmap) objM7377constructorimpl;
            AppWidgetManager appWidgetManager522 = appWidgetManager422;
            Ref.ObjectRef objectRef1522 = objectRef1122;
            if (tokenInfo == null) {
                iArr3 = iArr2;
                coinName = tokenInfo.getCoinName();
            } else {
                iArr3 = iArr2;
                coinName = null;
            }
            if (tokenInfo == null) {
                Object obj2 = obj;
                InterfaceC43033rhe interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.OLrzqt(InterfaceC43033rhe.class);
                List<NewsItem> list7 = list622;
                if (interfaceC43033rhe != null) {
                    fourNewsWidget$updateWidget$13 = fourNewsWidget$updateWidget$1422;
                    i11 = i2122;
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
                if (i7 != 0) {
                    i12 = i2022;
                    Integer num10 = (Integer) objectRef1422.element;
                    if (num10 != null) {
                        num10.intValue();
                        z = z2;
                        remoteViews522.setInt(((Number) objectRef1422.element).intValue(), "setLines", 1);
                    } else {
                        z = z2;
                    }
                    if (num922 != null) {
                        remoteViews522.setViewVisibility(num922.intValue(), 0);
                    }
                } else {
                    z = z2;
                    i12 = i2022;
                    Integer num11 = (Integer) objectRef1422.element;
                    if (num11 != null) {
                        num11.intValue();
                        remoteViews522.setInt(((Number) objectRef1422.element).intValue(), "setLines", 2);
                    }
                    if (num922 != null) {
                        remoteViews522.setViewVisibility(num922.intValue(), 8);
                    }
                }
                num2 = (Integer) objectRef5.element;
                if (num2 != null) {
                    num2.intValue();
                    fourNewsWidget322.copydefault(context2, remoteViews522, ((Number) objectRef5.element).intValue(), newsItem322.getContentId());
                }
                num3 = (Integer) objectRef1422.element;
                if (num3 != null) {
                    num3.intValue();
                    String translatedTitle = newsItem322.getTranslatedTitle();
                    if (translatedTitle != null && translatedTitle.length() > 0) {
                        title = newsItem322.getTranslatedTitle();
                    } else {
                        title = newsItem322.getTitle();
                    }
                    remoteViews522.setTextViewText(((Number) objectRef1422.element).intValue(), title);
                }
                num4 = (Integer) objectRef1322.element;
                if (num4 != null) {
                    num4.intValue();
                    if (bitmap22 != null) {
                        remoteViews522.setImageViewBitmap(((Number) objectRef1322.element).intValue(), bitmap22);
                    }
                }
                num5 = (Integer) objectRef1522.element;
                if (num5 != null) {
                    num5.intValue();
                    if (coinName != null) {
                        remoteViews522.setTextViewText(((Number) objectRef1522.element).intValue(), coinName);
                    } else {
                        remoteViews522.setTextViewText(((Number) objectRef1522.element).intValue(), "");
                    }
                }
                num6 = (Integer) objectRef1222.element;
                if (num6 != null) {
                    num6.intValue();
                    remoteViews522.setTextViewText(((Number) objectRef1222.element).intValue(), str2 + pTB.formatICUPercent$default(C33129mqd.EZpvd(C56443yFo.AEQbTJ(dDivD$default)), null, null, null, null, null, 31, null));
                    remoteViews522.setTextColor(((Number) objectRef1222.element).intValue(), z ? i5 : i6);
                }
                appWidgetManager2 = appWidgetManager522;
                iArr2 = iArr3;
                list2 = list7;
                fourNewsWidget$updateWidget$12 = fourNewsWidget$updateWidget$13;
                remoteViews = remoteViews522;
                fourNewsWidget = fourNewsWidget322;
                int i2222 = i11;
                i4 = i12;
                i = i6;
                i2 = i5;
                i3 = i2222 + 1;
                objCopydefault = obj2;
                if (i3 < i4) {
                    objectRef4 = new Ref.ObjectRef();
                    objectRef3 = new Ref.ObjectRef();
                    objectRef = new Ref.ObjectRef();
                    Object obj3 = objCopydefault;
                    objectRef5 = new Ref.ObjectRef();
                    int i23 = i4;
                    objectRef2 = new Ref.ObjectRef();
                    int i24 = i;
                    newsItem = (NewsItem) CollectionsKt___CollectionsKt.AkhnZx(list2, i3);
                    if (i3 != 0) {
                        i9 = i2;
                        if (i3 == 1) {
                            objectRef4.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.forceCloseConnection);
                            objectRef3.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.profile);
                            objectRef.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.sVXHln);
                            objectRef5.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.MediaBrowserCompatMediaBrowserImplBase);
                            objectRef2.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.tIwhY);
                            numAEQbTJ = C56443yFo.AEQbTJ(qZH.StateListAnimator.hlkKmr);
                        } else if (i3 == 2) {
                            objectRef4.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.MediaBrowserCompatMediaBrowserImplBase1);
                            objectRef3.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.registerUser);
                            objectRef.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.iPSTqm);
                            objectRef5.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.getStateLabel);
                            objectRef2.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.vLaW);
                            numAEQbTJ = C56443yFo.AEQbTJ(qZH.StateListAnimator.fsSxsn);
                        } else if (i3 != 3) {
                            num = null;
                            if (newsItem != null) {
                                List<TokenInfo> tokens = newsItem.getTokens();
                                if (tokens != null) {
                                    i10 = i3;
                                    tokenInfo2 = (TokenInfo) CollectionsKt___CollectionsKt.firstOrNull(tokens);
                                } else {
                                    i10 = i3;
                                    tokenInfo2 = null;
                                }
                                i7 = tokenInfo2 != null ? 1 : 0;
                                if (tokenInfo2 != null && (icon = tokenInfo2.getIcon()) != null) {
                                    if (icon.length() <= 0) {
                                        icon = null;
                                    }
                                    if (icon != null) {
                                        try {
                                        } catch (Throwable th4) {
                                            th = th4;
                                            list4 = list2;
                                        }
                                        Result.Application application3 = Result.Companion;
                                        fourNewsWidget$updateWidget$12.L$0 = fourNewsWidget;
                                        fourNewsWidget$updateWidget$12.L$1 = context2;
                                        fourNewsWidget$updateWidget$12.L$2 = appWidgetManager2;
                                        fourNewsWidget$updateWidget$12.L$3 = iArr2;
                                        fourNewsWidget$updateWidget$12.L$4 = list2;
                                        fourNewsWidget$updateWidget$12.L$5 = remoteViews;
                                        fourNewsWidget$updateWidget$12.L$6 = objectRef4;
                                        fourNewsWidget$updateWidget$12.L$7 = objectRef3;
                                        fourNewsWidget$updateWidget$12.L$8 = objectRef;
                                        fourNewsWidget$updateWidget$12.L$9 = objectRef5;
                                        fourNewsWidget$updateWidget$12.L$10 = objectRef2;
                                        fourNewsWidget$updateWidget$12.L$11 = num;
                                        fourNewsWidget$updateWidget$12.L$12 = newsItem;
                                        fourNewsWidget$updateWidget$12.L$13 = tokenInfo2;
                                        list4 = list2;
                                        int i25 = i9;
                                        fourNewsWidget$updateWidget$12.I$0 = i25;
                                        i9 = i25;
                                        fourNewsWidget$updateWidget$12.I$1 = i24;
                                        i24 = i24;
                                        fourNewsWidget$updateWidget$12.I$2 = i23;
                                        i23 = i23;
                                        int i26 = i10;
                                        fourNewsWidget$updateWidget$12.I$3 = i26;
                                        i10 = i26;
                                        int i27 = i7;
                                        fourNewsWidget$updateWidget$12.I$4 = i27;
                                        i7 = i27;
                                        fourNewsWidget$updateWidget$12.label = 1;
                                        objOLrzqt = C35129npW.OLrzqt(context2, icon, fourNewsWidget$updateWidget$12);
                                        obj = obj3;
                                        if (objOLrzqt == obj) {
                                            return obj;
                                        }
                                        i5 = i9;
                                        appWidgetManager3 = appWidgetManager2;
                                        tokenInfo = tokenInfo2;
                                        list3 = list4;
                                        i6 = i24;
                                        i16 = i10;
                                        context3 = context2;
                                        fourNewsWidget$updateWidget$1 = fourNewsWidget$updateWidget$12;
                                        num7 = num;
                                        i8 = i23;
                                        objM7377constructorimpl = Result.m7377constructorimpl((Bitmap) objOLrzqt);
                                        RemoteViews remoteViews4222 = remoteViews;
                                        FourNewsWidget$updateWidget$1 fourNewsWidget$updateWidget$14222 = fourNewsWidget$updateWidget$1;
                                        context2 = context3;
                                        Ref.ObjectRef objectRef11222 = objectRef;
                                        int i20222 = i8;
                                        NewsItem newsItem3222 = newsItem;
                                        Ref.ObjectRef objectRef12222 = objectRef2;
                                        int i21222 = i16;
                                        Ref.ObjectRef objectRef13222 = objectRef3;
                                        Ref.ObjectRef objectRef14222 = objectRef4;
                                        FourNewsWidget fourNewsWidget3222 = fourNewsWidget;
                                        RemoteViews remoteViews5222 = remoteViews4222;
                                        Integer num8222 = num7;
                                        List<NewsItem> list6222 = list3;
                                        AppWidgetManager appWidgetManager4222 = appWidgetManager3;
                                        Integer num9222 = num8222;
                                        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                                        }
                                        Bitmap bitmap222 = (Bitmap) objM7377constructorimpl;
                                        AppWidgetManager appWidgetManager5222 = appWidgetManager4222;
                                        Ref.ObjectRef objectRef15222 = objectRef11222;
                                        if (tokenInfo == null) {
                                        }
                                        if (tokenInfo == null) {
                                            obj2 = obj;
                                            list7 = list6222;
                                        }
                                    }
                                }
                                List<NewsItem> list8 = list2;
                                obj = obj3;
                                i5 = i9;
                                tokenInfo = tokenInfo2;
                                num9222 = num;
                                bitmap222 = null;
                                objectRef13222 = objectRef3;
                                newsItem3222 = newsItem;
                                objectRef14222 = objectRef4;
                                objectRef12222 = objectRef2;
                                i21222 = i10;
                                fourNewsWidget3222 = fourNewsWidget;
                                remoteViews5222 = remoteViews;
                                fourNewsWidget$updateWidget$14222 = fourNewsWidget$updateWidget$12;
                                list6222 = list8;
                                i6 = i24;
                                appWidgetManager5222 = appWidgetManager2;
                                objectRef15222 = objectRef;
                                i20222 = i23;
                                if (tokenInfo == null) {
                                }
                                if (tokenInfo == null) {
                                }
                            } else {
                                List<NewsItem> list9 = list2;
                                int i28 = i3;
                                obj2 = obj3;
                                Integer num12 = (Integer) objectRef5.element;
                                if (num12 != null) {
                                    remoteViews.setViewVisibility(num12.intValue(), 8);
                                    i = i24;
                                    i2 = i9;
                                    i2222 = i28;
                                    i4 = i23;
                                    list2 = list9;
                                } else {
                                    i = i24;
                                    i2 = i9;
                                    i2222 = i28;
                                    i4 = i23;
                                    list2 = list9;
                                }
                                i3 = i2222 + 1;
                                objCopydefault = obj2;
                                if (i3 < i4) {
                                    for (int i29 : iArr2) {
                                        appWidgetManager2.updateAppWidget(i29, remoteViews);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        } else {
                            objectRef4.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.MediaBrowserCompatMediaBrowserImplBase3);
                            objectRef3.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.siEkQe);
                            objectRef.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.zDUObI);
                            objectRef5.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.MediaBrowserCompatMediaBrowserImplBase4);
                            objectRef2.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.zKcAg);
                            numAEQbTJ = C56443yFo.AEQbTJ(qZH.StateListAnimator.hvKCwS);
                        }
                    } else {
                        i9 = i2;
                        objectRef4.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.MediaBrowserCompatMediaBrowserImplBase2);
                        objectRef3.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.zpGcln);
                        objectRef.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.swzYdv);
                        objectRef5.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.dump);
                        objectRef2.element = C56443yFo.AEQbTJ(qZH.StateListAnimator.zAEkPU);
                        numAEQbTJ = C56443yFo.AEQbTJ(qZH.StateListAnimator.gmHjFq);
                    }
                    num = numAEQbTJ;
                    if (newsItem != null) {
                    }
                }
            }
            fourNewsWidget$updateWidget$13 = fourNewsWidget$updateWidget$14222;
            i11 = i21222;
            strCopydefault = null;
            if (strCopydefault != null) {
            }
            if (dDivD$default >= AudioStats.AUDIO_AMPLITUDE_NONE) {
            }
            if (z2) {
            }
            if (i7 != 0) {
            }
            num2 = (Integer) objectRef5.element;
            if (num2 != null) {
            }
            num3 = (Integer) objectRef14222.element;
            if (num3 != null) {
            }
            num4 = (Integer) objectRef13222.element;
            if (num4 != null) {
            }
            num5 = (Integer) objectRef15222.element;
            if (num5 != null) {
            }
            num6 = (Integer) objectRef12222.element;
            if (num6 != null) {
            }
            appWidgetManager2 = appWidgetManager5222;
            iArr2 = iArr3;
            list2 = list7;
            fourNewsWidget$updateWidget$12 = fourNewsWidget$updateWidget$13;
            remoteViews = remoteViews5222;
            fourNewsWidget = fourNewsWidget3222;
            int i22222 = i11;
            i4 = i12;
            i = i6;
            i2 = i5;
            i3 = i22222 + 1;
            objCopydefault = obj2;
            if (i3 < i4) {
            }
        }
    }

    public final void copydefault(Context context, RemoteViews remoteViews, int i, String str) {
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
