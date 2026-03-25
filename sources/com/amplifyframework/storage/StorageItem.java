package com.amplifyframework.storage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import java.util.Date;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes21.dex */
public final class StorageItem {
    private final String eTag;
    private final String key;
    private final Date lastModified;
    private final Object pluginResults;
    private final long size;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getETag() {
        return this.eTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getKey() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Date getLastModified() {
        return this.lastModified;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Object getPluginResults() {
        return this.pluginResults;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long getSize() {
        return this.size;
    }

    public StorageItem(@NonNull String str, long j, @NonNull Date date, @NonNull String str2, @Nullable Object obj) {
        this.key = str;
        this.size = j;
        this.lastModified = date;
        this.eTag = str2;
        this.pluginResults = obj;
    }

    public String toString() {
        return "StorageItem{key='" + this.key + "', size=" + this.size + ", lastModified=" + this.lastModified.toString() + ", eTag='" + this.eTag + "', pluginResults=" + this.pluginResults + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageItem)) {
            return false;
        }
        StorageItem storageItem = (StorageItem) obj;
        if (ObjectsCompat.equals(this.key, storageItem.key) && this.size == storageItem.size && ObjectsCompat.equals(this.lastModified, storageItem.lastModified) && ObjectsCompat.equals(this.eTag, storageItem.eTag)) {
            return ObjectsCompat.equals(this.pluginResults, storageItem.pluginResults);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.key.hashCode();
        int i = (int) this.size;
        int iHashCode2 = this.lastModified.hashCode();
        int iHashCode3 = this.eTag.hashCode();
        Object obj = this.pluginResults;
        return (((((((iHashCode * 31) + i) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (obj != null ? obj.hashCode() : 0);
    }
}
