---
name: "nju-se-thesis-self-check"
description: "Checks NJU SE master's thesis PDFs before review. Invoke when user asks for thesis self-check/review and provides a PDF path."
---

# NJU SE Thesis Self Check

This Trae wrapper installs and delegates to the upstream skill:

`/Users/bytedance/.claude/skills/nju-se-thesis-self-check/SKILL.md`

Use this skill only when the user explicitly asks for thesis self-check, thesis self-review, pre-review checking, or asks whether a thesis PDF has issues, and provides a PDF path.

Follow the upstream `SKILL.md` exactly. Its bundled scripts and references are located under:

- `/Users/bytedance/.claude/skills/nju-se-thesis-self-check/scripts/`
- `/Users/bytedance/.claude/skills/nju-se-thesis-self-check/references/`

Do not run it merely because a PDF is present. Prefer `--auto` behavior only when the user requests full automatic mode.
