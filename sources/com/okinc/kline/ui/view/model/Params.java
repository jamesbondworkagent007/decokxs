package com.okinc.kline.ui.view.model;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Params {
    public static final int $stable = 8;
    private Out adx;
    private Out adxr;
    private Length atrLength;
    private Out background;
    private Out buy;
    private Out d;
    private Out downColor;
    private Length fastLength;
    private Out histogram;
    private Out j;
    private Out k;
    private Length length;
    private Length lengthADX;
    private Length lengthDI;
    private Length lengthRSI;
    private Length lengthStoch;

    /* JADX INFO: renamed from: long, reason: not valid java name */
    private Out f78long;
    private Length lookback;
    private Out lower;
    private Out lowerBound;
    private Out ma1;
    private Out ma2;
    private Out macd;
    private Out median;
    private Out minusDI;
    private Length mult;
    private Out out;
    private Out out1;
    private Out out2;
    private Out out3;
    private Out out4;
    private Out out5;
    private Out out6;
    private Out plusDI;
    private Out ratio;
    private Out sell;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private Out f79short;
    private Out signal;
    private Length signalLength;
    private Length slowLength;
    private Length smooth;
    private Length smoothD;
    private Length smoothK;
    private Out upColor;
    private Out upper;
    private Out upperBound;
    private Out vwap;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Params() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 32767, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out component1() {
        return this.out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Length component10() {
        return this.lookback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out component11() {
        return this.median;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out component12() {
        return this.upper;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out component13() {
        return this.lower;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out component14() {
        return this.background;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Length component15() {
        return this.fastLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Length component16() {
        return this.slowLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Length component17() {
        return this.signalLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out component18() {
        return this.macd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out component19() {
        return this.signal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out component2() {
        return this.out1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out component20() {
        return this.histogram;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Length component21() {
        return this.smooth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Length component22() {
        return this.smoothK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Length component23() {
        return this.smoothD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out component24() {
        return this.k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out component25() {
        return this.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out component26() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Length component27() {
        return this.lengthRSI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Length component28() {
        return this.lengthStoch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out component29() {
        return this.ma1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out component3() {
        return this.out2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out component30() {
        return this.ma2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Length component31() {
        return this.lengthDI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Length component32() {
        return this.lengthADX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out component33() {
        return this.plusDI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out component34() {
        return this.minusDI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out component35() {
        return this.adx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out component36() {
        return this.adxr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out component37() {
        return this.ratio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out component38() {
        return this.f78long;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out component39() {
        return this.f79short;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out component4() {
        return this.out3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out component40() {
        return this.buy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out component41() {
        return this.sell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out component42() {
        return this.upperBound;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out component43() {
        return this.lowerBound;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Length component44() {
        return this.atrLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out component45() {
        return this.upColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out component46() {
        return this.downColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out component47() {
        return this.vwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out component5() {
        return this.out4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out component6() {
        return this.out5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out component7() {
        return this.out6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Length component8() {
        return this.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Length component9() {
        return this.mult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Params copy(Out out, Out out2, Out out3, Out out4, Out out5, Out out6, Out out7, Length length, Length length2, Length length3, Out out8, Out out9, Out out10, Out out11, Length length4, Length length5, Length length6, Out out12, Out out13, Out out14, Length length7, Length length8, Length length9, Out out15, Out out16, Out out17, Length length10, Length length11, Out out18, Out out19, Length length12, Length length13, Out out20, Out out21, Out out22, Out out23, Out out24, Out out25, Out out26, Out out27, Out out28, Out out29, Out out30, Length length14, Out out31, Out out32, Out out33) {
        return new Params(out, out2, out3, out4, out5, out6, out7, length, length2, length3, out8, out9, out10, out11, length4, length5, length6, out12, out13, out14, length7, length8, length9, out15, out16, out17, length10, length11, out18, out19, length12, length13, out20, out21, out22, out23, out24, out25, out26, out27, out28, out29, out30, length14, out31, out32, out33);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Params)) {
            return false;
        }
        Params params = (Params) obj;
        return Intrinsics.EZpvd(this.out, params.out) && Intrinsics.EZpvd(this.out1, params.out1) && Intrinsics.EZpvd(this.out2, params.out2) && Intrinsics.EZpvd(this.out3, params.out3) && Intrinsics.EZpvd(this.out4, params.out4) && Intrinsics.EZpvd(this.out5, params.out5) && Intrinsics.EZpvd(this.out6, params.out6) && Intrinsics.EZpvd(this.length, params.length) && Intrinsics.EZpvd(this.mult, params.mult) && Intrinsics.EZpvd(this.lookback, params.lookback) && Intrinsics.EZpvd(this.median, params.median) && Intrinsics.EZpvd(this.upper, params.upper) && Intrinsics.EZpvd(this.lower, params.lower) && Intrinsics.EZpvd(this.background, params.background) && Intrinsics.EZpvd(this.fastLength, params.fastLength) && Intrinsics.EZpvd(this.slowLength, params.slowLength) && Intrinsics.EZpvd(this.signalLength, params.signalLength) && Intrinsics.EZpvd(this.macd, params.macd) && Intrinsics.EZpvd(this.signal, params.signal) && Intrinsics.EZpvd(this.histogram, params.histogram) && Intrinsics.EZpvd(this.smooth, params.smooth) && Intrinsics.EZpvd(this.smoothK, params.smoothK) && Intrinsics.EZpvd(this.smoothD, params.smoothD) && Intrinsics.EZpvd(this.k, params.k) && Intrinsics.EZpvd(this.d, params.d) && Intrinsics.EZpvd(this.j, params.j) && Intrinsics.EZpvd(this.lengthRSI, params.lengthRSI) && Intrinsics.EZpvd(this.lengthStoch, params.lengthStoch) && Intrinsics.EZpvd(this.ma1, params.ma1) && Intrinsics.EZpvd(this.ma2, params.ma2) && Intrinsics.EZpvd(this.lengthDI, params.lengthDI) && Intrinsics.EZpvd(this.lengthADX, params.lengthADX) && Intrinsics.EZpvd(this.plusDI, params.plusDI) && Intrinsics.EZpvd(this.minusDI, params.minusDI) && Intrinsics.EZpvd(this.adx, params.adx) && Intrinsics.EZpvd(this.adxr, params.adxr) && Intrinsics.EZpvd(this.ratio, params.ratio) && Intrinsics.EZpvd(this.f78long, params.f78long) && Intrinsics.EZpvd(this.f79short, params.f79short) && Intrinsics.EZpvd(this.buy, params.buy) && Intrinsics.EZpvd(this.sell, params.sell) && Intrinsics.EZpvd(this.upperBound, params.upperBound) && Intrinsics.EZpvd(this.lowerBound, params.lowerBound) && Intrinsics.EZpvd(this.atrLength, params.atrLength) && Intrinsics.EZpvd(this.upColor, params.upColor) && Intrinsics.EZpvd(this.downColor, params.downColor) && Intrinsics.EZpvd(this.vwap, params.vwap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out getAdx() {
        return this.adx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out getAdxr() {
        return this.adxr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Length getAtrLength() {
        return this.atrLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out getBackground() {
        return this.background;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out getBuy() {
        return this.buy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out getD() {
        return this.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out getDownColor() {
        return this.downColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Length getFastLength() {
        return this.fastLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out getHistogram() {
        return this.histogram;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out getJ() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out getK() {
        return this.k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Length getLength() {
        return this.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Length getLengthADX() {
        return this.lengthADX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Length getLengthDI() {
        return this.lengthDI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Length getLengthRSI() {
        return this.lengthRSI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Length getLengthStoch() {
        return this.lengthStoch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out getLong() {
        return this.f78long;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Length getLookback() {
        return this.lookback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out getLower() {
        return this.lower;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out getLowerBound() {
        return this.lowerBound;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out getMa1() {
        return this.ma1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out getMa2() {
        return this.ma2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out getMacd() {
        return this.macd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out getMedian() {
        return this.median;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out getMinusDI() {
        return this.minusDI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Length getMult() {
        return this.mult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out getOut() {
        return this.out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out getOut1() {
        return this.out1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out getOut2() {
        return this.out2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out getOut3() {
        return this.out3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out getOut4() {
        return this.out4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out getOut5() {
        return this.out5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out getOut6() {
        return this.out6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out getPlusDI() {
        return this.plusDI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out getRatio() {
        return this.ratio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out getSell() {
        return this.sell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out getShort() {
        return this.f79short;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out getSignal() {
        return this.signal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Length getSignalLength() {
        return this.signalLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Length getSlowLength() {
        return this.slowLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Length getSmooth() {
        return this.smooth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Length getSmoothD() {
        return this.smoothD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Length getSmoothK() {
        return this.smoothK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out getUpColor() {
        return this.upColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out getUpper() {
        return this.upper;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out getUpperBound() {
        return this.upperBound;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Out getVwap() {
        return this.vwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Out out = this.out;
        int iHashCode = out == null ? 0 : out.hashCode();
        Out out2 = this.out1;
        int iHashCode2 = out2 == null ? 0 : out2.hashCode();
        Out out3 = this.out2;
        int iHashCode3 = out3 == null ? 0 : out3.hashCode();
        Out out4 = this.out3;
        int iHashCode4 = out4 == null ? 0 : out4.hashCode();
        Out out5 = this.out4;
        int iHashCode5 = out5 == null ? 0 : out5.hashCode();
        Out out6 = this.out5;
        int iHashCode6 = out6 == null ? 0 : out6.hashCode();
        Out out7 = this.out6;
        int iHashCode7 = out7 == null ? 0 : out7.hashCode();
        Length length = this.length;
        int iHashCode8 = length == null ? 0 : length.hashCode();
        Length length2 = this.mult;
        int iHashCode9 = length2 == null ? 0 : length2.hashCode();
        Length length3 = this.lookback;
        int iHashCode10 = length3 == null ? 0 : length3.hashCode();
        Out out8 = this.median;
        int iHashCode11 = out8 == null ? 0 : out8.hashCode();
        Out out9 = this.upper;
        int iHashCode12 = out9 == null ? 0 : out9.hashCode();
        Out out10 = this.lower;
        int iHashCode13 = out10 == null ? 0 : out10.hashCode();
        Out out11 = this.background;
        int iHashCode14 = out11 == null ? 0 : out11.hashCode();
        Length length4 = this.fastLength;
        int iHashCode15 = length4 == null ? 0 : length4.hashCode();
        Length length5 = this.slowLength;
        int iHashCode16 = length5 == null ? 0 : length5.hashCode();
        Length length6 = this.signalLength;
        int iHashCode17 = length6 == null ? 0 : length6.hashCode();
        Out out12 = this.macd;
        int iHashCode18 = out12 == null ? 0 : out12.hashCode();
        Out out13 = this.signal;
        int iHashCode19 = out13 == null ? 0 : out13.hashCode();
        Out out14 = this.histogram;
        int iHashCode20 = out14 == null ? 0 : out14.hashCode();
        Length length7 = this.smooth;
        int iHashCode21 = length7 == null ? 0 : length7.hashCode();
        Length length8 = this.smoothK;
        int iHashCode22 = length8 == null ? 0 : length8.hashCode();
        Length length9 = this.smoothD;
        int iHashCode23 = length9 == null ? 0 : length9.hashCode();
        Out out15 = this.k;
        int iHashCode24 = out15 == null ? 0 : out15.hashCode();
        Out out16 = this.d;
        int iHashCode25 = out16 == null ? 0 : out16.hashCode();
        Out out17 = this.j;
        int iHashCode26 = out17 == null ? 0 : out17.hashCode();
        Length length10 = this.lengthRSI;
        int iHashCode27 = length10 == null ? 0 : length10.hashCode();
        Length length11 = this.lengthStoch;
        int iHashCode28 = length11 == null ? 0 : length11.hashCode();
        Out out18 = this.ma1;
        int iHashCode29 = out18 == null ? 0 : out18.hashCode();
        Out out19 = this.ma2;
        int iHashCode30 = out19 == null ? 0 : out19.hashCode();
        Length length12 = this.lengthDI;
        int iHashCode31 = length12 == null ? 0 : length12.hashCode();
        Length length13 = this.lengthADX;
        int iHashCode32 = length13 == null ? 0 : length13.hashCode();
        Out out20 = this.plusDI;
        int iHashCode33 = out20 == null ? 0 : out20.hashCode();
        Out out21 = this.minusDI;
        int iHashCode34 = out21 == null ? 0 : out21.hashCode();
        Out out22 = this.adx;
        int iHashCode35 = out22 == null ? 0 : out22.hashCode();
        Out out23 = this.adxr;
        int iHashCode36 = out23 == null ? 0 : out23.hashCode();
        Out out24 = this.ratio;
        int iHashCode37 = out24 == null ? 0 : out24.hashCode();
        Out out25 = this.f78long;
        int iHashCode38 = out25 == null ? 0 : out25.hashCode();
        Out out26 = this.f79short;
        int iHashCode39 = out26 == null ? 0 : out26.hashCode();
        Out out27 = this.buy;
        int iHashCode40 = out27 == null ? 0 : out27.hashCode();
        Out out28 = this.sell;
        int iHashCode41 = out28 == null ? 0 : out28.hashCode();
        Out out29 = this.upperBound;
        int iHashCode42 = out29 == null ? 0 : out29.hashCode();
        Out out30 = this.lowerBound;
        int iHashCode43 = out30 == null ? 0 : out30.hashCode();
        Length length14 = this.atrLength;
        int iHashCode44 = length14 == null ? 0 : length14.hashCode();
        Out out31 = this.upColor;
        int iHashCode45 = out31 == null ? 0 : out31.hashCode();
        Out out32 = this.downColor;
        int iHashCode46 = out32 == null ? 0 : out32.hashCode();
        Out out33 = this.vwap;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + (out33 == null ? 0 : out33.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAdx(Out out) {
        this.adx = out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAdxr(Out out) {
        this.adxr = out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAtrLength(Length length) {
        this.atrLength = length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBackground(Out out) {
        this.background = out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBuy(Out out) {
        this.buy = out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setD(Out out) {
        this.d = out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDownColor(Out out) {
        this.downColor = out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFastLength(Length length) {
        this.fastLength = length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHistogram(Out out) {
        this.histogram = out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setJ(Out out) {
        this.j = out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setK(Out out) {
        this.k = out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLength(Length length) {
        this.length = length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLengthADX(Length length) {
        this.lengthADX = length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLengthDI(Length length) {
        this.lengthDI = length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLengthRSI(Length length) {
        this.lengthRSI = length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLengthStoch(Length length) {
        this.lengthStoch = length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLong(Out out) {
        this.f78long = out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLookback(Length length) {
        this.lookback = length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLower(Out out) {
        this.lower = out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLowerBound(Out out) {
        this.lowerBound = out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMa1(Out out) {
        this.ma1 = out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMa2(Out out) {
        this.ma2 = out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMacd(Out out) {
        this.macd = out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMedian(Out out) {
        this.median = out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinusDI(Out out) {
        this.minusDI = out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMult(Length length) {
        this.mult = length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOut(Out out) {
        this.out = out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOut1(Out out) {
        this.out1 = out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOut2(Out out) {
        this.out2 = out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOut3(Out out) {
        this.out3 = out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOut4(Out out) {
        this.out4 = out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOut5(Out out) {
        this.out5 = out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOut6(Out out) {
        this.out6 = out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlusDI(Out out) {
        this.plusDI = out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRatio(Out out) {
        this.ratio = out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSell(Out out) {
        this.sell = out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShort(Out out) {
        this.f79short = out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignal(Out out) {
        this.signal = out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignalLength(Length length) {
        this.signalLength = length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlowLength(Length length) {
        this.slowLength = length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSmooth(Length length) {
        this.smooth = length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSmoothD(Length length) {
        this.smoothD = length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSmoothK(Length length) {
        this.smoothK = length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpColor(Out out) {
        this.upColor = out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpper(Out out) {
        this.upper = out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpperBound(Out out) {
        this.upperBound = out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVwap(Out out) {
        this.vwap = out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Params(out=" + this.out + ", out1=" + this.out1 + ", out2=" + this.out2 + ", out3=" + this.out3 + ", out4=" + this.out4 + ", out5=" + this.out5 + ", out6=" + this.out6 + ", length=" + this.length + ", mult=" + this.mult + ", lookback=" + this.lookback + ", median=" + this.median + ", upper=" + this.upper + ", lower=" + this.lower + ", background=" + this.background + ", fastLength=" + this.fastLength + ", slowLength=" + this.slowLength + ", signalLength=" + this.signalLength + ", macd=" + this.macd + ", signal=" + this.signal + ", histogram=" + this.histogram + ", smooth=" + this.smooth + ", smoothK=" + this.smoothK + ", smoothD=" + this.smoothD + ", k=" + this.k + ", d=" + this.d + ", j=" + this.j + ", lengthRSI=" + this.lengthRSI + ", lengthStoch=" + this.lengthStoch + ", ma1=" + this.ma1 + ", ma2=" + this.ma2 + ", lengthDI=" + this.lengthDI + ", lengthADX=" + this.lengthADX + ", plusDI=" + this.plusDI + ", minusDI=" + this.minusDI + ", adx=" + this.adx + ", adxr=" + this.adxr + ", ratio=" + this.ratio + ", long=" + this.f78long + ", short=" + this.f79short + ", buy=" + this.buy + ", sell=" + this.sell + ", upperBound=" + this.upperBound + ", lowerBound=" + this.lowerBound + ", atrLength=" + this.atrLength + ", upColor=" + this.upColor + ", downColor=" + this.downColor + ", vwap=" + this.vwap + ")";
    }

    public Params(Out out, Out out2, Out out3, Out out4, Out out5, Out out6, Out out7, Length length, Length length2, Length length3, Out out8, Out out9, Out out10, Out out11, Length length4, Length length5, Length length6, Out out12, Out out13, Out out14, Length length7, Length length8, Length length9, Out out15, Out out16, Out out17, Length length10, Length length11, Out out18, Out out19, Length length12, Length length13, Out out20, Out out21, Out out22, Out out23, Out out24, Out out25, Out out26, Out out27, Out out28, Out out29, Out out30, Length length14, Out out31, Out out32, Out out33) {
        this.out = out;
        this.out1 = out2;
        this.out2 = out3;
        this.out3 = out4;
        this.out4 = out5;
        this.out5 = out6;
        this.out6 = out7;
        this.length = length;
        this.mult = length2;
        this.lookback = length3;
        this.median = out8;
        this.upper = out9;
        this.lower = out10;
        this.background = out11;
        this.fastLength = length4;
        this.slowLength = length5;
        this.signalLength = length6;
        this.macd = out12;
        this.signal = out13;
        this.histogram = out14;
        this.smooth = length7;
        this.smoothK = length8;
        this.smoothD = length9;
        this.k = out15;
        this.d = out16;
        this.j = out17;
        this.lengthRSI = length10;
        this.lengthStoch = length11;
        this.ma1 = out18;
        this.ma2 = out19;
        this.lengthDI = length12;
        this.lengthADX = length13;
        this.plusDI = out20;
        this.minusDI = out21;
        this.adx = out22;
        this.adxr = out23;
        this.ratio = out24;
        this.f78long = out25;
        this.f79short = out26;
        this.buy = out27;
        this.sell = out28;
        this.upperBound = out29;
        this.lowerBound = out30;
        this.atrLength = length14;
        this.upColor = out31;
        this.downColor = out32;
        this.vwap = out33;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0226: CONSTRUCTOR 
  (wrap:com.okinc.kline.ui.view.model.Out:?: TERNARY null = ((wrap:int:0x0004: ARITH (r94v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Out) : (r47v0 com.okinc.kline.ui.view.model.Out))
  (wrap:com.okinc.kline.ui.view.model.Out:?: TERNARY null = ((wrap:int:0x000c: ARITH (r94v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Out) : (r48v0 com.okinc.kline.ui.view.model.Out))
  (wrap:com.okinc.kline.ui.view.model.Out:?: TERNARY null = ((wrap:int:0x0014: ARITH (r94v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Out) : (r49v0 com.okinc.kline.ui.view.model.Out))
  (wrap:com.okinc.kline.ui.view.model.Out:?: TERNARY null = ((wrap:int:0x001c: ARITH (r94v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Out) : (r50v0 com.okinc.kline.ui.view.model.Out))
  (wrap:com.okinc.kline.ui.view.model.Out:?: TERNARY null = ((wrap:int:0x0024: ARITH (r94v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Out) : (r51v0 com.okinc.kline.ui.view.model.Out))
  (wrap:com.okinc.kline.ui.view.model.Out:?: TERNARY null = ((wrap:int:0x002c: ARITH (r94v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Out) : (r52v0 com.okinc.kline.ui.view.model.Out))
  (wrap:com.okinc.kline.ui.view.model.Out:?: TERNARY null = ((wrap:int:0x0034: ARITH (r94v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Out) : (r53v0 com.okinc.kline.ui.view.model.Out))
  (wrap:com.okinc.kline.ui.view.model.Length:?: TERNARY null = ((wrap:int:0x003c: ARITH (r94v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Length) : (r54v0 com.okinc.kline.ui.view.model.Length))
  (wrap:com.okinc.kline.ui.view.model.Length:?: TERNARY null = ((wrap:int:0x0044: ARITH (r94v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Length) : (r55v0 com.okinc.kline.ui.view.model.Length))
  (wrap:com.okinc.kline.ui.view.model.Length:?: TERNARY null = ((wrap:int:0x004c: ARITH (r94v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Length) : (r56v0 com.okinc.kline.ui.view.model.Length))
  (wrap:com.okinc.kline.ui.view.model.Out:?: TERNARY null = ((wrap:int:0x0054: ARITH (r94v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Out) : (r57v0 com.okinc.kline.ui.view.model.Out))
  (wrap:com.okinc.kline.ui.view.model.Out:?: TERNARY null = ((wrap:int:0x005c: ARITH (r94v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Out) : (r58v0 com.okinc.kline.ui.view.model.Out))
  (wrap:com.okinc.kline.ui.view.model.Out:?: TERNARY null = ((wrap:int:0x0064: ARITH (r94v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Out) : (r59v0 com.okinc.kline.ui.view.model.Out))
  (wrap:com.okinc.kline.ui.view.model.Out:0x0074: TERNARY null = ((wrap:int:0x006c: ARITH (r94v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Out) : (r60v0 com.okinc.kline.ui.view.model.Out))
  (wrap:com.okinc.kline.ui.view.model.Length:?: TERNARY null = ((wrap:int:0x0076: ARITH (r94v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Length) : (r61v0 com.okinc.kline.ui.view.model.Length))
  (wrap:com.okinc.kline.ui.view.model.Length:?: TERNARY null = ((wrap:int:0x0081: ARITH (r94v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Length) : (r62v0 com.okinc.kline.ui.view.model.Length))
  (wrap:com.okinc.kline.ui.view.model.Length:?: TERNARY null = ((wrap:int:0x008c: ARITH (r94v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Length) : (r63v0 com.okinc.kline.ui.view.model.Length))
  (wrap:com.okinc.kline.ui.view.model.Out:?: TERNARY null = ((wrap:int:0x0097: ARITH (r94v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Out) : (r64v0 com.okinc.kline.ui.view.model.Out))
  (wrap:com.okinc.kline.ui.view.model.Out:?: TERNARY null = ((wrap:int:0x00a2: ARITH (r94v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Out) : (r65v0 com.okinc.kline.ui.view.model.Out))
  (wrap:com.okinc.kline.ui.view.model.Out:?: TERNARY null = ((wrap:int:0x00ad: ARITH (r94v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Out) : (r66v0 com.okinc.kline.ui.view.model.Out))
  (wrap:com.okinc.kline.ui.view.model.Length:?: TERNARY null = ((wrap:int:0x00b8: ARITH (r94v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Length) : (r67v0 com.okinc.kline.ui.view.model.Length))
  (wrap:com.okinc.kline.ui.view.model.Length:?: TERNARY null = ((wrap:int:0x00c3: ARITH (r94v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Length) : (r68v0 com.okinc.kline.ui.view.model.Length))
  (wrap:com.okinc.kline.ui.view.model.Length:?: TERNARY null = ((wrap:int:0x00ce: ARITH (r94v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Length) : (r69v0 com.okinc.kline.ui.view.model.Length))
  (wrap:com.okinc.kline.ui.view.model.Out:?: TERNARY null = ((wrap:int:0x00d9: ARITH (r94v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Out) : (r70v0 com.okinc.kline.ui.view.model.Out))
  (wrap:com.okinc.kline.ui.view.model.Out:?: TERNARY null = ((wrap:int:0x00e4: ARITH (r94v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Out) : (r71v0 com.okinc.kline.ui.view.model.Out))
  (wrap:com.okinc.kline.ui.view.model.Out:?: TERNARY null = ((wrap:int:0x00ef: ARITH (r94v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Out) : (r72v0 com.okinc.kline.ui.view.model.Out))
  (wrap:com.okinc.kline.ui.view.model.Length:?: TERNARY null = ((wrap:int:0x00fa: ARITH (r94v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Length) : (r73v0 com.okinc.kline.ui.view.model.Length))
  (wrap:com.okinc.kline.ui.view.model.Length:?: TERNARY null = ((wrap:int:0x0105: ARITH (r94v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Length) : (r74v0 com.okinc.kline.ui.view.model.Length))
  (wrap:com.okinc.kline.ui.view.model.Out:?: TERNARY null = ((wrap:int:0x0110: ARITH (r94v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Out) : (r75v0 com.okinc.kline.ui.view.model.Out))
  (wrap:com.okinc.kline.ui.view.model.Out:?: TERNARY null = ((wrap:int:0x011b: ARITH (r94v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Out) : (r76v0 com.okinc.kline.ui.view.model.Out))
  (wrap:com.okinc.kline.ui.view.model.Length:?: TERNARY null = ((wrap:int:0x0126: ARITH (r94v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Length) : (r77v0 com.okinc.kline.ui.view.model.Length))
  (wrap:com.okinc.kline.ui.view.model.Length:?: TERNARY null = ((wrap:int:0x0131: ARITH (r94v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Length) : (r78v0 com.okinc.kline.ui.view.model.Length))
  (wrap:com.okinc.kline.ui.view.model.Out:?: TERNARY null = ((wrap:int:0x0139: ARITH (r95v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Out) : (r79v0 com.okinc.kline.ui.view.model.Out))
  (wrap:com.okinc.kline.ui.view.model.Out:?: TERNARY null = ((wrap:int:0x0142: ARITH (r95v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Out) : (r80v0 com.okinc.kline.ui.view.model.Out))
  (wrap:com.okinc.kline.ui.view.model.Out:?: TERNARY null = ((wrap:int:0x014b: ARITH (r95v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Out) : (r81v0 com.okinc.kline.ui.view.model.Out))
  (wrap:com.okinc.kline.ui.view.model.Out:?: TERNARY null = ((wrap:int:0x0154: ARITH (r95v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Out) : (r82v0 com.okinc.kline.ui.view.model.Out))
  (wrap:com.okinc.kline.ui.view.model.Out:?: TERNARY null = ((wrap:int:0x015d: ARITH (r95v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Out) : (r83v0 com.okinc.kline.ui.view.model.Out))
  (wrap:com.okinc.kline.ui.view.model.Out:?: TERNARY null = ((wrap:int:0x0166: ARITH (r95v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Out) : (r84v0 com.okinc.kline.ui.view.model.Out))
  (wrap:com.okinc.kline.ui.view.model.Out:?: TERNARY null = ((wrap:int:0x016f: ARITH (r95v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Out) : (r85v0 com.okinc.kline.ui.view.model.Out))
  (wrap:com.okinc.kline.ui.view.model.Out:0x0182: TERNARY null = ((wrap:int:0x017a: ARITH (r95v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Out) : (r86v0 com.okinc.kline.ui.view.model.Out))
  (wrap:com.okinc.kline.ui.view.model.Out:0x018c: TERNARY null = ((wrap:int:0x0184: ARITH (r95v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Out) : (r87v0 com.okinc.kline.ui.view.model.Out))
  (wrap:com.okinc.kline.ui.view.model.Out:0x0196: TERNARY null = ((wrap:int:0x018e: ARITH (r95v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Out) : (r88v0 com.okinc.kline.ui.view.model.Out))
  (wrap:com.okinc.kline.ui.view.model.Out:0x01a0: TERNARY null = ((wrap:int:0x0198: ARITH (r95v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Out) : (r89v0 com.okinc.kline.ui.view.model.Out))
  (wrap:com.okinc.kline.ui.view.model.Length:0x01aa: TERNARY null = ((wrap:int:0x01a2: ARITH (r95v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Length) : (r90v0 com.okinc.kline.ui.view.model.Length))
  (wrap:com.okinc.kline.ui.view.model.Out:0x01b4: TERNARY null = ((wrap:int:0x01ac: ARITH (r95v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Out) : (r91v0 com.okinc.kline.ui.view.model.Out))
  (wrap:com.okinc.kline.ui.view.model.Out:?: TERNARY null = ((wrap:int:0x01b6: ARITH (r95v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Out) : (r92v0 com.okinc.kline.ui.view.model.Out))
  (wrap:com.okinc.kline.ui.view.model.Out:?: TERNARY null = ((wrap:int:0x01be: ARITH (r95v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.ui.view.model.Out) : (r93v0 com.okinc.kline.ui.view.model.Out))
 A[MD:(com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Length, com.okinc.kline.ui.view.model.Length, com.okinc.kline.ui.view.model.Length, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Length, com.okinc.kline.ui.view.model.Length, com.okinc.kline.ui.view.model.Length, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Length, com.okinc.kline.ui.view.model.Length, com.okinc.kline.ui.view.model.Length, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Length, com.okinc.kline.ui.view.model.Length, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Length, com.okinc.kline.ui.view.model.Length, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Length, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out):void (m)] (LINE:25) call: com.okinc.kline.ui.view.model.Params.<init>(com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Length, com.okinc.kline.ui.view.model.Length, com.okinc.kline.ui.view.model.Length, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Length, com.okinc.kline.ui.view.model.Length, com.okinc.kline.ui.view.model.Length, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Length, com.okinc.kline.ui.view.model.Length, com.okinc.kline.ui.view.model.Length, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Length, com.okinc.kline.ui.view.model.Length, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Length, com.okinc.kline.ui.view.model.Length, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Length, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out, com.okinc.kline.ui.view.model.Out):void type: THIS */
    public /* synthetic */ Params(Out out, Out out2, Out out3, Out out4, Out out5, Out out6, Out out7, Length length, Length length2, Length length3, Out out8, Out out9, Out out10, Out out11, Length length4, Length length5, Length length6, Out out12, Out out13, Out out14, Length length7, Length length8, Length length9, Out out15, Out out16, Out out17, Length length10, Length length11, Out out18, Out out19, Length length12, Length length13, Out out20, Out out21, Out out22, Out out23, Out out24, Out out25, Out out26, Out out27, Out out28, Out out29, Out out30, Length length14, Out out31, Out out32, Out out33, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : out, (i & 2) != 0 ? null : out2, (i & 4) != 0 ? null : out3, (i & 8) != 0 ? null : out4, (i & 16) != 0 ? null : out5, (i & 32) != 0 ? null : out6, (i & 64) != 0 ? null : out7, (i & 128) != 0 ? null : length, (i & 256) != 0 ? null : length2, (i & 512) != 0 ? null : length3, (i & 1024) != 0 ? null : out8, (i & 2048) != 0 ? null : out9, (i & 4096) != 0 ? null : out10, (i & 8192) != 0 ? null : out11, (i & 16384) != 0 ? null : length4, (i & 32768) != 0 ? null : length5, (i & 65536) != 0 ? null : length6, (i & 131072) != 0 ? null : out12, (i & 262144) != 0 ? null : out13, (i & 524288) != 0 ? null : out14, (i & 1048576) != 0 ? null : length7, (i & 2097152) != 0 ? null : length8, (i & 4194304) != 0 ? null : length9, (i & 8388608) != 0 ? null : out15, (i & 16777216) != 0 ? null : out16, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : out17, (i & 67108864) != 0 ? null : length10, (i & 134217728) != 0 ? null : length11, (i & 268435456) != 0 ? null : out18, (i & 536870912) != 0 ? null : out19, (i & 1073741824) != 0 ? null : length12, (i & Integer.MIN_VALUE) != 0 ? null : length13, (i2 & 1) != 0 ? null : out20, (i2 & 2) != 0 ? null : out21, (i2 & 4) != 0 ? null : out22, (i2 & 8) != 0 ? null : out23, (i2 & 16) != 0 ? null : out24, (i2 & 32) != 0 ? null : out25, (i2 & 64) != 0 ? null : out26, (i2 & 128) != 0 ? null : out27, (i2 & 256) != 0 ? null : out28, (i2 & 512) != 0 ? null : out29, (i2 & 1024) != 0 ? null : out30, (i2 & 2048) != 0 ? null : length14, (i2 & 4096) != 0 ? null : out31, (i2 & 8192) != 0 ? null : out32, (i2 & 16384) != 0 ? null : out33);
    }
}
