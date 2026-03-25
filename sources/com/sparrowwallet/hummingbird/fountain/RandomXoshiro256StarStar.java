package com.sparrowwallet.hummingbird.fountain;

import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes12.dex */
public class RandomXoshiro256StarStar extends Random {
    private static final long SPLITMIX1_MAGIC = -7046029254386353131L;
    private static final long serialVersionUID = -2837799889588687855L;
    private static final AtomicLong uniq = new AtomicLong(System.nanoTime());
    private long s0;
    private long s1;
    private long s2;
    private long s3;
    private long seed;

    private static long rotl(long j, int i) {
        return (j << i) | (j >>> (64 - i));
    }

    private static long splitmix64_1(long j) {
        return j - 7046029254386353131L;
    }

    private static long splitmix64_2(long j) {
        long j2 = (j ^ (j >> 30)) * (-4658895280553007687L);
        long j3 = (j2 ^ (j2 >> 27)) * (-7723592293110705685L);
        return j3 ^ (j3 >> 31);
    }

    private static final long nextUniq() {
        return splitmix64_2(uniq.addAndGet(SPLITMIX1_MAGIC));
    }

    public RandomXoshiro256StarStar() {
        this(System.nanoTime() ^ nextUniq());
    }

    public RandomXoshiro256StarStar(long j) {
        super(j);
    }

    public RandomXoshiro256StarStar(String str) {
        this(str.getBytes(StandardCharsets.UTF_8));
    }

    public RandomXoshiro256StarStar(byte[] bArr) {
        long[] jArr = new long[4];
        byte[] bArrHash = hash(bArr, 0, bArr.length);
        for (int i = 0; i < 4; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 8; i2++) {
                j = (j << 8) | ((long) (bArrHash[(i * 8) + i2] & UnsignedBytes.MAX_VALUE));
            }
            jArr[i] = j;
        }
        setState(jArr[0], jArr[1], jArr[2], jArr[3]);
    }

    public RandomXoshiro256StarStar(long j, long j2, long j3, long j4) {
        setState(j, j2, j3, j4);
    }

    @Override // java.util.Random
    public void setSeed(long j) {
        this.seed = j;
        super.setSeed(j);
        long jSplitmix64_1 = splitmix64_1(j);
        this.s0 = splitmix64_2(jSplitmix64_1);
        long jSplitmix64_12 = splitmix64_1(jSplitmix64_1);
        this.s1 = splitmix64_2(jSplitmix64_12);
        long jSplitmix64_13 = splitmix64_1(jSplitmix64_12);
        this.s2 = splitmix64_2(jSplitmix64_13);
        this.s3 = splitmix64_2(splitmix64_1(jSplitmix64_13));
    }

    public void setState(long j, long j2, long j3, long j4) {
        if (j == 0 && j2 == 0 && j3 == 0 && j4 == 0) {
            throw new IllegalArgumentException("xoshiro256** state cannot be all zeroes");
        }
        this.s0 = j;
        this.s1 = j2;
        this.s2 = j3;
        this.s3 = j4;
    }

    @Override // java.util.Random
    public int next(int i) {
        return (int) (nextLong() & ((1 << i) - 1));
    }

    @Override // java.util.Random
    public int nextInt() {
        return (int) nextLong();
    }

    @Override // java.util.Random
    public int nextInt(int i) {
        return (int) nextLong(i);
    }

    public long nextLong(long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        return (nextLong() & Long.MAX_VALUE) % j;
    }

    @Override // java.util.Random
    public double nextDouble() {
        return (nextLong() >>> 11) * 1.1102230246251565E-16d;
    }

    @Override // java.util.Random
    public float nextFloat() {
        return (nextLong() >>> 40) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return (nextLong() & 1) != 0;
    }

    @Override // java.util.Random
    public void nextBytes(byte[] bArr) {
        nextBytes(bArr, 0, bArr.length);
    }

    public void nextBytes(byte[] bArr, int i, int i2) {
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Offset " + i + " is negative");
        }
        if (i >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException("Offset " + i + " is greater than buffer length");
        }
        int i3 = i + i2;
        if (i3 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("Length " + i2 + " with offset " + i + " is past end of buffer");
        }
        long jNextLong = 0;
        int i4 = 8;
        while (i < i3) {
            if (i4 >= 8) {
                jNextLong = nextLong();
                i4 = 0;
            }
            bArr[i] = (byte) (255 & jNextLong);
            jNextLong >>>= 8;
            i4++;
            i++;
        }
    }

    public void nextData(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (nextInt(0, 256) & 255);
        }
    }

    public int nextInt(int i, int i2) {
        return ((int) (nextDouble() * ((double) i2))) + i;
    }

    @Override // java.util.Random
    public long nextLong() {
        long jRotl = rotl(this.s1 * 5, 7);
        long j = this.s1;
        long j2 = this.s2;
        long j3 = this.s0;
        long j4 = j2 ^ j3;
        long j5 = this.s3 ^ j;
        this.s3 = j5;
        this.s1 = j ^ j4;
        this.s0 = j3 ^ j5;
        this.s2 = (j << 17) ^ j4;
        this.s3 = rotl(j5, 45);
        return jRotl * 9;
    }

    public static byte[] hash(byte[] bArr, int i, int i2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr, i, i2);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
