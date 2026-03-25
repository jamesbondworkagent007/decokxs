package dagger.internal;

import o.C58165ywD;

/* JADX INFO: loaded from: classes24.dex */
public final class MembersInjectors {

    public enum NoOpMembersInjector {
        INSTANCE;

        public void injectMembers(Object obj) {
            C58165ywD.KWHzl(obj, "Cannot inject members into a null reference");
        }
    }

    private MembersInjectors() {
    }
}
