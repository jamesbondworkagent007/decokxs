package com.okinc.im.imui.livestream.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class UserRole {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ UserRole[] $VALUES;
    public static final StateListAnimator Companion;
    private final int value;
    public static final UserRole VIEWER = new UserRole("VIEWER", 0, 3);
    public static final UserRole MODERATOR = new UserRole("MODERATOR", 1, 2);
    public static final UserRole STREAMER = new UserRole("STREAMER", 2, 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ UserRole[] $values() {
        return new UserRole[]{VIEWER, MODERATOR, STREAMER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<UserRole> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private UserRole(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        UserRole[] userRoleArr$values = $values();
        $VALUES = userRoleArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(userRoleArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.livestream.model.UserRole.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final UserRole copydefault(int i) {
            UserRole userRole = UserRole.STREAMER;
            if (i == userRole.getValue()) {
                return userRole;
            }
            UserRole userRole2 = UserRole.MODERATOR;
            return i == userRole2.getValue() ? userRole2 : UserRole.VIEWER;
        }
    }

    public static UserRole valueOf(String str) {
        return (UserRole) Enum.valueOf(UserRole.class, str);
    }

    public static UserRole[] values() {
        return (UserRole[]) $VALUES.clone();
    }
}
