package com.okinc.localization;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX INFO: loaded from: classes23.dex */
public interface LocalizeLoaderCallback {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Repository {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Repository[] $VALUES;
        public static final Repository REMOTE = new Repository("REMOTE", 0);
        public static final Repository LOCAL = new Repository("LOCAL", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Repository[] $values() {
            return new Repository[]{REMOTE, LOCAL};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Repository> getEntries() {
            return $ENTRIES;
        }

        private Repository(String str, int i) {
        }

        static {
            Repository[] repositoryArr$values = $values();
            $VALUES = repositoryArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(repositoryArr$values);
        }

        public static Repository valueOf(String str) {
            return (Repository) Enum.valueOf(Repository.class, str);
        }

        public static Repository[] values() {
            return (Repository[]) $VALUES.clone();
        }
    }
}
