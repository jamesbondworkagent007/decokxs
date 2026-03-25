package com.okinc.business.invest_biz.ui.screens.univ3;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.TextViewCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.immomo.mls.fun.constants.TextAlign;
import com.okinc.business.dexlogic.bean.SlippageConfigVo;
import com.okinc.business.invest_biz.data.bean.SwapSlippageConfig;
import com.okinc.business.invest_biz.ui.screens.univ3.SwapSlippageActivity;
import com.reown.android.pulse.model.EventType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractActivityC33013moT;
import o.AbstractC23731iHf;
import o.C25493ixk;
import o.C26714jhY;
import o.C27492jwH;
import o.C32113mPz;
import o.C33054mpH;
import o.C33069mpW;
import o.C33129mqd;
import o.C33537myN;
import o.C52761wXj;
import o.C52794wYp;
import o.C55001xbh;
import o.C55008xbo;
import o.C55009xbp;
import o.C55258xgZ;
import o.C55279xgu;
import o.C55280xgv;
import o.C55296xhK;
import o.C55298xhM;
import o.C56390yDp;
import o.C56392yDr;
import o.C56423yEv;
import o.C56444yFp;
import o.C57406yhn;
import o.C59541ziw;
import o.InterfaceC24178iXu;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.InterfaceC59496ziD;
import o.ViewOnClickListenerC54939xaY;
import o.rVN;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class SwapSlippageActivity extends AbstractActivityC33013moT {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public String AEQbTJ;
    public PopupWindow AuCTel;
    public AbstractC23731iHf KWHzl;
    public int ejfBZ;
    public boolean fARcdN;
    public boolean fIwbmz;
    public int getFieldNames;
    public SwapSlippageConfig iwGUEr;
    public InputStatus DbNXlk = InputStatus.NORMAL;
    public SlippageMode OLrzqt = SlippageMode.DYNAMIC;
    public String fJNWhG = "";
    public String fetchVPNInfo = SlippageConfigVo.MAX_SLIP;
    public final InterfaceC56387yDm isConnected = C56392yDr.copydefault(new Function0() { // from class: o.jmT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SwapSlippageActivity.wlaJM(this.KWHzl);
        }
    });
    public final List<TextView> djBIcL = new ArrayList();
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.jmZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SwapSlippageActivity.getNewProxyInstance(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.jmY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SwapSlippageActivity.iwGUEr(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.jnb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SwapSlippageActivity.getFieldNames(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.jnc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SwapSlippageActivity.uzCIH(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.jna
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SwapSlippageActivity.AubY(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.jmP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SwapSlippageActivity.zLjUOn(this.copydefault);
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.jmS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SwapSlippageActivity.hDKMBd(this.EZpvd);
        }
    });

    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SlippageMode.values().length];
            try {
                iArr[SlippageMode.DYNAMIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SlippageMode.FIXED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[InputStatus.values().length];
            try {
                iArr2[InputStatus.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[InputStatus.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[InputStatus.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[InputStatus.NO_DATA.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            copydefault = iArr2;
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.screens.univ3.SwapSlippageActivity.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final Intent EZpvd(@NotNull Context context, @NotNull SlippageMode slippageMode, String str, String str2, boolean z, @NotNull SwapSlippageConfig swapSlippageConfig, String str3, boolean z2, int i) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(slippageMode, "");
            Intrinsics.checkNotNullParameter(swapSlippageConfig, "");
            Intent intent = new Intent(context, (Class<?>) SwapSlippageActivity.class);
            intent.putExtra("extra_slippage_mode", slippageMode.name());
            intent.putExtra("extra_max_slippage", str);
            intent.putExtra("extra_fixed_slippage", str2);
            intent.putExtra("extra_is_custom", z);
            intent.putExtra("extra_swap_slippage", str3);
            intent.putExtra("extra_swap_dynamic_has_custom", z2);
            intent.putExtra("extra_type", i);
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_swap_slippage_config", swapSlippageConfig);
            intent.putExtras(bundle);
            return intent;
        }
    }

    public static final class Fragment implements TextWatcher {
        public final /* synthetic */ C55008xbo EZpvd;
        public final /* synthetic */ SwapSlippageActivity KWHzl;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public Fragment(C55008xbo c55008xbo, SwapSlippageActivity swapSlippageActivity) {
            this.EZpvd = c55008xbo;
            this.KWHzl = swapSlippageActivity;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String strGEmmrt;
            String strIsConnected;
            C55001xbh c55001xbhAkhnZx = this.EZpvd.AkhnZx();
            if (c55001xbhAkhnZx == null || (strIsConnected = c55001xbhAkhnZx.isConnected()) == null || (strGEmmrt = C33129mqd.gEmmrt(strIsConnected)) == null) {
                strGEmmrt = "";
            }
            if (strGEmmrt.length() > 0) {
                this.KWHzl.EZpvd(strGEmmrt);
                if (this.KWHzl.OLrzqt == SlippageMode.FIXED) {
                    int iIndexOf = this.KWHzl.valueOf().indexOf(strGEmmrt);
                    if (iIndexOf >= 0) {
                        this.KWHzl.ejfBZ = iIndexOf;
                        this.KWHzl.fARcdN = false;
                        this.KWHzl.ejfBZ();
                    } else {
                        this.KWHzl.fARcdN = true;
                        this.KWHzl.ejfBZ();
                    }
                }
            }
            this.KWHzl.uzCIH();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class InputStatus {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ InputStatus[] $VALUES;
        public static final Activity Companion;
        private final int status;
        public static final InputStatus NORMAL = new InputStatus("NORMAL", 0, 0);
        public static final InputStatus WARNING = new InputStatus("WARNING", 1, 1);
        public static final InputStatus ERROR = new InputStatus(EventType.ERROR, 2, 2);
        public static final InputStatus NO_DATA = new InputStatus("NO_DATA", 3, 3);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ InputStatus[] $values() {
            return new InputStatus[]{NORMAL, WARNING, ERROR, NO_DATA};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<InputStatus> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getStatus() {
            return this.status;
        }

        private InputStatus(String str, int i, int i2) {
            this.status = i2;
        }

        static {
            InputStatus[] inputStatusArr$values = $values();
            $VALUES = inputStatusArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(inputStatusArr$values);
            Companion = new Activity(null);
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Activity {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.screens.univ3.SwapSlippageActivity.InputStatus.Activity.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Activity() {
            }
        }

        public static InputStatus valueOf(String str) {
            return (InputStatus) Enum.valueOf(InputStatus.class, str);
        }

        public static InputStatus[] values() {
            return (InputStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SlippageMode {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ SlippageMode[] $VALUES;
        public static final SlippageMode DYNAMIC = new SlippageMode("DYNAMIC", 0);
        public static final SlippageMode FIXED = new SlippageMode("FIXED", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ SlippageMode[] $values() {
            return new SlippageMode[]{DYNAMIC, FIXED};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<SlippageMode> getEntries() {
            return $ENTRIES;
        }

        private SlippageMode(String str, int i) {
        }

        static {
            SlippageMode[] slippageModeArr$values = $values();
            $VALUES = slippageModeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(slippageModeArr$values);
        }

        public static SlippageMode valueOf(String str) {
            return (SlippageMode) Enum.valueOf(SlippageMode.class, str);
        }

        public static SlippageMode[] values() {
            return (SlippageMode[]) $VALUES.clone();
        }
    }

    public final List<String> valueOf() {
        return (List) this.isConnected.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List wlaJM(SwapSlippageActivity swapSlippageActivity) {
        String strMulS$default;
        String stableMiddle;
        String strMulS$default2;
        String stableMax;
        String strMulS$default3;
        List list;
        SwapSlippageConfig swapSlippageConfig = swapSlippageActivity.iwGUEr;
        if (swapSlippageConfig != null) {
            String[] strArr = new String[3];
            String stableMin = swapSlippageConfig.getStableMin();
            if (stableMin == null) {
                strMulS$default = null;
                strArr[0] = strMulS$default;
                stableMiddle = swapSlippageConfig.getStableMiddle();
                if (stableMiddle == null) {
                    strMulS$default2 = null;
                    strArr[1] = strMulS$default2;
                    stableMax = swapSlippageConfig.getStableMax();
                    if (stableMax == null) {
                        strMulS$default3 = null;
                        strArr[2] = strMulS$default3;
                        List listValueOf = yDY.valueOf(strArr);
                        list = listValueOf.isEmpty() ^ true ? listValueOf : null;
                        if (list != null) {
                            return list;
                        }
                    } else {
                        String str = stableMax.length() > 0 ? stableMax : null;
                        if (str != null) {
                            strMulS$default3 = C33129mqd.mulS$default(str, "100", null, null, null, 14, null);
                        }
                        strArr[2] = strMulS$default3;
                        List listValueOf2 = yDY.valueOf(strArr);
                        if (listValueOf2.isEmpty() ^ true) {
                        }
                        if (list != null) {
                        }
                    }
                } else {
                    String str2 = stableMiddle.length() > 0 ? stableMiddle : null;
                    if (str2 != null) {
                        strMulS$default2 = C33129mqd.mulS$default(str2, "100", null, null, null, 14, null);
                    }
                    strArr[1] = strMulS$default2;
                    stableMax = swapSlippageConfig.getStableMax();
                    if (stableMax == null) {
                    }
                }
            } else {
                String str3 = stableMin.length() > 0 ? stableMin : null;
                if (str3 != null) {
                    strMulS$default = C33129mqd.mulS$default(str3, "100", null, null, null, 14, null);
                }
                strArr[0] = strMulS$default;
                stableMiddle = swapSlippageConfig.getStableMiddle();
                if (stableMiddle == null) {
                }
            }
        }
        return yDY.gEmmrt(SlippageConfigVo.MAX_SLIP, "1", "5");
    }

    public final String KWHzl() {
        return (String) this.AYXKKw.getValue();
    }

    public static final String getNewProxyInstance(SwapSlippageActivity swapSlippageActivity) {
        SwapSlippageConfig swapSlippageConfig = swapSlippageActivity.iwGUEr;
        return C33129mqd.mulS$default(swapSlippageConfig != null ? swapSlippageConfig.getAutoCustomMin() : null, "100", null, null, null, 14, null);
    }

    public final String AEQbTJ() {
        return (String) this.copydefault.getValue();
    }

    public static final String iwGUEr(SwapSlippageActivity swapSlippageActivity) {
        SwapSlippageConfig swapSlippageConfig = swapSlippageActivity.iwGUEr;
        return C33129mqd.mulS$default(swapSlippageConfig != null ? swapSlippageConfig.getAutoCustomMax() : null, "100", null, null, null, 14, null);
    }

    public final String gEmmrt() {
        return (String) this.AhwBna.getValue();
    }

    public static final String getFieldNames(SwapSlippageActivity swapSlippageActivity) {
        SwapSlippageConfig swapSlippageConfig = swapSlippageActivity.iwGUEr;
        return C33129mqd.mulS$default(swapSlippageConfig != null ? swapSlippageConfig.getCustomMin() : null, "100", null, null, null, 14, null);
    }

    public final String djBIcL() {
        return (String) this.gEmmrt.getValue();
    }

    public static final String uzCIH(SwapSlippageActivity swapSlippageActivity) {
        SwapSlippageConfig swapSlippageConfig = swapSlippageActivity.iwGUEr;
        return C33129mqd.mulS$default(swapSlippageConfig != null ? swapSlippageConfig.getCustomMax() : null, "100", null, null, null, 14, null);
    }

    public final String AYXKKw() {
        return (String) this.AkhnZx.getValue();
    }

    public static final String AubY(SwapSlippageActivity swapSlippageActivity) {
        SwapSlippageConfig swapSlippageConfig = swapSlippageActivity.iwGUEr;
        return C33129mqd.mulS$default(swapSlippageConfig != null ? swapSlippageConfig.getCustomWarn() : null, "100", null, null, null, 14, null);
    }

    public final String AhwBna() {
        return (String) this.values.getValue();
    }

    public static final String zLjUOn(SwapSlippageActivity swapSlippageActivity) {
        SwapSlippageConfig swapSlippageConfig = swapSlippageActivity.iwGUEr;
        return C33129mqd.mulS$default(swapSlippageConfig != null ? swapSlippageConfig.getCustomSafe() : null, "100", null, null, null, 14, null);
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ SwapSlippageActivity EZpvd;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, SwapSlippageActivity swapSlippageActivity) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = swapSlippageActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.isConnected();
            }
        }
    }

    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ SwapSlippageActivity KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(View view, long j, SwapSlippageActivity swapSlippageActivity) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = swapSlippageActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.AkhnZx();
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ SwapSlippageActivity copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(View view, long j, SwapSlippageActivity swapSlippageActivity) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = swapSlippageActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (this.copydefault.fJNWhG()) {
                    this.copydefault.getNewProxyInstance();
                }
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ SwapSlippageActivity copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(View view, long j, SwapSlippageActivity swapSlippageActivity, View view2) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = swapSlippageActivity;
            this.EZpvd = view2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                SlippageMode slippageMode = this.copydefault.OLrzqt;
                SlippageMode slippageMode2 = SlippageMode.DYNAMIC;
                if (slippageMode != slippageMode2) {
                    this.copydefault.OLrzqt = slippageMode2;
                    this.copydefault.AuCTel();
                    SwapSlippageActivity swapSlippageActivity = this.copydefault;
                    Intrinsics.copydefault(this.EZpvd);
                    swapSlippageActivity.updatePopupSelectedState(this.EZpvd);
                }
                PopupWindow popupWindow = this.copydefault.AuCTel;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                }
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ SwapSlippageActivity copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(View view, long j, SwapSlippageActivity swapSlippageActivity, View view2) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = swapSlippageActivity;
            this.EZpvd = view2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                SlippageMode slippageMode = this.copydefault.OLrzqt;
                SlippageMode slippageMode2 = SlippageMode.FIXED;
                if (slippageMode != slippageMode2) {
                    this.copydefault.OLrzqt = slippageMode2;
                    this.copydefault.AuCTel();
                    SwapSlippageActivity swapSlippageActivity = this.copydefault;
                    Intrinsics.copydefault(this.EZpvd);
                    swapSlippageActivity.updatePopupSelectedState(this.EZpvd);
                }
                PopupWindow popupWindow = this.copydefault.AuCTel;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                }
            }
        }
    }

    public final String OLrzqt() {
        String automaticSlippage;
        String str = this.AEQbTJ;
        String str2 = null;
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        SwapSlippageConfig swapSlippageConfig = this.iwGUEr;
        if (swapSlippageConfig != null && (automaticSlippage = swapSlippageConfig.getAutomaticSlippage()) != null && automaticSlippage.length() > 0) {
            str2 = automaticSlippage;
        }
        return str2 == null ? SlippageConfigVo.MAX_SLIP : str2;
    }

    public static final BigDecimal hDKMBd(SwapSlippageActivity swapSlippageActivity) {
        BigDecimal bigDecimalEZpvd;
        String str = (String) CollectionsKt___CollectionsKt.firstOrNull(swapSlippageActivity.valueOf());
        return (str == null || (bigDecimalEZpvd = C33129mqd.EZpvd(str)) == null) ? new BigDecimal(SlippageConfigVo.MAX_SLIP) : bigDecimalEZpvd;
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC23731iHf abstractC23731iHfEZpvd = AbstractC23731iHf.EZpvd(getLayoutInflater());
        this.KWHzl = abstractC23731iHfEZpvd;
        if (abstractC23731iHfEZpvd == null) {
            Intrinsics.gEmmrt("");
            abstractC23731iHfEZpvd = null;
        }
        setContentView(abstractC23731iHfEZpvd.getRoot());
        fIwbmz();
        fARcdN();
        getFieldNames();
    }

    public final void values() {
        AbstractC23731iHf abstractC23731iHf = this.KWHzl;
        AbstractC23731iHf abstractC23731iHf2 = null;
        if (abstractC23731iHf == null) {
            Intrinsics.gEmmrt("");
            abstractC23731iHf = null;
        }
        final C55008xbo c55008xbo = abstractC23731iHf.AhwBna;
        C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setMaxDecimalValue(2);
            c55001xbhAkhnZx.setShowThousandsSeparator(true);
        }
        LinearLayout linearLayoutAuCTel = c55008xbo.AuCTel();
        if (linearLayoutAuCTel != null) {
            linearLayoutAuCTel.setMinimumWidth(0);
        }
        c55008xbo.setTitleType(0);
        Intrinsics.copydefault(c55008xbo);
        OLrzqt(c55008xbo, C52761wXj.LoaderManager.KWHzl);
        EZpvd(c55008xbo, ContextCompat.getColor(this, C52761wXj.Activity.UlJrfe));
        View view$default = getView$default(this, false, 1, null);
        C55009xbp c55009xbpFIwbmz = c55008xbo.fIwbmz();
        if (c55009xbpFIwbmz != null) {
            c55009xbpFIwbmz.EZpvd(view$default);
        }
        C55001xbh c55001xbhAkhnZx2 = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            c55001xbhAkhnZx2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.jmJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    SwapSlippageActivity.copydefault(this.EZpvd, c55008xbo, view, z);
                }
            });
        }
        C55001xbh c55001xbhAkhnZx3 = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx3 != null) {
            c55001xbhAkhnZx3.addTextChangedListener(new Fragment(c55008xbo, this));
        }
        AbstractC23731iHf abstractC23731iHf3 = this.KWHzl;
        if (abstractC23731iHf3 == null) {
            Intrinsics.gEmmrt("");
            abstractC23731iHf3 = null;
        }
        LinearLayout linearLayout = abstractC23731iHf3.copydefault;
        linearLayout.setOnClickListener(new Activity(linearLayout, 1000L, this));
        AbstractC23731iHf abstractC23731iHf4 = this.KWHzl;
        if (abstractC23731iHf4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC23731iHf2 = abstractC23731iHf4;
        }
        C52794wYp c52794wYp = abstractC23731iHf2.EZpvd;
        c52794wYp.setOnClickListener(new PendingIntent(c52794wYp, 1000L, this));
    }

    public static final void copydefault(SwapSlippageActivity swapSlippageActivity, C55008xbo c55008xbo, View view, boolean z) {
        String strGEmmrt;
        String strIsConnected;
        int i = z ? C52761wXj.Activity.fdOvFl : C52761wXj.Activity.UlJrfe;
        Intrinsics.copydefault(c55008xbo);
        swapSlippageActivity.EZpvd(c55008xbo, ContextCompat.getColor(swapSlippageActivity, i));
        if (z) {
            if (swapSlippageActivity.OLrzqt == SlippageMode.FIXED) {
                int i2 = 0;
                for (Object obj : swapSlippageActivity.djBIcL) {
                    if (i2 < 0) {
                        yDY.AYXKKw();
                    }
                    swapSlippageActivity.OLrzqt((TextView) obj, false);
                    i2++;
                }
                swapSlippageActivity.fARcdN = true;
                swapSlippageActivity.ejfBZ = -1;
            }
            swapSlippageActivity.copydefault();
            return;
        }
        C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx == null || (strIsConnected = c55001xbhAkhnZx.isConnected()) == null || (strGEmmrt = C33129mqd.gEmmrt(strIsConnected)) == null) {
            strGEmmrt = "";
        }
        if (strGEmmrt.length() == 0) {
            if (swapSlippageActivity.OLrzqt == SlippageMode.FIXED) {
                setInputStatus$default(swapSlippageActivity, InputStatus.ERROR, c55008xbo, "", false, 8, null);
            } else {
                setInputStatus$default(swapSlippageActivity, InputStatus.NORMAL, c55008xbo, "", false, 8, null);
            }
        } else {
            swapSlippageActivity.EZpvd(strGEmmrt);
        }
        swapSlippageActivity.uzCIH();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void uzCIH() {
        String strGEmmrt;
        String strIsConnected;
        String strGEmmrt2;
        String strIsConnected2;
        String strIsConnected3;
        AbstractC23731iHf abstractC23731iHf = this.KWHzl;
        AbstractC23731iHf abstractC23731iHf2 = null;
        if (abstractC23731iHf == null) {
            Intrinsics.gEmmrt("");
            abstractC23731iHf = null;
        }
        C55001xbh c55001xbhAkhnZx = abstractC23731iHf.AhwBna.AkhnZx();
        boolean z = false;
        boolean z2 = (c55001xbhAkhnZx == null || (strIsConnected3 = c55001xbhAkhnZx.isConnected()) == null || strIsConnected3.length() <= 0) ? false : true;
        int i = Application.AEQbTJ[this.OLrzqt.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (z2) {
                AbstractC23731iHf abstractC23731iHf3 = this.KWHzl;
                if (abstractC23731iHf3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC23731iHf3 = null;
                }
                C55001xbh c55001xbhAkhnZx2 = abstractC23731iHf3.AhwBna.AkhnZx();
                if (c55001xbhAkhnZx2 == null || (strIsConnected2 = c55001xbhAkhnZx2.isConnected()) == null || (strGEmmrt2 = C33129mqd.gEmmrt(strIsConnected2)) == null) {
                    strGEmmrt2 = "";
                }
                BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(strGEmmrt2);
                if (bigDecimalEZpvd != null && C33129mqd.copydefault(bigDecimalEZpvd, gEmmrt()) && C33129mqd.valueOf(bigDecimalEZpvd, djBIcL()) && this.DbNXlk != InputStatus.ERROR) {
                    z = true;
                }
            } else if (!this.fARcdN && this.ejfBZ >= 0) {
            }
        } else if (z2) {
            AbstractC23731iHf abstractC23731iHf4 = this.KWHzl;
            if (abstractC23731iHf4 == null) {
                Intrinsics.gEmmrt("");
                abstractC23731iHf4 = null;
            }
            C55001xbh c55001xbhAkhnZx3 = abstractC23731iHf4.AhwBna.AkhnZx();
            if (c55001xbhAkhnZx3 == null || (strIsConnected = c55001xbhAkhnZx3.isConnected()) == null || (strGEmmrt = C33129mqd.gEmmrt(strIsConnected)) == null) {
                strGEmmrt = "";
            }
            BigDecimal bigDecimalEZpvd2 = C33129mqd.EZpvd(strGEmmrt);
            if (bigDecimalEZpvd2 != null && C33129mqd.copydefault(bigDecimalEZpvd2, KWHzl()) && C33129mqd.valueOf(bigDecimalEZpvd2, AEQbTJ()) && this.DbNXlk != InputStatus.ERROR) {
            }
        }
        AbstractC23731iHf abstractC23731iHf5 = this.KWHzl;
        if (abstractC23731iHf5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC23731iHf2 = abstractC23731iHf5;
        }
        abstractC23731iHf2.EZpvd.setEnabled(z);
    }

    private final void fIwbmz() {
        Bundle extras = getIntent().getExtras();
        this.iwGUEr = extras != null ? (SwapSlippageConfig) extras.getParcelable("extra_swap_slippage_config") : null;
        this.fIwbmz = getIntent().getBooleanExtra("extra_swap_dynamic_has_custom", false);
        this.AEQbTJ = getIntent().getStringExtra("extra_swap_slippage");
        String stringExtra = getIntent().getStringExtra("extra_slippage_mode");
        if (stringExtra == null) {
            stringExtra = "DYNAMIC";
        }
        this.OLrzqt = SlippageMode.valueOf(stringExtra);
        String stringExtra2 = getIntent().getStringExtra("extra_max_slippage");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.fJNWhG = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("extra_fixed_slippage");
        boolean booleanExtra = getIntent().getBooleanExtra("extra_is_custom", false);
        this.fARcdN = booleanExtra;
        if (booleanExtra && C33129mqd.OLrzqt((CharSequence) stringExtra3)) {
            this.fetchVPNInfo = stringExtra3 != null ? stringExtra3 : "";
            this.ejfBZ = -1;
            return;
        }
        if (C33129mqd.OLrzqt((CharSequence) stringExtra3)) {
            this.fetchVPNInfo = stringExtra3 != null ? stringExtra3 : "";
            Integer numValueOf = Integer.valueOf(valueOf().indexOf(this.fetchVPNInfo));
            Integer num = numValueOf.intValue() >= 0 ? numValueOf : null;
            this.ejfBZ = num != null ? num.intValue() : 0;
        } else {
            this.ejfBZ = 0;
            this.fetchVPNInfo = valueOf().get(0);
        }
        this.fARcdN = false;
    }

    private final void fARcdN() {
        final AbstractC23731iHf abstractC23731iHf = this.KWHzl;
        if (abstractC23731iHf == null) {
            Intrinsics.gEmmrt("");
            abstractC23731iHf = null;
        }
        abstractC23731iHf.valueOf.setTextValue(getString(C25493ixk.FragmentManager.DCUTEIddSDPG));
        abstractC23731iHf.valueOf.setHelperLabelType(1);
        C55258xgZ c55258xgZ = abstractC23731iHf.valueOf;
        c55258xgZ.setOnClickListener(new LoaderManager(c55258xgZ, 1000L, this));
        ViewCompat.setOnApplyWindowInsetsListener(abstractC23731iHf.getRoot(), new OnApplyWindowInsetsListener() { // from class: o.jmO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                return SwapSlippageActivity.AEQbTJ(abstractC23731iHf, view, windowInsetsCompat);
            }
        });
        fetchVPNInfo();
        AuCTel();
        ejfBZ();
        values();
        InputStatus inputStatus = InputStatus.NORMAL;
        this.DbNXlk = inputStatus;
        AbstractC23731iHf abstractC23731iHf2 = this.KWHzl;
        if (abstractC23731iHf2 == null) {
            Intrinsics.gEmmrt("");
            abstractC23731iHf2 = null;
        }
        TextView textView = abstractC23731iHf2.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
        AbstractC23731iHf abstractC23731iHf3 = this.KWHzl;
        if (abstractC23731iHf3 == null) {
            Intrinsics.gEmmrt("");
            abstractC23731iHf3 = null;
        }
        setInputStatus$default(this, inputStatus, abstractC23731iHf3.AhwBna, "", false, 8, null);
        uzCIH();
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (String) null, 2, (Object) null);
    }

    public static final WindowInsetsCompat AEQbTJ(AbstractC23731iHf abstractC23731iHf, View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.statusBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        C33537myN c33537myN = abstractC23731iHf.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c33537myN, "");
        c33537myN.setPaddingRelative(c33537myN.getPaddingStart(), insets.top, c33537myN.getPaddingEnd(), c33537myN.getPaddingBottom());
        return windowInsetsCompat;
    }

    private final void getFieldNames() {
        AbstractC23731iHf abstractC23731iHf = this.KWHzl;
        if (abstractC23731iHf == null) {
            Intrinsics.gEmmrt("");
            abstractC23731iHf = null;
        }
        View root = abstractC23731iHf.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(root);
        if (lifecycleOwner == null) {
            lifecycleOwner = this;
        }
        C59541ziw.EZpvd(this, lifecycleOwner, new InterfaceC59496ziD() { // from class: o.jmR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC59496ziD
            public final void OLrzqt(boolean z) {
                SwapSlippageActivity.EZpvd(this.KWHzl, z);
            }
        });
    }

    public static final void EZpvd(SwapSlippageActivity swapSlippageActivity, boolean z) {
        AbstractC23731iHf abstractC23731iHf = swapSlippageActivity.KWHzl;
        if (abstractC23731iHf == null) {
            Intrinsics.gEmmrt("");
            abstractC23731iHf = null;
        }
        C55001xbh c55001xbhAkhnZx = abstractC23731iHf.AhwBna.AkhnZx();
        if (z) {
            if (c55001xbhAkhnZx == null || !c55001xbhAkhnZx.hasFocus()) {
                return;
            }
            swapSlippageActivity.copydefault();
            return;
        }
        if (c55001xbhAkhnZx == null || !c55001xbhAkhnZx.hasFocus()) {
            return;
        }
        c55001xbhAkhnZx.clearFocus();
    }

    public final void copydefault() {
        AbstractC23731iHf abstractC23731iHf = this.KWHzl;
        if (abstractC23731iHf == null) {
            Intrinsics.gEmmrt("");
            abstractC23731iHf = null;
        }
        final TextView textView = abstractC23731iHf.djBIcL;
        if (textView != null) {
            textView.post(new Runnable() { // from class: o.jmU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    SwapSlippageActivity.OLrzqt(textView);
                }
            });
        }
    }

    public static final void OLrzqt(TextView textView) {
        textView.requestRectangleOnScreen(new Rect(0, 0, textView.getWidth(), textView.getHeight()), true);
    }

    public final void OLrzqt(C55008xbo c55008xbo, @StyleRes int i) {
        View viewIwGUEr = c55008xbo.iwGUEr();
        if (viewIwGUEr instanceof TextView) {
            TextViewCompat.setTextAppearance((TextView) viewIwGUEr, i);
        } else if (viewIwGUEr instanceof C55258xgZ) {
            ((C55258xgZ) viewIwGUEr).setTextAppearance(i);
        }
    }

    public final void EZpvd(C55008xbo c55008xbo, @ColorInt int i) {
        View viewIwGUEr = c55008xbo.iwGUEr();
        if (viewIwGUEr instanceof TextView) {
            ((TextView) viewIwGUEr).setTextColor(i);
        } else if (viewIwGUEr instanceof C55258xgZ) {
            ((C55258xgZ) viewIwGUEr).setTextColor(i);
        }
    }

    public static /* synthetic */ View getView$default(SwapSlippageActivity swapSlippageActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return swapSlippageActivity.AEQbTJ(z);
    }

    public final View AEQbTJ(boolean z) {
        FrameLayout frameLayout = new FrameLayout(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = TextAlign.RIGHT;
        frameLayout.setLayoutParams(layoutParams);
        AppCompatTextView appCompatTextView = new AppCompatTextView(this);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = TextAlign.RIGHT;
        appCompatTextView.setLayoutParams(layoutParams2);
        appCompatTextView.setText("%");
        appCompatTextView.setTextColor(ContextCompat.getColor(this, C52761wXj.Activity.fdOvFl));
        TextViewCompat.setTextAppearance(appCompatTextView, C32113mPz.Dialog.hDKMBd);
        frameLayout.addView(appCompatTextView);
        return frameLayout;
    }

    public static /* synthetic */ void setInputStatus$default(SwapSlippageActivity swapSlippageActivity, InputStatus inputStatus, C55008xbo c55008xbo, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        swapSlippageActivity.copydefault(inputStatus, c55008xbo, str, z);
    }

    public final void copydefault(InputStatus inputStatus, C55008xbo c55008xbo, String str, boolean z) {
        this.DbNXlk = inputStatus;
        int i = Application.copydefault[inputStatus.ordinal()];
        if (i == 1) {
            AEQbTJ(c55008xbo, str, z);
            return;
        }
        if (i == 2) {
            EZpvd(c55008xbo, str, z);
        } else {
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            AEQbTJ(c55008xbo, str);
        }
    }

    public final void fetchVPNInfo() {
        AbstractC23731iHf abstractC23731iHf = this.KWHzl;
        if (abstractC23731iHf == null) {
            Intrinsics.gEmmrt("");
            abstractC23731iHf = null;
        }
        abstractC23731iHf.KWHzl.removeAllViews();
        this.djBIcL.clear();
        final int i = 0;
        for (Object obj : valueOf()) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            String str = (String) obj;
            TextView textView = new TextView(this);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
            layoutParams.setMarginEnd(i < valueOf().size() - 1 ? C55298xhM.dp2px$default(8.0f, null, 1, null) : 0);
            textView.setLayoutParams(layoutParams);
            textView.setText(str + "%");
            textView.setTag(str);
            textView.setGravity(17);
            textView.setMinHeight(C55298xhM.dp2px$default(36.0f, null, 1, null));
            textView.setPadding(C55298xhM.dp2px$default(8.0f, null, 1, null), C55298xhM.dp2px$default(8.0f, null, 1, null), C55298xhM.dp2px$default(8.0f, null, 1, null), C55298xhM.dp2px$default(8.0f, null, 1, null));
            textView.setTextSize(14.0f);
            TextViewCompat.setTextAppearance(textView, C52761wXj.LoaderManager.zuBGHE);
            textView.setTextColor(ContextCompat.getColor(this, C52761wXj.Activity.fdOvFl));
            OLrzqt(textView, i == this.ejfBZ && !this.fARcdN);
            textView.setOnClickListener(new View.OnClickListener() { // from class: o.jmV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    SwapSlippageActivity.KWHzl(this.EZpvd, i, view);
                }
            });
            this.djBIcL.add(textView);
            AbstractC23731iHf abstractC23731iHf2 = this.KWHzl;
            if (abstractC23731iHf2 == null) {
                Intrinsics.gEmmrt("");
                abstractC23731iHf2 = null;
            }
            abstractC23731iHf2.KWHzl.addView(textView);
            i++;
        }
    }

    public static final void KWHzl(SwapSlippageActivity swapSlippageActivity, int i, View view) {
        swapSlippageActivity.KWHzl(i);
    }

    public final void AuCTel() {
        AbstractC23731iHf abstractC23731iHf = this.KWHzl;
        AbstractC23731iHf abstractC23731iHf2 = null;
        if (abstractC23731iHf == null) {
            Intrinsics.gEmmrt("");
            abstractC23731iHf = null;
        }
        ImageView imageView = abstractC23731iHf.AEQbTJ;
        PopupWindow popupWindow = this.AuCTel;
        imageView.setRotation((popupWindow == null || !popupWindow.isShowing()) ? 0.0f : 180.0f);
        AbstractC23731iHf abstractC23731iHf3 = this.KWHzl;
        if (abstractC23731iHf3 == null) {
            Intrinsics.gEmmrt("");
            abstractC23731iHf3 = null;
        }
        LinearLayout linearLayout = abstractC23731iHf3.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(this.OLrzqt == SlippageMode.FIXED ? 0 : 8);
        int i = Application.AEQbTJ[this.OLrzqt.ordinal()];
        if (i == 1) {
            AbstractC23731iHf abstractC23731iHf4 = this.KWHzl;
            if (abstractC23731iHf4 == null) {
                Intrinsics.gEmmrt("");
                abstractC23731iHf4 = null;
            }
            C55008xbo c55008xbo = abstractC23731iHf4.AhwBna;
            String string = getString(C25493ixk.FragmentManager.OrsvgJ);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c55008xbo.setLabelText(string);
            c55008xbo.setHintText(KWHzl() + " ~ " + AEQbTJ());
            C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
            if (c55001xbhAkhnZx != null) {
                c55001xbhAkhnZx.setGravity(TextAlign.RIGHT);
            }
            if (this.fJNWhG.length() > 0 && this.fIwbmz) {
                c55008xbo.setText(this.fJNWhG);
            } else {
                c55008xbo.setText("");
            }
            AbstractC23731iHf abstractC23731iHf5 = this.KWHzl;
            if (abstractC23731iHf5 == null) {
                Intrinsics.gEmmrt("");
                abstractC23731iHf5 = null;
            }
            abstractC23731iHf5.AYXKKw.setText(C33069mpW.KWHzl(this, C25493ixk.FragmentManager.zblBkD, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, OLrzqt(), false, 2, null)))));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC23731iHf abstractC23731iHf6 = this.KWHzl;
            if (abstractC23731iHf6 == null) {
                Intrinsics.gEmmrt("");
                abstractC23731iHf6 = null;
            }
            C55008xbo c55008xbo2 = abstractC23731iHf6.AhwBna;
            c55008xbo2.setLabelText("");
            c55008xbo2.setHintText(gEmmrt() + " ~ " + djBIcL());
            C55001xbh c55001xbhAkhnZx2 = c55008xbo2.AkhnZx();
            if (c55001xbhAkhnZx2 != null) {
                c55001xbhAkhnZx2.setGravity(TextAlign.LEFT);
            }
            if (this.fARcdN && C33129mqd.OLrzqt((CharSequence) this.fetchVPNInfo)) {
                c55008xbo2.setText(this.fetchVPNInfo);
            } else {
                c55008xbo2.setText("");
                if (this.ejfBZ < 0 && (!valueOf().isEmpty())) {
                    this.ejfBZ = 0;
                    this.fetchVPNInfo = valueOf().get(0);
                    this.fARcdN = false;
                }
            }
            AbstractC23731iHf abstractC23731iHf7 = this.KWHzl;
            if (abstractC23731iHf7 == null) {
                Intrinsics.gEmmrt("");
                abstractC23731iHf7 = null;
            }
            abstractC23731iHf7.AYXKKw.setText(getString(C25493ixk.FragmentManager.ixgjPv));
        }
        InputStatus inputStatus = InputStatus.NORMAL;
        AbstractC23731iHf abstractC23731iHf8 = this.KWHzl;
        if (abstractC23731iHf8 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC23731iHf2 = abstractC23731iHf8;
        }
        setInputStatus$default(this, inputStatus, abstractC23731iHf2.AhwBna, "", false, 8, null);
        uzCIH();
    }

    public final void isConnected() {
        if (this.AuCTel == null) {
            EZpvd();
        }
        PopupWindow popupWindow = this.AuCTel;
        if (popupWindow == null) {
            return;
        }
        if (popupWindow.isShowing()) {
            popupWindow.dismiss();
            return;
        }
        DbNXlk();
        View contentView = popupWindow.getContentView();
        if (contentView != null) {
            updatePopupSelectedState(contentView);
        }
        AbstractC23731iHf abstractC23731iHf = this.KWHzl;
        AbstractC23731iHf abstractC23731iHf2 = null;
        if (abstractC23731iHf == null) {
            Intrinsics.gEmmrt("");
            abstractC23731iHf = null;
        }
        popupWindow.showAsDropDown(abstractC23731iHf.AYXKKw, 0, C55298xhM.dp2px$default(8.0f, null, 1, null), 80);
        AbstractC23731iHf abstractC23731iHf3 = this.KWHzl;
        if (abstractC23731iHf3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC23731iHf2 = abstractC23731iHf3;
        }
        abstractC23731iHf2.AEQbTJ.setRotation(180.0f);
    }

    public final void EZpvd() {
        View viewInflate = LayoutInflater.from(this).inflate(C25493ixk.Activity.dzCpvv, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(C25493ixk.ActionBar.gdwsGQ);
        textView.setText(C33069mpW.KWHzl(this, C25493ixk.FragmentManager.zblBkD, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, OLrzqt(), false, 2, null)))));
        View viewFindViewById = viewInflate.findViewById(C25493ixk.ActionBar.iRgjgR);
        Intrinsics.copydefault(viewInflate);
        updatePopupSelectedState(viewInflate);
        textView.setOnClickListener(new StateListAnimator(textView, 1000L, this, viewInflate));
        viewFindViewById.setOnClickListener(new TaskDescription(viewFindViewById, 1000L, this, viewInflate));
        PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2, true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setElevation(C55298xhM.copydefault(8.0f, (Context) this));
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o.jmM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                SwapSlippageActivity.ejfBZ(this.KWHzl);
            }
        });
        this.AuCTel = popupWindow;
    }

    public static final void ejfBZ(SwapSlippageActivity swapSlippageActivity) {
        AbstractC23731iHf abstractC23731iHf = swapSlippageActivity.KWHzl;
        if (abstractC23731iHf == null) {
            Intrinsics.gEmmrt("");
            abstractC23731iHf = null;
        }
        abstractC23731iHf.AEQbTJ.setRotation(0.0f);
    }

    public final void updatePopupSelectedState(View view) {
        TextView textView = (TextView) view.findViewById(C25493ixk.ActionBar.gdwsGQ);
        TextView textView2 = (TextView) view.findViewById(C25493ixk.ActionBar.iRgjgR);
        SlippageMode slippageMode = this.OLrzqt;
        boolean z = slippageMode == SlippageMode.DYNAMIC;
        boolean z2 = slippageMode == SlippageMode.FIXED;
        if (textView != null) {
            textView.setTextColor(ContextCompat.getColor(this, z ? C52761wXj.Activity.fdOvFl : C52761wXj.Activity.QwvEab));
        }
        if (textView2 != null) {
            textView2.setTextColor(ContextCompat.getColor(this, z2 ? C52761wXj.Activity.fdOvFl : C52761wXj.Activity.QwvEab));
        }
    }

    public final void KWHzl(int i) {
        DbNXlk();
        if (i < 0 || i >= valueOf().size() || i == this.ejfBZ) {
            return;
        }
        this.ejfBZ = i;
        AbstractC23731iHf abstractC23731iHf = this.KWHzl;
        AbstractC23731iHf abstractC23731iHf2 = null;
        if (abstractC23731iHf == null) {
            Intrinsics.gEmmrt("");
            abstractC23731iHf = null;
        }
        abstractC23731iHf.AhwBna.setText("");
        AbstractC23731iHf abstractC23731iHf3 = this.KWHzl;
        if (abstractC23731iHf3 == null) {
            Intrinsics.gEmmrt("");
            abstractC23731iHf3 = null;
        }
        C55001xbh c55001xbhAkhnZx = abstractC23731iHf3.AhwBna.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.clearFocus();
        }
        this.fARcdN = false;
        this.fetchVPNInfo = valueOf().get(i);
        ejfBZ();
        InputStatus inputStatus = InputStatus.NORMAL;
        AbstractC23731iHf abstractC23731iHf4 = this.KWHzl;
        if (abstractC23731iHf4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC23731iHf2 = abstractC23731iHf4;
        }
        setInputStatus$default(this, inputStatus, abstractC23731iHf2.AhwBna, "", false, 8, null);
        uzCIH();
    }

    public final void OLrzqt(TextView textView, boolean z) {
        C55279xgu c55279xgu = new C55279xgu();
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c55279xgu.OLrzqt(C55298xhM.OLrzqt(8.0f, context));
        if (z) {
            c55279xgu.isConnected(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.ODXsMY));
        } else {
            c55279xgu.isConnected(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.invokespecialDPHOMC));
        }
        new C55280xgv().KWHzl(textView, c55279xgu);
    }

    public final void EZpvd(String str) {
        int i = Application.AEQbTJ[this.OLrzqt.ordinal()];
        if (i == 1) {
            KWHzl(str);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            copydefault(str);
        }
    }

    public final boolean KWHzl(String str) {
        Pair pairOLrzqt;
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(str);
        AbstractC23731iHf abstractC23731iHf = null;
        if (bigDecimalEZpvd == null) {
            InputStatus inputStatus = InputStatus.NORMAL;
            AbstractC23731iHf abstractC23731iHf2 = this.KWHzl;
            if (abstractC23731iHf2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC23731iHf = abstractC23731iHf2;
            }
            setInputStatus$default(this, inputStatus, abstractC23731iHf.AhwBna, "", false, 8, null);
            return false;
        }
        if (C33129mqd.AEQbTJ(bigDecimalEZpvd, AEQbTJ())) {
            pairOLrzqt = C56390yDp.OLrzqt(InputStatus.ERROR, C33069mpW.KWHzl(this, C25493ixk.FragmentManager.Dmq, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", AEQbTJ()))));
        } else if (C33129mqd.gEmmrt(bigDecimalEZpvd, KWHzl())) {
            pairOLrzqt = C56390yDp.OLrzqt(InputStatus.ERROR, C33069mpW.KWHzl(this, C25493ixk.FragmentManager.DCUTEIdCUTEI, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", KWHzl()))));
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(InputStatus.NORMAL, "");
        }
        InputStatus inputStatus2 = (InputStatus) pairOLrzqt.component1();
        String str2 = (String) pairOLrzqt.component2();
        AbstractC23731iHf abstractC23731iHf3 = this.KWHzl;
        if (abstractC23731iHf3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC23731iHf = abstractC23731iHf3;
        }
        setInputStatus$default(this, inputStatus2, abstractC23731iHf.AhwBna, str2, false, 8, null);
        return inputStatus2 == InputStatus.NORMAL;
    }

    public final boolean copydefault(String str) {
        Pair pairOLrzqt;
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(str);
        AbstractC23731iHf abstractC23731iHf = null;
        if (bigDecimalEZpvd == null) {
            InputStatus inputStatus = InputStatus.NORMAL;
            AbstractC23731iHf abstractC23731iHf2 = this.KWHzl;
            if (abstractC23731iHf2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC23731iHf = abstractC23731iHf2;
            }
            setInputStatus$default(this, inputStatus, abstractC23731iHf.AhwBna, "", false, 8, null);
            return false;
        }
        if (C33129mqd.AEQbTJ(bigDecimalEZpvd, djBIcL())) {
            pairOLrzqt = C56390yDp.OLrzqt(InputStatus.ERROR, C33069mpW.KWHzl(this, C25493ixk.FragmentManager.Dmq, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", djBIcL()))));
        } else if (C33129mqd.gEmmrt(bigDecimalEZpvd, gEmmrt())) {
            pairOLrzqt = C56390yDp.OLrzqt(InputStatus.ERROR, getString(C25493ixk.FragmentManager.spnCvw));
        } else if (C33129mqd.copydefault(bigDecimalEZpvd, gEmmrt()) && C33129mqd.gEmmrt(bigDecimalEZpvd, AYXKKw())) {
            pairOLrzqt = C56390yDp.OLrzqt(InputStatus.WARNING, getString(C25493ixk.FragmentManager.spnCvw));
        } else if (C33129mqd.copydefault(bigDecimalEZpvd, AhwBna()) && C33129mqd.valueOf(bigDecimalEZpvd, djBIcL())) {
            pairOLrzqt = C56390yDp.OLrzqt(InputStatus.WARNING, C33069mpW.KWHzl(this, C25493ixk.FragmentManager.htlTjW, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", str))));
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(InputStatus.NORMAL, "");
        }
        InputStatus inputStatus2 = (InputStatus) pairOLrzqt.component1();
        String str2 = (String) pairOLrzqt.component2();
        AbstractC23731iHf abstractC23731iHf3 = this.KWHzl;
        if (abstractC23731iHf3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC23731iHf = abstractC23731iHf3;
        }
        setInputStatus$default(this, inputStatus2, abstractC23731iHf.AhwBna, str2, false, 8, null);
        return inputStatus2 != InputStatus.ERROR;
    }

    public static /* synthetic */ void setNormalBgStyle$default(SwapSlippageActivity swapSlippageActivity, C55008xbo c55008xbo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            c55008xbo = null;
        }
        if ((i & 2) != 0) {
            str = "";
        }
        swapSlippageActivity.AEQbTJ(c55008xbo, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(final C55008xbo c55008xbo, String str) {
        final boolean z;
        AbstractC23731iHf abstractC23731iHf = null;
        if (c55008xbo == null) {
            AbstractC23731iHf abstractC23731iHf2 = this.KWHzl;
            if (abstractC23731iHf2 == null) {
                Intrinsics.gEmmrt("");
                abstractC23731iHf2 = null;
            }
            c55008xbo = abstractC23731iHf2.AhwBna;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        }
        C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            z = c55001xbhAkhnZx.hasFocus();
        }
        AbstractC23731iHf abstractC23731iHf3 = this.KWHzl;
        if (abstractC23731iHf3 == null) {
            Intrinsics.gEmmrt("");
            abstractC23731iHf3 = null;
        }
        abstractC23731iHf3.djBIcL.setTextColor(ContextCompat.getColor(this, C52761wXj.Activity.QwvEab));
        AbstractC23731iHf abstractC23731iHf4 = this.KWHzl;
        if (abstractC23731iHf4 == null) {
            Intrinsics.gEmmrt("");
            abstractC23731iHf4 = null;
        }
        abstractC23731iHf4.djBIcL.setText(str);
        AbstractC23731iHf abstractC23731iHf5 = this.KWHzl;
        if (abstractC23731iHf5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC23731iHf = abstractC23731iHf5;
        }
        TextView textView = abstractC23731iHf.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(str.length() <= 0 ? 8 : 0);
        c55008xbo.post(new Runnable() { // from class: o.jmW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                SwapSlippageActivity.copydefault(c55008xbo, z);
            }
        });
    }

    public static final void copydefault(C55008xbo c55008xbo, boolean z) {
        LinearLayout linearLayoutEjfBZ = c55008xbo.ejfBZ();
        if (z) {
            C55279xgu c55279xgu = new C55279xgu();
            Context context = linearLayoutEjfBZ.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c55279xgu.OLrzqt(C55298xhM.OLrzqt(6.0f, context));
            c55279xgu.isConnected(ContextCompat.getColor(linearLayoutEjfBZ.getContext(), C52761wXj.Activity.invokespecialDPHOMC));
            Context context2 = linearLayoutEjfBZ.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            c55279xgu.fIwbmz(C55298xhM.copydefault(1.0f, context2));
            c55279xgu.DbNXlk(ContextCompat.getColor(linearLayoutEjfBZ.getContext(), C52761wXj.Activity.fdOvFl));
            new C55280xgv().KWHzl(linearLayoutEjfBZ, c55279xgu);
            return;
        }
        linearLayoutEjfBZ.setBackgroundResource(C57406yhn.Activity.AYXKKw);
    }

    public final void DbNXlk() {
        AbstractC23731iHf abstractC23731iHf = this.KWHzl;
        if (abstractC23731iHf == null) {
            Intrinsics.gEmmrt("");
            abstractC23731iHf = null;
        }
        C33054mpH.OLrzqt(this, abstractC23731iHf.AhwBna.AkhnZx());
    }

    public static /* synthetic */ void setWarningStyle$default(SwapSlippageActivity swapSlippageActivity, C55008xbo c55008xbo, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            c55008xbo = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        swapSlippageActivity.EZpvd(c55008xbo, str, z);
    }

    public final void EZpvd(final C55008xbo c55008xbo, String str, boolean z) {
        AbstractC23731iHf abstractC23731iHf = null;
        if (c55008xbo == null) {
            AbstractC23731iHf abstractC23731iHf2 = this.KWHzl;
            if (abstractC23731iHf2 == null) {
                Intrinsics.gEmmrt("");
                abstractC23731iHf2 = null;
            }
            c55008xbo = abstractC23731iHf2.AhwBna;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        }
        AbstractC23731iHf abstractC23731iHf3 = this.KWHzl;
        if (abstractC23731iHf3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC23731iHf = abstractC23731iHf3;
        }
        TextView textView = abstractC23731iHf.djBIcL;
        textView.setTextColor(ContextCompat.getColor(this, C52761wXj.Activity.gdmIOq));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        Intrinsics.copydefault(textView);
        textView.setVisibility(0);
        if (str != null) {
            textView.setText(str);
        }
        c55008xbo.post(new Runnable() { // from class: o.jmQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                SwapSlippageActivity.KWHzl(c55008xbo);
            }
        });
    }

    public static final void KWHzl(C55008xbo c55008xbo) {
        LinearLayout linearLayoutEjfBZ = c55008xbo.ejfBZ();
        C55279xgu c55279xgu = new C55279xgu();
        Context context = linearLayoutEjfBZ.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c55279xgu.OLrzqt(C55298xhM.OLrzqt(6.0f, context));
        Context context2 = linearLayoutEjfBZ.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        c55279xgu.fIwbmz(C55298xhM.copydefault(1.0f, context2));
        c55279xgu.DbNXlk(ContextCompat.getColor(linearLayoutEjfBZ.getContext(), C52761wXj.Activity.gdmIOq));
        new C55280xgv().KWHzl(linearLayoutEjfBZ, c55279xgu);
    }

    public static /* synthetic */ void setErrorStyle$default(SwapSlippageActivity swapSlippageActivity, C55008xbo c55008xbo, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            c55008xbo = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        swapSlippageActivity.AEQbTJ(c55008xbo, str, z);
    }

    public final void AEQbTJ(final C55008xbo c55008xbo, String str, boolean z) {
        AbstractC23731iHf abstractC23731iHf = null;
        if (c55008xbo == null) {
            AbstractC23731iHf abstractC23731iHf2 = this.KWHzl;
            if (abstractC23731iHf2 == null) {
                Intrinsics.gEmmrt("");
                abstractC23731iHf2 = null;
            }
            c55008xbo = abstractC23731iHf2.AhwBna;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        }
        AbstractC23731iHf abstractC23731iHf3 = this.KWHzl;
        if (abstractC23731iHf3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC23731iHf = abstractC23731iHf3;
        }
        TextView textView = abstractC23731iHf.djBIcL;
        textView.setTextColor(ContextCompat.getColor(this, C52761wXj.Activity.fhUrPt));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        Intrinsics.copydefault(textView);
        textView.setVisibility(0);
        if (str != null) {
            textView.setText(str);
        }
        c55008xbo.post(new Runnable() { // from class: o.jmX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                SwapSlippageActivity.OLrzqt(c55008xbo);
            }
        });
    }

    public static final void OLrzqt(C55008xbo c55008xbo) {
        LinearLayout linearLayoutEjfBZ = c55008xbo.ejfBZ();
        C55279xgu c55279xgu = new C55279xgu();
        Context context = linearLayoutEjfBZ.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c55279xgu.OLrzqt(C55298xhM.OLrzqt(6.0f, context));
        Context context2 = linearLayoutEjfBZ.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        c55279xgu.fIwbmz(C55298xhM.copydefault(1.0f, context2));
        c55279xgu.DbNXlk(ContextCompat.getColor(linearLayoutEjfBZ.getContext(), C52761wXj.Activity.fhUrPt));
        new C55280xgv().KWHzl(linearLayoutEjfBZ, c55279xgu);
    }

    public final boolean fJNWhG() {
        String strGEmmrt;
        String strIsConnected;
        String strGEmmrt2;
        String strIsConnected2;
        int i = Application.AEQbTJ[this.OLrzqt.ordinal()];
        AbstractC23731iHf abstractC23731iHf = null;
        if (i == 1) {
            AbstractC23731iHf abstractC23731iHf2 = this.KWHzl;
            if (abstractC23731iHf2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC23731iHf = abstractC23731iHf2;
            }
            C55001xbh c55001xbhAkhnZx = abstractC23731iHf.AhwBna.AkhnZx();
            if (c55001xbhAkhnZx == null || (strIsConnected = c55001xbhAkhnZx.isConnected()) == null || (strGEmmrt = C33129mqd.gEmmrt(strIsConnected)) == null) {
                strGEmmrt = "";
            }
            if (strGEmmrt.length() <= 0) {
                this.fJNWhG = "";
                return true;
            }
            if (KWHzl(strGEmmrt)) {
                this.fJNWhG = strGEmmrt;
                return true;
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.fARcdN) {
                AbstractC23731iHf abstractC23731iHf3 = this.KWHzl;
                if (abstractC23731iHf3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC23731iHf3 = null;
                }
                C55001xbh c55001xbhAkhnZx2 = abstractC23731iHf3.AhwBna.AkhnZx();
                if (c55001xbhAkhnZx2 == null || (strIsConnected2 = c55001xbhAkhnZx2.isConnected()) == null || (strGEmmrt2 = C33129mqd.gEmmrt(strIsConnected2)) == null) {
                    strGEmmrt2 = "";
                }
            } else {
                strGEmmrt2 = valueOf().get(this.ejfBZ);
            }
            if (strGEmmrt2.length() > 0) {
                if (!this.fARcdN || copydefault(strGEmmrt2)) {
                    this.fetchVPNInfo = strGEmmrt2;
                    return true;
                }
            } else {
                InputStatus inputStatus = InputStatus.ERROR;
                AbstractC23731iHf abstractC23731iHf4 = this.KWHzl;
                if (abstractC23731iHf4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC23731iHf = abstractC23731iHf4;
                }
                setInputStatus$default(this, inputStatus, abstractC23731iHf.AhwBna, "", false, 8, null);
            }
        }
        return false;
    }

    public final void AkhnZx() {
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.KWHzl(C25493ixk.Activity.fFgQHt);
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C25493ixk.FragmentManager.DcMfJKOmnske, (View.OnClickListener) null, 2, (Object) null);
        viewOnClickListenerC54939xaY.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getNewProxyInstance() {
        Pair pairOLrzqt;
        Triple triple;
        String strGEmmrt;
        String strIsConnected;
        String strName = this.OLrzqt.name();
        SlippageMode slippageMode = this.OLrzqt;
        int[] iArr = Application.AEQbTJ;
        int i = iArr[slippageMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            pairOLrzqt = C56390yDp.OLrzqt("", Boolean.FALSE);
        } else if (this.fJNWhG.length() > 0) {
            pairOLrzqt = C56390yDp.OLrzqt(C33129mqd.KWHzl(this.fJNWhG, this.AEQbTJ), Boolean.valueOf(C33129mqd.gEmmrt(C33129mqd.divS$default(this.fJNWhG, "100", null, null, null, 14, null), this.AEQbTJ) && C33129mqd.gEmmrt(this.fJNWhG, "0")));
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(C33129mqd.mulS$default(OLrzqt(), "100", null, null, null, 14, null), Boolean.FALSE);
        }
        String str = (String) pairOLrzqt.component1();
        boolean zBooleanValue = ((Boolean) pairOLrzqt.component2()).booleanValue();
        int i2 = iArr[this.OLrzqt.ordinal()];
        if (i2 == 1) {
            Boolean bool = Boolean.FALSE;
            triple = new Triple("", bool, bool);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC23731iHf abstractC23731iHf = this.KWHzl;
            if (abstractC23731iHf == null) {
                Intrinsics.gEmmrt("");
                abstractC23731iHf = null;
            }
            C55001xbh c55001xbhAkhnZx = abstractC23731iHf.AhwBna.AkhnZx();
            if (c55001xbhAkhnZx == null || (strIsConnected = c55001xbhAkhnZx.isConnected()) == null || (strGEmmrt = C33129mqd.gEmmrt(strIsConnected)) == null) {
                strGEmmrt = "";
            }
            if (this.fARcdN && strGEmmrt.length() > 0) {
                Boolean bool2 = Boolean.TRUE;
                triple = new Triple(strGEmmrt, bool2, bool2);
            } else {
                int i3 = this.ejfBZ;
                if (i3 >= 0 && i3 < valueOf().size()) {
                    triple = new Triple(valueOf().get(this.ejfBZ), Boolean.FALSE, Boolean.TRUE);
                } else {
                    String str2 = (String) CollectionsKt___CollectionsKt.firstOrNull(valueOf());
                    if (str2 == null) {
                        str2 = "";
                    }
                    triple = new Triple(str2, Boolean.FALSE, Boolean.TRUE);
                }
            }
        }
        String str3 = (String) triple.component1();
        boolean zBooleanValue2 = ((Boolean) triple.component2()).booleanValue();
        boolean zBooleanValue3 = ((Boolean) triple.component3()).booleanValue();
        int i4 = this.getFieldNames;
        if (i4 == 0) {
            Intent intent = new Intent();
            intent.putExtra("result_slippage_mode", strName);
            intent.putExtra("result_max_slippage", str);
            intent.putExtra("result_dynamic_is_custom", zBooleanValue);
            intent.putExtra("result_fixed_slippage", str3);
            intent.putExtra("result_is_custom", zBooleanValue2);
            intent.putExtra("result_user_set_fixed_slippage", zBooleanValue3);
            setResult(-1, intent);
        } else if (i4 == 1) {
            String str4 = this.AEQbTJ;
            String str5 = str4 == null ? "" : str4;
            SlippageMode slippageMode2 = this.OLrzqt;
            SwapSlippageConfig swapSlippageConfig = this.iwGUEr;
            InterfaceC24178iXu.SharedElementCallback sharedElementCallback = new InterfaceC24178iXu.SharedElementCallback(str5, slippageMode2, str, str3, zBooleanValue2, zBooleanValue, zBooleanValue3, swapSlippageConfig == null ? new SwapSlippageConfig((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null) : swapSlippageConfig, null, 256, null);
            ViewModel viewModel = new ViewModelProvider(this).get(C26714jhY.class);
            C26714jhY c26714jhY = viewModel instanceof C26714jhY ? (C26714jhY) viewModel : null;
            if (c26714jhY != null) {
                c26714jhY.OLrzqt(sharedElementCallback);
            }
        }
        finish();
    }

    public final void ejfBZ() {
        int i = 0;
        for (Object obj : this.djBIcL) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            OLrzqt((TextView) obj, !this.fARcdN && this.ejfBZ == i);
            i++;
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
