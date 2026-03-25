package com.okinc.planet.biz_plugin.future.data;

import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import com.okinc.business.invest_biz.data.bean.InvestButtonAction;
import com.okinc.planet.biz_plugin.future.data.FutureTabPage;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C45984tDn;
import o.C47501trL;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC47831txY;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.tCO;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
@Serializable
public abstract class FutureTabPage implements InterfaceC47831txY {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FutureTabPage[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final String contentDescriptionId;
    private final int titleResId;
    private final String trackEventPara;
    public static final FutureTabPage OPEN = new FutureTabPage("OPEN", 0) { // from class: com.okinc.planet.biz_plugin.future.data.FutureTabPage.OPEN
        @Override // com.okinc.planet.biz_plugin.future.data.FutureTabPage
        public boolean isAvailable() {
            return true;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C47501trL.Fragment.aVhqwO;
            String str = "open";
            String str2 = "openTab";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC47831txY
        public Fragment createFragment() {
            return new C45984tDn();
        }
    };
    public static final FutureTabPage CLOSE = new FutureTabPage(InvestButtonAction.ACTION_CALLBACK_CLOSE, 1) { // from class: com.okinc.planet.biz_plugin.future.data.FutureTabPage.CLOSE
        @Override // com.okinc.planet.biz_plugin.future.data.FutureTabPage
        public boolean isAvailable() {
            return true;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C47501trL.Fragment.dIjzlO;
            String str = "closed";
            String str2 = "closedTab";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC47831txY
        public Fragment createFragment() {
            return new tCO();
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FutureTabPage[] $values() {
        return new FutureTabPage[]{OPEN, CLOSE};
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 int), (r3v0 int), (r4v0 java.lang.String), (r5v0 java.lang.String) A[MD:(java.lang.String, int, int, java.lang.String, java.lang.String):void (m)] call: com.okinc.planet.biz_plugin.future.data.FutureTabPage.<init>(java.lang.String, int, int, java.lang.String, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ FutureTabPage(String str, int i, int i2, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FutureTabPage> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContentDescriptionId() {
        return this.contentDescriptionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleResId() {
        return this.titleResId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrackEventPara() {
        return this.trackEventPara;
    }

    public abstract boolean isAvailable();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47831txY
    public boolean onCompareContents(@NotNull InterfaceC47831txY interfaceC47831txY) {
        Intrinsics.checkNotNullParameter(interfaceC47831txY, "");
        return this == interfaceC47831txY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47831txY
    public boolean onCompareItems(@NotNull InterfaceC47831txY interfaceC47831txY) {
        Intrinsics.checkNotNullParameter(interfaceC47831txY, "");
        return this == interfaceC47831txY;
    }

    private FutureTabPage(@StringRes String str, int i, int i2, String str2, String str3) {
        this.titleResId = i2;
        this.trackEventPara = str2;
        this.contentDescriptionId = str3;
    }

    static {
        FutureTabPage[] futureTabPageArr$values = $values();
        $VALUES = futureTabPageArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(futureTabPageArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.tCy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return FutureTabPage._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_plugin.future.data.FutureTabPage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) FutureTabPage.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<FutureTabPage> serializer() {
            return AEQbTJ();
        }

        public final List<FutureTabPage> copydefault() {
            FutureTabPage[] futureTabPageArrValues = FutureTabPage.values();
            ArrayList arrayList = new ArrayList();
            for (FutureTabPage futureTabPage : futureTabPageArrValues) {
                if (futureTabPage.isAvailable()) {
                    arrayList.add(futureTabPage);
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.planet.biz_plugin.future.data.FutureTabPage", values());
    }

    public static FutureTabPage valueOf(String str) {
        return (FutureTabPage) Enum.valueOf(FutureTabPage.class, str);
    }

    public static FutureTabPage[] values() {
        return (FutureTabPage[]) $VALUES.clone();
    }
}
