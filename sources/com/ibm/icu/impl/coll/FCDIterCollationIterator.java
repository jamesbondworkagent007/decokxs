package com.ibm.icu.impl.coll;

import o.AbstractC7052acZ;
import o.C7069acq;
import o.C7106ada;
import o.C7115adj;

/* JADX INFO: loaded from: classes22.dex */
public final class FCDIterCollationIterator extends C7115adj {
    public final C7069acq AYXKKw;
    public int AhwBna;
    public int AkhnZx;
    public State DbNXlk;
    public StringBuilder fetchVPNInfo;
    public int isConnected;
    public StringBuilder valueOf;

    public enum State {
        ITER_CHECK_FWD,
        ITER_CHECK_BWD,
        ITER_IN_FCD_SEGMENT,
        IN_NORM_ITER_AT_LIMIT,
        IN_NORM_ITER_AT_START
    }

    @Override // o.C7115adj, o.AbstractC7052acZ
    public int djBIcL() {
        if (this.DbNXlk.compareTo(State.ITER_CHECK_BWD) <= 0) {
            return this.values.EZpvd();
        }
        return this.DbNXlk == State.ITER_IN_FCD_SEGMENT ? this.isConnected : this.isConnected == 0 ? this.AkhnZx : this.AhwBna;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (o.AbstractC7052acZ.OLrzqt(r0) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        r1 = r3.values.KWHzl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (o.AbstractC7052acZ.EZpvd(r1) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        return java.lang.Character.toCodePoint((char) r0, (char) r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        if (r1 < 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        r3.values.copydefault();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        return r0;
     */
    @Override // o.C7115adj, o.AbstractC7052acZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int fetchVPNInfo() {
        while (true) {
            State state = this.DbNXlk;
            if (state == State.ITER_CHECK_FWD) {
                int iKWHzl = this.values.KWHzl();
                if (iKWHzl < 0) {
                    return iKWHzl;
                }
                if (!C7106ada.copydefault(iKWHzl) || (!C7106ada.AEQbTJ(iKWHzl) && !C7106ada.KWHzl(this.values.OLrzqt()))) {
                    break;
                }
                this.values.copydefault();
                if (!AkhnZx()) {
                    return -1;
                }
            } else {
                if (state == State.ITER_IN_FCD_SEGMENT && this.isConnected != this.AhwBna) {
                    int iValueOf = this.values.valueOf();
                    this.isConnected += Character.charCount(iValueOf);
                    return iValueOf;
                }
                if (state.compareTo(State.IN_NORM_ITER_AT_LIMIT) >= 0 && this.isConnected != this.valueOf.length()) {
                    int iCodePointAt = this.valueOf.codePointAt(this.isConnected);
                    this.isConnected += Character.charCount(iCodePointAt);
                    return iCodePointAt;
                }
                fARcdN();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
    
        return r0;
     */
    @Override // o.C7115adj, o.AbstractC7052acZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int isConnected() {
        int iCopydefault;
        int i;
        while (true) {
            State state = this.DbNXlk;
            if (state == State.ITER_CHECK_BWD) {
                int iCopydefault2 = this.values.copydefault();
                if (iCopydefault2 < 0) {
                    this.isConnected = 0;
                    this.AkhnZx = 0;
                    this.DbNXlk = State.ITER_IN_FCD_SEGMENT;
                    return -1;
                }
                if (!C7106ada.KWHzl(iCopydefault2)) {
                    break;
                }
                if (C7106ada.AEQbTJ(iCopydefault2)) {
                    iCopydefault = -1;
                } else {
                    iCopydefault = this.values.copydefault();
                    if (!C7106ada.copydefault(iCopydefault)) {
                        if (AbstractC7052acZ.EZpvd(iCopydefault2)) {
                            if (iCopydefault < 0) {
                                iCopydefault = this.values.copydefault();
                            }
                            if (AbstractC7052acZ.OLrzqt(iCopydefault)) {
                                return Character.toCodePoint((char) iCopydefault, (char) iCopydefault2);
                            }
                        }
                        if (iCopydefault >= 0) {
                            this.values.KWHzl();
                        }
                    }
                }
                this.values.KWHzl();
                if (iCopydefault >= 0) {
                    this.values.KWHzl();
                }
                if (!fIwbmz()) {
                    return -1;
                }
            } else {
                if (state == State.ITER_IN_FCD_SEGMENT && this.isConnected != this.AkhnZx) {
                    int iAYXKKw = this.values.AYXKKw();
                    this.isConnected -= Character.charCount(iAYXKKw);
                    return iAYXKKw;
                }
                if (state.compareTo(State.IN_NORM_ITER_AT_LIMIT) >= 0 && (i = this.isConnected) != 0) {
                    int iCodePointBefore = this.valueOf.codePointBefore(i);
                    this.isConnected -= Character.charCount(iCodePointBefore);
                    return iCodePointBefore;
                }
                AuCTel();
            }
        }
    }

    @Override // o.C7115adj, o.AbstractC7052acZ
    public long AhwBna() {
        int iKWHzl;
        while (true) {
            State state = this.DbNXlk;
            if (state == State.ITER_CHECK_FWD) {
                iKWHzl = this.values.KWHzl();
                if (iKWHzl < 0) {
                    return -4294967104L;
                }
                if (!C7106ada.copydefault(iKWHzl) || (!C7106ada.AEQbTJ(iKWHzl) && !C7106ada.KWHzl(this.values.OLrzqt()))) {
                    break;
                }
                this.values.copydefault();
                if (!AkhnZx()) {
                    return 192L;
                }
            } else {
                if (state == State.ITER_IN_FCD_SEGMENT && this.isConnected != this.AhwBna) {
                    iKWHzl = this.values.KWHzl();
                    this.isConnected++;
                    break;
                }
                if (state.compareTo(State.IN_NORM_ITER_AT_LIMIT) >= 0 && this.isConnected != this.valueOf.length()) {
                    StringBuilder sb = this.valueOf;
                    int i = this.isConnected;
                    this.isConnected = i + 1;
                    iKWHzl = sb.charAt(i);
                    break;
                }
                fARcdN();
            }
        }
        return OLrzqt(iKWHzl, this.djBIcL.EZpvd((char) iKWHzl));
    }

    @Override // o.C7115adj, o.AbstractC7052acZ
    public char valueOf() {
        State state = this.DbNXlk;
        State state2 = State.ITER_IN_FCD_SEGMENT;
        if (state.compareTo(state2) <= 0) {
            int iKWHzl = this.values.KWHzl();
            if (AbstractC7052acZ.EZpvd(iKWHzl)) {
                if (this.DbNXlk == state2) {
                    this.isConnected++;
                }
            } else if (iKWHzl >= 0) {
                this.values.copydefault();
            }
            return (char) iKWHzl;
        }
        char cCharAt = this.valueOf.charAt(this.isConnected);
        if (Character.isLowSurrogate(cCharAt)) {
            this.isConnected++;
        }
        return cCharAt;
    }

    @Override // o.C7115adj, o.AbstractC7052acZ
    public void AYXKKw(int i) {
        while (i > 0 && fetchVPNInfo() >= 0) {
            i--;
        }
    }

    @Override // o.C7115adj, o.AbstractC7052acZ
    public void AEQbTJ(int i) {
        while (i > 0 && isConnected() >= 0) {
            i--;
        }
    }

    public final void fARcdN() {
        State state = this.DbNXlk;
        if (state == State.ITER_CHECK_BWD) {
            int iEZpvd = this.values.EZpvd();
            this.isConnected = iEZpvd;
            this.AkhnZx = iEZpvd;
            if (iEZpvd == this.AhwBna) {
                this.DbNXlk = State.ITER_CHECK_FWD;
                return;
            } else {
                this.DbNXlk = State.ITER_IN_FCD_SEGMENT;
                return;
            }
        }
        if (state != State.ITER_IN_FCD_SEGMENT) {
            if (state == State.IN_NORM_ITER_AT_START) {
                this.values.OLrzqt(this.AhwBna - this.AkhnZx);
            }
            this.AkhnZx = this.AhwBna;
        }
        this.DbNXlk = State.ITER_CHECK_FWD;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        r0 = r7.values.valueOf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r0 >= 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        if (r7.AYXKKw.isConnected(r0) > 255) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        r7.values.AYXKKw();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        copydefault(r7.fetchVPNInfo);
        r0 = r7.isConnected;
        r7.AkhnZx = r0;
        r7.AhwBna = r0 + r7.fetchVPNInfo.length();
        r7.DbNXlk = com.ibm.icu.impl.coll.FCDIterCollationIterator.State.IN_NORM_ITER_AT_LIMIT;
        r7.isConnected = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        r7.fetchVPNInfo.appendCodePoint(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AkhnZx() {
        this.isConnected = this.values.EZpvd();
        StringBuilder sb = this.fetchVPNInfo;
        if (sb == null) {
            this.fetchVPNInfo = new StringBuilder();
        } else {
            sb.setLength(0);
        }
        int i = 0;
        while (true) {
            int iValueOf = this.values.valueOf();
            if (iValueOf < 0) {
                break;
            }
            int iIsConnected = this.AYXKKw.isConnected(iValueOf);
            int i2 = iIsConnected >> 8;
            if (i2 == 0 && this.fetchVPNInfo.length() != 0) {
                this.values.AYXKKw();
                break;
            }
            this.fetchVPNInfo.appendCodePoint(iValueOf);
            if (i2 != 0 && (i > i2 || C7106ada.EZpvd(iIsConnected))) {
                break;
            }
            i = iIsConnected & 255;
            if (i == 0) {
                break;
            }
        }
        this.AhwBna = this.isConnected + this.fetchVPNInfo.length();
        this.values.OLrzqt(-this.fetchVPNInfo.length());
        this.DbNXlk = State.ITER_IN_FCD_SEGMENT;
        return true;
    }

    public final void AuCTel() {
        State state = this.DbNXlk;
        if (state == State.ITER_CHECK_FWD) {
            int iEZpvd = this.values.EZpvd();
            this.isConnected = iEZpvd;
            this.AhwBna = iEZpvd;
            if (iEZpvd == this.AkhnZx) {
                this.DbNXlk = State.ITER_CHECK_BWD;
                return;
            } else {
                this.DbNXlk = State.ITER_IN_FCD_SEGMENT;
                return;
            }
        }
        if (state != State.ITER_IN_FCD_SEGMENT) {
            if (state == State.IN_NORM_ITER_AT_LIMIT) {
                this.values.OLrzqt(this.AkhnZx - this.AhwBna);
            }
            this.AhwBna = this.AkhnZx;
        }
        this.DbNXlk = State.ITER_CHECK_BWD;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
    
        r6.AkhnZx = r6.isConnected - r6.fetchVPNInfo.length();
        r6.values.OLrzqt(r6.fetchVPNInfo.length());
        r6.DbNXlk = com.ibm.icu.impl.coll.FCDIterCollationIterator.State.ITER_IN_FCD_SEGMENT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00af, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean fIwbmz() {
        int iIsConnected;
        int iAYXKKw;
        this.isConnected = this.values.EZpvd();
        StringBuilder sb = this.fetchVPNInfo;
        int i = 0;
        if (sb == null) {
            this.fetchVPNInfo = new StringBuilder();
        } else {
            sb.setLength(0);
        }
        while (true) {
            int iAYXKKw2 = this.values.AYXKKw();
            if (iAYXKKw2 < 0) {
                break;
            }
            iIsConnected = this.AYXKKw.isConnected(iAYXKKw2);
            int i2 = iIsConnected & 255;
            if (i2 == 0 && this.fetchVPNInfo.length() != 0) {
                this.values.valueOf();
                break;
            }
            this.fetchVPNInfo.appendCodePoint(iAYXKKw2);
            if (i2 != 0 && ((i != 0 && i2 > i) || C7106ada.EZpvd(iIsConnected))) {
                break;
            }
            i = iIsConnected >> 8;
            if (i == 0) {
                break;
            }
        }
        while (true) {
            if (iIsConnected <= 255 || (iAYXKKw = this.values.AYXKKw()) < 0) {
                break;
            }
            iIsConnected = this.AYXKKw.isConnected(iAYXKKw);
            if (iIsConnected == 0) {
                this.values.valueOf();
                break;
            }
            this.fetchVPNInfo.appendCodePoint(iAYXKKw);
        }
        this.fetchVPNInfo.reverse();
        copydefault(this.fetchVPNInfo);
        int i3 = this.isConnected;
        this.AhwBna = i3;
        this.AkhnZx = i3 - this.fetchVPNInfo.length();
        this.DbNXlk = State.IN_NORM_ITER_AT_START;
        this.isConnected = this.valueOf.length();
        return true;
    }

    public final void copydefault(CharSequence charSequence) {
        if (this.valueOf == null) {
            this.valueOf = new StringBuilder();
        }
        this.AYXKKw.copydefault(charSequence, this.valueOf);
    }
}
