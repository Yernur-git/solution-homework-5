# Proxy & Flyweight Patterns

## What problem was solved?

For Proxy pattern, the problem was that we had a heavy object (high-res image), and we don’t always need to load it fully at the start. Sometimes we just need a thumbnail. So with proxy, we can load the full image only when we actually need it. This saves time and resources.

For Flyweight, the issue was memory. If we have like 10,000 markers on a map, creating separate objects for each is not smart. So instead, we reuse the same object and just give it different positions. It’s way more optimized.

## How did the pattern simplify or optimize the design?

Proxy makes things simpler by separating the logic. Like, the main code just calls display() or displayFullImage() and the proxy decides when to load the real image.

Flyweight helped to reduce memory usage. Instead of repeating the same object thousands of times, we use one and reuse it. The factory handles it all.
