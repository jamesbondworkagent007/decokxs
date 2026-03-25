package com.amplifyframework.auth.cognito;

import com.amplifyframework.auth.MFAType;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class UserMFAPreference {
    private final Set<MFAType> enabled;
    private final MFAType preferred;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplifyframework.auth.cognito.UserMFAPreference */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserMFAPreference copy$default(UserMFAPreference userMFAPreference, Set set, MFAType mFAType, int i, Object obj) {
        if ((i & 1) != 0) {
            set = userMFAPreference.enabled;
        }
        if ((i & 2) != 0) {
            mFAType = userMFAPreference.preferred;
        }
        return userMFAPreference.copy(set, mFAType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Set<MFAType> component1() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MFAType component2() {
        return this.preferred;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserMFAPreference copy(Set<? extends MFAType> set, MFAType mFAType) {
        return new UserMFAPreference(set, mFAType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserMFAPreference)) {
            return false;
        }
        UserMFAPreference userMFAPreference = (UserMFAPreference) obj;
        return Intrinsics.EZpvd(this.enabled, userMFAPreference.enabled) && this.preferred == userMFAPreference.preferred;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Set<MFAType> getEnabled() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MFAType getPreferred() {
        return this.preferred;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Set<MFAType> set = this.enabled;
        int iHashCode = set == null ? 0 : set.hashCode();
        MFAType mFAType = this.preferred;
        return (iHashCode * 31) + (mFAType != null ? mFAType.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UserMFAPreference(enabled=" + this.enabled + ", preferred=" + this.preferred + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Set<? extends com.amplifyframework.auth.MFAType> */
    /* JADX WARN: Multi-variable type inference failed */
    public UserMFAPreference(Set<? extends MFAType> set, MFAType mFAType) {
        this.enabled = set;
        this.preferred = mFAType;
    }
}
