package com.squareup.moshi;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes12.dex */
final class JsonValueSource implements Source {
    private final Buffer buffer;
    private boolean closed;
    private long limit;
    private final Buffer prefix;
    private final BufferedSource source;
    private int stackSize;
    private ByteString state;
    static final ByteString STATE_JSON = ByteString.encodeUtf8("[]{}\"'/#");
    static final ByteString STATE_SINGLE_QUOTED = ByteString.encodeUtf8("'\\");
    static final ByteString STATE_DOUBLE_QUOTED = ByteString.encodeUtf8("\"\\");
    static final ByteString STATE_END_OF_LINE_COMMENT = ByteString.encodeUtf8("\r\n");
    static final ByteString STATE_C_STYLE_COMMENT = ByteString.encodeUtf8("*");
    static final ByteString STATE_END_OF_JSON = ByteString.EMPTY;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.closed = true;
    }

    public JsonValueSource(BufferedSource bufferedSource) {
        this(bufferedSource, new Buffer(), STATE_JSON, 0);
    }

    public JsonValueSource(BufferedSource bufferedSource, Buffer buffer, ByteString byteString, int i) {
        this.limit = 0L;
        this.closed = false;
        this.source = bufferedSource;
        this.buffer = bufferedSource.getBuffer();
        this.prefix = buffer;
        this.state = byteString;
        this.stackSize = i;
    }

    private void advanceLimit(long j) throws IOException {
        ByteString byteString;
        long j2;
        ByteString byteString2;
        long j3;
        while (true) {
            long j4 = this.limit;
            if (j4 >= j) {
                return;
            }
            ByteString byteString3 = this.state;
            ByteString byteString4 = STATE_END_OF_JSON;
            if (byteString3 == byteString4) {
                return;
            }
            if (j4 == this.buffer.size()) {
                if (this.limit > 0) {
                    return;
                } else {
                    this.source.require(1L);
                }
            }
            long jIndexOfElement = this.buffer.indexOfElement(this.state, this.limit);
            if (jIndexOfElement == -1) {
                this.limit = this.buffer.size();
            } else {
                byte b = this.buffer.getByte(jIndexOfElement);
                ByteString byteString5 = this.state;
                ByteString byteString6 = STATE_JSON;
                if (byteString5 == byteString6) {
                    if (b == 34) {
                        byteString = STATE_DOUBLE_QUOTED;
                    } else if (b == 35) {
                        byteString = STATE_END_OF_LINE_COMMENT;
                    } else if (b == 39) {
                        byteString = STATE_SINGLE_QUOTED;
                    } else if (b != 47) {
                        if (b != 91) {
                            if (b != 93) {
                                if (b != 123) {
                                    if (b != 125) {
                                    }
                                }
                            }
                            int i = this.stackSize - 1;
                            this.stackSize = i;
                            if (i == 0) {
                                this.state = byteString4;
                            }
                            this.limit = jIndexOfElement + 1;
                        }
                        this.stackSize++;
                        this.limit = jIndexOfElement + 1;
                    } else {
                        long j5 = 2 + jIndexOfElement;
                        this.source.require(j5);
                        j2 = jIndexOfElement + 1;
                        byte b2 = this.buffer.getByte(j2);
                        if (b2 == 47) {
                            byteString2 = STATE_END_OF_LINE_COMMENT;
                        } else if (b2 == 42) {
                            byteString2 = STATE_C_STYLE_COMMENT;
                        } else {
                            this.limit = j2;
                        }
                        this.state = byteString2;
                        this.limit = j5;
                    }
                    this.state = byteString;
                    j2 = jIndexOfElement + 1;
                    this.limit = j2;
                } else if (byteString5 == STATE_SINGLE_QUOTED || byteString5 == STATE_DOUBLE_QUOTED) {
                    if (b == 92) {
                        j3 = jIndexOfElement + 2;
                        this.source.require(j3);
                    } else {
                        if (this.stackSize > 0) {
                            byteString4 = byteString6;
                        }
                        this.state = byteString4;
                        j3 = jIndexOfElement + 1;
                    }
                    this.limit = j3;
                } else {
                    if (byteString5 == STATE_C_STYLE_COMMENT) {
                        long j6 = 2 + jIndexOfElement;
                        this.source.require(j6);
                        long j7 = jIndexOfElement + 1;
                        if (this.buffer.getByte(j7) == 47) {
                            this.limit = j6;
                        } else {
                            this.limit = j7;
                        }
                    } else {
                        if (byteString5 != STATE_END_OF_LINE_COMMENT) {
                            throw new AssertionError();
                        }
                        this.limit = jIndexOfElement + 1;
                    }
                    this.state = byteString6;
                }
            }
        }
    }

    public void discard() throws IOException {
        this.closed = true;
        while (this.state != STATE_END_OF_JSON) {
            advanceLimit(PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            this.source.skip(this.limit);
        }
    }

    @Override // okio.Source
    public long read(Buffer buffer, long j) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.prefix.exhausted()) {
            long j2 = this.prefix.read(buffer, j);
            if (this.buffer.exhausted()) {
                return j2;
            }
            long j3 = read(buffer, j - j2);
            return j3 != -1 ? j2 + j3 : j2;
        }
        advanceLimit(j);
        long j4 = this.limit;
        if (j4 == 0) {
            if (this.state == STATE_END_OF_JSON) {
                return -1L;
            }
            throw new AssertionError();
        }
        long jMin = Math.min(j, j4);
        buffer.write(this.buffer, jMin);
        this.limit -= jMin;
        return jMin;
    }

    @Override // okio.Source
    public Timeout timeout() {
        return this.source.timeout();
    }
}
