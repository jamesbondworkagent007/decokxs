package com.okinc.im.imui.qrcode;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.SharePlatformsConfig;
import com.okinc.share.bean.link.LinkShareParams;
import com.okinc.share.platforms.SharePlatform;
import com.reown.android.pulse.model.EventType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractActivityC33044moy;
import o.C33070mpX;
import o.C35399nuc;
import o.C35893oHp;
import o.C43251rlk;
import o.C52761wXj;
import o.C52794wYp;
import o.C55113xdn;
import o.C55173xeu;
import o.C55296xhK;
import o.C56444yFp;
import o.C6995aZr;
import o.InterfaceC48893ueK;
import o.InterfaceC56445yFq;
import o.nHK;
import o.wYC;
import o.wYF;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public abstract class BaseQrDisplayActivity extends AbstractActivityC33044moy<nHK> {
    public Function0<Unit> valueOf;
    public final int DbNXlk = C35399nuc.Dialog.copydefault;
    public String fetchVPNInfo = "";
    public String values = "";

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PageState.values().length];
            try {
                iArr[PageState.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PageState.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PageState.CONTENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.values = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fetchVPNInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFieldNames() {
        return this.fetchVPNInfo;
    }

    public final void OLrzqt(Function0<Unit> function0) {
        this.valueOf = function0;
        valueOf().setVisibility(function0 != null ? 0 : 8);
    }

    public final String fARcdN() {
        String str = this.values;
        if (!StringsKt__StringsKt.fARcdN((CharSequence) str)) {
            return str;
        }
        String strOLrzqt = AuCTel().OLrzqt();
        return strOLrzqt == null ? "" : strOLrzqt;
    }

    public final View fIwbmz() {
        LinearLayout linearLayout = KWHzl().valueOf;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        return linearLayout;
    }

    public final ImageView fetchVPNInfo() {
        wYC wyc = KWHzl().KWHzl;
        Intrinsics.checkNotNullExpressionValue(wyc, "");
        return wyc;
    }

    public final C55173xeu hDKMBd() {
        C55173xeu c55173xeu = KWHzl().fARcdN;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        return c55173xeu;
    }

    public final ImageView valueOf() {
        ImageView imageView = KWHzl().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        return imageView;
    }

    public final ImageView values() {
        ImageView imageView = KWHzl().copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        return imageView;
    }

    public final C35893oHp isConnected() {
        C35893oHp c35893oHp = KWHzl().djBIcL;
        Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
        return c35893oHp;
    }

    public final TextView uzCIH() {
        TextView textView = KWHzl().values;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final TextView ejfBZ() {
        TextView textView = KWHzl().gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final C6995aZr AuCTel() {
        C6995aZr c6995aZr = KWHzl().AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c6995aZr, "");
        return c6995aZr;
    }

    public final C52794wYp AkhnZx() {
        return KWHzl().AEQbTJ.copydefault();
    }

    public final C52794wYp DbNXlk() {
        return KWHzl().AEQbTJ.AEQbTJ();
    }

    public final String fJNWhG() {
        String strOLrzqt = AuCTel().OLrzqt();
        if (strOLrzqt == null || !(!StringsKt__StringsKt.fARcdN((CharSequence) strOLrzqt))) {
            return null;
        }
        return strOLrzqt;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class PageState {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ PageState[] $VALUES;
        public static final PageState CONTENT = new PageState("CONTENT", 0);
        public static final PageState LOADING = new PageState("LOADING", 1);
        public static final PageState ERROR = new PageState(EventType.ERROR, 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ PageState[] $values() {
            return new PageState[]{CONTENT, LOADING, ERROR};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<PageState> getEntries() {
            return $ENTRIES;
        }

        private PageState(String str, int i) {
        }

        static {
            PageState[] pageStateArr$values = $values();
            $VALUES = pageStateArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(pageStateArr$values);
        }

        public static PageState valueOf(String str) {
            return (PageState) Enum.valueOf(PageState.class, str);
        }

        public static PageState[] values() {
            return (PageState[]) $VALUES.clone();
        }
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EZpvd();
    }

    public final void OLrzqt(@NotNull PageState pageState) {
        Intrinsics.checkNotNullParameter(pageState, "");
        nHK nhkKWHzl = KWHzl();
        int i = ActionBar.KWHzl[pageState.ordinal()];
        if (i == 1) {
            ScrollView scrollView = nhkKWHzl.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(scrollView, "");
            scrollView.setVisibility(8);
            wYF wyf = nhkKWHzl.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(wyf, "");
            wyf.setVisibility(8);
            ImageView imageView = nhkKWHzl.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(8);
            C55173xeu c55173xeu = nhkKWHzl.fARcdN;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(8);
            C55113xdn c55113xdn = nhkKWHzl.ejfBZ;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            c55113xdn.setVisibility(0);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            C55113xdn c55113xdn2 = nhkKWHzl.ejfBZ;
            Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
            c55113xdn2.setVisibility(8);
            C55173xeu c55173xeu2 = nhkKWHzl.fARcdN;
            Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
            c55173xeu2.setVisibility(8);
            ScrollView scrollView2 = nhkKWHzl.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(scrollView2, "");
            scrollView2.setVisibility(0);
            wYF wyf2 = nhkKWHzl.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(wyf2, "");
            wyf2.setVisibility(0);
            ImageView imageView2 = nhkKWHzl.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(0);
            return;
        }
        ScrollView scrollView3 = nhkKWHzl.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(scrollView3, "");
        scrollView3.setVisibility(8);
        wYF wyf3 = nhkKWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(wyf3, "");
        wyf3.setVisibility(8);
        ImageView imageView3 = nhkKWHzl.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView3, "");
        imageView3.setVisibility(8);
        C55113xdn c55113xdn3 = nhkKWHzl.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(c55113xdn3, "");
        c55113xdn3.setVisibility(8);
        C55173xeu c55173xeu3 = nhkKWHzl.fARcdN;
        Intrinsics.checkNotNullExpressionValue(c55173xeu3, "");
        c55173xeu3.setVisibility(0);
        ImageView imageView4 = nhkKWHzl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView4, "");
        if (imageView4.getVisibility() == 0) {
            C55173xeu c55173xeu4 = nhkKWHzl.fARcdN;
            String string = getString(C35399nuc.LoaderManager.SePrCP);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c55173xeu4.setRetry(string);
            C55173xeu c55173xeu5 = nhkKWHzl.fARcdN;
            String string2 = getString(C35399nuc.LoaderManager.DdI);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            c55173xeu5.setSubTitle((CharSequence) string2);
            return;
        }
        nhkKWHzl.fARcdN.setRetry("");
    }

    public final void OLrzqt(boolean z) {
        C52794wYp c52794wYpAkhnZx = AkhnZx();
        if (c52794wYpAkhnZx != null) {
            c52794wYpAkhnZx.setEnabled(z);
        }
        C52794wYp c52794wYpDbNXlk = DbNXlk();
        if (c52794wYpDbNXlk != null) {
            c52794wYpDbNXlk.setEnabled(z);
        }
        values().setEnabled(z);
        valueOf().setEnabled(z);
    }

    private final void EZpvd() {
        ImageView imageViewFetchVPNInfo = fetchVPNInfo();
        imageViewFetchVPNInfo.setOnClickListener(new Activity(imageViewFetchVPNInfo, 1000L, this));
        ImageView imageViewValueOf = valueOf();
        imageViewValueOf.setOnClickListener(new TaskDescription(imageViewValueOf, 1000L, this));
        ImageView imageViewValues = values();
        imageViewValues.setOnClickListener(new StateListAnimator(imageViewValues, 1000L, this));
        C52794wYp c52794wYpAkhnZx = AkhnZx();
        if (c52794wYpAkhnZx != null) {
            c52794wYpAkhnZx.setOnClickListener(new Application(c52794wYpAkhnZx, 1000L, this));
        }
        C52794wYp c52794wYpDbNXlk = DbNXlk();
        if (c52794wYpDbNXlk != null) {
            c52794wYpDbNXlk.setOnClickListener(new Dialog(c52794wYpDbNXlk, 1000L, this));
        }
        wYF wyf = KWHzl().AEQbTJ;
        int iOLrzqt = C33070mpX.OLrzqt(C52761wXj.StateListAnimator.QUSxYX);
        wyf.setPadding(iOLrzqt, wyf.getPaddingTop(), iOLrzqt, wyf.getPaddingBottom());
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ BaseQrDisplayActivity OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, BaseQrDisplayActivity baseQrDisplayActivity) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = baseQrDisplayActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.getOnBackPressedDispatcher().onBackPressed();
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ BaseQrDisplayActivity copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, BaseQrDisplayActivity baseQrDisplayActivity) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = baseQrDisplayActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.getNewProxyInstance();
            }
        }
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ BaseQrDisplayActivity EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(View view, long j, BaseQrDisplayActivity baseQrDisplayActivity) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = baseQrDisplayActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.zLjUOn();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ BaseQrDisplayActivity KWHzl;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(View view, long j, BaseQrDisplayActivity baseQrDisplayActivity) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = baseQrDisplayActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.iwGUEr();
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ BaseQrDisplayActivity KWHzl;
        public final /* synthetic */ View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(View view, long j, BaseQrDisplayActivity baseQrDisplayActivity) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = baseQrDisplayActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function0<Unit> function0AYXKKw = this.KWHzl.AYXKKw();
                if (function0AYXKKw != null) {
                    function0AYXKKw.invoke();
                }
            }
        }
    }

    public final void iwGUEr() {
        if (fJNWhG() != null) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BaseQrDisplayActivity$shareImage$1$1(this, null), 3, null);
        }
    }

    public final void getNewProxyInstance() {
        if (fJNWhG() != null) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BaseQrDisplayActivity$saveImage$1$1(this, null), 3, null);
        }
    }

    public final void zLjUOn() {
        String strFJNWhG = fJNWhG();
        if (strFJNWhG != null) {
            LinkShareParams linkShareParamsCreate$default = LinkShareParams.Activity.create$default(LinkShareParams.Companion, strFJNWhG, null, 2, null);
            linkShareParamsCreate$default.setTitle(this.fetchVPNInfo);
            linkShareParamsCreate$default.setBody(fARcdN());
            linkShareParamsCreate$default.setShareFrom("OKIM");
            ShareConfig shareConfigCreate$default = ShareConfig.ActionBar.create$default(ShareConfig.Companion, linkShareParamsCreate$default, null, 2, null);
            shareConfigCreate$default.setSharePlatformConfig(SharePlatformsConfig.ActionBar.create$default(SharePlatformsConfig.Companion, yDY.gEmmrt(SharePlatform.WHATS_APP, SharePlatform.TELEGRAM, SharePlatform.FACEBOOK), null, 2, null));
            EZpvd(shareConfigCreate$default);
        }
    }

    public final void EZpvd(ShareConfig shareConfig) {
        InterfaceC48893ueK interfaceC48893ueK = (InterfaceC48893ueK) C43251rlk.OLrzqt(InterfaceC48893ueK.class);
        if (interfaceC48893ueK != null) {
            interfaceC48893ueK.copydefault(this, shareConfig);
        }
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
