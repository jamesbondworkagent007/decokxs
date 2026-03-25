package com.okinc.planet.biz_create_centre.common;

import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import com.okinc.planet.utils.IMUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43251rlk;
import o.C47501trL;
import o.C47774twU;
import o.C47835txc;
import o.C47837txe;
import o.C47841txi;
import o.C56444yFp;
import o.InterfaceC47831txY;
import o.InterfaceC56445yFq;
import o.tWM;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public abstract class CreatorCentreSubPage implements InterfaceC47831txY {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CreatorCentreSubPage[] $VALUES;
    public static final Activity Companion;
    private final String contentDescriptionId;
    private final int titleResId;
    private final String trackEventPara;
    public static final CreatorCentreSubPage POST = new CreatorCentreSubPage("POST", 0) { // from class: com.okinc.planet.biz_create_centre.common.CreatorCentreSubPage.POST
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C47501trL.Fragment.RKDWNf;
            String str = "post";
            String str2 = "creator_centre_post_tab";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.okinc.planet.biz_create_centre.common.CreatorCentreSubPage, o.InterfaceC47831txY
        public Fragment createFragment() {
            return new C47841txi();
        }

        @Override // com.okinc.planet.biz_create_centre.common.CreatorCentreSubPage
        public boolean isAvailable() {
            return C47774twU.AEQbTJ.OLrzqt() && ((tWM) C43251rlk.copydefault(tWM.class)).valueOf();
        }
    };
    public static final CreatorCentreSubPage LIVESTREAMS = new CreatorCentreSubPage("LIVESTREAMS", 1) { // from class: com.okinc.planet.biz_create_centre.common.CreatorCentreSubPage.LIVESTREAMS
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C47501trL.Fragment.OBJEWx;
            String str = "livestreams";
            String str2 = "creator_centre_livestreams_tab";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.okinc.planet.biz_create_centre.common.CreatorCentreSubPage, o.InterfaceC47831txY
        public Fragment createFragment() {
            return new C47835txc();
        }

        @Override // com.okinc.planet.biz_create_centre.common.CreatorCentreSubPage
        public boolean isAvailable() {
            return C47774twU.AEQbTJ.EZpvd();
        }
    };
    public static final CreatorCentreSubPage GROUPS = new CreatorCentreSubPage("GROUPS", 2) { // from class: com.okinc.planet.biz_create_centre.common.CreatorCentreSubPage.GROUPS
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C47501trL.Fragment.QSBOWP;
            String str = "groups";
            String str2 = "creator_centre_groups_tab";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.okinc.planet.biz_create_centre.common.CreatorCentreSubPage, o.InterfaceC47831txY
        public Fragment createFragment() {
            return new C47837txe();
        }

        @Override // com.okinc.planet.biz_create_centre.common.CreatorCentreSubPage
        public boolean isAvailable() {
            return C47774twU.AEQbTJ.AEQbTJ() && IMUtils.KWHzl.OLrzqt();
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CreatorCentreSubPage[] $values() {
        return new CreatorCentreSubPage[]{POST, LIVESTREAMS, GROUPS};
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 int), (r3v0 int), (r4v0 java.lang.String), (r5v0 java.lang.String) A[MD:(java.lang.String, int, int, java.lang.String, java.lang.String):void (m)] call: com.okinc.planet.biz_create_centre.common.CreatorCentreSubPage.<init>(java.lang.String, int, int, java.lang.String, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ CreatorCentreSubPage(String str, int i, int i2, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CreatorCentreSubPage> getEntries() {
        return $ENTRIES;
    }

    @Override // o.InterfaceC47831txY
    public abstract Fragment createFragment();

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

    private CreatorCentreSubPage(@StringRes String str, int i, int i2, String str2, String str3) {
        this.titleResId = i2;
        this.trackEventPara = str2;
        this.contentDescriptionId = str3;
    }

    static {
        CreatorCentreSubPage[] creatorCentreSubPageArr$values = $values();
        $VALUES = creatorCentreSubPageArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(creatorCentreSubPageArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_create_centre.common.CreatorCentreSubPage.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final List<CreatorCentreSubPage> OLrzqt() {
            InterfaceC56445yFq<CreatorCentreSubPage> entries = CreatorCentreSubPage.getEntries();
            ArrayList arrayList = new ArrayList();
            for (CreatorCentreSubPage creatorCentreSubPage : entries) {
                if (creatorCentreSubPage.isAvailable()) {
                    arrayList.add(creatorCentreSubPage);
                }
            }
            return arrayList;
        }
    }

    public static CreatorCentreSubPage valueOf(String str) {
        return (CreatorCentreSubPage) Enum.valueOf(CreatorCentreSubPage.class, str);
    }

    public static CreatorCentreSubPage[] values() {
        return (CreatorCentreSubPage[]) $VALUES.clone();
    }
}
