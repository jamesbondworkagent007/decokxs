package com.okinc.business.defi.api.bean.passkeywallet.cedefi;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ProjectSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ProjectSource[] $VALUES;
    public static final ActionBar Companion;
    private final String value;
    public static final ProjectSource CeDeFi = new ProjectSource("CeDeFi", 0, "cedefi");
    public static final ProjectSource EASY_WALLET = new ProjectSource("EASY_WALLET", 1, "easyWallet");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ProjectSource[] $values() {
        return new ProjectSource[]{CeDeFi, EASY_WALLET};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ProjectSource> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private ProjectSource(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        ProjectSource[] projectSourceArr$values = $values();
        $VALUES = projectSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(projectSourceArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.passkeywallet.cedefi.ProjectSource.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final ProjectSource EZpvd(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return Intrinsics.EZpvd((Object) str, (Object) "easyWallet") ? ProjectSource.EASY_WALLET : ProjectSource.CeDeFi;
        }
    }

    public static ProjectSource valueOf(String str) {
        return (ProjectSource) Enum.valueOf(ProjectSource.class, str);
    }

    public static ProjectSource[] values() {
        return (ProjectSource[]) $VALUES.clone();
    }
}
