package o;

import android.os.Build;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.config.serviceprovider.GeneralAction;
import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import com.okinc.im.imui.inputpanelV2.pluginV2.GalleryPlugin$launchPicker$1;
import com.okinc.im.imui.inputpanelV2.pluginV2.GalleryPlugin$launchPickerWithPreSelectedUris$1;
import com.okinc.im.imui.inputpanelV2.pluginV2.GalleryPlugin$onActivityResult$1;
import com.okinc.im.imui.inputpanelV2.pluginV2.GalleryPlugin$processMediaItems$1;
import com.okinc.im.imui.inputpanelV2.pluginV2.GalleryPlugin$processUriList$1;
import com.okinc.im.picker.OKIMVisualMediaPicker;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35399nuc;
import o.C60123zwM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.obi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36478obi extends AbstractC35291nsZ {
    public static final ActionBar Companion = new ActionBar(null);
    public final int AYXKKw;
    public final int AhwBna;
    public final int EZpvd;
    public final boolean KWHzl;
    public final int copydefault;
    public final int djBIcL;
    public final int gEmmrt;
    public final int valueOf;
    public final int values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C36478obi() {
        this(0, false, 0, 0, 0, 0, 63, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002f: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (9 int) : (r5v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r6v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000e: ARITH (r11v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r7v0 int) : (0 int))
  (wrap:int:0x001a: TERNARY null = ((wrap:int:0x0014: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (100 int) : (r8v0 int))
  (wrap:int:0x0021: TERNARY null = ((wrap:int:0x001b: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (20 int) : (r9v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0022: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (5 int) : (r10v0 int))
 A[MD:(int, boolean, int, int, int, int):void (m)] (LINE:41) call: o.obi.<init>(int, boolean, int, int, int, int):void type: THIS */
    public /* synthetic */ C36478obi(int i, boolean z, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 9 : i, (i6 & 2) != 0 ? false : z, (i6 & 4) == 0 ? i2 : 0, (i6 & 8) != 0 ? 100 : i3, (i6 & 16) != 0 ? 20 : i4, (i6 & 32) != 0 ? 5 : i5);
    }

    public C36478obi(int i, boolean z, int i2, int i3, int i4, int i5) {
        this.gEmmrt = i;
        this.KWHzl = z;
        this.values = i2;
        this.djBIcL = i3;
        this.AYXKKw = i4;
        this.EZpvd = i5;
        this.AhwBna = i3 * 1048576;
        this.valueOf = i4 * 1048576;
        this.copydefault = i5 * 1048576;
    }

    /* JADX INFO: renamed from: o.obi$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.obi.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.InterfaceC35288nsW
    public android.graphics.drawable.Drawable EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return C33070mpX.KWHzl(C35399nuc.ActionBar.zuBGHE);
    }

    @Override // o.InterfaceC35288nsW
    public java.lang.String KWHzl() {
        return C33070mpX.AYXKKw(C35399nuc.LoaderManager.RIsQag);
    }

    @Override // o.InterfaceC35288nsW
    public void copydefault(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("IMChat_Btm_Send_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.obk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36478obi.KWHzl((EventParamsList) obj);
            }
        });
        sEF sef = sEF.OLrzqt;
        EventData eventDataAEQbTJ = sef.AEQbTJ();
        eventDataAEQbTJ.setMsg("Input panel button click");
        eventDataAEQbTJ.setAttrs(C56423yEv.EZpvd(C56390yDp.OLrzqt("isRunningInEmulator", "library")));
        sef.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ);
        if (Build.VERSION.SDK_INT >= 33 || C60121zwJ.KWHzl(fragment.requireContext(), "android.permission.READ_EXTERNAL_STORAGE")) {
            AEQbTJ(fragment);
            return;
        }
        C60123zwM c60123zwMAEQbTJ = new C60123zwM.ActionBar(fragment, 105, "android.permission.READ_EXTERNAL_STORAGE").AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(c60123zwMAEQbTJ, "");
        C60121zwJ.copydefault(c60123zwMAEQbTJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "library", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(androidx.fragment.app.Fragment fragment) {
        OKIMVisualMediaPicker oKIMVisualMediaPickerEZpvd = EZpvd(fragment);
        LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new GalleryPlugin$launchPicker$1(this, fragment, oKIMVisualMediaPickerEZpvd, null), 3, null);
    }

    public final void KWHzl(androidx.fragment.app.Fragment fragment, java.util.List<? extends android.net.Uri> list) {
        if (list.isEmpty()) {
            pUU.valueOf("GalleryPlugin", "No pre-selected URIs provided");
            return;
        }
        OKIMVisualMediaPicker oKIMVisualMediaPickerEZpvd = EZpvd(fragment);
        LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new GalleryPlugin$launchPickerWithPreSelectedUris$1(this, fragment, oKIMVisualMediaPickerEZpvd, list, null), 3, null);
    }

    public final OKIMVisualMediaPicker EZpvd(androidx.fragment.app.Fragment fragment) {
        return oBC.EZpvd(fragment, new C35724oBi(this.gEmmrt, this.KWHzl, this.values, true, null, 16, null));
    }

    public final void AEQbTJ(androidx.fragment.app.Fragment fragment, OKIMVisualMediaPicker.Activity activity) {
        if (activity instanceof OKIMVisualMediaPicker.Activity.TaskDescription) {
            android.content.Intent intent = new android.content.Intent();
            OKIMVisualMediaPicker.Activity.TaskDescription taskDescription = (OKIMVisualMediaPicker.Activity.TaskDescription) activity;
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("selected_media", taskDescription.copydefault()), C56390yDp.OLrzqt("use_original_image", taskDescription.OLrzqt())));
            android.content.Context contextRequireContext = fragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            OLrzqt(105, -1, intent, contextRequireContext);
            return;
        }
        if (activity instanceof OKIMVisualMediaPicker.Activity.ActionBar) {
            android.content.Context contextRequireContext2 = fragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            OLrzqt(105, 0, (android.content.Intent) null, contextRequireContext2);
        } else {
            if (!(activity instanceof OKIMVisualMediaPicker.Activity.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            OKIMVisualMediaPicker.Activity.StateListAnimator stateListAnimator = (OKIMVisualMediaPicker.Activity.StateListAnimator) activity;
            C55326xho.toastWithFailedIcon$default(stateListAnimator.copydefault(), 0, 1, (java.lang.Object) null);
            pUU.copydefault("GalleryPlugin", "Error in media picker: " + stateListAnimator.copydefault());
            android.content.Context contextRequireContext3 = fragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
            OLrzqt(105, 0, (android.content.Intent) null, contextRequireContext3);
        }
    }

    @Override // o.InterfaceC35288nsW
    public void OLrzqt(@NotNull androidx.fragment.app.Fragment fragment, int i, @NotNull java.lang.String[] strArr, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        if (i == 105 && yDV.AYXKKw(iArr, 0)) {
            AEQbTJ(fragment);
        }
    }

    @Override // o.InterfaceC35288nsW
    public void OLrzqt(int i, int i2, android.content.Intent intent, @NotNull android.content.Context context) {
        LifecycleCoroutineScope lifecycleScope;
        Intrinsics.checkNotNullParameter(context, "");
        LifecycleOwner lifecycleOwnerAEQbTJ = C35334ntP.AEQbTJ(context);
        if (lifecycleOwnerAEQbTJ == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerAEQbTJ)) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new GalleryPlugin$onActivityResult$1(i2, i, intent, this, context, null), 3, null);
    }

    @Override // o.AbstractC35291nsZ, o.InterfaceC35288nsW
    public java.lang.Integer AEQbTJ() {
        return 105;
    }

    /* JADX INFO: renamed from: o.obi$Application */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class Application {
        public final int EZpvd;
        public final java.util.List<SendMessageRequestParam> KWHzl;
        public final int OLrzqt;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.obi$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, java.util.List list, int i, int i2, int i3, int i4, java.lang.Object obj) {
            if ((i4 & 1) != 0) {
                list = application.KWHzl;
            }
            if ((i4 & 2) != 0) {
                i = application.OLrzqt;
            }
            if ((i4 & 4) != 0) {
                i2 = application.copydefault;
            }
            if ((i4 & 8) != 0) {
                i3 = application.EZpvd;
            }
            return application.KWHzl(list, i, i2, i3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<SendMessageRequestParam> KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(@NotNull java.util.List<? extends SendMessageRequestParam> list, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(list, "");
            return new Application(list, i, i2, i3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd(this.KWHzl, application.KWHzl) && this.OLrzqt == application.OLrzqt && this.copydefault == application.copydefault && this.EZpvd == application.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.KWHzl.hashCode() * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + java.lang.Integer.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MediaProcessingResult(validParams=" + this.KWHzl + ", largeImageSizeCount=" + this.OLrzqt + ", largeVideoSizeCount=" + this.copydefault + ", largeGifSizeCount=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.im.config.serviceprovider.SendMessageRequestParam> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(@NotNull java.util.List<? extends SendMessageRequestParam> list, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = list;
            this.OLrzqt = i;
            this.copydefault = i2;
            this.EZpvd = i3;
        }
    }

    /* JADX DEBUG: Duplicate block (B:132:0x03a0) to fix multi-entry loop: BACK_EDGE: B:132:0x03a0 -> B:133:0x03a6 */
    /* JADX DEBUG: Duplicate block (B:67:0x0264) to fix multi-entry loop: BACK_EDGE: B:67:0x0264 -> B:133:0x03a6 */
    /* JADX WARN: Can't wrap try/catch for region: R(14:73|144|74|75|142|76|77|150|101|124|(0)|127|(0)|130) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:12|(3:146|13|14)|156|99|100|150|101|124|(1:126)|127|(1:129)|130|(1:134)|135|21|(2:23|(1:25)(7:26|27|(1:29)(2:30|(11:154|32|33|(2:148|35)(1:36)|37|44|(1:46)|47|(1:49)|50|168)(2:51|(8:164|53|(1:55)(1:56)|57|61|(1:63)|64|(2:66|67)(1:67))(2:68|(4:140|70|71|(14:73|144|74|75|142|76|77|150|101|124|(0)|127|(0)|130)(20:83|160|84|85|152|86|87|138|88|89|166|90|91|162|92|93|158|94|95|(1:97)(11:98|156|99|100|150|101|124|(0)|127|(0)|130)))(2:131|132))))|(0)|135|21|(2:136|137)(0)))(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(20:83|(1:160)|84|85|152|86|87|138|88|89|166|90|91|162|92|93|158|94|95|(1:97)(11:98|156|99|100|150|101|124|(0)|127|(0)|130)) */
    /* JADX WARN: Can't wrap try/catch for region: R(20:83|160|84|85|152|86|87|138|88|89|166|90|91|162|92|93|158|94|95|(1:97)(11:98|156|99|100|150|101|124|(0)|127|(0)|130)) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x030c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x030f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0310, code lost:
    
        r18 = r5;
        r5 = r13;
        r13 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0315, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0316, code lost:
    
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0319, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x031a, code lost:
    
        r3 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x031d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x031e, code lost:
    
        r3 = r24;
        r2 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0323, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0324, code lost:
    
        r3 = r24;
        r2 = r25;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x032a, code lost:
    
        r9 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x032d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x032e, code lost:
    
        r3 = r24;
        r2 = r25;
        r1 = r16;
        r13 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0352, code lost:
    
        r18 = r5;
        r12 = r9;
        r5 = r13;
        r9 = r4;
        r13 = r10;
        r10 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x03a6, code lost:
    
        r3 = r24;
        r10 = r25;
        r12 = r6;
        r2 = (com.okinc.im.config.serviceprovider.SendMessageRequestParam) r11;
        r4 = r14;
        r1 = r16;
        r0 = r17;
        r5 = r18;
        r9 = r19;
        r6 = r20;
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02a5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02a9, code lost:
    
        r2 = r25;
        r9 = r4;
        r13 = r20;
        r1 = r16;
        r5 = r17;
        r12 = r19;
        r10 = r24;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:123:0x0359 -> B:124:0x0363). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0144 -> B:133:0x03a6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0296 -> B:150:0x0306). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x02eb -> B:156:0x02f7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(android.content.Context context, java.util.List<? extends android.net.Uri> list, java.util.List<? extends android.net.Uri> list2, Continuation<? super Application> continuation) throws java.lang.Throwable {
        GalleryPlugin$processMediaItems$1 galleryPlugin$processMediaItems$1;
        C36478obi c36478obi;
        C36478obi c36478obi2;
        java.util.Collection arrayList;
        java.util.Iterator it;
        Ref.IntRef intRef;
        Ref.IntRef intRef2;
        Ref.IntRef intRef3;
        GalleryPlugin$processMediaItems$1 galleryPlugin$processMediaItems$12;
        android.content.Context context2;
        java.util.List<? extends android.net.Uri> list3;
        GalleryPlugin$processMediaItems$1 galleryPlugin$processMediaItems$13;
        java.util.List<? extends android.net.Uri> list4;
        Ref.IntRef intRef4;
        java.lang.Object obj;
        C36478obi c36478obi3;
        java.util.Collection collection;
        java.lang.Object obj2;
        java.lang.Throwable th;
        java.lang.Object objM7377constructorimpl;
        Ref.IntRef intRef5;
        Ref.IntRef intRef6;
        java.util.Collection collection2;
        java.util.Iterator it2;
        android.net.Uri uri;
        android.content.Context context3;
        java.lang.String strOLrzqt;
        GalleryPlugin$processMediaItems$1 galleryPlugin$processMediaItems$14;
        java.lang.Object objM7377constructorimpl2;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        SendMessageRequestParam sendMessageRequestParam;
        SendMessageRequestParam.ImageOrGif imageOrGif;
        java.lang.Object objM7377constructorimpl3;
        SendMessageRequestParam.ImageOrGif imageOrGif2;
        java.util.Iterator it3;
        android.content.Context context4;
        GalleryPlugin$processMediaItems$1 galleryPlugin$processMediaItems$15;
        Ref.IntRef intRef7;
        Ref.IntRef intRef8;
        Ref.IntRef intRef9;
        java.lang.Throwable thM7380exceptionOrNullimpl2;
        if (continuation instanceof GalleryPlugin$processMediaItems$1) {
            galleryPlugin$processMediaItems$1 = (GalleryPlugin$processMediaItems$1) continuation;
            int i = galleryPlugin$processMediaItems$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                galleryPlugin$processMediaItems$1.label = i - Integer.MIN_VALUE;
                c36478obi = this;
            } else {
                c36478obi = this;
                galleryPlugin$processMediaItems$1 = new GalleryPlugin$processMediaItems$1(c36478obi, continuation);
            }
        }
        java.lang.Object obj3 = galleryPlugin$processMediaItems$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = galleryPlugin$processMediaItems$1.label;
        java.lang.Object obj4 = null;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj3);
            Ref.IntRef intRef10 = new Ref.IntRef();
            Ref.IntRef intRef11 = new Ref.IntRef();
            Ref.IntRef intRef12 = new Ref.IntRef();
            c36478obi2 = c36478obi;
            arrayList = new java.util.ArrayList();
            it = list.iterator();
            intRef = intRef11;
            intRef2 = intRef12;
            intRef3 = intRef10;
            galleryPlugin$processMediaItems$12 = galleryPlugin$processMediaItems$1;
            context2 = context;
            list3 = list2;
            if (it.hasNext()) {
            }
        } else if (i2 == 1) {
            android.net.Uri uri2 = (android.net.Uri) galleryPlugin$processMediaItems$1.L$8;
            java.util.Iterator it4 = (java.util.Iterator) galleryPlugin$processMediaItems$1.L$7;
            java.util.Collection collection3 = (java.util.Collection) galleryPlugin$processMediaItems$1.L$6;
            Ref.IntRef intRef13 = (Ref.IntRef) galleryPlugin$processMediaItems$1.L$5;
            Ref.IntRef intRef14 = (Ref.IntRef) galleryPlugin$processMediaItems$1.L$4;
            Ref.IntRef intRef15 = (Ref.IntRef) galleryPlugin$processMediaItems$1.L$3;
            java.util.List<? extends android.net.Uri> list5 = (java.util.List) galleryPlugin$processMediaItems$1.L$2;
            android.content.Context context5 = (android.content.Context) galleryPlugin$processMediaItems$1.L$1;
            C36478obi c36478obi4 = (C36478obi) galleryPlugin$processMediaItems$1.L$0;
            C56391yDq.AEQbTJ(obj3);
            list4 = list5;
            intRef6 = intRef13;
            uri = uri2;
            it2 = it4;
            context3 = context5;
            intRef5 = intRef14;
            collection2 = collection3;
            c36478obi3 = c36478obi4;
            intRef4 = intRef15;
            C44161sFo c44161sFo = (C44161sFo) obj3;
            android.net.Uri uri3 = uri;
            long jKWHzl = c44161sFo.KWHzl();
            strOLrzqt = c44161sFo.OLrzqt();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object obj5 = objCopydefault;
            sb.append("Selected media item: ");
            sb.append(uri3);
            sb.append(", type: ");
            sb.append(strOLrzqt);
            sb.append(", size: ");
            sb.append(jKWHzl);
            pUU.KWHzl("GalleryPlugin", sb.toString());
            if (strOLrzqt != null) {
            }
            if (sendMessageRequestParam != null) {
            }
            obj4 = obj;
            it = it;
            objCopydefault = obj2;
            list3 = list4;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.String str = (java.lang.String) galleryPlugin$processMediaItems$1.L$9;
            android.net.Uri uri4 = (android.net.Uri) galleryPlugin$processMediaItems$1.L$8;
            java.util.Iterator it5 = (java.util.Iterator) galleryPlugin$processMediaItems$1.L$7;
            java.util.Collection collection4 = (java.util.Collection) galleryPlugin$processMediaItems$1.L$6;
            Ref.IntRef intRef16 = (Ref.IntRef) galleryPlugin$processMediaItems$1.L$5;
            Ref.IntRef intRef17 = (Ref.IntRef) galleryPlugin$processMediaItems$1.L$4;
            intRef4 = (Ref.IntRef) galleryPlugin$processMediaItems$1.L$3;
            list4 = (java.util.List) galleryPlugin$processMediaItems$1.L$2;
            android.content.Context context6 = (android.content.Context) galleryPlugin$processMediaItems$1.L$1;
            c36478obi3 = (C36478obi) galleryPlugin$processMediaItems$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj3);
                collection = collection4;
                obj = null;
                galleryPlugin$processMediaItems$15 = galleryPlugin$processMediaItems$1;
                obj2 = objCopydefault;
                intRef9 = intRef17;
                context4 = context6;
            } catch (java.lang.Throwable th2) {
                th = th2;
                galleryPlugin$processMediaItems$13 = galleryPlugin$processMediaItems$1;
                obj2 = objCopydefault;
                collection = collection4;
                obj = null;
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl2 != null) {
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                }
                java.util.Iterator it6 = it5;
                intRef2 = intRef16;
                intRef3 = intRef4;
                arrayList = collection;
                c36478obi2 = c36478obi3;
                intRef = intRef17;
                sendMessageRequestParam = (SendMessageRequestParam) objM7377constructorimpl;
                context2 = context6;
                galleryPlugin$processMediaItems$12 = galleryPlugin$processMediaItems$13;
                if (sendMessageRequestParam != null) {
                }
                obj4 = obj;
                it = it6;
                objCopydefault = obj2;
                list3 = list4;
                if (it.hasNext()) {
                }
            }
            SendMessageRequestParam.Video video = new SendMessageRequestParam.Video(str, ((java.lang.Number) obj3).intValue());
            galleryPlugin$processMediaItems$13 = galleryPlugin$processMediaItems$15;
            context6 = context4;
            intRef17 = intRef9;
            objM7377constructorimpl = Result.m7377constructorimpl(video);
            thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl2 != null) {
                pUU.AEQbTJ("GalleryPlugin", "Error prepping video file: " + uri4, thM7380exceptionOrNullimpl2);
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = obj;
            }
            java.util.Iterator it62 = it5;
            intRef2 = intRef16;
            intRef3 = intRef4;
            arrayList = collection;
            c36478obi2 = c36478obi3;
            intRef = intRef17;
            sendMessageRequestParam = (SendMessageRequestParam) objM7377constructorimpl;
            context2 = context6;
            galleryPlugin$processMediaItems$12 = galleryPlugin$processMediaItems$13;
            if (sendMessageRequestParam != null) {
                arrayList.add(sendMessageRequestParam);
            }
            obj4 = obj;
            it = it62;
            objCopydefault = obj2;
            list3 = list4;
            if (it.hasNext()) {
                android.net.Uri uri5 = (android.net.Uri) it.next();
                galleryPlugin$processMediaItems$12.L$0 = c36478obi2;
                galleryPlugin$processMediaItems$12.L$1 = context2;
                galleryPlugin$processMediaItems$12.L$2 = list3;
                galleryPlugin$processMediaItems$12.L$3 = intRef3;
                galleryPlugin$processMediaItems$12.L$4 = intRef;
                galleryPlugin$processMediaItems$12.L$5 = intRef2;
                galleryPlugin$processMediaItems$12.L$6 = arrayList;
                galleryPlugin$processMediaItems$12.L$7 = it;
                galleryPlugin$processMediaItems$12.L$8 = uri5;
                galleryPlugin$processMediaItems$12.L$9 = obj4;
                galleryPlugin$processMediaItems$12.label = 1;
                java.lang.Object objGEmmrt = sFB.gEmmrt(uri5, context2, galleryPlugin$processMediaItems$12);
                if (objGEmmrt == objCopydefault) {
                    return objCopydefault;
                }
                list4 = list3;
                galleryPlugin$processMediaItems$1 = galleryPlugin$processMediaItems$12;
                context3 = context2;
                obj3 = objGEmmrt;
                intRef4 = intRef3;
                intRef5 = intRef;
                c36478obi3 = c36478obi2;
                intRef6 = intRef2;
                uri = uri5;
                java.util.Iterator it7 = it;
                collection2 = arrayList;
                it2 = it7;
                C44161sFo c44161sFo2 = (C44161sFo) obj3;
                android.net.Uri uri32 = uri;
                long jKWHzl2 = c44161sFo2.KWHzl();
                strOLrzqt = c44161sFo2.OLrzqt();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                java.lang.Object obj52 = objCopydefault;
                sb2.append("Selected media item: ");
                sb2.append(uri32);
                sb2.append(", type: ");
                sb2.append(strOLrzqt);
                sb2.append(", size: ");
                sb2.append(jKWHzl2);
                pUU.KWHzl("GalleryPlugin", sb2.toString());
                if (strOLrzqt != null) {
                    context2 = context3;
                    it62 = it2;
                    arrayList = collection2;
                    intRef2 = intRef6;
                    intRef3 = intRef4;
                    sendMessageRequestParam = null;
                    obj = null;
                    galleryPlugin$processMediaItems$12 = galleryPlugin$processMediaItems$1;
                    c36478obi2 = c36478obi3;
                    intRef = intRef5;
                    obj2 = obj52;
                } else {
                    java.util.Iterator it8 = it2;
                    java.util.Collection collection5 = collection2;
                    android.content.Context context7 = context3;
                    if (C59449zhJ.startsWith$default(strOLrzqt, "image/gif", false, 2, null)) {
                        try {
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            galleryPlugin$processMediaItems$14 = galleryPlugin$processMediaItems$1;
                        }
                        Result.Application application2 = Result.Companion;
                        galleryPlugin$processMediaItems$14 = galleryPlugin$processMediaItems$1;
                        if (jKWHzl2 <= c36478obi3.copydefault) {
                            boolean zContains = list4.contains(uri32);
                            pUU.KWHzl("GalleryPlugin", "Use original image: " + zContains + ", item: " + uri32);
                            java.lang.String string = uri32.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "");
                            imageOrGif = new SendMessageRequestParam.ImageOrGif(string, strOLrzqt, zContains);
                        } else {
                            try {
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                Result.Application application3 = Result.Companion;
                                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
                                if (thM7380exceptionOrNullimpl != null) {
                                }
                                if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
                                }
                                it62 = it8;
                                intRef2 = intRef6;
                                obj2 = obj52;
                                galleryPlugin$processMediaItems$12 = galleryPlugin$processMediaItems$14;
                                obj = null;
                                c36478obi2 = c36478obi3;
                                intRef = intRef5;
                                intRef3 = intRef4;
                                arrayList = collection5;
                                sendMessageRequestParam = (SendMessageRequestParam) objM7377constructorimpl2;
                                context2 = context7;
                                if (sendMessageRequestParam != null) {
                                }
                                obj4 = obj;
                                it = it62;
                                objCopydefault = obj2;
                                list3 = list4;
                                if (it.hasNext()) {
                                }
                            }
                            intRef6.element++;
                            imageOrGif = null;
                        }
                        objM7377constructorimpl2 = Result.m7377constructorimpl(imageOrGif);
                        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
                        if (thM7380exceptionOrNullimpl != null) {
                            pUU.AEQbTJ("GalleryPlugin", "Error prepping image file: " + uri32, thM7380exceptionOrNullimpl);
                        }
                        if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
                            objM7377constructorimpl2 = null;
                        }
                        it62 = it8;
                        intRef2 = intRef6;
                        obj2 = obj52;
                        galleryPlugin$processMediaItems$12 = galleryPlugin$processMediaItems$14;
                        obj = null;
                        c36478obi2 = c36478obi3;
                        intRef = intRef5;
                        intRef3 = intRef4;
                        arrayList = collection5;
                        sendMessageRequestParam = (SendMessageRequestParam) objM7377constructorimpl2;
                        context2 = context7;
                    } else {
                        galleryPlugin$processMediaItems$13 = galleryPlugin$processMediaItems$1;
                        Ref.IntRef intRef18 = intRef6;
                        Ref.IntRef intRef19 = intRef5;
                        if (C59449zhJ.startsWith$default(strOLrzqt, "image/", false, 2, null)) {
                            try {
                            } catch (java.lang.Throwable th5) {
                                Result.Application application4 = Result.Companion;
                                objM7377constructorimpl3 = Result.m7377constructorimpl(C56391yDq.EZpvd(th5));
                            }
                            Result.Application application5 = Result.Companion;
                            if (jKWHzl2 > c36478obi3.valueOf) {
                                intRef4.element++;
                                imageOrGif2 = null;
                            } else {
                                boolean zContains2 = list4.contains(uri32);
                                pUU.KWHzl("GalleryPlugin", "Use original image: " + zContains2 + ", item: " + uri32);
                                java.lang.String string2 = uri32.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "");
                                imageOrGif2 = new SendMessageRequestParam.ImageOrGif(string2, strOLrzqt, zContains2);
                            }
                            objM7377constructorimpl3 = Result.m7377constructorimpl(imageOrGif2);
                            java.lang.Object obj6 = objM7377constructorimpl3;
                            java.lang.Throwable thM7380exceptionOrNullimpl3 = Result.m7380exceptionOrNullimpl(obj6);
                            if (thM7380exceptionOrNullimpl3 != null) {
                                pUU.AEQbTJ("GalleryPlugin", "Error prepping image file: " + uri32, thM7380exceptionOrNullimpl3);
                            }
                            if (Result.m7383isFailureimpl(obj6)) {
                                it62 = it8;
                                arrayList = collection5;
                                c36478obi2 = c36478obi3;
                                sendMessageRequestParam = (SendMessageRequestParam) null;
                                intRef3 = intRef4;
                                obj2 = obj52;
                                context2 = context7;
                                galleryPlugin$processMediaItems$12 = galleryPlugin$processMediaItems$13;
                                intRef2 = intRef18;
                                intRef = intRef19;
                                obj = null;
                            } else {
                                it62 = it8;
                                arrayList = collection5;
                                c36478obi2 = c36478obi3;
                                sendMessageRequestParam = (SendMessageRequestParam) null;
                                intRef3 = intRef4;
                                obj2 = obj52;
                                context2 = context7;
                                galleryPlugin$processMediaItems$12 = galleryPlugin$processMediaItems$13;
                                intRef2 = intRef18;
                                intRef = intRef19;
                                obj = null;
                            }
                        } else {
                            obj = null;
                            if (C59449zhJ.startsWith$default(strOLrzqt, "video/", false, 2, null)) {
                                try {
                                } catch (java.lang.Throwable th6) {
                                    th = th6;
                                    it3 = it8;
                                    collection = collection5;
                                    obj2 = obj52;
                                    context4 = context7;
                                    galleryPlugin$processMediaItems$15 = galleryPlugin$processMediaItems$13;
                                    intRef7 = intRef18;
                                    intRef8 = intRef19;
                                }
                                Result.Application application6 = Result.Companion;
                                if (jKWHzl2 > c36478obi3.AhwBna) {
                                    try {
                                    } catch (java.lang.Throwable th7) {
                                        th = th7;
                                    }
                                    intRef19.element++;
                                    collection = collection5;
                                    uri4 = uri32;
                                    intRef17 = intRef19;
                                    video = null;
                                    obj2 = obj52;
                                    context6 = context7;
                                    intRef16 = intRef18;
                                    it5 = it8;
                                    objM7377constructorimpl = Result.m7377constructorimpl(video);
                                    thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                                    if (thM7380exceptionOrNullimpl2 != null) {
                                    }
                                    if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                                    }
                                    java.util.Iterator it622 = it5;
                                    intRef2 = intRef16;
                                    intRef3 = intRef4;
                                    arrayList = collection;
                                    c36478obi2 = c36478obi3;
                                    intRef = intRef17;
                                    sendMessageRequestParam = (SendMessageRequestParam) objM7377constructorimpl;
                                    context2 = context6;
                                    galleryPlugin$processMediaItems$12 = galleryPlugin$processMediaItems$13;
                                } else {
                                    intRef8 = intRef19;
                                    try {
                                    } catch (java.lang.Throwable th8) {
                                        th = th8;
                                        it3 = it8;
                                        collection = collection5;
                                        obj2 = obj52;
                                        context4 = context7;
                                        galleryPlugin$processMediaItems$15 = galleryPlugin$processMediaItems$13;
                                    }
                                    java.lang.String string3 = uri32.toString();
                                    Intrinsics.checkNotNullExpressionValue(string3, "");
                                    galleryPlugin$processMediaItems$15 = galleryPlugin$processMediaItems$13;
                                    galleryPlugin$processMediaItems$15.L$0 = c36478obi3;
                                    context4 = context7;
                                    galleryPlugin$processMediaItems$15.L$1 = context4;
                                    galleryPlugin$processMediaItems$15.L$2 = list4;
                                    galleryPlugin$processMediaItems$15.L$3 = intRef4;
                                    galleryPlugin$processMediaItems$15.L$4 = intRef8;
                                    intRef7 = intRef18;
                                    galleryPlugin$processMediaItems$15.L$5 = intRef7;
                                    collection = collection5;
                                    galleryPlugin$processMediaItems$15.L$6 = collection;
                                    it3 = it8;
                                    galleryPlugin$processMediaItems$15.L$7 = it3;
                                    galleryPlugin$processMediaItems$15.L$8 = uri32;
                                    galleryPlugin$processMediaItems$15.L$9 = string3;
                                    galleryPlugin$processMediaItems$15.label = 2;
                                    java.lang.Object objValueOf = sFB.valueOf(uri32, context4, galleryPlugin$processMediaItems$15);
                                    obj2 = obj52;
                                    if (objValueOf == obj2) {
                                        return obj2;
                                    }
                                    str = string3;
                                    obj3 = objValueOf;
                                    intRef16 = intRef7;
                                    uri4 = uri32;
                                    it5 = it3;
                                    intRef9 = intRef8;
                                    SendMessageRequestParam.Video video2 = new SendMessageRequestParam.Video(str, ((java.lang.Number) obj3).intValue());
                                    galleryPlugin$processMediaItems$13 = galleryPlugin$processMediaItems$15;
                                    context6 = context4;
                                    intRef17 = intRef9;
                                    objM7377constructorimpl = Result.m7377constructorimpl(video2);
                                    thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                                    if (thM7380exceptionOrNullimpl2 != null) {
                                    }
                                    if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                                    }
                                    java.util.Iterator it6222 = it5;
                                    intRef2 = intRef16;
                                    intRef3 = intRef4;
                                    arrayList = collection;
                                    c36478obi2 = c36478obi3;
                                    intRef = intRef17;
                                    sendMessageRequestParam = (SendMessageRequestParam) objM7377constructorimpl;
                                    context2 = context6;
                                    galleryPlugin$processMediaItems$12 = galleryPlugin$processMediaItems$13;
                                }
                            } else {
                                it6222 = it8;
                                obj2 = obj52;
                                galleryPlugin$processMediaItems$12 = galleryPlugin$processMediaItems$13;
                                intRef2 = intRef18;
                                c36478obi2 = c36478obi3;
                                intRef = intRef19;
                                intRef3 = intRef4;
                                arrayList = collection5;
                                sendMessageRequestParam = null;
                                context2 = context7;
                            }
                        }
                    }
                }
                if (sendMessageRequestParam != null) {
                }
                obj4 = obj;
                it = it6222;
                objCopydefault = obj2;
                list3 = list4;
                if (it.hasNext()) {
                    return new Application((java.util.List) arrayList, intRef3.element, intRef.element, intRef2.element);
                }
            }
        }
    }

    public final boolean EZpvd(java.util.List<? extends android.net.Uri> list) {
        if (list.size() <= this.gEmmrt) {
            return true;
        }
        OLrzqt();
        return false;
    }

    public final void OLrzqt() {
        java.lang.String strCopydefault;
        int i = this.gEmmrt;
        if (i == 1) {
            strCopydefault = C33070mpX.AYXKKw(C35399nuc.LoaderManager.BVXAa);
        } else {
            strCopydefault = C33069mpW.copydefault(C35399nuc.LoaderManager.HJWChPURsaBn, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(i))));
        }
        GeneralAction.OpenMediaPickerToast openMediaPickerToast = new GeneralAction.OpenMediaPickerToast(strCopydefault);
        InterfaceC35289nsX interfaceC35289nsXEZpvd = EZpvd();
        if (interfaceC35289nsXEZpvd != null) {
            interfaceC35289nsXEZpvd.KWHzl(openMediaPickerToast);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final GeneralAction.OpenMediaPickerToast AEQbTJ(int i, int i2, int i3) {
        java.lang.String strCopydefault;
        java.util.List listGEmmrt = yDY.gEmmrt(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3));
        if (!(listGEmmrt instanceof java.util.Collection) || !listGEmmrt.isEmpty()) {
            java.util.Iterator it = listGEmmrt.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                if (((java.lang.Number) it.next()).intValue() > 0 && (i4 = i4 + 1) < 0) {
                    yDY.djBIcL();
                }
            }
            if (i4 >= 2) {
                strCopydefault = C33069mpW.copydefault(C35399nuc.LoaderManager.getUserContextRegisteredStatus, C56424yEw.gEmmrt(C56390yDp.OLrzqt("imgSize", java.lang.String.valueOf(this.djBIcL)), C56390yDp.OLrzqt("vidSize", java.lang.String.valueOf(this.djBIcL)), C56390yDp.OLrzqt("gifSize", java.lang.String.valueOf(this.EZpvd))));
            } else if (i > 0) {
                strCopydefault = C33069mpW.copydefault(C35399nuc.LoaderManager.sendSocketRequest, C56423yEv.EZpvd(C56390yDp.OLrzqt("count", java.lang.String.valueOf(this.djBIcL))));
            } else if (i2 > 0) {
                strCopydefault = C33069mpW.copydefault(C35399nuc.LoaderManager.accept, C56423yEv.EZpvd(C56390yDp.OLrzqt("maxSize", this.djBIcL + " MB")));
            } else {
                strCopydefault = i3 > 0 ? C33069mpW.copydefault(C35399nuc.LoaderManager.wtf, C56423yEv.EZpvd(C56390yDp.OLrzqt("count", java.lang.String.valueOf(this.EZpvd)))) : "";
            }
        }
        return new GeneralAction.OpenMediaPickerToast(strCopydefault);
    }

    public final void copydefault(java.util.List<? extends SendMessageRequestParam> list, int i, GeneralAction.OpenMediaPickerToast openMediaPickerToast) {
        InterfaceC35289nsX interfaceC35289nsXEZpvd;
        if ((!list.isEmpty()) && i > 0) {
            InterfaceC35289nsX interfaceC35289nsXEZpvd2 = EZpvd();
            if (interfaceC35289nsXEZpvd2 != null) {
                interfaceC35289nsXEZpvd2.AEQbTJ(yDY.gEmmrt(new GeneralAction.SendMessages(new java.util.ArrayList(list)), openMediaPickerToast));
                return;
            }
            return;
        }
        if (!list.isEmpty()) {
            InterfaceC35289nsX interfaceC35289nsXEZpvd3 = EZpvd();
            if (interfaceC35289nsXEZpvd3 != null) {
                interfaceC35289nsXEZpvd3.KWHzl(new GeneralAction.SendMessages(new java.util.ArrayList(list)));
                return;
            }
            return;
        }
        if (i > this.gEmmrt || (interfaceC35289nsXEZpvd = EZpvd()) == null) {
            return;
        }
        interfaceC35289nsXEZpvd.KWHzl(openMediaPickerToast);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(android.content.Context context, java.util.List<? extends android.net.Uri> list, java.util.List<? extends android.net.Uri> list2, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        GalleryPlugin$processUriList$1 galleryPlugin$processUriList$1;
        C36478obi c36478obi;
        if (continuation instanceof GalleryPlugin$processUriList$1) {
            galleryPlugin$processUriList$1 = (GalleryPlugin$processUriList$1) continuation;
            int i = galleryPlugin$processUriList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                galleryPlugin$processUriList$1.label = i - Integer.MIN_VALUE;
            } else {
                galleryPlugin$processUriList$1 = new GalleryPlugin$processUriList$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = galleryPlugin$processUriList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = galleryPlugin$processUriList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            if (!EZpvd(list)) {
                return Unit.INSTANCE;
            }
            galleryPlugin$processUriList$1.L$0 = this;
            galleryPlugin$processUriList$1.label = 1;
            objOLrzqt = OLrzqt(context, list, list2, galleryPlugin$processUriList$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c36478obi = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c36478obi = (C36478obi) galleryPlugin$processUriList$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        Application application = (Application) objOLrzqt;
        java.util.List<SendMessageRequestParam> listKWHzl = application.KWHzl();
        int iAEQbTJ = application.AEQbTJ();
        int iOLrzqt = application.OLrzqt();
        int iCopydefault = application.copydefault();
        c36478obi.copydefault(listKWHzl, iAEQbTJ + iOLrzqt + iCopydefault, c36478obi.AEQbTJ(iAEQbTJ, iOLrzqt, iCopydefault));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.obi */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object processUriList$default(C36478obi c36478obi, android.content.Context context, java.util.List list, java.util.List list2, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            list2 = yDY.AhwBna();
        }
        return c36478obi.AEQbTJ(context, list, list2, continuation);
    }

    @Override // o.AbstractC35291nsZ
    public void EZpvd(@NotNull androidx.fragment.app.Fragment fragment, @NotNull java.util.List<? extends GeneralAction> list) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(list, "");
        for (GeneralAction generalAction : list) {
            if (generalAction instanceof GeneralAction.ProcessPastedUris) {
                KWHzl(fragment, ((GeneralAction.ProcessPastedUris) generalAction).copydefault());
            }
        }
    }
}
