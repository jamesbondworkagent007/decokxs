package com.okinc.planet.biz_home.root;

import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import com.okinc.planet.utils.IMUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.C47599ttE;
import o.C47888tyc;
import o.C56444yFp;
import o.InterfaceC47831txY;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public abstract class PlanetSubPage implements InterfaceC47831txY {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PlanetSubPage[] $VALUES;
    public static final Application Companion;
    private final String contentDescriptionId;
    private final int titleResId;
    private final String trackEventPara;
    public static final PlanetSubPage LeaderBoard = new PlanetSubPage("LeaderBoard", 0) { // from class: com.okinc.planet.biz_home.root.PlanetSubPage.LeaderBoard
        @Override // com.okinc.planet.biz_home.root.PlanetSubPage
        public boolean isAvailable() {
            return true;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C47501trL.Fragment.DGOPHZ;
            String str = "Leaderboard";
            String str2 = "LeaderboardFeedsTab";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC47831txY
        public Fragment createFragment() {
            return new C47599ttE();
        }
    };
    public static final PlanetSubPage FEED = new PlanetSubPage("FEED", 1) { // from class: com.okinc.planet.biz_home.root.PlanetSubPage.FEED
        @Override // com.okinc.planet.biz_home.root.PlanetSubPage
        public boolean isAvailable() {
            return true;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C47501trL.Fragment.invokespecialatDTRm;
            String str = "feed";
            String str2 = "DiscoverFeedsTab";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC47831txY
        public Fragment createFragment() {
            return new C47888tyc();
        }
    };
    public static final PlanetSubPage CHAT = new PlanetSubPage("CHAT", 2) { // from class: com.okinc.planet.biz_home.root.PlanetSubPage.CHAT
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            int i = C47501trL.Fragment.spnCvw;
            String str = "chat";
            String str2 = "DiscoverChatTab";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC47831txY
        public Fragment createFragment() {
            Fragment fragmentAEQbTJ = IMUtils.KWHzl.AEQbTJ();
            return fragmentAEQbTJ == null ? new Fragment() : fragmentAEQbTJ;
        }

        @Override // com.okinc.planet.biz_home.root.PlanetSubPage
        public boolean isAvailable() {
            return IMUtils.KWHzl.AEQbTJ() != null;
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PlanetSubPage[] $values() {
        return new PlanetSubPage[]{LeaderBoard, FEED, CHAT};
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 int), (r3v0 int), (r4v0 java.lang.String), (r5v0 java.lang.String) A[MD:(java.lang.String, int, int, java.lang.String, java.lang.String):void (m)] call: com.okinc.planet.biz_home.root.PlanetSubPage.<init>(java.lang.String, int, int, java.lang.String, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PlanetSubPage(String str, int i, int i2, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PlanetSubPage> getEntries() {
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

    private PlanetSubPage(@StringRes String str, int i, int i2, String str2, String str3) {
        this.titleResId = i2;
        this.trackEventPara = str2;
        this.contentDescriptionId = str3;
    }

    static {
        PlanetSubPage[] planetSubPageArr$values = $values();
        $VALUES = planetSubPageArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(planetSubPageArr$values);
        Companion = new Application(null);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_home.root.PlanetSubPage.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static PlanetSubPage valueOf(String str) {
        return (PlanetSubPage) Enum.valueOf(PlanetSubPage.class, str);
    }

    public static PlanetSubPage[] values() {
        return (PlanetSubPage[]) $VALUES.clone();
    }
}
