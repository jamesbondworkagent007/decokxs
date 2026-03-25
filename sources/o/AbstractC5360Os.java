package o;

import com.bumptech.glide.load.EncodeStrategy;

/* JADX INFO: renamed from: o.Os, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5360Os {
    public static final AbstractC5360Os copydefault = new AbstractC5360Os() { // from class: o.Os.1
        @Override // o.AbstractC5360Os
        public boolean EZpvd() {
            return true;
        }

        @Override // o.AbstractC5360Os
        public boolean OLrzqt() {
            return true;
        }

        @Override // o.AbstractC5360Os
        public boolean AEQbTJ(com.bumptech.glide.load.DataSource dataSource) {
            return dataSource == com.bumptech.glide.load.DataSource.REMOTE;
        }

        @Override // o.AbstractC5360Os
        public boolean OLrzqt(boolean z, com.bumptech.glide.load.DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == com.bumptech.glide.load.DataSource.RESOURCE_DISK_CACHE || dataSource == com.bumptech.glide.load.DataSource.MEMORY_CACHE) ? false : true;
        }
    };
    public static final AbstractC5360Os KWHzl = new AbstractC5360Os() { // from class: o.Os.5
        @Override // o.AbstractC5360Os
        public boolean AEQbTJ(com.bumptech.glide.load.DataSource dataSource) {
            return false;
        }

        @Override // o.AbstractC5360Os
        public boolean EZpvd() {
            return false;
        }

        @Override // o.AbstractC5360Os
        public boolean OLrzqt() {
            return false;
        }

        @Override // o.AbstractC5360Os
        public boolean OLrzqt(boolean z, com.bumptech.glide.load.DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    };
    public static final AbstractC5360Os EZpvd = new AbstractC5360Os() { // from class: o.Os.4
        @Override // o.AbstractC5360Os
        public boolean EZpvd() {
            return false;
        }

        @Override // o.AbstractC5360Os
        public boolean OLrzqt() {
            return true;
        }

        @Override // o.AbstractC5360Os
        public boolean OLrzqt(boolean z, com.bumptech.glide.load.DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }

        @Override // o.AbstractC5360Os
        public boolean AEQbTJ(com.bumptech.glide.load.DataSource dataSource) {
            return (dataSource == com.bumptech.glide.load.DataSource.DATA_DISK_CACHE || dataSource == com.bumptech.glide.load.DataSource.MEMORY_CACHE) ? false : true;
        }
    };
    public static final AbstractC5360Os OLrzqt = new AbstractC5360Os() { // from class: o.Os.3
        @Override // o.AbstractC5360Os
        public boolean AEQbTJ(com.bumptech.glide.load.DataSource dataSource) {
            return false;
        }

        @Override // o.AbstractC5360Os
        public boolean EZpvd() {
            return true;
        }

        @Override // o.AbstractC5360Os
        public boolean OLrzqt() {
            return false;
        }

        @Override // o.AbstractC5360Os
        public boolean OLrzqt(boolean z, com.bumptech.glide.load.DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == com.bumptech.glide.load.DataSource.RESOURCE_DISK_CACHE || dataSource == com.bumptech.glide.load.DataSource.MEMORY_CACHE) ? false : true;
        }
    };
    public static final AbstractC5360Os AEQbTJ = new AbstractC5360Os() { // from class: o.Os.2
        @Override // o.AbstractC5360Os
        public boolean EZpvd() {
            return true;
        }

        @Override // o.AbstractC5360Os
        public boolean OLrzqt() {
            return true;
        }

        @Override // o.AbstractC5360Os
        public boolean AEQbTJ(com.bumptech.glide.load.DataSource dataSource) {
            return dataSource == com.bumptech.glide.load.DataSource.REMOTE;
        }

        @Override // o.AbstractC5360Os
        public boolean OLrzqt(boolean z, com.bumptech.glide.load.DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z && dataSource == com.bumptech.glide.load.DataSource.DATA_DISK_CACHE) || dataSource == com.bumptech.glide.load.DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
        }
    };

    public abstract boolean AEQbTJ(com.bumptech.glide.load.DataSource dataSource);

    public abstract boolean EZpvd();

    public abstract boolean OLrzqt();

    public abstract boolean OLrzqt(boolean z, com.bumptech.glide.load.DataSource dataSource, EncodeStrategy encodeStrategy);
}
